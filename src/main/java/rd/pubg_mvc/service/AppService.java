package rd.pubg_mvc.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rd.pubg_mvc.model.DTO.PlayerDTO;
import rd.pubg_mvc.model.database.Player;
import rd.pubg_mvc.model.database.Totals;
import rd.pubg_mvc.model.mastery.MasteryDataContainer;
import rd.pubg_mvc.model.players.PlayerDataContainer;
import rd.pubg_mvc.model.stats.StatDataContainer;
import rd.pubg_mvc.repository.DbAccess;

@Service
public class AppService {
    
    @Autowired
    private PUBG_RestService restService;

    @Autowired
    private PlayerDTOUtil dtoUtil;

    @Autowired
    private DbAccess repository;


    public PlayerDTO getPlayerDataByPlayerName(String playerName) {

        PlayerDataContainer playerMainData = restService.getAccountIdByPlayerName(playerName);
        String accountId = playerMainData.getData().get(0).getId();

        StatDataContainer playerStatData = restService.getLifetimeStatsByAccount(accountId);
        MasteryDataContainer playerWeaponMasteryData = restService.getAllWeaponStatsByAccount(accountId);

        PlayerDTO playerData = dtoUtil.buildPlayerDTO(playerMainData, playerStatData, playerWeaponMasteryData);
        this.persistOrUpdatePlayerDataInDB(playerData);

        return playerData;
    }


    public List<Player> getAllPlayersFromDB() {
        return repository.getAllPlayers();
    }


    private void persistOrUpdatePlayerDataInDB(PlayerDTO playerDTO) {

        if(repository.checkIfPlayerAlreadyInDbByName(playerDTO.getPlayerName())) {

            this.mergePlayerDataInDB(playerDTO);
        }
        else {
            this.persistPlayerDataInDB(playerDTO);
        }

    }

    private void mergePlayerDataInDB(PlayerDTO playerDTO) {
        
        Player playerDbData = new Player();
        playerDbData.setAccountId(playerDTO.getAccountId());
        playerDbData.setPlayerName(playerDTO.getPlayerName());
        playerDbData.setLastModified(LocalDateTime.now());
        repository.mergePlayer(playerDbData);

        Totals totalsDbData = new Totals();
        totalsDbData.setAccountId(playerDTO.getAccountId());
        totalsDbData.setAttributes(playerDTO);
        repository.mergeTotals(totalsDbData);
    }

    private void persistPlayerDataInDB(PlayerDTO playerDTO) {

        Player playerDbData = new Player();
        playerDbData.setAccountId(playerDTO.getAccountId());
        playerDbData.setPlayerName(playerDTO.getPlayerName());
        playerDbData.setLastModified(LocalDateTime.now());
        repository.persistPlayer(playerDbData);

        Totals totalsDbData = new Totals();
        totalsDbData.setId(0);
        totalsDbData.setAccountId(playerDTO.getAccountId());
        totalsDbData.setAttributes(playerDTO);
        repository.persistTotals(totalsDbData);
    }
}

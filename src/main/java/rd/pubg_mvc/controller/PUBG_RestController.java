package rd.pubg_mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import rd.pubg_mvc.model.DTO.PlayerDTO;
import rd.pubg_mvc.service.AppService;

@RestController
public class PUBG_RestController {

    @Autowired
    private AppService appService;

    
    @GetMapping("/player/{playerName}")
    public PlayerDTO getPlayerIdByPlayerName(@PathVariable String playerName) {

        return appService.getPlayerDataByPlayerName(playerName);
    }
}

package rd.pubg_mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import rd.pubg_mvc.model.DTO.PlayerDTO;
import rd.pubg_mvc.model.database.Player;
import rd.pubg_mvc.service.AppService;

@Controller
public class PUBG_MVC_Controller {
    
    @Autowired
    private AppService appService;


    @GetMapping("/")
    public String loadMainPage(Model model) {

        List<Player> playersCached = appService.getAllPlayersFromDB();
        model.addAttribute("players", playersCached);

        return "index.html";
    }

    @GetMapping("/search/players")
    public String searchPlayer(
            Model model,
            @RequestParam(name="playername") String playerName) {
        
        String targetPage = "player.html";
        
        try {

            PlayerDTO playerData = appService.getPlayerDataByPlayerName(playerName);
            model.addAttribute("player", playerData);
        }
        catch(RuntimeException e) {
            
            targetPage = "index.html";
            model.addAttribute("errormessage", e.getMessage());
        }        

        return targetPage;
    }

}

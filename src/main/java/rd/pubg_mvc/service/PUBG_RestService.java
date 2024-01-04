package rd.pubg_mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import rd.pubg_mvc.model.mastery.MasteryDataContainer;
import rd.pubg_mvc.model.players.PlayerDataContainer;
import rd.pubg_mvc.model.stats.StatDataContainer;

@Service
public class PUBG_RestService {

    @Autowired
    private RestServiceUtils serviceUtils;

    private final String baseURL = "https://api.pubg.com/shards";
    private final String platform = "/steam";


    public PlayerDataContainer getAccountIdByPlayerName(String playerName) throws RestClientException {

        RestTemplate rt = serviceUtils.buildtRestTemplate();
        String URL = baseURL + platform + "/players?filter[playerNames]=" + playerName;

        HttpEntity<String> entity = new HttpEntity<>("", serviceUtils.getPubgHeader());
        
        ResponseEntity<String> response = rt.exchange(URL, HttpMethod.GET, entity, String.class);
        String JsonString = response.getBody();

        PlayerDataContainer data = serviceUtils.convertJsonStringToObject(JsonString, PlayerDataContainer.class);
        // System.out.println(">>>>> getAccountIdByPlayerName: " + data  + "<<<<<<");

        return data;
    }


    public StatDataContainer getLifetimeStatsByAccount(String accountId) throws IllegalArgumentException, RestClientException {
       
        if(accountId.startsWith("account.") == false) {
            throw new IllegalArgumentException("Invalid account ID.");
        }

        RestTemplate rt = serviceUtils.buildtRestTemplate();
        String URL = baseURL + platform + "/players/" + accountId + "/seasons/lifetime";

        HttpEntity<String> entity = new HttpEntity<>("", serviceUtils.getPubgHeader());
        
        ResponseEntity<String> response = rt.exchange(URL, HttpMethod.GET, entity, String.class);
        String JsonString = response.getBody();

        StatDataContainer data = serviceUtils.convertJsonStringToObject(JsonString, StatDataContainer.class);
        // System.out.println(">>>>> getLifetimeStatsByAccount: " + data + "<<<<<<");

        return data;
    }


    public MasteryDataContainer getAllWeaponStatsByAccount(String accountId) {

        if(accountId.startsWith("account.") == false) {
            throw new IllegalArgumentException("Invalid account ID.");
        }

        RestTemplate rt = serviceUtils.buildtRestTemplate();
        String URL = baseURL + platform + "/players/" + accountId + "/weapon_mastery";

        HttpEntity<String> entity = new HttpEntity<>("", serviceUtils.getPubgHeader());
        
        ResponseEntity<String> response = rt.exchange(URL, HttpMethod.GET, entity, String.class);
        String JsonString = response.getBody();

        MasteryDataContainer data = serviceUtils.convertJsonStringToObject(JsonString, MasteryDataContainer.class);
        // System.out.println(">>>>> getAllWeaponStatsByAccount: " + data  + "<<<<<<");

        return data;
    }
    
}

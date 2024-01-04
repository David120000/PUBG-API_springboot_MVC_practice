package rd.pubg_mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;

import rd.pubg_mvc.configuration.PUBG_API_Key;

@Service
public class RestServiceUtils {

    @Autowired
    private PUBG_API_Key apiKey;

    
    public HttpHeaders getPubgHeader() {

        HttpHeaders headers = new HttpHeaders();
        headers.set("Accept", "application/vnd.api+json");
        headers.setBearerAuth(apiKey.getAPI_Key());

        return headers;
    }

    public RestTemplate buildtRestTemplate() {
        return new RestTemplate();
    }

    public <T> T convertJsonStringToObject(String JsonString, Class<T> classOfT) {
        
        Gson gson = new Gson();
        return gson.fromJson(JsonString, classOfT);
    }
    
}

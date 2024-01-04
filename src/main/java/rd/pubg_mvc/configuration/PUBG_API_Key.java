package rd.pubg_mvc.configuration;

import org.springframework.stereotype.Component;

@Component
public class PUBG_API_Key {
    
    private final String API_Key = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJqdGkiOiI5Y2JjNDYwMC04M2I1LTAxM2MtYzllNC0wYTFjYWFlY2IyZjQiLCJpc3MiOiJnYW1lbG9ja2VyIiwiaWF0IjoxNzAzMzMxNDY0LCJwdWIiOiJibHVlaG9sZSIsInRpdGxlIjoicHViZyIsImFwcCI6InJkX3NwcmluZ2Jvb3RfIn0.Rd8uOmhBlRKUqhpMbYD0EMtuLND3DL_atlhayb2qBIw";
    private final int requestPerMinute = 10;


    public String getAPI_Key() {
        return API_Key;
    }
    
    public int getRequestPerMinute() {
        return requestPerMinute;
    }

}

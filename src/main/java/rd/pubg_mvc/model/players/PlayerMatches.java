package rd.pubg_mvc.model.players;

import java.util.List;

public class PlayerMatches {
    
    private List<Match> data;


    public List<Match> getData() {
        return data;
    }

    public void setData(List<Match> data) {
        this.data = data;
    }


    @Override
    public String toString() {
        return "PlayerMatches [data=" + data + "]";
    }

}

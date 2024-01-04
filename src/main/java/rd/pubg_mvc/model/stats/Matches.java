package rd.pubg_mvc.model.stats;

import java.util.List;

import rd.pubg_mvc.model.players.Match;

public class Matches {
    
    private List<Match> data;

    
    public List<Match> getData() {
        return data;
    }

    public void setData(List<Match> data) {
        this.data = data;
    }

    
    @Override
    public String toString() {
        return "MatchesSolo [data=" + data + "]";
    }
}

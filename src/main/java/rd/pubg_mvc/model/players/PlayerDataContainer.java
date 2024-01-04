package rd.pubg_mvc.model.players;

import java.util.List;

public class PlayerDataContainer {
    
    private List<Player> data;
    private Links links;


    public List<Player> getData() {
        return data;
    }
    public void setData(List<Player> data) {
        this.data = data;
    }
    public Links getLinks() {
        return links;
    }
    public void setLinks(Links links) {
        this.links = links;
    }


    @Override
    public String toString() {
        return "PlayerDataContainer [data=" + data + ", links=" + links + "]";
    }

}

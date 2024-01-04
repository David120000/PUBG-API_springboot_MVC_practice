package rd.pubg_mvc.model.stats;

import rd.pubg_mvc.model.players.Links;

public class StatDataContainer {
    
    private PlayerLifetime data;
    private Links links;

    
    public PlayerLifetime getData() {
        return data;
    }
    public void setData(PlayerLifetime data) {
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
        return "StatDataContainer [data=" + data + ", links=" + links + "]";
    }
    
}

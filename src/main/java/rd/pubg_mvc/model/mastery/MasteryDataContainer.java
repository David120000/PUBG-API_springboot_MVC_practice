package rd.pubg_mvc.model.mastery;

import rd.pubg_mvc.model.players.Links;

public class MasteryDataContainer {
    
    private MasteryData data;
    private Links links;

    
    public MasteryData getData() {
        return data;
    }
    public void setData(MasteryData data) {
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
        return "MasteryDataContainer [data=" + data + ", links=" + links + "]";
    }

}

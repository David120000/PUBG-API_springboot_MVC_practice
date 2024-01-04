package rd.pubg_mvc.model.players;

public class Match {

    private String type;
    private String id;

    
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "Match [type=" + type + ", id=" + id + "]";
    }

}

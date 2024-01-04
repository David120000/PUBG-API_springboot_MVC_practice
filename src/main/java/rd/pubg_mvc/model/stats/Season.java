package rd.pubg_mvc.model.stats;

public class Season {
    
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
        return "Season [type=" + type + ", id=" + id + "]";
    }

}

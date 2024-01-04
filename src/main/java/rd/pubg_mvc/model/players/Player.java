package rd.pubg_mvc.model.players;

public class Player {

    private String type;
    private String id;
    private PlayerAttributes attributes;
    private Relationships relationships;


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
    public PlayerAttributes getAttributes() {
        return attributes;
    }
    public void setAttributes(PlayerAttributes attributes) {
        this.attributes = attributes;
    }
    public Relationships getRelationships() {
        return relationships;
    }
    public void setRelationships(Relationships relationships) {
        this.relationships = relationships;
    }


    @Override
    public String toString() {
        return "Player [type=" + type + ", id=" + id + ", attributes=" + attributes + ", relationships=" + relationships
                + "]";
    }

}

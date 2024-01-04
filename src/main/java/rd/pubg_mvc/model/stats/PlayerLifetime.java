package rd.pubg_mvc.model.stats;

public class PlayerLifetime {
    
    private String type;
    private StatAttributes attributes;
    private Relationships relationships;

    
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public StatAttributes getAttributes() {
        return attributes;
    }
    public void setAttributes(StatAttributes attributes) {
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
        return "PlayerLifetime [type=" + type + ", attributes=" + attributes + ", relationships=" + relationships + "]";
    }

}

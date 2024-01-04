package rd.pubg_mvc.model.mastery;

public class MasteryData {

    private String type;
    private String id;
    private MasteryAttributes attributes;

    
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
    public MasteryAttributes getAttributes() {
        return attributes;
    }
    public void setAttributes(MasteryAttributes attributes) {
        this.attributes = attributes;
    }


    @Override
    public String toString() {
        return "MasteryData [type=" + type + ", id=" + id + ", attributes=" + attributes + "]";
    }


}

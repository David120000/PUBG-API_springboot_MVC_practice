package rd.pubg_mvc.model.stats;

public class Player {
    
    private PlayerData data;

    
    public PlayerData getData() {
        return data;
    }

    public void setData(PlayerData data) {
        this.data = data;
    }

    
    @Override
    public String toString() {
        return "Player [data=" + data + "]";
    }

    
}

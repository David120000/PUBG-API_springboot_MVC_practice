package rd.pubg_mvc.model.stats;

public class SeasonData {
    
    private Season data;

    
    public Season getData() {
        return data;
    }

    public void setData(Season data) {
        this.data = data;
    }


    @Override
    public String toString() {
        return "SeasonData [data=" + data + "]";
    }
    
}

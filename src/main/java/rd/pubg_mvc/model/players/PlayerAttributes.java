package rd.pubg_mvc.model.players;

public class PlayerAttributes {
    
    private String clanId;
    private String name;
    private String titleId;
    private String shardId;
    private String banType;


    public String getClanId() {
        return clanId;
    }
    public void setClanId(String clanId) {
        this.clanId = clanId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getTitleId() {
        return titleId;
    }
    public void setTitleId(String titleId) {
        this.titleId = titleId;
    }
    public String getShardId() {
        return shardId;
    }
    public void setShardId(String shardId) {
        this.shardId = shardId;
    }
    public String getBanType() {
        return banType;
    }
    public void setBanType(String banType) {
        this.banType = banType;
    }


    @Override
    public String toString() {
        return "PlayerAttributes [clanId=" + clanId + ", name=" + name + ", titleId=" + titleId + ", shardId=" + shardId
                + ", banType=" + banType + "]";
    }
 
    
}

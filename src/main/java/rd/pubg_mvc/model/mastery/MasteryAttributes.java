package rd.pubg_mvc.model.mastery;

public class MasteryAttributes {

    private String platform;
    private String seasonId;
    private WeaponSummaries weaponSummaries;
    private String latestMatchId;

    
    public String getPlatform() {
        return platform;
    }
    public void setPlatform(String platform) {
        this.platform = platform;
    }
    public String getSeasonId() {
        return seasonId;
    }
    public void setSeasonId(String seasonId) {
        this.seasonId = seasonId;
    }
    public WeaponSummaries getWeaponSummaries() {
        return weaponSummaries;
    }
    public void setWeaponSummaries(WeaponSummaries weaponSummaries) {
        this.weaponSummaries = weaponSummaries;
    }
    public String getLatestMatchId() {
        return latestMatchId;
    }
    public void setLatestMatchId(String latestMatchId) {
        this.latestMatchId = latestMatchId;
    }

    
    @Override
    public String toString() {
        return "MasteryAttributes [platform=" + platform + ", seasonId=" + seasonId + ", weaponSummaries="
                + weaponSummaries + ", latestMatchId=" + latestMatchId + "]";
    }

    
}

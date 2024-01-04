package rd.pubg_mvc.model.mastery;

public class WeaponStats {

    private int XPTotal;
    private int LevelCurrent;
    private int TierCurrent;
    private StatsTotal StatsTotal;
    private OfficialStatsTotal OfficialStatsTotal;
    private CompetitveStatsTotal CompetitiveStatsTotal;

    
    public int getXPTotal() {
        return XPTotal;
    }
    public void setXPTotal(int xPTotal) {
        XPTotal = xPTotal;
    }
    public int getLevelCurrent() {
        return LevelCurrent;
    }
    public void setLevelCurrent(int levelCurrent) {
        LevelCurrent = levelCurrent;
    }
    public int getTierCurrent() {
        return TierCurrent;
    }
    public void setTierCurrent(int tierCurrent) {
        TierCurrent = tierCurrent;
    }
    public StatsTotal getStatsTotal() {
        return StatsTotal;
    }
    public void setStatsTotal(StatsTotal statsTotal) {
        StatsTotal = statsTotal;
    }
    public OfficialStatsTotal getOfficialStatsTotal() {
        return OfficialStatsTotal;
    }
    public void setOfficialStatsTotal(OfficialStatsTotal officialStatsTotal) {
        OfficialStatsTotal = officialStatsTotal;
    }
    public CompetitveStatsTotal getCompetitiveStatsTotal() {
        return CompetitiveStatsTotal;
    }
    public void setCompetitiveStatsTotal(CompetitveStatsTotal competitveStatsTotal) {
        CompetitiveStatsTotal = competitveStatsTotal;
    }


    @Override
    public String toString() {
        return "WeaponStats [XPTotal=" + XPTotal + ", LevelCurrent=" + LevelCurrent + ", TierCurrent=" + TierCurrent
                + ", StatsTotal=" + StatsTotal + ", OfficialStatsTotal=" + OfficialStatsTotal
                + ", CompetitiveStatsTotal=" + CompetitiveStatsTotal + "]";
    }

}

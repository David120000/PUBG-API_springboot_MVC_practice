package rd.pubg_mvc.model.stats;

public class StatAttributes {
    
    private GameModeStats gameModeStats;
    private double bestRankPoint;

    
    public GameModeStats getGameModeStats() {
        return gameModeStats;
    }
    public void setGameModeStats(GameModeStats gameModeStats) {
        this.gameModeStats = gameModeStats;
    }
    public double getBestRankPoint() {
        return bestRankPoint;
    }
    public void setBestRankPoint(double bestRankPoint) {
        this.bestRankPoint = bestRankPoint;
    }


    @Override
    public String toString() {
        return "StatAttributes [gameModeStats=" + gameModeStats + ", bestRankPoint=" + bestRankPoint + "]";
    }
    
}

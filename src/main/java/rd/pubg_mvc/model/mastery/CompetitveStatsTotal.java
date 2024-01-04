package rd.pubg_mvc.model.mastery;

public class CompetitveStatsTotal {

    private int MostDefeatsInAGame;
    private int Defeats;
    private double DamagePlayer;
    private int HeadShots;
    private int Kills;
    private int MostKillsInAGame;
    private int Groggies;
    private int LongestKill;

    
    public int getMostDefeatsInAGame() {
        return MostDefeatsInAGame;
    }
    public void setMostDefeatsInAGame(int mostDefeatsInAGame) {
        MostDefeatsInAGame = mostDefeatsInAGame;
    }
    public int getDefeats() {
        return Defeats;
    }
    public void setDefeats(int defeats) {
        Defeats = defeats;
    }
    public double getDamagePlayer() {
        return DamagePlayer;
    }
    public void setDamagePlayer(double damagePlayer) {
        DamagePlayer = damagePlayer;
    }
    public int getHeadShots() {
        return HeadShots;
    }
    public void setHeadShots(int headShots) {
        HeadShots = headShots;
    }
    public int getKills() {
        return Kills;
    }
    public void setKills(int kills) {
        Kills = kills;
    }
    public int getMostKillsInAGame() {
        return MostKillsInAGame;
    }
    public void setMostKillsInAGame(int mostKillsInAGame) {
        MostKillsInAGame = mostKillsInAGame;
    }
    public int getGroggies() {
        return Groggies;
    }
    public void setGroggies(int groggies) {
        Groggies = groggies;
    }
    public int getLongestKill() {
        return LongestKill;
    }
    public void setLongestKill(int longestKill) {
        LongestKill = longestKill;
    }


    @Override
    public String toString() {
        return "CompetitveStatsTotal [MostDefeatsInAGame=" + MostDefeatsInAGame + ", Defeats=" + Defeats
                + ", DamagePlayer=" + DamagePlayer + ", HeadShots=" + HeadShots + ", Kills=" + Kills
                + ", MostKillsInAGame=" + MostKillsInAGame + ", Groggies=" + Groggies + ", LongestKill=" + LongestKill
                + "]";
    }
 
}

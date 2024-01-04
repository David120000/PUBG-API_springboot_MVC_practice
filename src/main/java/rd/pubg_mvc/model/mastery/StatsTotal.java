package rd.pubg_mvc.model.mastery;

public class StatsTotal {

    private int MostDefeatsInAGame;
    private int Defeats;
    private double MostDamagePlayerInAGame;
    private double DamagePlayer;
    private int MostHeadShotsInAGame;
    private int HeadShots;
    private double LongestDefeat;
    private int Kills;
    private int MostKillsInAGame;
    private int Groggies;
    private int MostGroggiesInAGame;

    
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
    public double getMostDamagePlayerInAGame() {
        return MostDamagePlayerInAGame;
    }
    public void setMostDamagePlayerInAGame(double mostDamagePlayerInAGame) {
        MostDamagePlayerInAGame = mostDamagePlayerInAGame;
    }
    public double getDamagePlayer() {
        return DamagePlayer;
    }
    public void setDamagePlayer(double damagePlayer) {
        DamagePlayer = damagePlayer;
    }
    public int getMostHeadShotsInAGame() {
        return MostHeadShotsInAGame;
    }
    public void setMostHeadShotsInAGame(int mostHeadShotsInAGame) {
        MostHeadShotsInAGame = mostHeadShotsInAGame;
    }
    public int getHeadShots() {
        return HeadShots;
    }
    public void setHeadShots(int headShots) {
        HeadShots = headShots;
    }
    public double getLongestDefeat() {
        return LongestDefeat;
    }
    public void setLongestDefeat(double longestDefeat) {
        LongestDefeat = longestDefeat;
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
    public int getMostGroggiesInAGame() {
        return MostGroggiesInAGame;
    }
    public void setMostGroggiesInAGame(int mostGroggiesInAGame) {
        MostGroggiesInAGame = mostGroggiesInAGame;
    }


    @Override
    public String toString() {
        return "StatsTotal [MostDefeatsInAGame=" + MostDefeatsInAGame + ", Defeats=" + Defeats
                + ", MostDamagePlayerInAGame=" + MostDamagePlayerInAGame + ", DamagePlayer=" + DamagePlayer
                + ", MostHeadShotsInAGame=" + MostHeadShotsInAGame + ", HeadShots=" + HeadShots + ", LongestDefeat="
                + LongestDefeat + ", Kills=" + Kills + ", MostKillsInAGame=" + MostKillsInAGame + ", Groggies="
                + Groggies + ", MostGroggiesInAGame=" + MostGroggiesInAGame + "]";
    }
    
}

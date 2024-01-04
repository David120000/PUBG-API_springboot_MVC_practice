package rd.pubg_mvc.model.stats;

public class Relationships {
    
    private Player player;
    private Matches matchesSolo;
    private Matches matchesSoloFPP;
    private Matches matchesDuo;
    private Matches matchesDuoFPP;
    private Matches matchesSquad;
    private Matches matchesSquadFPP;
    private SeasonData season;


    public Player getPlayer() {
        return player;
    }
    public void setPlayer(Player player) {
        this.player = player;
    }
    public Matches getMatchesSolo() {
        return matchesSolo;
    }
    public void setMatchesSolo(Matches matchesSolo) {
        this.matchesSolo = matchesSolo;
    }
    public Matches getMatchesSoloFPP() {
        return matchesSoloFPP;
    }
    public void setMatchesSoloFPP(Matches matchesSoloFPP) {
        this.matchesSoloFPP = matchesSoloFPP;
    }
    public Matches getMatchesDuo() {
        return matchesDuo;
    }
    public void setMatchesDuo(Matches matchesDuo) {
        this.matchesDuo = matchesDuo;
    }
    public Matches getMatchesDuoFPP() {
        return matchesDuoFPP;
    }
    public void setMatchesDuoFPP(Matches matchesDuoFPP) {
        this.matchesDuoFPP = matchesDuoFPP;
    }
    public Matches getMatchesSquad() {
        return matchesSquad;
    }
    public void setMatchesSquad(Matches matchesSquad) {
        this.matchesSquad = matchesSquad;
    }
    public Matches getMatchesSquadFPP() {
        return matchesSquadFPP;
    }
    public void setMatchesSquadFPP(Matches matchesSquadFPP) {
        this.matchesSquadFPP = matchesSquadFPP;
    }
    public SeasonData getSeason() {
        return season;
    }
    public void setSeason(SeasonData season) {
        this.season = season;
    }


    @Override
    public String toString() {
        return "Relationships [player=" + player + ", matchesSolo=" + matchesSolo + ", matchesSoloFPP=" + matchesSoloFPP
                + ", matchesDuo=" + matchesDuo + ", matchesDuoFPP=" + matchesDuoFPP + ", matchesSquad=" + matchesSquad
                + ", matchesSquadFPP=" + matchesSquadFPP + ", season=" + season + "]";
    }

}

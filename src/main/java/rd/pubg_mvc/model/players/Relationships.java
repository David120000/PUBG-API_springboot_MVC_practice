package rd.pubg_mvc.model.players;

public class Relationships {
    
    private PlayerMatches matches;


    public PlayerMatches getMatches() {
        return matches;
    }

    public void setMatches(PlayerMatches matches) {
        this.matches = matches;
    }


    @Override
    public String toString() {
        return "Relationships [matches=" + matches + "]";
    }

}

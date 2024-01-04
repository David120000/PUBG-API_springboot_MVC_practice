package rd.pubg_mvc.model.stats;

import com.google.gson.annotations.SerializedName;

public class GameModeStats {

    @SerializedName("duo-fpp") 
    private StatsByGameMode duo_fpp;

    @SerializedName("solo-fpp")
    private StatsByGameMode solo_fpp;

    @SerializedName("squad-fpp")
    private StatsByGameMode squad_fpp;

    private StatsByGameMode duo;
    private StatsByGameMode solo;
    private StatsByGameMode squad;

    
    public StatsByGameMode getDuo() {
        return duo;
    }

    public void setDuo(StatsByGameMode duo) {
        this.duo = duo;
    }

    public StatsByGameMode getSolo() {
        return solo;
    }

    public void setSolo(StatsByGameMode solo) {
        this.solo = solo;
    }

    public StatsByGameMode getSquad() {
        return squad;
    }

    public void setSquad(StatsByGameMode squad) {
        this.squad = squad;
    }

    public StatsByGameMode getDuo_fpp() {
        return duo_fpp;
    }

    public void setDuo_fpp(StatsByGameMode duo_fpp) {
        this.duo_fpp = duo_fpp;
    }

    public StatsByGameMode getSolo_fpp() {
        return solo_fpp;
    }

    public void setSolo_fpp(StatsByGameMode solo_fpp) {
        this.solo_fpp = solo_fpp;
    }

    public StatsByGameMode getSquad_fpp() {
        return squad_fpp;
    }

    public void setSquad_fpp(StatsByGameMode squad_fpp) {
        this.squad_fpp = squad_fpp;
    }


    @Override
    public String toString() {
        return "GameModeStats [duo=" + duo + ", solo=" + solo + ", squad=" + squad + ", duo_fpp=" + duo_fpp
                + ", solo_fpp=" + solo_fpp + ", squad_fpp=" + squad_fpp + "]";
    }

}

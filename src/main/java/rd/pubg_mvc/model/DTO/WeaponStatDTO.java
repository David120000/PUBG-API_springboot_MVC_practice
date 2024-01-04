package rd.pubg_mvc.model.DTO;

import rd.pubg_mvc.model.WeaponTypeEnum;

public class WeaponStatDTO {

    private String weaponName;
    private WeaponTypeEnum weaponType;
    private String ingameId;
    private int masteryLevel;
    private int kills;
    private int mostKillsInAGame;
    private int damage;
    private int dBNOs;
    private int headShots;
    private int longestKill;

    
    public String getIngameId() {
        return ingameId;
    }
    public void setIngameId(String ingameId) {
        this.ingameId = ingameId;
    }
    public String getWeaponName() {
        return weaponName;
    }
    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }
    public int getMasteryLevel() {
        return masteryLevel;
    }
    public void setMasteryLevel(int masteryLevel) {
        this.masteryLevel = masteryLevel;
    }
    public int getKills() {
        return kills;
    }
    public void setKills(int kills) {
        this.kills = kills;
    }
    public int getMostKillsInAGame() {
        return mostKillsInAGame;
    }
    public void setMostKillsInAGame(int mostKillsInAGame) {
        this.mostKillsInAGame = mostKillsInAGame;
    }
    public int getDamage() {
        return damage;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }
    public void setDamage(double damage) {
        Double damageAsDouble = damage;
        this.damage = damageAsDouble.intValue();
    }
    public int getdBNOs() {
        return dBNOs;
    }
    public void setdBNOs(int dBNOs) {
        this.dBNOs = dBNOs;
    }
    public int getHeadShots() {
        return headShots;
    }
    public void setHeadShots(int headShots) {
        this.headShots = headShots;
    }
    public int getLongestKill() {
        return longestKill;
    }
    public void setLongestKill(int longestKill) {
        this.longestKill = longestKill;
    }
    public WeaponTypeEnum getWeaponType() {
        return weaponType;
    }
    public void setWeaponType(WeaponTypeEnum weaponType) {
        this.weaponType = weaponType;
    }


    @Override
    public String toString() {
        return "WeaponStatDTO [ingameId=" + ingameId + ", weaponName=" + weaponName + ", masteryLevel=" + masteryLevel
                + ", kills=" + kills + ", mostKillsInAGame=" + mostKillsInAGame + ", damage=" + damage + ", dBNOs="
                + dBNOs + ", headShots=" + headShots + ", longestKill=" + longestKill + "]";
    }

}

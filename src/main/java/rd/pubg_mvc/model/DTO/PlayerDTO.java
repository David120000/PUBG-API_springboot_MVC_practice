package rd.pubg_mvc.model.DTO;

import java.util.ArrayList;

import rd.pubg_mvc.model.stats.GameModeStats;

public class PlayerDTO {
    
    private String playerName;
    private String accountId;

    private int totalKills;
    private long totalDamage;
    
    private int totalARKills;
    private long totalARDamage;
    private int totalDMRKills;
    private long totalDMRDamage;
    private int totalRifleKills;
    private long totalRifleDamage;
    private int totalSMGKills;
    private long totalSMGDamage;
    private int totalSRKills;
    private long totalSRDamage;
    private int totalLMGKills;
    private long totalLMGDamage;
    private int totalShotgunKills;
    private long totalShotgunDamage;
    private int totalBowKills;
    private int totalBowDamage;
    private int totalPistolKills;
    private int totalPistolDamage;

    private ArrayList<WeaponStatDTO> weaponStats;
    
    private GameModeStats statsByGameModes;

    
    public String getPlayerName() {
        return playerName;
    }
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
    public String getAccountId() {
        return accountId;
    }
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }
    public GameModeStats getStatsByGameModes() {
        return statsByGameModes;
    }
    public void setStatsByGameModes(GameModeStats statsByGameModes) {
        this.statsByGameModes = statsByGameModes;
    }
    public ArrayList<WeaponStatDTO> getWeaponStats() {
        return weaponStats;
    }
    public void setWeaponStats(ArrayList<WeaponStatDTO> weaponStats) {
        this.weaponStats = weaponStats;
    }
    public int getTotalKills() {
        return totalKills;
    }
    public void setTotalKills(int totalKills) {
        this.totalKills = totalKills;
    }
    public long getTotalDamage() {
        return totalDamage;
    }
    public void setTotalDamage(long totalDamage) {
        this.totalDamage = totalDamage;
    }
    public int getTotalARKills() {
        return totalARKills;
    }
    public void setTotalARKills(int totalARKills) {
        this.totalARKills = totalARKills;
    }
    public long getTotalARDamage() {
        return totalARDamage;
    }
    public void setTotalARDamage(long totalARDamage) {
        this.totalARDamage = totalARDamage;
    }
    public int getTotalDMRKills() {
        return totalDMRKills;
    }
    public void setTotalDMRKills(int totalDMRKills) {
        this.totalDMRKills = totalDMRKills;
    }
    public long getTotalDMRDamage() {
        return totalDMRDamage;
    }
    public void setTotalDMRDamage(long totalDMRDamage) {
        this.totalDMRDamage = totalDMRDamage;
    }
    public int getTotalRifleKills() {
        return totalRifleKills;
    }
    public void setTotalRifleKills(int totalRifleKills) {
        this.totalRifleKills = totalRifleKills;
    }
    public long getTotalRifleDamage() {
        return totalRifleDamage;
    }
    public void setTotalRifleDamage(long totalRifleDamage) {
        this.totalRifleDamage = totalRifleDamage;
    }
    public int getTotalSMGKills() {
        return totalSMGKills;
    }
    public void setTotalSMGKills(int totalSMGKills) {
        this.totalSMGKills = totalSMGKills;
    }
    public long getTotalSMGDamage() {
        return totalSMGDamage;
    }
    public void setTotalSMGDamage(long totalSMGDamage) {
        this.totalSMGDamage = totalSMGDamage;
    }
    public int getTotalSRKills() {
        return totalSRKills;
    }
    public void setTotalSRKills(int totalSRKills) {
        this.totalSRKills = totalSRKills;
    }
    public long getTotalSRDamage() {
        return totalSRDamage;
    }
    public void setTotalSRDamage(long totalSRDamage) {
        this.totalSRDamage = totalSRDamage;
    }
    public int getTotalLMGKills() {
        return totalLMGKills;
    }
    public void setTotalLMGKills(int totalLMGKills) {
        this.totalLMGKills = totalLMGKills;
    }
    public long getTotalLMGDamage() {
        return totalLMGDamage;
    }
    public void setTotalLMGDamage(long totalLMGDamage) {
        this.totalLMGDamage = totalLMGDamage;
    }
    public int getTotalShotgunKills() {
        return totalShotgunKills;
    }
    public void setTotalShotgunKills(int totalShotgunKills) {
        this.totalShotgunKills = totalShotgunKills;
    }
    public long getTotalShotgunDamage() {
        return totalShotgunDamage;
    }
    public void setTotalShotgunDamage(long totalShotgunDamage) {
        this.totalShotgunDamage = totalShotgunDamage;
    }
    public int getTotalBowKills() {
        return totalBowKills;
    }
    public void setTotalBowKills(int totalBowKills) {
        this.totalBowKills = totalBowKills;
    }
    public int getTotalBowDamage() {
        return totalBowDamage;
    }
    public void setTotalBowDamage(int totalBowDamage) {
        this.totalBowDamage = totalBowDamage;
    }
    public int getTotalPistolKills() {
        return totalPistolKills;
    }
    public void setTotalPistolKills(int totalPistolKills) {
        this.totalPistolKills = totalPistolKills;
    }
    public int getTotalPistolDamage() {
        return totalPistolDamage;
    }
    public void setTotalPistolDamage(int totalPistolDamage) {
        this.totalPistolDamage = totalPistolDamage;
    }


    @Override
    public String toString() {
        return "PlayerDTO [playerName=" + playerName + ", accountId=" + accountId + ", statsByGameModes="
                + statsByGameModes + ", weaponStats=" + weaponStats + ", totalKills=" + totalKills + ", totalDamage="
                + totalDamage + ", totalARKills=" + totalARKills + ", totalARDamage=" + totalARDamage
                + ", totalDMRKills=" + totalDMRKills + ", totalDMRDamage=" + totalDMRDamage + ", totalRifleKills="
                + totalRifleKills + ", totalRifleDamage=" + totalRifleDamage + ", totalSMGKills=" + totalSMGKills
                + ", totalSMGDamage=" + totalSMGDamage + ", totalSRKills=" + totalSRKills + ", totalSRDamage="
                + totalSRDamage + ", totalLMGKills=" + totalLMGKills + ", totalLMGDamage=" + totalLMGDamage
                + ", totalShotgunKills=" + totalShotgunKills + ", totalShotgunDamage=" + totalShotgunDamage
                + ", totalBowKills=" + totalBowKills + ", totalBowDamage=" + totalBowDamage + ", totalPistolKills="
                + totalPistolKills + ", totalPistolDamage=" + totalPistolDamage + "]";
    }

}

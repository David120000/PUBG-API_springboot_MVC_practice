package rd.pubg_mvc.model.database;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import rd.pubg_mvc.model.DTO.PlayerDTO;

@Entity
@Table(name="totals")
public class Totals {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @Column(name="accountid")
    private String accountId;

    @Column(name="kills_all")
    private int totalKills;
    @Column(name="damage_all")
    private long totalDamage;

    @Column(name="kills_ar")
    private int totalARKills;
    @Column(name="damage_ar")
    private long totalARDamage;

    @Column(name="kills_dmr")
    private int totalDMRKills;
    @Column(name="damage_dmr")
    private long totalDMRDamage;

    @Column(name="kills_rifle")
    private int totalRifleKills;
    @Column(name="damage_rifle")
    private long totalRifleDamage;

    @Column(name="kills_smg")
    private int totalSMGKills;
    @Column(name="damage_smg")
    private long totalSMGDamage;

    @Column(name="kills_sr")
    private int totalSRKills;
    @Column(name="damage_sr")
    private long totalSRDamage;

    @Column(name="kills_lmg")
    private int totalLMGKills;
    @Column(name="damage_lmg")
    private long totalLMGDamage;

    @Column(name="kills_shotgun")
    private int totalShotgunKills;
    @Column(name="damage_shotgun")
    private long totalShotgunDamage;

    @Column(name="kills_bow")
    private int totalBowKills;
    @Column(name="damage_bow")
    private int totalBowDamage;

    @Column(name="kills_pistol")
    private int totalPistolKills;
    @Column(name="damage_pistol")
    private int totalPistolDamage;


    public void setAttributes(PlayerDTO playerDTO) {

        this.totalKills = playerDTO.getTotalKills();
        this.totalDamage = playerDTO.getTotalDamage();
        this.totalARKills = playerDTO.getTotalKills();
        this.totalARDamage = playerDTO.getTotalARDamage();
        this.totalDMRKills = playerDTO.getTotalDMRKills();
        this.totalDMRDamage = playerDTO.getTotalDMRDamage();
        this.totalRifleKills = playerDTO.getTotalRifleKills();
        this.totalRifleDamage = playerDTO.getTotalRifleDamage();
        this.totalSMGKills = playerDTO.getTotalSMGKills();
        this.totalSMGDamage = playerDTO.getTotalSMGDamage();
        this.totalSRKills = playerDTO.getTotalSRKills();
        this.totalSRDamage = playerDTO.getTotalSRDamage();
        this.totalLMGKills = playerDTO.getTotalLMGKills();
        this.totalLMGDamage = playerDTO.getTotalLMGDamage();
        this.totalShotgunKills = playerDTO.getTotalShotgunKills();
        this.totalShotgunDamage = playerDTO.getTotalShotgunDamage();
        this.totalBowKills = playerDTO.getTotalBowKills();
        this.totalBowDamage = playerDTO.getTotalBowDamage();
        this.totalPistolKills = playerDTO.getTotalPistolKills();
        this.totalPistolDamage = playerDTO.getTotalPistolDamage();
    }


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getAccountId() {
        return accountId;
    }
    public void setAccountId(String accountId) {
        this.accountId = accountId;
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

    
    
    
}

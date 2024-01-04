package rd.pubg_mvc.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import rd.pubg_mvc.model.WeaponTypeEnum;
import rd.pubg_mvc.model.DTO.PlayerDTO;
import rd.pubg_mvc.model.DTO.WeaponStatDTO;
import rd.pubg_mvc.model.mastery.MasteryDataContainer;
import rd.pubg_mvc.model.mastery.WeaponStats;
import rd.pubg_mvc.model.mastery.WeaponSummaries;
import rd.pubg_mvc.model.players.PlayerDataContainer;
import rd.pubg_mvc.model.stats.StatDataContainer;

@Service
public class PlayerDTOUtil {

    public PlayerDTO buildPlayerDTO(PlayerDataContainer playerMainData, StatDataContainer playerStatData,
            MasteryDataContainer playerWeaponMasteryData) {

        PlayerDTO dto = new PlayerDTO();

        dto.setPlayerName(playerMainData.getData().get(0).getAttributes().getName());
        dto.setAccountId(playerMainData.getData().get(0).getId());
        dto.setStatsByGameModes(playerStatData.getData().getAttributes().getGameModeStats());

        ArrayList<WeaponStatDTO> weaponStats = new ArrayList<>();
        dto.setWeaponStats(weaponStats);

        this.loadWeaponDataIntoList(playerWeaponMasteryData, weaponStats);

        this.calculateTotalsAndAverages(dto);

        return dto;
    }


    private void loadWeaponDataIntoList(MasteryDataContainer playerWeaponMasteryData, ArrayList<WeaponStatDTO> weaponStatsList) {

        WeaponSummaries summaries = playerWeaponMasteryData.getData().getAttributes().getWeaponSummaries();

        WeaponStatDTO ace32 = new WeaponStatDTO();
        this.loadStatsIntoWeaponStatDTO(ace32, "ACE32", "Item_Weapon_ACE32_C", WeaponTypeEnum.AR, summaries.getItem_Weapon_ACE32_C());
        weaponStatsList.add(ace32);
        
        WeaponStatDTO ak47 = new WeaponStatDTO();
        this.loadStatsIntoWeaponStatDTO(ak47, "AKM", "Item_Weapon_AK47_C", WeaponTypeEnum.AR, summaries.getItem_Weapon_AK47_C());
        weaponStatsList.add(ak47);

        WeaponStatDTO aug = new WeaponStatDTO();
        this.loadStatsIntoWeaponStatDTO(aug, "AUG", "Item_Weapon_AUG_C", WeaponTypeEnum.AR, summaries.getItem_Weapon_AUG_C());
        weaponStatsList.add(aug);

        WeaponStatDTO awm = new WeaponStatDTO();
        this.loadStatsIntoWeaponStatDTO(awm, "AWM", "Item_Weapon_AWM_C", WeaponTypeEnum.SR, summaries.getItem_Weapon_AWM_C());
        weaponStatsList.add(awm);

        WeaponStatDTO s686 = new WeaponStatDTO();
        this.loadStatsIntoWeaponStatDTO(s686, "S686", "Item_Weapon_Berreta686_C", WeaponTypeEnum.SHOTGUN, summaries.getItem_Weapon_Berreta686_C());
        weaponStatsList.add(s686);

        WeaponStatDTO beryl = new WeaponStatDTO();
        this.loadStatsIntoWeaponStatDTO(beryl, "Beryl M762", "Item_Weapon_BerylM762_C", WeaponTypeEnum.AR, summaries.getItem_Weapon_BerylM762_C());
        weaponStatsList.add(beryl);

        WeaponStatDTO bizon = new WeaponStatDTO();
        this.loadStatsIntoWeaponStatDTO(bizon, "Bizon PP19", "Item_Weapon_BizonPP19_C", WeaponTypeEnum.SMG, summaries.getItem_Weapon_BizonPP19_C());
        weaponStatsList.add(bizon);

        WeaponStatDTO crossbow = new WeaponStatDTO();
        this.loadStatsIntoWeaponStatDTO(crossbow, "Crossbow", "Item_Weapon_Crossbow_C", WeaponTypeEnum.BOW, summaries.getItem_Weapon_Crossbow_C());
        weaponStatsList.add(crossbow);

        WeaponStatDTO dbs = new WeaponStatDTO();
        this.loadStatsIntoWeaponStatDTO(dbs, "DBS", "Item_Weapon_DP12_C", WeaponTypeEnum.SHOTGUN, summaries.getItem_Weapon_DP12_C());
        weaponStatsList.add(dbs);

        WeaponStatDTO dp28 = new WeaponStatDTO();
        this.loadStatsIntoWeaponStatDTO(dp28, "DP-28", "Item_Weapon_DP28_C", WeaponTypeEnum.LMG, summaries.getItem_Weapon_DP28_C());
        weaponStatsList.add(dp28);

        WeaponStatDTO deagle = new WeaponStatDTO();
        this.loadStatsIntoWeaponStatDTO(deagle, "Desert Eagle", "Item_Weapon_DesertEagle_C", WeaponTypeEnum.PISTOL, summaries.getItem_Weapon_DesertEagle_C());
        weaponStatsList.add(deagle);

        WeaponStatDTO dragunov = new WeaponStatDTO();
        this.loadStatsIntoWeaponStatDTO(dragunov, "Dragunov", "Item_Weapon_Dragunov_C", WeaponTypeEnum.DMR, summaries.getItem_Weapon_Dragunov_C());
        weaponStatsList.add(dragunov);

        WeaponStatDTO famas = new WeaponStatDTO();
        this.loadStatsIntoWeaponStatDTO(famas, "Famas", "Item_Weapon_FAMASG2_C", WeaponTypeEnum.AR, summaries.getItem_Weapon_FAMASG2_C());
        weaponStatsList.add(famas);

        WeaponStatDTO slr = new WeaponStatDTO();
        this.loadStatsIntoWeaponStatDTO(slr, "SLR", "Item_Weapon_FNFal_C", WeaponTypeEnum.DMR, summaries.getItem_Weapon_FNFal_C());
        weaponStatsList.add(slr);

        WeaponStatDTO p18c = new WeaponStatDTO();
        this.loadStatsIntoWeaponStatDTO(p18c, "P18C", "Item_Weapon_G18_C", WeaponTypeEnum.PISTOL, summaries.getItem_Weapon_G18_C());
        weaponStatsList.add(p18c);

        WeaponStatDTO g36 = new WeaponStatDTO();
        this.loadStatsIntoWeaponStatDTO(g36, "G36C", "Item_Weapon_G36C_C", WeaponTypeEnum.AR, summaries.getItem_Weapon_G36C_C());
        weaponStatsList.add(g36);

        WeaponStatDTO groza = new WeaponStatDTO();
        this.loadStatsIntoWeaponStatDTO(groza, "Groza", "Item_Weapon_Groza_C", WeaponTypeEnum.AR, summaries.getItem_Weapon_Groza_C());
        weaponStatsList.add(groza);

        WeaponStatDTO m416 = new WeaponStatDTO();
        this.loadStatsIntoWeaponStatDTO(m416, "M416", "Item_Weapon_HK416_C", WeaponTypeEnum.AR, summaries.getItem_Weapon_HK416_C());
        weaponStatsList.add(m416);

        WeaponStatDTO js9 = new WeaponStatDTO();
        this.loadStatsIntoWeaponStatDTO(js9, "JS9", "Item_Weapon_JS9_C", WeaponTypeEnum.SMG, summaries.getItem_Weapon_JS9_C());
        weaponStatsList.add(js9);

        WeaponStatDTO k2 = new WeaponStatDTO();
        this.loadStatsIntoWeaponStatDTO(k2, "K2", "Item_Weapon_K2_C", WeaponTypeEnum.AR, summaries.getItem_Weapon_K2_C());
        weaponStatsList.add(k2);

        WeaponStatDTO kar98k = new WeaponStatDTO();
        this.loadStatsIntoWeaponStatDTO(kar98k, "Kar98k", "Item_Weapon_Kar98k_C", WeaponTypeEnum.SR, summaries.getItem_Weapon_Kar98k_C());
        weaponStatsList.add(kar98k);

        WeaponStatDTO lynx = new WeaponStatDTO();
        this.loadStatsIntoWeaponStatDTO(lynx, "L6 Lynx AMR", "Item_Weapon_L6_C", WeaponTypeEnum.SR, summaries.getItem_Weapon_L6_C());
        weaponStatsList.add(lynx);

        WeaponStatDTO m16 = new WeaponStatDTO();
        this.loadStatsIntoWeaponStatDTO(m16, "M16A4", "Item_Weapon_M16A4_C", WeaponTypeEnum.AR, summaries.getItem_Weapon_M16A4_C());
        weaponStatsList.add(m16);

        WeaponStatDTO p1911 = new WeaponStatDTO();
        this.loadStatsIntoWeaponStatDTO(p1911, "P1911", "Item_Weapon_M1911_C", WeaponTypeEnum.PISTOL, summaries.getItem_Weapon_M1911_C());
        weaponStatsList.add(p1911);

        WeaponStatDTO m249 = new WeaponStatDTO();
        this.loadStatsIntoWeaponStatDTO(m249, "M249", "Item_Weapon_M249_C", WeaponTypeEnum.LMG, summaries.getItem_Weapon_M249_C());
        weaponStatsList.add(m249);

        WeaponStatDTO m24 = new WeaponStatDTO();
        this.loadStatsIntoWeaponStatDTO(m24, "M24", "Item_Weapon_M24_C", WeaponTypeEnum.SR, summaries.getItem_Weapon_M24_C());
        weaponStatsList.add(m24);

        WeaponStatDTO p92 = new WeaponStatDTO();
        this.loadStatsIntoWeaponStatDTO(p92, "P92", "Item_Weapon_M9_C", WeaponTypeEnum.PISTOL, summaries.getItem_Weapon_M9_C());
        weaponStatsList.add(p92);

        WeaponStatDTO mg3 = new WeaponStatDTO();
        this.loadStatsIntoWeaponStatDTO(mg3, "MG3", "Item_Weapon_MG3_C", WeaponTypeEnum.LMG, summaries.getItem_Weapon_MG3_C());
        weaponStatsList.add(mg3);

        WeaponStatDTO mp5 = new WeaponStatDTO();
        this.loadStatsIntoWeaponStatDTO(mp5, "MP5K", "Item_Weapon_MP5K_C", WeaponTypeEnum.SMG, summaries.getItem_Weapon_MP5K_C());
        weaponStatsList.add(mp5);

        WeaponStatDTO mp9 = new WeaponStatDTO();
        this.loadStatsIntoWeaponStatDTO(mp9, "MP9", "Item_Weapon_MP9_C", WeaponTypeEnum.SMG, summaries.getItem_Weapon_MP9_C());
        weaponStatsList.add(mp9);

        WeaponStatDTO mini14 = new WeaponStatDTO();
        this.loadStatsIntoWeaponStatDTO(mini14, "Mini-14", "Item_Weapon_Mini14_C", WeaponTypeEnum.DMR, summaries.getItem_Weapon_Mini14_C());
        weaponStatsList.add(mini14);

        WeaponStatDTO mk12 = new WeaponStatDTO();
        this.loadStatsIntoWeaponStatDTO(mk12, "Mk12", "Item_Weapon_Mk12_C", WeaponTypeEnum.DMR, summaries.getItem_Weapon_Mk12_C());
        weaponStatsList.add(mk12);

        WeaponStatDTO mk14 = new WeaponStatDTO();
        this.loadStatsIntoWeaponStatDTO(mk14, "Mk14", "Item_Weapon_Mk14_C", WeaponTypeEnum.DMR, summaries.getItem_Weapon_Mk14_C());
        weaponStatsList.add(mk14);

        WeaponStatDTO mutant = new WeaponStatDTO();
        this.loadStatsIntoWeaponStatDTO(mutant, "Mk47 Mutant", "Item_Weapon_Mk47Mutant_C", WeaponTypeEnum.AR, summaries.getItem_Weapon_Mk47Mutant_C());
        weaponStatsList.add(mutant);

        WeaponStatDTO mosin = new WeaponStatDTO();
        this.loadStatsIntoWeaponStatDTO(mosin, "Mosin Nagant", "Item_Weapon_Mosin_C", WeaponTypeEnum.SR, summaries.getItem_Weapon_Mosin_C());
        weaponStatsList.add(mosin);

        WeaponStatDTO r1895 = new WeaponStatDTO();
        this.loadStatsIntoWeaponStatDTO(r1895, "R1895", "Item_Weapon_NagantM1895_C", WeaponTypeEnum.PISTOL, summaries.getItem_Weapon_NagantM1895_C());
        weaponStatsList.add(r1895);

        WeaponStatDTO o12 = new WeaponStatDTO();
        this.loadStatsIntoWeaponStatDTO(o12, "O12", "Item_Weapon_OriginS12_C", WeaponTypeEnum.SHOTGUN, summaries.getItem_Weapon_OriginS12_C());
        weaponStatsList.add(o12);

        WeaponStatDTO p90 = new WeaponStatDTO();
        this.loadStatsIntoWeaponStatDTO(p90, "P90", "Item_Weapon_P90_C", WeaponTypeEnum.SMG, summaries.getItem_Weapon_P90_C());
        weaponStatsList.add(p90);

        WeaponStatDTO qbu = new WeaponStatDTO();
        this.loadStatsIntoWeaponStatDTO(qbu, "QBU", "Item_Weapon_QBU88_C", WeaponTypeEnum.DMR, summaries.getItem_Weapon_QBU88_C());
        weaponStatsList.add(qbu);

        WeaponStatDTO qbz = new WeaponStatDTO();
        this.loadStatsIntoWeaponStatDTO(qbz, "QBZ", "Item_Weapon_QBZ95_C", WeaponTypeEnum.AR, summaries.getItem_Weapon_QBZ95_C());
        weaponStatsList.add(qbz);

        WeaponStatDTO r45 = new WeaponStatDTO();
        this.loadStatsIntoWeaponStatDTO(r45, "R45", "Item_Weapon_Rhino_C", WeaponTypeEnum.PISTOL, summaries.getItem_Weapon_Rhino_C());
        weaponStatsList.add(r45);

        WeaponStatDTO scar = new WeaponStatDTO();
        this.loadStatsIntoWeaponStatDTO(scar, "SCAR-L", "Item_Weapon_SCAR_L_C", WeaponTypeEnum.AR, summaries.getItem_Weapon_SCAR_L_C());
        weaponStatsList.add(scar);

        WeaponStatDTO sks = new WeaponStatDTO();
        this.loadStatsIntoWeaponStatDTO(sks, "SKS", "Item_Weapon_SKS_C", WeaponTypeEnum.DMR, summaries.getItem_Weapon_SKS_C());
        weaponStatsList.add(sks);

        WeaponStatDTO s12k = new WeaponStatDTO();
        this.loadStatsIntoWeaponStatDTO(s12k, "S12K", "Item_Weapon_Saiga12_C", WeaponTypeEnum.SHOTGUN, summaries.getItem_Weapon_Saiga12_C());
        weaponStatsList.add(s12k);

        WeaponStatDTO sawedoff = new WeaponStatDTO();
        this.loadStatsIntoWeaponStatDTO(sawedoff, "Sawed-Off", "Item_Weapon_Sawnoff_C", WeaponTypeEnum.PISTOL, summaries.getItem_Weapon_Sawnoff_C());
        weaponStatsList.add(sawedoff);

        WeaponStatDTO tommygun = new WeaponStatDTO();
        this.loadStatsIntoWeaponStatDTO(tommygun, "Tommy Gun", "Item_Weapon_Thompson_C", WeaponTypeEnum.SMG, summaries.getItem_Weapon_Thompson_C());
        weaponStatsList.add(tommygun);

        WeaponStatDTO ump = new WeaponStatDTO();
        this.loadStatsIntoWeaponStatDTO(ump, "UMP45", "Item_Weapon_UMP_C", WeaponTypeEnum.SMG, summaries.getItem_Weapon_UMP_C());
        weaponStatsList.add(ump);

        WeaponStatDTO uzi = new WeaponStatDTO();
        this.loadStatsIntoWeaponStatDTO(uzi, "Micro UZI", "Item_Weapon_UZI_C", WeaponTypeEnum.SMG, summaries.getItem_Weapon_UZI_C());
        weaponStatsList.add(uzi);

        WeaponStatDTO vss = new WeaponStatDTO();
        this.loadStatsIntoWeaponStatDTO(vss, "VSS", "Item_Weapon_VSS_C", WeaponTypeEnum.RIFLE, summaries.getItem_Weapon_VSS_C());
        weaponStatsList.add(vss);

        WeaponStatDTO vector = new WeaponStatDTO();
        this.loadStatsIntoWeaponStatDTO(vector, "Vector", "Item_Weapon_Vector_C", WeaponTypeEnum.SMG, summaries.getItem_Weapon_Vector_C());
        weaponStatsList.add(vector);

        WeaponStatDTO winchester = new WeaponStatDTO();
        this.loadStatsIntoWeaponStatDTO(winchester, "Winchester 1894", "Item_Weapon_Win1894_C", WeaponTypeEnum.RIFLE, summaries.getItem_Weapon_Win1894_C());
        weaponStatsList.add(winchester);

        WeaponStatDTO s1897 = new WeaponStatDTO();
        this.loadStatsIntoWeaponStatDTO(s1897, "S1897", "Item_Weapon_Winchester_C", WeaponTypeEnum.SHOTGUN, summaries.getItem_Weapon_Winchester_C());
        weaponStatsList.add(s1897);

        WeaponStatDTO skorpion = new WeaponStatDTO();
        this.loadStatsIntoWeaponStatDTO(skorpion, "Skorpion vzor61", "Item_Weapon_vz61Skorpion_C", WeaponTypeEnum.PISTOL, summaries.getItem_Weapon_vz61Skorpion_C());
        weaponStatsList.add(skorpion);
    }

    private void loadStatsIntoWeaponStatDTO(WeaponStatDTO dto, String weaponName, String ingameId, WeaponTypeEnum type, WeaponStats weaponStats) {

        dto.setWeaponName(weaponName);
        dto.setIngameId(ingameId);
        dto.setWeaponType(type);

        if(weaponStats != null) {

            dto.setMasteryLevel(weaponStats.getLevelCurrent() + (weaponStats.getTierCurrent() * 100));

            dto.setKills(weaponStats.getStatsTotal().getKills() + weaponStats.getOfficialStatsTotal().getKills() + weaponStats.getCompetitiveStatsTotal().getKills());
            dto.setMostKillsInAGame( 
                maxInt(weaponStats.getStatsTotal().getMostKillsInAGame(), 
                weaponStats.getOfficialStatsTotal().getMostKillsInAGame(), 
                weaponStats.getCompetitiveStatsTotal().getMostKillsInAGame()) );
            dto.setDamage(weaponStats.getStatsTotal().getDamagePlayer() + weaponStats.getOfficialStatsTotal().getDamagePlayer() + weaponStats.getCompetitiveStatsTotal().getDamagePlayer());
            dto.setdBNOs(weaponStats.getStatsTotal().getGroggies() + weaponStats.getOfficialStatsTotal().getGroggies() + weaponStats.getCompetitiveStatsTotal().getGroggies());
            dto.setHeadShots(weaponStats.getStatsTotal().getHeadShots() + weaponStats.getOfficialStatsTotal().getHeadShots() + weaponStats.getCompetitiveStatsTotal().getHeadShots());

            Double longestDefeat = weaponStats.getStatsTotal().getLongestDefeat();

            dto.setLongestKill( 
                maxInt( longestDefeat.intValue(), 
                weaponStats.getOfficialStatsTotal().getLongestKill(), 
                weaponStats.getCompetitiveStatsTotal().getLongestKill()));
        }
        else {

            dto.setMasteryLevel(0);
            dto.setKills(0);
            dto.setMostKillsInAGame(0);
            dto.setDamage(0);
            dto.setdBNOs(0);
            dto.setHeadShots(0);
            dto.setLongestKill(0);
        }
        
    }


    private int maxInt(int a, int b, int c) {

        int biggest = a;

        if(b > biggest) {
            biggest = b;
        }

        if(c > biggest) {
            biggest = c;
        }

        return biggest;
    }



    private void calculateTotalsAndAverages(PlayerDTO dto) {

        for(WeaponStatDTO weaponStat : dto.getWeaponStats()) {

            dto.setTotalKills( dto.getTotalKills() + weaponStat.getKills() );
            dto.setTotalDamage( dto.getTotalDamage() + weaponStat.getDamage() );

            if(weaponStat.getWeaponType() == WeaponTypeEnum.AR) {

                dto.setTotalARKills( dto.getTotalARKills() + weaponStat.getKills() );
                dto.setTotalARDamage( dto.getTotalARDamage() + weaponStat.getDamage() );
            }
            else if(weaponStat.getWeaponType() == WeaponTypeEnum.BOW) {

                dto.setTotalBowKills( dto.getTotalBowKills() + weaponStat.getKills() );
                dto.setTotalBowDamage( dto.getTotalBowDamage() + weaponStat.getDamage() );
            }
            else if(weaponStat.getWeaponType() == WeaponTypeEnum.DMR) {

                dto.setTotalDMRKills( dto.getTotalDMRKills() + weaponStat.getKills() );
                dto.setTotalDMRDamage( dto.getTotalDMRDamage() + weaponStat.getDamage() );
            }
            else if(weaponStat.getWeaponType() == WeaponTypeEnum.LMG) {

                dto.setTotalLMGKills( dto.getTotalLMGKills() + weaponStat.getKills() );
                dto.setTotalLMGDamage( dto.getTotalLMGDamage() + weaponStat.getDamage() );
            }
            else if(weaponStat.getWeaponType() == WeaponTypeEnum.PISTOL) {

                dto.setTotalPistolKills( dto.getTotalPistolKills() + weaponStat.getKills() );
                dto.setTotalPistolDamage( dto.getTotalPistolDamage() + weaponStat.getDamage() );
            }
            else if(weaponStat.getWeaponType() == WeaponTypeEnum.RIFLE) {

                dto.setTotalRifleKills( dto.getTotalRifleKills() + weaponStat.getKills() );
                dto.setTotalRifleDamage( dto.getTotalRifleDamage() + weaponStat.getDamage() );
            }
            else if(weaponStat.getWeaponType() == WeaponTypeEnum.SHOTGUN) {

                dto.setTotalShotgunKills( dto.getTotalShotgunKills() + weaponStat.getKills() );
                dto.setTotalShotgunDamage( dto.getTotalShotgunDamage() + weaponStat.getDamage() );
            }
            else if(weaponStat.getWeaponType() == WeaponTypeEnum.SMG) {

                dto.setTotalSMGKills( dto.getTotalSMGKills() + weaponStat.getKills() );
                dto.setTotalSMGDamage( dto.getTotalSMGDamage() + weaponStat.getDamage() );
            }
            else if(weaponStat.getWeaponType() == WeaponTypeEnum.SR) {

                dto.setTotalSRKills( dto.getTotalSRKills() + weaponStat.getKills() );
                dto.setTotalSRDamage( dto.getTotalSRDamage() + weaponStat.getDamage() );
            }

        }
    }
    
}

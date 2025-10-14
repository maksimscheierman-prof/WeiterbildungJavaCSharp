package A18_DungeonCrawl.archetypes;

import A18_DungeonCrawl.weapons.Weapon;

public abstract class Archetype {
    private double bonusLifepoints;
    private Double dmgMulti;


    public Double getDmgMulti(Weapon weapon){
        return weapon.getDmg();
    }

    public Double getBonusLifepoints() {
        return bonusLifepoints;
    }
}

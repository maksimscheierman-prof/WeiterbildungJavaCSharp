package A18_DungeonCrawl.archetypes;

import A18_DungeonCrawl.weapons.Weapon;

public class Mage extends Archetype {
    private Double bonusLifepoints = 8.0;
    private Double dmgMulti;


    @Override
    public Double getDmgMulti(Weapon weapon) {
        Double bonus = 1.0;
        switch (weapon.getType()) {
            case "Melee":
                bonus = 0.5;
                break;
            case "Range":
                bonus = 1.0;
                break;
            case "Staff":
                bonus = 1.5;
        }
        return bonus;
    }
}

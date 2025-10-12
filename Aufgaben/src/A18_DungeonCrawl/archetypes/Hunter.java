package A18_DungeonCrawl.archetypes;

import A18_DungeonCrawl.weapons.Weapon;

public class Hunter extends Archetype {
    private Double Lifepoints = 10.0;
    private Integer Strength = 1;
    private Integer Intelligence = 1;
    private Integer Dexterity = 3;


    public Hunter(Double lifepoints, Integer strength, Integer intelligence, Integer dexterity) {
        super(lifepoints, strength, intelligence, dexterity);
    }

    @Override
    public Double dealDamge(Weapon weapon) {
        Double bonus = 1.0;
        switch (weapon.getType()) {
            case "Melee":
                bonus = 0.5;
                break;
            case "Range":
                bonus = 1.5;
                break;
            case "Staff":
                bonus = 1.0;
        }
        return weapon.getDmg()*bonus;
    }
}

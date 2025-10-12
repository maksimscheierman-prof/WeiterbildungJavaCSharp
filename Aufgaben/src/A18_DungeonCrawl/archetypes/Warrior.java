package A18_DungeonCrawl.archetypes;

import A18_DungeonCrawl.weapons.Weapon;

public class Warrior extends Archetype {
    private Double Lifepoints = 15.0;
    private Integer Strength = 3;
    private Integer Intelligence = 1;
    private Integer Dexterity = 1;


    public Warrior(Double lifepoints, Integer strength, Integer intelligence, Integer dexterity) {
        super(lifepoints, strength, intelligence, dexterity);
    }

    @Override
    public Double dealDamge(Weapon weapon) {
        Double bonus = 1.0;
        switch (weapon.getType()) {
            case "Melee":
                bonus = 1.5;
                break;
            case "Range":
                bonus = 1.0;
                break;
            case "Staff":
                bonus = 0.5;
        }
        return weapon.getDmg()*bonus;
    }
}

package A18_DungeonCrawl.archetypes;

import A18_DungeonCrawl.weapons.Weapon;

public abstract class Archetype {
    private Double Lifepoints;
    private Integer Strength;
    private Integer Intelligence;
    private Integer Dexterity;

    public Integer getDexterity() {
        return Dexterity;
    }

    public void setDexterity(Integer dexterity) {
        Dexterity = dexterity;
    }

    public Double dealDamge(Weapon weapon){
        return weapon.getDmg();
    }

    public Double getLifepoints() {
        return Lifepoints;
    }

    public void setLifepoints(Double lifepoints) {
        Lifepoints = lifepoints;
    }

    public Integer getStrength() {
        return Strength;
    }

    public void setStrength(Integer strength) {
        Strength = strength;
    }

    public Integer getIntelligence() {
        return Intelligence;
    }

    public void setIntelligence(Integer intelligence) {
        Intelligence = intelligence;
    }

    public Archetype(Double lifepoints, Integer strength, Integer intelligence, Integer dexterity) {
        Lifepoints = lifepoints;
        Strength = strength;
        Intelligence = intelligence;
        Dexterity = dexterity;
    }
}

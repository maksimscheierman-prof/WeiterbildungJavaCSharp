package A18_DungeonCrawl.archetypes;

import A18_DungeonCrawl.weapons.Weapon;

public abstract class Archetype {
    private double lifepoints;
    private int strength;
    private int intelligence;
    private int dexterity;


    public Integer getDexterity() {
        return dexterity;
    }

    public void setDexterity(Integer dexterity) {
        this.dexterity = dexterity;
    }

    public Double dealDamge(Weapon weapon){
        return weapon.getDmg();
    }

    public Double getLifepoints() {
        return lifepoints;
    }

    public void setLifepoints(Double lifepoints) {
        this.lifepoints = lifepoints;
    }

    public Integer getStrength() {
        return strength;
    }

    public void setStrength(Integer strength) {
        this.strength = strength;
    }

    public Integer getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(Integer intelligence) {
        this.intelligence = intelligence;
    }

    public Archetype(Double lifepoints, Integer strength, Integer intelligence, Integer dexterity) {
        this.lifepoints = lifepoints;
        this.strength = strength;
        this.intelligence = intelligence;
        this.dexterity = dexterity;
    }
}

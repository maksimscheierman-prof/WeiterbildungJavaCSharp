package A18_DungeonCrawl.weapons;

public class Weapon {
    private String Type;
    private Integer Range;
    private Double Dmg;

    public Weapon(String type, Integer range, Double dmg) {
        Type = type;
        Range = range;
        Dmg = dmg;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public Integer getRange() {
        return Range;
    }

    public void setRange(Integer range) {
        Range = range;
    }

    public Double getDmg() {
        return Dmg;
    }

    public void setDmg(Double dmg) {
        Dmg = dmg;
    }
}

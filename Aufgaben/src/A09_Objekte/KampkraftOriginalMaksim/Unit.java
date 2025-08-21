package A09_Objekte.KampkraftOriginalMaksim;

public class Unit {
    //Attributes
    private String name;
    private Integer power;

    //Getter & Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }
    //Constructor

    public Unit(String name, Integer power) {
        this.name = name;
        this.power = power;
    }
}

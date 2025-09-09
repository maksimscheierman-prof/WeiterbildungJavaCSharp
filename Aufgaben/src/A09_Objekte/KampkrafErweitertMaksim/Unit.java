package A09_Objekte.KampkrafErweitertMaksim;

public class Unit {
    //Variables
    private String name;
    private Integer cost;
    private Integer lifepoints;
    private Dice power;

    //Constructor
    public Unit ( String name,Integer cost,  Integer lifepoints, Dice power){
        this.name = name;
        this.power = power;
        this.cost = cost;
        this.lifepoints = lifepoints;
    }

    //Getter & Setter
    public String getName(){return this.name;}
    public String getPower(){return power.toString();}
    public Integer getRoll(){return power.roll();}
    public Integer getCost(){return this.cost;}
    public Integer getLifepoints(){return this.lifepoints;}
    public Dice getDice() {
        return power;
    }

}

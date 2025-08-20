package A09_Objekte.KampkrafMaksim;

public class Unit {
    //Variables
    String name;
    Integer power;
    Integer cost;
    Integer lifepoints;

    //Constructor
    public Unit ( String name, Integer power, Integer cost, Integer lifepoints){
        this.name = name;
        this.power = power;
        this.cost = cost;
        this.lifepoints = lifepoints;
    }

    //Getter & Setter
    public String getName(){return this.name;}
    public Integer getPower(){return this.power;}
    public Integer getCost(){return this.cost;}
    public Integer getLifepoints(){return this.lifepoints;}

    public void setPower(int power){
        if(power > 0){
            this.power = power;
        }
    }

    //Methods
}

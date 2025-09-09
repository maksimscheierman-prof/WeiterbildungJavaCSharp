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

    //Methods
    public int calculateDamage(Unit opponent) {
        return this.getRoll(); // Basisschaden
    }

    @Override
    public String toString() {
        // Die Ausgabe des Typs erfolgt jetzt über den Klassennamen
        return String.format("Einheit: %s (%s) | Stärke: %d, Leben: %d, Kosten: %d",
                this.name, this.getClass().getSimpleName(), this.power, this.lifepoints, this.cost);
    }
}


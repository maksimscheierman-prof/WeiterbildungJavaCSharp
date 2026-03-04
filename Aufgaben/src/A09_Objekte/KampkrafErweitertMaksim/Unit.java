package A09_Objekte.KampkrafErweitertMaksim;

public abstract class Unit {
    private static int nextId = 1;
    //Variables
    private final int id;
    private String name;
    private Integer cost;
    private Integer lifepoints;
    private Dice power;
    private int maxLifepoints;

    //Constructor
    public Unit ( String name,Integer cost,  Integer lifepoints, Dice power){
        this.id = nextId++;
        this.name = name;
        this.power = power;
        this.cost = cost;
        this.lifepoints = lifepoints;
        this.maxLifepoints = lifepoints; //initial max hp
    }

    //Getter & Setter
    public int getId() { return id; }
    public String getName() { return name; }
    public int getCost() { return cost; }

    public void setLifepoints(Integer lifepoints) {
        this.lifepoints = lifepoints;
    }
    public int getMaxLifepoints() {
        return maxLifepoints;
    }
    public int getLifepoints() { return lifepoints; }
    public String getPower() { return power.toString(); }
    public int getRoll() { return power.roll(); }
    public Dice getDice() {
        return power;
    }
    public abstract String getType();

    //Methods
    public int calculateDamage(Unit opponent) {
        return this.getRoll(); // Basisschaden
    }


    @Override
    public String toString() {
        return String.format(
                "ID: %d | Einheit: %s (%s) | Stärke: %s, Leben: %d, Kosten: %d, Type: %s",
                id,
                this.name,
                this.getClass().getSimpleName(),
                this.power.toString(),
                this.lifepoints,
                this.cost,
                getType()
        );
    }
}


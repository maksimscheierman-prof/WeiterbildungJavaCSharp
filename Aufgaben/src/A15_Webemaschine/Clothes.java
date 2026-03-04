package A15_Webemaschine;

public class Clothes {
    private String brand;
    private Double cost;
    private String material;

    {
        cost = 0.05;
        material = "Wool";
    }

    public Clothes(){}

    public Clothes(String brand, Double cost, String material) {
        this.brand = brand;
        this.cost = cost;
        this.material = material;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }
}

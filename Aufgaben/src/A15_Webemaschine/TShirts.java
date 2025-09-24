package A15_Webemaschine;

public class TShirts extends Clothes {
    private String collar;

    public TShirts(String brand, Double cost, String material, String collar) {
        super(brand, cost, material);
        this.collar = collar;
    }

    public String getCollar() {
        return collar;
    }

    public void setCollar(String collar) {
        this.collar = collar;
    }

    @Override
    public String toString() {
        return "T-Shirt mit " + collar + " Kragen: " + super.toString();
    }
}

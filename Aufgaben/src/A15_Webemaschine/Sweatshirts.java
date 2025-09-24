package A15_Webemaschine;

public class Sweatshirts extends Clothes {
    private boolean hoodie;

    public Sweatshirts(String brand, Double cost, String material, Boolean hoodie) {
        super(brand, cost, material);
        this.hoodie = hoodie;
    }

    public boolean hasHoodie() {
        return hoodie;
    }

    public void setHoodie(boolean hoodie) {
        this.hoodie = hoodie;
    }

    @Override
    public String toString() {
        return "Pullover " + (hoodie ? "mit Kapuze" : "ohne Kapuze") + ": " + super.toString();
    }
}

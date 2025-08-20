package A09_Objekte_snackautomat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Snacks {

    //Variables
    private String name;
    private int amount;
    private double price;
    private Map<String, Double> nutrients = new HashMap<>();

    //Constructor
    public Snacks(String name, int amount, double price, double fat, double carbs, double protein) {
        this.name = name;
        this.amount = amount;
        this.price = price;

        nutrients.put("Fat", fat);
        nutrients.put("Protein", protein);
        nutrients.put("Carbohydrate", carbs);
    }

    //Getter & Setter
    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public int getAmount() {
        return this.amount;
    }
    public Map<String, Double> getNutrients() {
        return this.nutrients;
    }

    public void setAmount(int amount) {
        if (amount >= 0 && amount <=10) {
            this.amount = amount;
        }
    }

    //Methods
    public static void createInitialSnacks(ArrayList<Snacks> snacks) {
        snacks.add(new Snacks("Chips", 8, 2.10, 35.0, 50.0, 6.0));
        snacks.add(new Snacks("Schokolade", 5, 2.50, 30.0, 55.0, 5.0));
        snacks.add(new Snacks("Nüsse", 10, 3.0, 50.0, 20.0, 25.0));

    }

    public static void showSnacks(ArrayList<Snacks> snacks) {
        for (Snacks snack : snacks) {
            //System.out.println("Name " + snack.name + " Menge " + snack.amount + " Nährwerte " + snack.nutrients);
            System.out.println("Name: " + snack.getName() + " Menge: " + snack.getAmount() + " Preis in €: " + snack.getPrice());
        }
    }

    public static void refillableSnacks(ArrayList<Snacks> snacks) {
        for (Snacks snack : snacks) {
            if (snack.getAmount() < 10) {
                System.out.println("Name: " + snack.name + " Menge: " + snack.amount);
            }
        }
    }

    public static void updateSnackAmount(Snacks snack, int amount){
        snack.setAmount(snack.getAmount() + amount);
    }
}

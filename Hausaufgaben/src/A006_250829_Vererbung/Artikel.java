package A006_250829_Vererbung;

import java.util.HashMap;
import java.util.Map;

public class Artikel {

     //Attributes
    private String name;
    private int amount;
    private double price;
    private Map<String, Double> nutrients = new HashMap<>();

    public Artikel(double fat, double protein, double carbs, double grammperUnit, double price, int amount, String name) {
        nutrients.put("Fat", fat);
        nutrients.put("Protein", protein);
        nutrients.put("Carbohydrate", carbs);
        nutrients.put("GrammProEinheit", grammperUnit);
        this.price = price;
        this.amount = amount;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Map<String, Double> getNutrients() {
        return nutrients;
    }

    public void setNutrients(Map<String, Double> nutrients) {
        this.nutrients = nutrients;
    }

    public Artikel() {
    }
}

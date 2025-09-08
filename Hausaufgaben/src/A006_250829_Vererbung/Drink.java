package A006_250829_Vererbung;
import java.util.List;
import java.util.ArrayList;

public class Drink extends Artikel {

    private Integer pfand;
    private Double alkoholprozent;

    public Drink(double fat, double protein, double carbs, double grammperUnit, double price, int amount, String name, Integer pfand, Double alkoholprozent) {
        super(fat, protein, carbs, grammperUnit, price, amount, name);
        this.pfand = pfand;
        this.alkoholprozent = alkoholprozent;
    }

    //Methods
    public static void createInitialDrinks(ArrayList<Drink> drinks) {


        drinks.add(new Drink(0, 0, 35, 330, 1.20, 30, "Cola", 25, 0.0));
        drinks.add(new Drink(0, 0, 0, 500, 0.99, 40, "Mineral Water", 25, 0.0));
        drinks.add(new Drink(0, 1, 10, 250, 1.50, 20, "Orange Juice", 25, 0.0));
        drinks.add(new Drink(0, 0, 3, 330, 1.10, 25, "Iced Tea", 25, 0.0));
        drinks.add(new Drink(0, 0, 0, 500, 2.50, 15, "Beer", 25, 5.0));
        drinks.add(new Drink(0, 0, 0, 700, 8.90, 10, "Wine", 50, 12.0));

    }
    public static void showDrinks(List<Drink> drinks) {
        for (Drink drink : drinks) {
            System.out.println(
                    "Name: " + drink.getName() +
                            " | Menge: " + drink.getAmount() +
                            " | Preis in €: " + drink.getPrice() +
                            " | Pfand: " + drink.pfand +
                            " | Alkohol: " + drink.alkoholprozent + "%"
            );
        }
    }
}

package A006_250829_Vererbung;

import java.util.List;
import java.util.ArrayList;

public class Snack extends Artikel {
    private Double amountPerUnit; // neues Attribut

    public Snack(double fat, double protein, double carbs, double grammperUnit,
                 double price, int amount, String name, Double amountPerUnit) {
        super(fat, protein, carbs, grammperUnit, price, amount, name);
        this.amountPerUnit = amountPerUnit;
    }

    // Getter (falls du es von außen brauchst)
    public Double getAmountPerUnit() {
        return amountPerUnit;
    }

    // Beispiel-Initialisierung von Snacks
    public static void createInitialSnacks(ArrayList<Snack> snacks) {
        snacks.add(new Snack(10, 5, 50, 100, 1.50, 10, "Chips", 100.0));
        snacks.add(new Snack(8, 2, 30, 80, 1.20, 15, "Chocolate Bar", 80.0));
        snacks.add(new Snack(12, 4, 45, 60, 0.99, 20, "Cookies", 60.0));
        snacks.add(new Snack(6, 3, 25, 75, 1.10, 12, "Crackers", 75.0));
    }

    // Ausgabe-Methode
    public static void showSnacks(List<Snack> snacks) {
        for (Snack snack : snacks) {
            System.out.println(
                    "Name: " + snack.getName() +
                            " | Menge: " + snack.getAmount() +
                            " | Preis in €: " + snack.getPrice() +
                            " | Gramm pro Einheit: " + snack.amountPerUnit
            );
        }
    }
}

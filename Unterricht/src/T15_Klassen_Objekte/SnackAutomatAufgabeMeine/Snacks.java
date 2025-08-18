package T15_Klassen_Objekte.SnackAutomatAufgabeMeine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Snacks {
    //Variablen
    private String name;
    private int amount;
    private Map<String, Double> nutrients = new HashMap<>();

    //Contructor
    public Snacks(String name, int amount, double fat, double carbs, double protein){
        this.name = name;
        this.amount = amount;

        nutrients.put("Fat", fat);
        nutrients.put("Protein", protein);
        nutrients.put("Carbohydrate", carbs);
    }

    public static void createInitialSnacks(ArrayList<Snacks> snacks){
        snacks.add(new Snacks("Chips",8,35.0,50.0,6.0));
        snacks.add(new Snacks("Chocolate",5,30.0,55.0,5.0));
        snacks.add(new Snacks("Nuts",1,50.0,20.0,25.0));

    }
    public static void showSnacks(ArrayList<Snacks> snacks){
        for (Snacks snack : snacks){
            System.out.println("Name " + snack.name + " Menge " + snack.amount + " Nährwerte " + snack.nutrients);
        }
    }
}

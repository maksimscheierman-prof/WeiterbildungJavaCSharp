package A09_Objekte.ResteraurantMaksim;

import java.util.ArrayList;

public class Gericht {
    //Attributes
    private String name;
    private Double price;

    //Getter & Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    //Constructor
    public Gericht(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    //Methods
    public static void createGerichte(ArrayList<Gericht> gerichte){
        gerichte.add(new Gericht("Spaghetti Bologonese", 5.60));
        gerichte.add(new Gericht("Döner ohne Zwiebel", 5.00));
        gerichte.add(new Gericht("Kartoffelsuppe", 3.50));
    }

    public static void showGerichte(ArrayList<Gericht> gerichte){
        for(Gericht gericht : gerichte){
            System.out.println("Gericht: " + gericht.getName() + " Preis: " + gericht.getPrice());
        }
    }
}

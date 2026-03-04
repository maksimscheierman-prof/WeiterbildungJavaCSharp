package A09_Objekte.ResteraurantMaksim;

import java.util.ArrayList;
import java.util.Scanner;

public class Bestellung {

    //Variables
    Scanner scan = new Scanner(System.in);
    String userStrInput;
    Integer userIntInput;
    ArrayList<Gericht> gerichte = new ArrayList<>();
    ArrayList<Gericht> bestellungen = new ArrayList<>();

    public void run(){
        Gericht.createGerichte(gerichte);
        Gericht.showGerichte(gerichte);
    }

    public void addOrder(Gericht gericht){
        bestellungen.add(gericht);
    }

}

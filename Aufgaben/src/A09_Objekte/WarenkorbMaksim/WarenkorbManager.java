package A09_Objekte.WarenkorbMaksim;

import java.util.ArrayList;
import java.util.Scanner;

public class WarenkorbManager {

    //Attributes
    private Double gesamtPreis = 0.0;
    private ArrayList<Produkt> produkte = new ArrayList<>();

    //Variables
    Scanner scan = new Scanner(System.in);
    String userStrInput;
    Integer userIntInput;
    Double userDoubleInput;

    //Getter & Setter
    public Double getGesamtPreis() {
        return gesamtPreis;
    }

    public void addToGesamtPreis(Double betrag) {
        this.gesamtPreis += betrag;
    }

    public ArrayList<Produkt> getProdukte() {
        return produkte;
    }

    public void setProdukte(ArrayList<Produkt> produkte) {
        this.produkte = produkte;
    }

    public void runShop() {

        System.out.println("Willkommen zum Online Shop!");
        while (true) {
            System.out.println("Bitte Produktnamen eingeben: ");
            userStrInput = scan.nextLine();
            System.out.println("Menge eingeben: ");
            userIntInput = scan.nextInt();
            scan.nextLine();
            System.out.println("Bitte Preis eingeben: ");
            userDoubleInput = scan.nextDouble();
            scan.nextLine();
            produkte.add(new Produkt(userStrInput, userIntInput, userDoubleInput));
            addToGesamtPreis(userDoubleInput * userIntInput);
            showWares();
        }
    }

    public void showWares() {
        for (Produkt produkt : produkte) {
            System.out.println("Produktname: " + produkt.getName() + " Menge: " + produkt.getAmount() + " Preis: " + produkt.getPrice());

        }
        System.out.println("Gesamtpreis beträgt: " + gesamtPreis);
    }
}

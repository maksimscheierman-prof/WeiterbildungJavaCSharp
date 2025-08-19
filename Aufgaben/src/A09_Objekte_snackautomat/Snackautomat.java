package A09_Objekte_snackautomat;

import A09_Objekte_snackautomat.Snacks;

import java.util.ArrayList;
import java.util.Scanner;

public class Snackautomat {

    ArrayList<Snacks> allSnacks = new ArrayList<>();
    Scanner scan = new Scanner(System.in);
    String userinput;
    Double usermoneyinput;
    String menu;

    public void runSnackAutomat() {
        Snacks.createInitialSnacks(allSnacks);

        while (true) {
            menu = mainMenu();
            switch (menu) {
                case "kaufen":
                    kaufMenu();
                    break;
                case "auffuellen":
                    break;
                case "snackinfo":
                    break;
                default:
                    mainMenu();
            }
        }
    }

    public String mainMenu() {
        System.out.println("******************************************\n");
        System.out.println("Willkommen zum Snackautomaten!\n");
        System.out.println("Folgende Optionen stehen zur Auswahl:");
        System.out.println("Tippen Sie kaufen, um einen Snack zu bekommen");
        System.out.println("Tippen Sie auffuellen, um einen Snack aufzufüllen(Passwort erforderlich!)");
        System.out.println("Tippen Sie snackinfo, um die Nährwerte für Snack zu erhalten");
        System.out.println("\n******************************************");
        userinput = scan.nextLine();
        return userinput;
    }

    public void kaufMenu() {
        System.out.println("******************************************\n");
        System.out.println("Folgende Snacks stehen zur Auswahl:");
        Snacks.showSnacks(allSnacks);
        System.out.println("Tippen Sie bitten des Snacks ein:");
        System.out.println("\n******************************************");

        userinput = scan.nextLine();
        boolean found = false;
        for (Snacks snack : allSnacks) {
            if (snack.getName().equals(userinput)) {
                {
                    System.out.println("Der Preis beträgt: " + snack.getPrice());
                    System.out.println("Bitte werfen Sie das Geld ein!");
                    usermoneyinput = scan.nextDouble();
                    geldTransfer(usermoneyinput,snack.getPrice());
                    mainMenu();
                    found = true;
                    break;
                }
            }
        }
        if (!found) {
            System.out.println("Eingabe inkorrekt!");
            kaufMenu();
        }
    }

    public void geldTransfer(double betrag, double preis){
        while(true){
            if (betrag == preis) {
                System.out.println("Vielen Dank! Sie haben passend bezahlt.");
            }
            else if (betrag < preis) {
                double fehlend = preis - betrag;
                System.out.println("Es fehlen noch: " + fehlend + " €");
            }
            else {
                double restgeld = betrag - preis;
                System.out.println("Vielen Dank! Ihr Restgeld beträgt: " + restgeld + " €");
            }
        }
    }
}
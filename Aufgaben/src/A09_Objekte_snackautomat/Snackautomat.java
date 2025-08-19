package A09_Objekte_snackautomat;

import java.util.ArrayList;
import java.util.Scanner;

import static A09_Objekte_snackautomat.Snacks.updateSnackAmount;

public class Snackautomat {

    ArrayList<Snacks> allSnacks = new ArrayList<>();
    Scanner scan = new Scanner(System.in);
    String userStrInput;
    Double userDoubleInput;
    Integer userIntInput;
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
                    menu = auffuelMenu();
                    break;
                case "snackinfo":
                    snackinfoMenu();
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
        userStrInput = scan.nextLine();
        return userStrInput;
    }

    public void kaufMenu() {
        System.out.println("******************************************\n");
        System.out.println("Folgende Snacks stehen zur Auswahl:");
        Snacks.showSnacks(allSnacks);
        System.out.println("Tippen Sie bitten den Namen des Snacks ein:");
        System.out.println("\n******************************************");

        userStrInput = scan.nextLine();
        boolean found = false;
        for (Snacks snack : allSnacks) {
            if (snack.getName().equals(userStrInput)) {
                {
                    System.out.println("Der Preis beträgt: " + snack.getPrice());
                    System.out.println("Bitte werfen Sie das Geld ein!");
                    userDoubleInput = scan.nextDouble();
                    geldTransfer(userDoubleInput, snack.getPrice());
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

    public String auffuelMenu() {
        if (!passwordCheck()) {
            return "main";
        }

        System.out.println("******************************************\n");
        System.out.println("Folgende Snacks können aufgefüllt werden:");
        Snacks.refillableSnacks(allSnacks);
        System.out.println("Tippen Sie bitten den Namen des Snacks ein:");
        System.out.println("\n******************************************");

        boolean selected = false;
        userStrInput = scan.nextLine();
        for (Snacks snack : allSnacks) {
            if (snack.getName().equals(userStrInput)) {
                {
                    System.out.println("Auffüllende Mengenanzahl eingeben: ");
                    userIntInput = scan.nextInt();
                    snackAuffuelung(userIntInput, snack);

                    selected = true;
                    break;
                }
            }
        }
        if (!selected) {
            System.out.println("Falschen Snack eingegeben! ");
        }
        return "main";
    }

    public void snackinfoMenu() {

    }

    public void snackAuffuelung(int aufzuladaneMenge, Snacks snack) {
        boolean snackAufgefuellt = false;
        while (!snackAufgefuellt) {

            if (aufzuladaneMenge == 0 || aufzuladaneMenge + snack.getAmount() > 10) {
                System.out.println("******************************************\n");
                System.out.println("Die Menge ist ungültig!\n");
                System.out.println("Bitte eine Menge größer als 0 eingeben und die maximale Menge von 10 nicht überschreiten!");
                aufzuladaneMenge = scan.nextInt();

            } else if (aufzuladaneMenge + snack.getAmount() <= 10) {
                updateSnackAmount(snack, aufzuladaneMenge);
                System.out.println("******************************************\n");
                System.out.println("Der Snack " + snack.getName() + " wurde um " + aufzuladaneMenge + " erfolgreich aufgefüllt!");
                snackAufgefuellt = true;
            }
        }
    }


    public boolean passwordCheck() {
        System.out.println("******************************************\n");
        System.out.println("Bitte Passwort eingeben!\nFalscheingabe führt zum Hauptmenü\n");

        userStrInput = scan.nextLine();
        if (userStrInput.equals("555Nase")) {
            System.out.println("******************************************\n");
            System.out.println("Password ist valide!\n");
            return true;
        } else {
            System.out.println("******************************************\n");
            System.out.println("Password ist invalide!\n");
            return false;
        }
    }


    public void geldTransfer(double betrag, double preis) {
        boolean bezahlvorgangAbgeschlossen = false;
        while (!bezahlvorgangAbgeschlossen) {
            if (betrag == preis) {
                System.out.println("Vielen Dank! Sie haben passend bezahlt.");
                bezahlvorgangAbgeschlossen = true;
            } else if (betrag < preis) {
                double fehlend = preis - betrag;
                System.out.println("Es fehlen noch: " + fehlend + " €");
            } else {
                double restgeld = betrag - preis;
                System.out.println("Vielen Dank! Ihr Restgeld beträgt: " + restgeld + " €");
                bezahlvorgangAbgeschlossen = true;
            }
        }
        mainMenu();
    }
}
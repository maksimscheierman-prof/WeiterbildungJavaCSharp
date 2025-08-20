package A09_Objekte.meineLoesung;

import java.util.ArrayList;
import java.util.Scanner;

import static A09_Objekte.meineLoesung.Snacks.updateSnackAmount;

public class Snackautomat {

    ArrayList<Snacks> allSnacks = new ArrayList<>();
    Scanner scan = new Scanner(System.in);
    String userStrInput;
    Double userDoubleInput;
    Integer userIntInput;
    String menu = "main";

    public void runSnackAutomat() {
        Snacks.createInitialSnacks(allSnacks);

        //Menüschleife durch Switch case
        while (true) {
            switch (menu) {
                case "kaufen":
                    menu = kaufMenu();
                    break;
                case "auffuellen":
                    menu = auffuelMenu();
                    break;
                case "snackinfo":
                    menu = snackinfoMenu();
                    break;
                case "main":
                    menu = mainMenu();
                    break;
                default:
                    menu = mainMenu();
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

    public String kaufMenu() {
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
                    handeln(userDoubleInput, snack);
                    found = true;
                    break;
                }
            }
        }
        if (!found) {
            System.out.println("Eingabe inkorrekt!");
        }
        return "main";
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

    public String snackinfoMenu() {
        System.out.println("******************************************\n");
        System.out.println("Folgende Snacks stehen zur Auswahl für Nährwert Informationen:");
        Snacks.showSnacks(allSnacks);
        System.out.println("Tippen Sie bitten den Namen des Snacks ein:");
        System.out.println("\n******************************************");


        userStrInput = scan.nextLine();
        for (Snacks snack : allSnacks) {
            if (snack.getName().equals(userStrInput)) {
                {
                    System.out.println("Die Nährwerte des Snacks " + snack.getName() + " sind wie folgt " + snack.getNutrients());
                    System.out.println("Wollen Sie weitere Snackinformationen abrufen, tippen Sie ja. Ansonsten werden Sie zum Hauptmenü weitergeleitet.");
                    userStrInput = scan.nextLine();
                    if(userStrInput.equals("ja")){
                        return "snackinfo";
                    }else{
                        return  "main";
                    }

                }
            }
        }
        return "main";
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


    public void handeln(double betrag, Snacks snack) {
        double preis = snack.getPrice();
        boolean bezahlvorgangAbgeschlossen = false;
        while (!bezahlvorgangAbgeschlossen) {
            if (betrag == preis) {
                System.out.println("Vielen Dank! Sie haben passend bezahlt.");
                bezahlvorgangAbgeschlossen = true;
                updateSnackAmount(snack, -1);
            } else if (betrag < preis) {
                double fehlend = preis - betrag;
                System.out.println("Es fehlen noch: " + fehlend + " €");
            } else {
                double restgeld = betrag - preis;
                System.out.println("Vielen Dank! Ihr Restgeld beträgt: " + restgeld + " €");
                bezahlvorgangAbgeschlossen = true;
                updateSnackAmount(snack, -1);
            }
        }
    }
}
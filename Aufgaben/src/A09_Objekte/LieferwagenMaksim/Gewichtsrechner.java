package A09_Objekte.LieferwagenMaksim;

import java.util.ArrayList;
import java.util.Scanner;

public class Gewichtsrechner {

    //Variables
    Scanner scan = new Scanner(System.in);
    String userStrInput;
    Integer userIntInput;
    ArrayList<Lieferwagen> lorries = new ArrayList<>();

    public void start() {
        System.out.println("Willkommen beim Gewichtsrechner!\n");
        mainMenu();
    }

    public void mainMenu() {

        System.out.println("Tippen Sie die Zahl um eine der folgenden Optionen auszuführen");
        System.out.println("1 Lieferwagen hinzufügen");
        System.out.println("2 Alle Lieferwagen anzeigen");
        System.out.println("3 Pakete auffüllen");
        userIntInput = scan.nextInt();
        scan.nextLine();
        menuHandling(userIntInput);

    }

    public void menuHandling(Integer menu) {
        switch (menu) {
            case 1:
                createLorry();
            case 2:
                showLorries();
            case 3:
                manageLorry();
        }
    }

    public void createLorry() {
        System.out.println("Bitte Namen eingeben:");
        userStrInput = scan.nextLine();
        System.out.println("Bitte das max. Gesamtgewicht in kg eingeben:");
        userIntInput = scan.nextInt();
        lorries.add(new Lieferwagen(userStrInput, userIntInput));
    }

    public void showLorries() {
        for (Lieferwagen lorry : lorries) {
            System.out.println("Name: " + lorry.getName() + " Gesamtgewicht: " + lorry.getGesamtgewicht() +
                    " maximales Gesamtgewicht: " + lorry.getMaxGesamtgewicht());
        }
        mainMenu();
    }

    public void manageLorry() {
        System.out.println("Bitte den Namen des LKWs eingeben:");
        userStrInput = scan.nextLine();
        Lieferwagen lorry = findLorry(userStrInput);
        if (findLorry(userStrInput) != null) {
            System.out.println("LKW: " + lorry.getName());
            System.out.println("Optionen:");
            System.out.println("1 Paket hinzufügen");
            System.out.println("2 Pakete anschauen");
            userIntInput = scan.nextInt();
            if (userIntInput == 1) {
                fillLorry(lorry);
            } else if(userIntInput == 2) {
                lorry.showPackages();
            } else {
                mainMenu();
            }
        } else {
            System.out.println("Lieferwagen konnte nicht gefunden werden!");
            manageLorry();
        }
    }

    public void fillLorry(Lieferwagen lorry) {
        System.out.println("LKW: " + lorry.getName());
        scan.nextLine();
        System.out.println("Bitte den Namen des Pakets eingeben:");
        userStrInput = scan.nextLine();
        System.out.println("Bitte das Gewicht des Pakets eingeben:");
        userIntInput = scan.nextInt();
        lorry.addPackage(new Paket(userStrInput, userIntInput));
    }

    public Lieferwagen findLorry(String lorryName) {
        for (Lieferwagen lorry : lorries) {
            if (lorryName.equals(lorry.getName())) {
                return lorry;
            }
        }
        return null;
    }

}


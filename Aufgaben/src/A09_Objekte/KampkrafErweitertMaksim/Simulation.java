package A09_Objekte.KampkrafErweitertMaksim;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;



public class Simulation {
    Scanner scan = new Scanner(System.in);
    String userStrInput;
    Double userDoubleInput;
    Integer userIntInput;
    String menu = "main";
    private Random random = new Random();

    //Teams
    Team shop = new Team("Shop");
    Team user = new Team("User");
    Team enemy = new Team("Enemy");
    public void simulate(){
        System.out.println("Matrix initialisiert....");
        /**createShop();*/

    }
    //Teamerstellung
    /**public int buildPlayerTeam(Scanner scanner, Team playerTeam, int currentBudget) {
        System.out.println("Stelle nun dein Team zusammen.");

        Unit infantryTemplate = new Infantry("Legionär", 15, 120, 60);
        Unit cavalryTemplate = new Cavalry("Prätorianer", 20, 180, 85);
        Unit artilleryTemplate = new Artillery("Balliste", 30, 250, 45);

        while (true) {
            System.out.println("\n------------------------------------");
            System.out.println("Dein Budget: " + currentBudget + " Münzen");
            System.out.println("------------------------------------");
            System.out.println("Welche Einheit möchtest du rekrutieren?");
            System.out.printf(" (1) Infanterie (%d Münzen)\n", infantryTemplate.getCost());
            System.out.printf(" (2) Kavallerie (%d Münzen)\n", cavalryTemplate.getCost());
            System.out.printf(" (3) Artillerie (%d Münzen)\n", artilleryTemplate.getCost());
            System.out.println(" (0) Team-Erstellung abschließen");
            System.out.print("Deine Wahl: ");

            try {
                int choice = scanner.nextInt();
                scanner.nextLine();

                if (choice == 0) {
                    System.out.println("Team-Erstellung abgeschlossen!");
                    break;
                }

                Unit unitToAdd = null;
                String unitTypeName = "";

                switch (choice) {
                    case 1:
                        if (currentBudget >= infantryTemplate.getCost()) {
                            unitToAdd = infantryTemplate;
                            unitTypeName = "Infanterie";
                        }
                        break;
                    case 2:
                        if (currentBudget >= cavalryTemplate.getCost()) {
                            unitToAdd = cavalryTemplate;
                            unitTypeName = "Kavallerie";
                        }
                        break;
                    case 3:
                        if (currentBudget >= artilleryTemplate.getCost()) {
                            unitToAdd = artilleryTemplate;
                            unitTypeName = "Artillerie";
                        }
                        break;
                    default:
                        System.out.println("!! Ungültige Auswahl. Bitte versuche es erneut.");
                        continue;
                }

                if (unitToAdd != null) {
                    currentBudget -= unitToAdd.getCost();
                    System.out.print("Gib der neuen Einheit einen Namen: ");
                    String unitName = scanner.nextLine();

                    if (unitToAdd instanceof Infantry) {
                        playerTeam.addUnit(new Infantry(unitName, unitToAdd.getPower(), unitToAdd.getCost(), unitToAdd.getLifepoints()));
                    } else if (unitToAdd instanceof Cavalry) {
                        playerTeam.addUnit(new Cavalry(unitName, unitToAdd.getPower(), unitToAdd.getCost(), unitToAdd.getLifepoints()));
                    } else if (unitToAdd instanceof Artillery) {
                        playerTeam.addUnit(new Artillery(unitName, unitToAdd.getPower(), unitToAdd.getCost(), unitToAdd.getLifepoints()));
                    }

                    System.out.printf(">> %s '%s' wurde rekrutiert. Verbleibendes Budget: %d Münzen.\n", unitTypeName, unitName, currentBudget);
                } else {
                    System.out.println("!! Nicht genügend Münzen für diese Einheit!");
                }

            } catch (InputMismatchException e) {
                System.out.println("!! Fehler: Bitte gib eine Zahl ein.");
                scanner.nextLine();
            }
        }
        return currentBudget;*/

    public void createShop(){
        shop.addUnits(UnitFactory.createUnits(10));
        shop.showUnits();
    }

    //Erstellung eines zufälligen Gegnerteams
    /**public Team createRandomOpponentTeam() {
        Team opponentTeam = new Team(name);
        int teamSize = random.nextInt(3) + 3;
        for (int i = 0; i < teamSize; i++) {
            int unitType = random.nextInt(3);
            switch (unitType) {
                case 0: opponentTeam.addUnit(new Infantry("Gegn. Schwertkämpfer", 12, 100, 50)); break;
                case 1: opponentTeam.addUnit(new Cavalry("Gegn. Ritter", 18, 150, 70)); break;
                case 2: opponentTeam.addUnit(new Artillery("Gegn. Kanone", 25, 200, 40)); break;
            }
        }
        return opponentTeam;

        System.out.println("Zufälliges Gegner-Team wird generiert...");
        opponentTeam.showTeam();

        scan.close();*/
    }


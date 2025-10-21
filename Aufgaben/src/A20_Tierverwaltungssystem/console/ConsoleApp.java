package A20_Tierverwaltungssystem.console;

import A20_Tierverwaltungssystem.exceptions.InvalidAgeException;
import A20_Tierverwaltungssystem.exceptions.InvalidNameException;
import A20_Tierverwaltungssystem.model.*;
import A20_Tierverwaltungssystem.service.AnimalService;

import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class ConsoleApp {

    private static AnimalService service;
    private static Scanner scanner;
    private boolean running = true;

    /**
     * Konstruktor nutzt Dependency Injection. Wenn man keine Dependency Injection nutzt, dann weist die
     * Klasse eine starke Kopplung auf.
     * <p>
     * Klasse mit starker Kopplung bringt viele Nachteile mit sich....
     * Nachteile ohne Dependency Injection:
     * <ul>
     *   <li>Kaum testbar: Mocks oder alternative Implementierungen lassen sich nicht einfach einsetzen,
     *       weil alles fest verdrahtet ist.</li>
     *   <li>Schlechte Wiederverwendbarkeit: Die Klasse kann nicht mit anderen Varianten umgehen,
     *       weil der konkrete Typ fest eingekodiert ist.</li>
     *   <li>Hoher Wartungsaufwand: Jede Änderung an der Abhängigkeit erfordert direkte Anpassungen
     *       in allen abhängigen Klassen, was zu Fehlern und erhöhtem Aufwand führt.</li>
     *   <li>Keine Flexibilität: Neuerungen oder Erweiterungen erfordern oft das Umschreiben existierender
     *       Klassen, statt nur eine neue Implementierung zu verwenden.</li>
     * </ul>
     */
    public ConsoleApp(AnimalService animalService) {
        service = animalService;
        scanner = new Scanner(System.in);
        printGreeting();
    }

    private void printGreeting() {
        System.out.println("Willkommen im Tierheim-Verwaltungssystem!");
        System.out.println("============================================");
    }

    public void run() {
        printMenu();
        while (running) {
            System.out.print("Bitte wähle eine Option: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1" -> addAnimal();
                case "2" -> removeAnimal();
                case "3" -> updateAnimal();
                case "4" -> searchMenu();
                case "5" -> service.printAll();
                case "6" -> printMenu();
                case "0" -> {
                    running = false;
                    System.out.println("Programm wird beendet...");
                }
                default -> System.out.println("Ungültige Eingabe, bitte erneut versuchen!");
            }
            System.out.println();

            /*
             *  while(isRunning) {
             *             System.out.println("Bitte wähle eine Option: ");
             *             String choice = scanner.nextLine();
             *
             *             switch (choice) {
             *                 case "1":
             *                     addAnimal();
             *                     break;
             *                 case "2":
             *                     removeAnimal();
             *                     break;
             *                 case "3":
             *                     updateAnimal();
             *                     break;
             *                 case "4":
             *                     searchAnimal();
             *                     break;
             *                 case "5":
             *                     this.service.showAllPets();
             *                     break;
             *                 case "6":
             *                     printMenu();
             *                     break;
             *                 case "0":
             *                     isRunning = false;
             *                     //System.exit(0);
             *                     break;
             *                 default:
             *                     System.out.println("Ungültige Eingabe");
             *             }
             *         }
             */
        }
    }

    // Menü
    private static void printMenu() {
        System.out.println("""
                =============================
                Tierheim Menü:
                1. Tier hinzufügen
                2. Tier löschen
                3. Tier bearbeiten
                4. Tiere suchen
                5. Alle Tiere anzeigen
                6. Menü anzeigen
                0. Beenden
                =============================
                """);
    }

    // Tier hinzufügen
    private static void addAnimal() {
        try {
            System.out.print("Name des Tieres: ");
            String name = scanner.nextLine().trim();

            System.out.print("Art (Hund/Katze/Papagei): ");
            String species = scanner.nextLine().trim();

            System.out.print("Alter: ");
            int age = scanner.nextInt();
            scanner.nextLine();

            Animal animal = switch (species.toLowerCase()) {
                case "hund" -> new Dog(name, species, age);
                case "katze" -> new Cat(name, species, age);
                case "papagei" -> new Parrot(name, species, age);
                default -> new Animal(name, species, age) {
                };
            };

            service.addAnimal(animal);
            System.out.println("Tier erfolgreich hinzugefügt!");
        } catch (InvalidAgeException | InvalidNameException e) {
            System.out.println("Fehler: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Ungültige Eingabe! Alter muss eine Zahl sein.");
        } catch (Exception e) {
            System.out.println("Unerwarteter Fehler: " + e.getMessage());
        }
    }

    // Tier löschen
    private static void removeAnimal() {
        try {
            System.out.print("Name des zu löschenden Tieres: ");
            String name = scanner.nextLine().trim();
            service.removeAnimal(name);
            System.out.println("Tier erfolgreich gelöscht!");
        } catch (InvalidNameException e) {
            System.out.println("Fehler: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unerwarteter Fehler: " + e.getMessage());
        }
    }

    // Tier bearbeiten
    private static void updateAnimal() {
        try {
            System.out.print("Name des zu bearbeitenden Tieres: ");
            String name = scanner.nextLine().trim();

            System.out.print("Neue Art: ");
            String newSpecies = scanner.nextLine().trim();

            System.out.print("Neues Alter: ");
            int newAge = scanner.nextInt();
            scanner.nextLine();

            service.updateAnimal(name, newSpecies, newAge);
            System.out.println("Tier erfolgreich aktualisiert!");
        } catch (InvalidAgeException | InvalidNameException e) {
            System.out.println("Fehler: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Ungültige Eingabe! Alter muss eine Zahl sein.");
        } catch (Exception e) {
            System.out.println("Unerwarteter Fehler: " + e.getMessage());
        }
    }

    // Suchmenü
    private void searchMenu() {
        try {
            String choice = getChoiceOfSearchMenu();
            Predicate<Animal> condition = getPredicateFromChoice(choice);
            if(condition == null){
                return;
            }
            List<Animal> results = service.search(condition);
            printList(results);

        } catch (NumberFormatException e) {
            System.out.println("Ungültige Eingabe! Bitte eine Zahl eingeben.");
        } catch (Exception e) {
            System.out.println("Unerwarteter Fehler: " + e.getMessage());
        }
    }

    private String getChoiceOfSearchMenu() {
        System.out.println("""
                =============================
                Suchoptionen:
                1. Nach Alter (> x)
                2. Nach Alter (< x)
                3. Nach Anfangsbuchstabe im Namen
                4. Nach Tierart
                0. Zurück zum Hauptmenü
                =============================
                """);

        System.out.print("Auswahl: ");
        return scanner.nextLine();
    }

    private Predicate<Animal> getPredicateFromChoice (String choice){
        Predicate<Animal> condition = null;
        switch (choice) {
            case "1" -> {
                System.out.print("Alter größer als: ");
                int age = Integer.parseInt(scanner.nextLine().trim());
                condition = a -> a.getAge() > age;
            }
            case "2" -> {
                System.out.print("Alter kleiner als: ");
                int age = Integer.parseInt(scanner.nextLine().trim());
                condition = a -> a.getAge() < age;
            }
            case "3" -> {
                System.out.print("Anfangsbuchstabe: ");
                String letter = scanner.nextLine().trim();
                condition = a -> a.getName().toLowerCase().startsWith(letter.toLowerCase());
            }
            case "4" -> {
                System.out.print("Tierart: ");
                String art = scanner.nextLine().trim();
                condition = a -> a.getSpecies().equalsIgnoreCase(art);
            }
            case "0" -> {
                return null;
            }
            default -> {
                System.out.println("Ungültige Eingabe.");
                return null;
            }
        }
        return condition;

        /*
        switch(choice){
            case "1":
                System.out.println("Alter größer als....");
                int minAge = scanner.nextInt();
                scanner.nextLine();
                condition = animal -> animal.getAge() > minAge;
                break;

            case "2":
                System.out.println("Alter kleiner als....");
                int maxAge = scanner.nextInt();
                scanner.nextLine();
                condition = animal -> animal.getAge() > maxAge;
                break;
            case "3":
                System.out.println("Anfangsbuchstabe fängt an mit...");
                String letter = scanner.nextLine();
                condition = animal -> animal.getName().toLowerCase().startsWith(letter.toLowerCase());
                break;
            case  "4":
                System.out.println("Tierart...");
                String species = scanner.nextLine();
                condition = animal -> animal.getSpecies().equalsIgnoreCase(species);
                break;
            case "5":
                return null;
            default:
                System.out.println("Ungültige Eingabe, geh weg");
                return null;
        }
         */
    }

    // Ergebnisliste anzeigen
    private static void printList(List<Animal> list) {
        if (list.isEmpty()) {
            System.out.println("(Keine Treffer)");
        } else {
            System.out.println("Suchergebnisse:");
            for (Animal a : list) {
                System.out.println(a);
            }
        }
    }
}

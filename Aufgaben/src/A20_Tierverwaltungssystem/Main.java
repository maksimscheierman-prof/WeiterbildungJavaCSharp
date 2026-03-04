package A20_Tierverwaltungssystem;

import A20_Tierverwaltungssystem.exceptions.AnimalNotFoundException;
import A20_Tierverwaltungssystem.exceptions.ValidationException;
import A20_Tierverwaltungssystem.model.*;
import A20_Tierverwaltungssystem.service.AnimalService;

import java.io.File;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final Scanner IN = new Scanner(System.in);

    public static void main(String[] args) {
        AnimalService svc = new AnimalService();
        svc.printFilePath();
        svc.loadFromFile();

        while (true) {
            //Lade alle Vorhandenen Tiere

            System.out.println("""
                    \n=== LambdaLand Tierverwaltung ===
                    1) Alle Tiere anzeigen
                    2) Tier hinzufügen
                    3) Tier bearbeiten (Name/Alter)
                    4) Tier löschen
                    5) Suche (Name enthält)
                    6) Suche (Mindestalter)
                    7) Suche (Art)
                    0) Ende
                    """);
            System.out.print("Auswahl: ");
            String choice = IN.nextLine().trim();
            try {
                switch (choice) {
                    case "1" -> list(svc.listAll());
                    case "2" -> addAnimal(svc);
                    case "3" -> editAnimal(svc);
                    case "4" -> deleteAnimal(svc);
                    case "5" -> searchByName(svc);
                    case "6" -> searchByMinAge(svc);
                    case "7" -> searchBySpecies(svc);
                    case "0" -> { System.out.println("Tschüss!"); return; }
                    default -> System.out.println("Ungültige Auswahl.");
                }
            } catch (ValidationException | AnimalNotFoundException e) {
                System.out.println("FEHLER: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Unerwarteter Fehler: " + e);
            }
        }
    }

    private static void list(List<Animal> animals) {
        if (animals.isEmpty()) System.out.println("(keine Tiere)");
        else animals.forEach(System.out::println);
    }

    private static void addAnimal(AnimalService svc) throws ValidationException {
        System.out.print("ID: ");
        long id = Long.parseLong(IN.nextLine());
        System.out.print("Art (Dog/Cat/Parrot): ");
        String species = IN.nextLine().trim();
        System.out.print("Name: ");
        String name = IN.nextLine();
        System.out.print("Geburtsdatum (YYYY-MM-DD): ");
        LocalDate birthDate = LocalDate.parse(IN.nextLine());

        Animal a;
        switch (species.toLowerCase()) {
            case "dog" -> {
                System.out.print("Rasse: ");
                String breed = IN.nextLine();
                a = new Dog(id, name, birthDate, breed);
            }
            case "cat" -> {
                System.out.print("Wohnungskatze? (true/false): ");
                boolean indoor = Boolean.parseBoolean(IN.nextLine());
                a = new Cat(id, name, birthDate, indoor);
            }
            case "parrot" -> {
                System.out.print("Farbe: ");
                String color = IN.nextLine();
                a = new Parrot(id, name, birthDate, color);
            }
            default -> throw new ValidationException("Unbekannte Art: " + species);
        }

        svc.add(a);
        System.out.println("Hinzugefügt: " + a);
    }

    private static void editAnimal(AnimalService svc)
            throws ValidationException, AnimalNotFoundException {

        System.out.print("ID des Tieres: ");
        long id = Long.parseLong(IN.nextLine());

        System.out.print("Neuer Name (leer = unverändert): ");
        String newName = IN.nextLine();

        System.out.print("Neues Geburtsdatum (YYYY-MM-DD, leer = unverändert): ");
        String birthInput = IN.nextLine();

        svc.update(id, a -> {
            try {
                if (!newName.isBlank()) {
                    a.setName(newName);
                }

                if (!birthInput.isBlank()) {
                    a.setBirthDate(LocalDate.parse(birthInput));
                }

            } catch (ValidationException e) {
                throw new RuntimeException(e); // notwendig wegen Lambda
            }
        });

        System.out.println("Geändert: " + svc.getById(id));
    }


    private static void deleteAnimal(AnimalService svc) throws AnimalNotFoundException {
        System.out.print("ID zum Löschen: ");
        long id = Long.parseLong(IN.nextLine());
        svc.delete(id);
        System.out.println("Gelöscht.");
    }

    private static void searchByName(AnimalService svc) {
        System.out.print("Name enthält: ");
        list(svc.search(AnimalService.byName(IN.nextLine())));
    }

    private static void searchByMinAge(AnimalService svc) {
        System.out.print("Mindestalter: ");
        int min = Integer.parseInt(IN.nextLine());
        list(svc.search(AnimalService.byMinAge(min)));
    }

    private static void searchBySpecies(AnimalService svc) {
        System.out.print("Art (Dog/Cat/Parrot): ");
        list(svc.search(AnimalService.bySpecies(IN.nextLine())));
    }

}


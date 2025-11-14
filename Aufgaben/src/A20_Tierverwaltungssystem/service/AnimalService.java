package A20_Tierverwaltungssystem.service;

import A20_Tierverwaltungssystem.model.Animal;
import A20_Tierverwaltungssystem.exceptions.AnimalNotFoundException;
import A20_Tierverwaltungssystem.exceptions.ValidationException;
import A20_Tierverwaltungssystem.model.Cat;
import A20_Tierverwaltungssystem.model.Dog;
import A20_Tierverwaltungssystem.model.Parrot;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class AnimalService {
    private final List<Animal> animals = new ArrayList<>();
    private static final String FILE_PATH = "C:\\Users\\maksi\\OneDrive\\Desktop\\Weiterbildung\\GitGeht\\Aufgaben\\src\\A20_Tierverwaltungssystem\\tiere.csv";

    // --- Create ---
    public void add(Animal animal) throws ValidationException {
        if (animal == null) throw new ValidationException("Tier darf nicht null sein.");
        // einfache Eindeutigkeitsprüfung
        boolean duplicateId = animals.stream().anyMatch(a -> a.getId() == animal.getId());
        if (duplicateId) throw new ValidationException("ID " + animal.getId() + " ist bereits vergeben.");
        animals.add(animal);
        saveToFile();
        log("Tier hinzugefügt: " + animal);

    }

    // --- Read ---
    public List<Animal> listAll() {
        return List.copyOf(animals); }

    public Animal getById(long id) throws AnimalNotFoundException {
        return animals.stream()
                .filter(a -> a.getId() == id)
                .findFirst()
                .orElseThrow(() -> new AnimalNotFoundException(id));
    }

    // --- Update ---
    public void update(long id, java.util.function.Consumer<Animal> updater)
            throws AnimalNotFoundException, ValidationException {
        if (updater == null)
            throw new ValidationException("Updater darf nicht null sein.");
        Animal a = getById(id);
        updater.accept(a); // Setter der Subklassen validieren bereits
    }

    // --- Delete ---
    public void delete(long id) throws AnimalNotFoundException {
        boolean removed = animals.removeIf(a -> a.getId() == id);
        if (!removed) throw new AnimalNotFoundException(id);
    }

    // --- Suche/Filter mit Lambda ---
    public ArrayList<Animal> search(Predicate<Animal> condition) {
        return animals.stream()
                .filter(condition)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public void printFilePath() {
        System.out.println("Versuche Datei zu laden: " + new File(FILE_PATH).getAbsolutePath());
    }


    // --- Bonus: nützliche vordefinierte Prädikate ---
    public static Predicate<Animal> byName(String query) {
        String q = query == null ? "" : query.trim().toLowerCase();
        return a -> a.getName().toLowerCase().contains(q);
    }
    public static Predicate<Animal> byMinAge(int minAge) { return a -> a.getAge() >= minAge; }
    public static Predicate<Animal> bySpecies(String species) {
        String s = species == null ? "" : species.trim().toLowerCase();
        return a -> a.getSpecies().toLowerCase().equals(s);
    }

    //Save to File
    private void saveToFile() {
        try (FileWriter fw = new FileWriter(FILE_PATH, false); // <-- false = überschreiben
             PrintWriter out = new PrintWriter(fw)) {
            for (Animal animal : animals) {
                out.printf("%s;%d;%s;%s;%s;%s;%s%n",
                        animal.getSpecies(),
                        animal.getId(),
                        animal.getName(),
                        animal.getBirthDate(),
                        animal.getFormattedDateAdded(),
                        animal.getFormattedTimeAdded(),
                        animal.getLastCheck());
            }
        } catch (IOException e) {
            System.err.println("Fehler beim Speichern: " + e.getMessage());
        }
    }


    //Load from file
    public void loadFromFile() {
        animals.clear();
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = br.readLine()) != null) {
                try {
                    String[] parts = line.split(";");

                    String species = parts[0];
                    long id = Long.parseLong(parts[1]);
                    String name = parts[2];
                    LocalDate birthDate = LocalDate.parse(parts[3]);
                    LocalDate dateAdded = LocalDate.parse(parts[4]);
                    LocalTime timeAdded = LocalTime.parse(parts[5]);
                    LocalDateTime lastCheck = LocalDateTime.parse(parts[6]);

                    // Spezial-Daten (Breed / Indoor / Color)
                    String extra = parts.length >= 8 ? parts[7] : "";

                    Animal a = switch (species) {
                        case "Dog" ->
                                new Dog(id, name, birthDate, extra);                // Breed aus CSV
                        case "Cat" ->
                                new Cat(id, name, birthDate, Boolean.parseBoolean(extra)); // Indoor aus CSV
                        case "Parrot" ->
                                new Parrot(id, name, birthDate, extra);             // Color aus CSV
                        default -> null;
                    };

                    if (a != null) {
                        // Zusatzfelder setzen
                        a.setDateAdded(dateAdded);
                        a.setTimeAdded(timeAdded);
                        a.setLastCheck(lastCheck);
                        animals.add(a);
                    }

                } catch (Exception e) {
                    System.err.println("Fehler beim Einlesen: " + line);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Noch keine Datei vorhanden – wird neu erstellt.");
        } catch (IOException e) {
            System.err.println("Fehler beim Laden: " + e.getMessage());
        }
    }

    //Log
    private void log(String msg) {
        try (FileWriter fw = new FileWriter("log.txt", true)) {
            fw.write(LocalDateTime.now() + " - " + msg + "\n");
        } catch (IOException ignored) {}
    }


}


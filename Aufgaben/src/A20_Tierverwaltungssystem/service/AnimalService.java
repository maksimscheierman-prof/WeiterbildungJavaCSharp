package A20_Tierverwaltungssystem.service;

import A20_Tierverwaltungssystem.model.Animal;
import A20_Tierverwaltungssystem.exceptions.AnimalNotFoundException;
import A20_Tierverwaltungssystem.exceptions.ValidationException;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class AnimalService {
    private final List<Animal> animals = new ArrayList<>();

    // --- Create ---
    public void add(Animal animal) throws ValidationException {
        if (animal == null) throw new ValidationException("Tier darf nicht null sein.");
        // einfache Eindeutigkeitsprüfung
        boolean duplicateId = animals.stream().anyMatch(a -> a.getId() == animal.getId());
        if (duplicateId) throw new ValidationException("ID " + animal.getId() + " ist bereits vergeben.");
        animals.add(animal);
    }

    // --- Read ---
    public List<Animal> listAll() { return List.copyOf(animals); }

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
}


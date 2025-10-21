package A20_Tierverwaltungssystem.service;

import A20_Tierverwaltungssystem.exceptions.InvalidAgeException;
import A20_Tierverwaltungssystem.exceptions.InvalidNameException;
import A20_Tierverwaltungssystem.model.Animal;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class AnimalService {
    private List<Animal> animals = new ArrayList<>();

    // Tier hinzufügen
    public void addAnimal(Animal animal) throws InvalidAgeException {
        for (Animal a : animals) {
            if (a.getName().equalsIgnoreCase(animal.getName())) {
                throw new InvalidNameException("Tier mit Namen '" + animal.getName() + "' existiert bereits!");
            }
        }
        if (animal.getAge() < 0) {
            throw new InvalidAgeException();
        }
        animals.add(animal);
    }

    // Tier löschen
    public void removeAnimal(String name) throws InvalidNameException {
        Animal found = findByName(name);
        animals.remove(found);
    }

    // Tier bearbeiten
    public void updateAnimal(String name, String newSpecies, int newAge) throws InvalidAgeException {
        Animal found = findByName(name);
        if (newAge < 0) throw new InvalidAgeException();
        found.setSpecies(newSpecies);
        found.setAge(newAge);
    }

    // Hilfsmethode: Suche Tier nach Name
    private Animal findByName(String name) throws InvalidNameException {
        for (Animal a : animals) {
            if (a.getName().equalsIgnoreCase(name)) {
                return a;
            }
        }
        throw new InvalidNameException("Tier mit Namen '" + name + "' nicht gefunden!");
    }

    // Suche über Predicate (ohne Streams)
    public List<Animal> search(Predicate<Animal> condition) {
        List<Animal> results = new ArrayList<>();
        for (Animal a : animals) {
            if (condition.test(a)) {
                results.add(a);
            }
        }
        return results;
    }

    // Tiere anzeigen
    public void printAll() {
        if (animals.isEmpty()) {
            System.out.println("(Keine Tiere vorhanden)");
        } else {
            for (Animal a : animals) {
                System.out.println(a);
            }
        }
    }
}

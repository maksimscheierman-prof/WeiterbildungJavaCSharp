package A20_Tierverwaltungssystem.model;

import A20_Tierverwaltungssystem.exceptions.ValidationException;

public class Dog extends Animal {
    private String breed;

    public Dog(long id, String name, int age, String breed) throws ValidationException {
        super(id, name, age);
        setBreed(breed);
    }

    public String getBreed() { return breed; }
    public void setBreed(String breed) throws ValidationException {
        if (breed == null || breed.isBlank())
            throw new ValidationException("Hunderasse darf nicht leer sein.");
        this.breed = breed.trim();
    }

    @Override public String getSpecies() { return "Dog"; }
}


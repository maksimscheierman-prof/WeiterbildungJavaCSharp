package A20_Tierverwaltungssystem.model;

import A20_Tierverwaltungssystem.exceptions.ValidationException;

import java.time.LocalDate;

public class Dog extends Animal {
    private String breed;

    public Dog(long id, String name, LocalDate birthDate, String breed) throws ValidationException {
        super(id, name, birthDate);
        setBreed(breed);
    }

    public String getBreed() { return breed; }
    public void setBreed(String breed) throws ValidationException {
        if (breed == null || breed.isBlank())
            throw new ValidationException("Hunderasse darf nicht leer sein.");
        this.breed = breed.trim();
    }

    @Override public String getSpecies() { return "Dog"; }
    @Override
    public String toString() {
        return "Dog{id=%d, name='%s', birthDate=%s, age=%d, breed='%s'}"
                .formatted(getId(), getName(), getBirthDate(), getAge(), breed);
    }
}


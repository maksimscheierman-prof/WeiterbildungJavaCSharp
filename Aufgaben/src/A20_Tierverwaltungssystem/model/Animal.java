package A20_Tierverwaltungssystem.model;

import A20_Tierverwaltungssystem.exceptions.InvalidAgeException;
import A20_Tierverwaltungssystem.exceptions.ValidationException;
import java.util.Objects;

public abstract class Animal {
    private final long id;
    private String name;
    private int age;

    protected Animal(long id, String name, int age) throws ValidationException {
        this.id = id;
        setName(name);
        setAge(age);
    }

    public long getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }

    // --- Validierungen pro Setter ---
    public void setName(String name) throws ValidationException {
        if (name == null || name.isBlank())
            throw new ValidationException("Name darf nicht leer sein.");
        this.name = name.trim();
    }

    public void setAge(int age) throws InvalidAgeException {
        if (age < 0) throw new InvalidAgeException(age);
        this.age = age;
    }

    public abstract String getSpecies();

    @Override public String toString() {
        return "%s{id=%d, name='%s', age=%d}".formatted(getSpecies(), id, name, age);
    }
    @Override public boolean equals(Object o) {
        return (o instanceof Animal other) && id == other.id;
    }
    @Override public int hashCode() { return Objects.hash(id); }
}

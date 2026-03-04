package A20_Tierverwaltungssystem.model;

import A20_Tierverwaltungssystem.exceptions.ValidationException;

import java.time.LocalDate;

public class Parrot extends Animal {
    private String color;

    public Parrot(long id, String name, LocalDate birthDate, String color) throws ValidationException {
        super(id, name, birthDate);
        setColor(color);
    }

    public String getColor() { return color; }
    public void setColor(String color) throws ValidationException {
        if (color == null || color.isBlank())
            throw new ValidationException("Farbe darf nicht leer sein.");
        this.color = color.trim();
    }

    @Override public String getSpecies() { return "Parrot"; }
    @Override
    public String toString() {
        return "Parrot{id=%d, name='%s', birthDate=%s, age=%d, color='%s'}"
                .formatted(getId(), getName(), getBirthDate(), getAge(), color);
    }

}


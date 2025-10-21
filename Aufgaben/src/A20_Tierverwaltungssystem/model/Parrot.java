package A20_Tierverwaltungssystem.model;

import A20_Tierverwaltungssystem.exceptions.ValidationException;

public class Parrot extends Animal {
    private String color;

    public Parrot(long id, String name, int age, String color) throws ValidationException {
        super(id, name, age);
        setColor(color);
    }

    public String getColor() { return color; }
    public void setColor(String color) throws ValidationException {
        if (color == null || color.isBlank())
            throw new ValidationException("Farbe darf nicht leer sein.");
        this.color = color.trim();
    }

    @Override public String getSpecies() { return "Parrot"; }
}


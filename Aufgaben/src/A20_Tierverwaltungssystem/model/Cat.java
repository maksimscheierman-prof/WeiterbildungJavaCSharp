package A20_Tierverwaltungssystem.model;

import A20_Tierverwaltungssystem.exceptions.ValidationException;

public class Cat extends Animal {
    private boolean indoor;

    public Cat(long id, String name, int age, boolean indoor) throws ValidationException {
        super(id, name, age);
        this.indoor = indoor; // bool braucht keine extra Validierung
    }

    public boolean isIndoor() { return indoor; }
    public void setIndoor(boolean indoor) { this.indoor = indoor; }

    @Override public String getSpecies() { return "Cat"; }
}


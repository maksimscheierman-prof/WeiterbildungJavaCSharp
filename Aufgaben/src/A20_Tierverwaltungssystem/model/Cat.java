package A20_Tierverwaltungssystem.model;

import A20_Tierverwaltungssystem.exceptions.ValidationException;

import java.time.LocalDate;

public class Cat extends Animal {
    private boolean indoor;

    public Cat(long id, String name, LocalDate birthDate, boolean indoor) throws ValidationException {
        super(id, name, birthDate);
        this.indoor = indoor; // bool braucht keine extra Validierung
    }

    public boolean isIndoor() { return indoor; }
    public void setIndoor(boolean indoor) { this.indoor = indoor; }

    @Override public String getSpecies() { return "Cat"; }
    @Override
    public String toString() {
        return "Cat{id=%d, name='%s', birthDate=%s, age=%d, indoor=%s}"
                .formatted(getId(), getName(), getBirthDate(), getAge(), indoor);
    }

}


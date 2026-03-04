package A20_Tierverwaltungssystem.model;

import A20_Tierverwaltungssystem.exceptions.InvalidAgeException;
import A20_Tierverwaltungssystem.exceptions.ValidationException;

import java.time.format.DateTimeFormatter;
import java.util.Objects;
import java.time.*;

public abstract class Animal {
    private final long id;
    private String name;
    private int age;
    protected LocalDate birthDate;
    private LocalDate dateAdded;
    private LocalTime timeAdded;
    private LocalDateTime lastCheck;
    private static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    private static final DateTimeFormatter TIME_FORMAT = DateTimeFormatter.ofPattern("HH:mm:ss");

    protected Animal(long id, String name, LocalDate birthDate) throws ValidationException {
        this.id = id;
        setName(name);
        this.birthDate = birthDate;
        this.dateAdded = LocalDate.now();
        this.timeAdded = LocalTime.now();
        this.lastCheck = LocalDateTime.now();
    }
    public String getFormattedDateAdded() { return dateAdded.format(DATE_FORMAT); }
    public String getFormattedTimeAdded() { return timeAdded.format(TIME_FORMAT); }
    public long getId() { return id; }
    public String getName() { return name; }
    public int getAge() {
        return Period.between(birthDate, LocalDate.now()).getYears();
    }

    public LocalDateTime getLastCheck() {
        return lastCheck;
    }

    // --- Validierungen pro Setter ---
    public void setName(String name) throws ValidationException {
        if (name == null || name.isBlank())
            throw new ValidationException("Name darf nicht leer sein.");
        this.name = name.trim();
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public abstract String getSpecies();

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public void setDateAdded(LocalDate dateAdded) {
        this.dateAdded = dateAdded;
    }

    public void setTimeAdded(LocalTime timeAdded) {
        this.timeAdded = timeAdded;
    }

    public void setLastCheck(LocalDateTime lastCheck) {
        this.lastCheck = lastCheck;
    }

    //Zeitdifferenz berechnen
    public String getDaysSinceAdded() {
        Period p = Period.between(dateAdded, LocalDate.now());
        return "%d Jahre, %d Monate, %d Tage".formatted(p.getYears(), p.getMonths(), p.getDays());
    }

    @Override
    public String toString() {
        return "%s{id=%d, name='%s', birthDate=%s, age=%d}"
                .formatted(
                        getClass().getSimpleName(),
                        id,
                        name,
                        birthDate,
                        getAge()
                );
    }

    @Override public boolean equals(Object o) {
        return (o instanceof Animal other) && id == other.id;
    }
    @Override public int hashCode() { return Objects.hash(id); }
}

package A20_Tierverwaltungssystem.exceptions;


public class AnimalNotFoundException extends Exception {
    public AnimalNotFoundException(long id) {
        super("Tier mit ID " + id + " wurde nicht gefunden.");
    }
}

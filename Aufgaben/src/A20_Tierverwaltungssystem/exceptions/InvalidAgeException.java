package A20_Tierverwaltungssystem.exceptions;

public class InvalidAgeException extends Exception {
    public InvalidAgeException() {
        super("Das Alter darf nicht unter 0 sein.");
    }
}

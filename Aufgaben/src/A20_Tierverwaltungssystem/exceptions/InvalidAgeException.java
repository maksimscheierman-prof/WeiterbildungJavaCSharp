package A20_Tierverwaltungssystem.exceptions;

public class InvalidAgeException extends ValidationException {
    public InvalidAgeException(int age) {
        super("Ungültiges Alter: " + age + " (muss >= 0 sein)");
    }
}

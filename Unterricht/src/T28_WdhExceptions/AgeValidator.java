package T28_WdhExceptions;

import java.util.*;

public class AgeValidator {
    static void validateAge(int age) throws Exception {
        if (age < 0 || age > 120) throw new Exception("Ungültiges Alter!");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Alter eingeben: ");
            int age = sc.nextInt();
            validateAge(age);
            System.out.println("Alter akzeptiert!");
        } catch (InputMismatchException e) {
            System.out.println("Bitte eine Zahl eingeben!");
        } catch (Exception e) {
            System.out.println("Fehler: " + e.getMessage());
        } finally {
            System.out.println("Programm beendet.");
        }
    }
}


package Test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test2 {

    // 🔹 Methode, die das Alter prüft
    public static void validateAge(int age) throws Exception {
        if (age < 0 || age > 120) {
            throw new Exception("Ungültiges Alter: " + age + ". Muss zwischen 0 und 120 liegen.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Bitte gib dein Alter ein: ");
            int age = sc.nextInt(); // ❗ hier kann InputMismatchException auftreten

            validateAge(age); // prüft den Bereich
            System.out.println("Alter ist gültig: " + age);
        }
        catch (InputMismatchException e) {
            System.out.println("Fehler: Du musst eine Zahl eingeben!");
        }
        catch (Exception e) {
            System.out.println("Fehler: " + e.getMessage());
        }
        finally {
            System.out.println("Programm beendet.");
            sc.close();
        }
    }
}


package Test;

import java.util.Scanner;

public class AufgabeParse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = 0;
        boolean valid = false;

        while (!valid) {
            System.out.print("Bitte eine Zahl eingeben: ");
            String input = sc.nextLine();

            try {
                number = Integer.parseInt(input);
                valid = true; // Eingabe war gültig
            } catch (NumberFormatException e) {
                System.out.println("Fehler: Das ist keine gültige Zahl! Bitte erneut versuchen.");
            }
        }

        int result = number * number;
        System.out.println("Ergebnis: " + result);
    }
}



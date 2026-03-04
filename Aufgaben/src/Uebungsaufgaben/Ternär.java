package Uebungsaufgaben;

import java.util.Scanner;

public class Ternär {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Gib eine Zahl ein: ");
        int x = sc.nextInt();

        // Ternärer Operator zur Bestimmung gerade/ungerade
        String ergebnis = (x % 2 == 0) ? "gerade" : "ungerade";

        System.out.println("Die Zahl " + x + " ist " + ergebnis + ".");
        erweitert();
    }

        public static void erweitert() {

            Scanner sc = new Scanner(System.in);

            System.out.print("Bitte gib dein Alter ein: ");
            int alter = sc.nextInt();

            // Verschachtelter ternärer Operator
            String ergebnis = (alter >= 21)
                    ? "volljährig (auch in Mississippi)"
                    : (alter >= 18)
                    ? "volljährig"
                    : "minderjährig";

            System.out.println("Du bist: " + ergebnis);
        }
}


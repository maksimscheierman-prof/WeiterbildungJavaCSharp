package A02_Ablaufsteuerung_Musterloesung;

import java.util.Scanner;

public class Noten_Marco {
    /** Deutsches Notensystem; 1 sehr gut bis 6 nicht bestanden
     * Punktesystem: maximal 60 Punkte da eine Klausur 60 Minuten dauert.
     */
    public static void main(String[] args) {
/**Variablen */
        // Variablen
        double note = 0.0;
        double punktezahl = 0;
        double eingabe = 0; // 0 bis 60 zulässig

        int zaehler = 0;

        Scanner scan = new Scanner(System.in);

        while(zaehler == 0) {
            // Berechnung
/** NUTZEREINGABE */
            System.out.println("Welche Punktzahl soll umgerechnet werden? (Nur Werte von maximal 60 bis minimal 0 sind zulässig. ");
            eingabe = scan.nextDouble();

/** NOTENZUWEISUNG */
            if (eingabe <= 60 && eingabe > 50) System.out.println("Note: 1");
            else if (eingabe <= 50 && eingabe > 40) {                   // Eingabe MUSS Kleinergleich 50 sein "UND" groesserals 40
                System.out.println("Note: 2");
            } else if (eingabe <= 40 && eingabe > 30) {
                System.out.println("Note: 3");
            } else if (eingabe <= 30 && eingabe > 20) {
                System.out.println("Note: 4");
            } else if (eingabe <= 20 && eingabe > 10) {
                System.out.println("Note: 5");
            } else if (eingabe <= 10 && eingabe <= 0) {
                System.out.println("Note: 6");
            } else {
                System.out.println("Eingabe unzulässig!");
            }
        }
    }
}

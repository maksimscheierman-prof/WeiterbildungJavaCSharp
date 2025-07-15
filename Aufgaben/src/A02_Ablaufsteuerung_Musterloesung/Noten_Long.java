package A02_Ablaufsteuerung_Musterloesung;

import java.util.Scanner;

public class Noten_Long {
    public static void main(String[] args) {
    /**VARIABLEN */
        /** SCANNER **/// Eingabe
        Scanner scan = new Scanner(System.in);                  // SCANNER

        /** MAXIMALE PUNKZAHL FESTLEGEN**/
        System.out.println("Bitte max Punktzahl eingeben: ");
        double maxPunktzahl = scan.nextDouble();    /** DIREKTE ZUWEISUNG **/
        /** PUNKTEINGABEN **/
        System.out.println("Bitte Punktzahl eingeben: ");
        double punktzahl = scan.nextDouble();   /** Double für Kommazahlen */

    /** FAILSAFE (Punktzahl im Rahmen?)**/
        if (punktzahl > maxPunktzahl) {
            System.out.println("Punktzahl darf nicht groesser als max Punktzahl sein!");
            return;
        }
    /** PROZENTWERT BERECHNEN */
        // Prozentwert berechnen
        double prozent = (punktzahl / maxPunktzahl) * 100;

    /** NOTENSCHLÜSSEL **/  // Note bestimmen
        int note;
        if (prozent >= 96) {
            note = 1;
        } else if (prozent >= 80) {
            note = 2;
        } else if (prozent >= 60) {
            note = 3;
        } else if (prozent >= 45) {
            note = 4;
        } else if (prozent >= 16) {
            note = 5;
        } else {
            note = 6;
        }

    /**Ausgabe */    // Ausgabe
        System.out.printf("Prozent: %.2f%%\n", prozent);
        System.out.println("Note: " + note);
    }
}

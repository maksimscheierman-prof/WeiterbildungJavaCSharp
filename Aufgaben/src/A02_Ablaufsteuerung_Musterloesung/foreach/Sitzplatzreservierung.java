package A02_Ablaufsteuerung_Musterloesung.foreach;

import java.util.Scanner;

public class Sitzplatzreservierung {
    public static void main(String[] args) {
        // Array für 20 Sitzplätze, anfangs leer ("" steht für "nicht reserviert")
        String[] sitzplaetze = new String[20];

        // Scanner-Objekt zur Eingabe von der Konsole
        Scanner scn = new Scanner(System.in);

        // Initialisiere alle Plätze mit einem leeren String ("")
        for (int i = 0; i < sitzplaetze.length; i++) {
            sitzplaetze[i] = "";
        }

        // Wiederhole das Menü solange, bis der Benutzer "Beenden" auswählt
        do {
            // Abstand schaffen (5 Leerzeilen)
            for (int i = 0; i < 5; i++) {
                System.out.println("");
            }

            // Hauptmenü anzeigen
            System.out.println("*****************************************************************");
            System.out.println("*                      Sitzplatzreservierung                    *");
            System.out.println("* 1: Eingabe Reservierung                                       *");
            System.out.println("* 2: Suche                                                      *");
            System.out.println("* 3: Beenden                                                    *");
            System.out.println("*****************************************************************");

            // Benutzer wählt eine Option
            System.out.print("Ihre Wahl: ");
            int auswahl = scn.nextInt();

            // Option 1: Sitzplatz reservieren
            if (auswahl == 1) {
                System.out.println("\nBitte Namen eingeben:");
                String name = scn.next(); // Benutzer gibt seinen Namen ein

                boolean reserviert = false;

                // Durchlaufe alle Sitzplätze und finde den ersten freien Platz
                for (int i = 0; i < sitzplaetze.length; i++) {
                    if (sitzplaetze[i].isEmpty()) { // Platz ist frei
                        sitzplaetze[i] = name;     // Name eintragen
                        reserviert = true;         // Markiere als erfolgreich reserviert
                        break;                     // Beende die Schleife nach erster Buchung
                    }
                }

                // Ausgabe je nach Erfolg der Reservierung
                if (reserviert) {
                    System.out.println("Sitzplatz wurde auf den Namen " + name + " reserviert.");
                } else {
                    System.out.println("Es konnte keine Reservierung vorgenommen werden. Alle Plätze sind belegt.");
                }

                // Option 2: Nach einem Namen suchen
            } else if (auswahl == 2) {
                System.out.println("Bitte zu suchenden Namen eingeben:");
                String suche = scn.next(); // Eingabe des zu suchenden Namens

                boolean hatReserviert = false;

                // Durchsuche alle Sitzplätze mit einer foreach-Schleife
                for (String platz : sitzplaetze) {
                    if (platz.equals(suche)) { // Falls der Name gefunden wird
                        hatReserviert = true;
                        break; // Schleife beenden, da Treffer gefunden
                    }
                }

                // Rückmeldung an den Benutzer
                if (hatReserviert) {
                    System.out.println("+ Die Suche ergab einen Treffer auf der Reservierungsliste.");
                } else {
                    System.out.println("- Die Suche ergab keinen Treffer auf der Reservierungsliste.");
                }

                // Option 3: Programm beenden
            } else if (auswahl == 3) {
                System.out.println("Auf Wiedersehen...");
                break; // Beende die do-while-Schleife
            }

            // Falls keine gültige Eingabe gemacht wurde, wird das Menü erneut angezeigt

        } while (true); // Endlosschleife – wird nur durch "break" verlassen
    }
}

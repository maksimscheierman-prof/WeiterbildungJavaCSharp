package A03_2DArrays.Musterloesung;

import java.util.Scanner;

public class MenuPlan_Toni {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Scanner-Objekt zum Einlesen von Benutzereingaben

        String wochentag; // Variable zur Speicherung des eingegebenen Wochentags
        int auswahl; // Variable für die Menüauswahl
        String[] essen = new String[5]; // Array zur Speicherung der Menüs für Montag bis Freitag

        // Abfrage der Menüs für die einzelnen Wochentage zu Beginn des Programms
        System.out.println("Bitte geben Sie die Menüs für den Tag ein:");
        System.out.println("Montag:");
        essen[0] = scan.nextLine();
        System.out.println("Dienstag:");
        essen[1] = scan.nextLine();
        System.out.println("Mittwoch:");
        essen[2] = scan.nextLine();
        System.out.println("Donnerstag:");
        essen[3] = scan.nextLine();
        System.out.println("Freitag:");
        essen[4] = scan.nextLine();

        // Start der Endlosschleife für das Menüsystem
        while (true) {

            // Hauptmenü wird angezeigt
            System.out.println("Willkommen bei der Menüplanung!");
            System.out.println("Was möchten Sie tun?");
            System.out.println("Menü der Woche angucken - drücken Sie 1!");
            System.out.println("Menü des Tages angucken - drücken Sie 2!");
            System.out.println("Neues Menü festlegen - drücken Sie 3!");
            System.out.println("Beenden - drücken Sie 4!");
            auswahl = scan.nextInt(); // Benutzer wählt eine Option

            // Auswahl 1: Alle Wochentagsmenüs anzeigen
            if (auswahl == 1) {
                System.out.println("Unser Menü der Woche:");
                for (int i = 0; i < essen.length; i++) {
                    System.out.println(essen[i]); // Gibt jedes Tagesmenü aus
                }
            }

            // Auswahl 2: Menü eines bestimmten Tages anzeigen
            if (auswahl == 2) {
                System.out.println("Für welchen Wochentag wollen Sie das Menü sehen?");
                System.out.println("Geben Sie ein: Mo / Di / Mi / Do / Fr");
                scan.nextLine(); // Scanner-Puffer leeren (notwendig nach nextInt)
                wochentag = scan.nextLine(); // Eingabe des Wochentags

                // Je nach Eingabe wird das passende Menü angezeigt
                if (wochentag.equals("Mo")) {
                    System.out.println(essen[0]);
                }
                if (wochentag.equals("Di")) {
                    System.out.println(essen[1]);
                }
                if (wochentag.equals("Mi")) {
                    System.out.println(essen[2]);
                }
                if (wochentag.equals("Do")) {
                    System.out.println(essen[3]);
                }
                if (wochentag.equals("Fr")) {
                    System.out.println("Freitag" + essen[4]); // Hier wird "Freitag" vor das Menü geschrieben
                }
            }

            // Auswahl 3: Neue Menüs eingeben (überschreiben die alten Einträge)
            if (auswahl == 3) {
                System.out.println("Bitte geben Sie die Menüs für den Tag ein:");
                System.out.println("Montag:");
                scan.nextLine(); // Scanner-Puffer leeren
                essen[0] = scan.nextLine();
                System.out.println("Dienstag:");
                essen[1] = scan.nextLine();
                System.out.println("Mittwoch:");
                essen[2] = scan.nextLine();
                System.out.println("Donnerstag:");
                essen[3] = scan.nextLine();
                System.out.println("Freitag:");
                essen[4] = scan.nextLine();
            }

            // Auswahl 4: Programm beenden
            if (auswahl == 4) {
                System.out.println("Tschüssi!");
                break; // Schleife wird verlassen → Programmende
            }
        }
    }
}

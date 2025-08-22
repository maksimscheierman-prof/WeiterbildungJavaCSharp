package T16_Queue_HashMap.Aufgaben;

import java.util.Scanner;

public class Aufgaben {
    /**
     *  Programm 1: Rezeption Warteschlangensystem (Queue)
     *
     *      Erstelle ein System bei dem sich Kunden anmelden können und in der Reihenfolge
     *      ihres Eintreffens bedient werden können.
     *      Die Verwaltungsmitarbeitenden können auf Knopfdruck (Hier per Konsoleneingabe) die nächste
     *      Person dran nehmen
     *
     *      Es soll immer Ausgeben werden welche Person als nächstes dran ist.
     **     Du kannst das untenstehende Programm erweitern.
     * */
    void Programm1() {
        String input = "";
        while(true){
            System.out.println("(1) Kunden in warteschlange anlegen. (2) nächsten Kunden dran nehmen.");
            switch(input) {
                case "1":
                    System.out.println("Anmeldung, wie ist ihr Name?");
                    break;
                case "2":
                    System.out.println("Jetzt am Telefon: " );
                    break;
                default:
                    System.out.println("Ungültige Eingabe");
                    break;
            }
            System.out.println("Nächste Person in der Schlange: ");
            System.out.println("Personen in der Warteschlange: ");
        }
    }


    /** Programm 2 : Telefonbuch mit Nummernverwaltung
     *   Lege ein Programm an, in dem ein Telefonbuch erstellt wird.
     *   Es soll immer ein Kontakt mit Telefonnummer gespeichert werden. (Nummernformat 0123456789)
     *   Anforderungen:
     *   - Es soll ein Textbasiertes Interface geben über das
     *   1. Kontakte gesucht
     *   2. Kontakte hinzugefügt
     *   3. Kontakte gelöscht
     *   4. Alle Kontakte angezeigt
     *   werden können.
     **/

    public void programm2() {

        while(true){
            System.out.println("--- Telefonbuch --- ");
            System.out.println("1. Kontakt hinzufügen");
            System.out.println("2. Kontakt suchen");
            System.out.println("3. Kontakt löschen");
            System.out.println("4. Alle Kontakte anzeigen");

            Scanner scan = new Scanner(System.in);
            String input = scan.nextLine();

            switch(input){
                case "1":

                    break;
                case "2":

                    break;
                case "3":

                    break;
                case "4":

                    break;
                default:

                    break;
            }
        }
    }

    /**
     *  Programm 3 :
     *  Kindergarten Telefonservice
     *  A) Lege ein Telefonbuch an.
     *  b) Lege eine Anrufliste an in der alle Personen aus dem Telefonbuch namentlich eingefügt werden.
     *  c) Lasse dir Alphabetisch ausgeben wer angerufen werden muss, lass dir gleich auch die
     *  Nummer mit ausgeben.
     *
     *  p
     * */
}

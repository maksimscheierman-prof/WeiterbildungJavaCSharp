package T04_Array;

public class a_1D_Arrays {
    public static void main(String[] args) {

        /***********************************************************************************************************************************
          █████╗ ██████╗ ██████╗  █████╗ ██╗   ██╗
         ██╔══██╗██╔══██╗██╔══██╗██╔══██╗╚██╗ ██╔╝
         ███████║██████╔╝██████╔╝███████║ ╚████╔╝
         ██╔══██║██╔══██╗██╔══██╗██╔══██║  ╚██╔╝
         ██║  ██║██║  ██║██║  ██║██║  ██║   ██║
         ╚═╝  ╚═╝╚═╝  ╚═╝╚═╝  ╚═╝╚═╝  ╚═╝   ╚═╝
         ***********************************************************************************************************************************/

        /**                                     Datenstruktur: Arrays
         * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
         *  Ein Array ist eine Sammlung von Werten gleichen Typs unter einem gemeinsamen Namen. Im Prinzip eine Art Tabelle.
         *  Jedes Element im Array ist über einen sogenannten Index (Start bei 0) ansprechbar.
         *  Arrays haben eine feste Länge, die bei der Erstellung festgelegt wird.
         *
         *  Man verwendet Arrays z.B. zur Speicherung mehrerer Zahlen, Zeichen oder Objekte.
         *
         * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
         */

        /*** * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
         *    So erstellt und verwendet man Arrays:
         *
         *    Variante 1 – Deklaration mit fixer Größe:
         *    int[] zahlen = new int[5];     // Erstellt ein Array mit 5 Plätzen (alle Werte sind 0)
         *
         *    Variante 2 – Direkte Initialisierung:
         *    int[] zahlen = {10, 20, 30, 40, 50};   // Erstellt ein Array mit 5 Werten
         *
         *    Zugriff auf ein Element:
         *    zahlen[0] → liefert den ersten Wert
         *    zahlen[4] → liefert den letzten Wert (Index = Länge - 1)
         *
         *    Ändern eines Wertes:
         *    zahlen[2] = 99;    // Setzt das dritte Element auf 99
         *
         *    Länge des Arrays:
         *    zahlen.length      // gibt die Anzahl der Elemente zurück
         *
         *    Achtung:
         *    Der Zugriff auf ungültige Indizes (z.B. zahlen[5] bei einem 5er Array) führt zu einem Fehler!
         *
         * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */

        /** BEISPIEL 1: Direkte Initialisierung mit Zugriff **/
        int[] noten = {1, 2, 3, 4, 5};
        System.out.println("Erste Note: " + noten[0]);
        System.out.println("Letzte Note: " + noten[noten.length - 1]);

        /** BEISPIEL 2: Werte ändern **/
        noten[2] = 6;
        System.out.println("Neue dritte Note: " + noten[2]);


        /** BEISPIEL 3: Deklaration ohne Initialisierung**/
        char[] buchstaben = new char[2];
        buchstaben[0] = 'h';
        buchstaben[1] = 'i';
        System.out.println(buchstaben[0] +""+ buchstaben[1]);   // Hint: Ohne die "" addition würde java automatisch den Unicodewert (zugewiesener Zahlenwert)
                                                                // des Chars addieren und eine Zahl ausgeben.

    }
}

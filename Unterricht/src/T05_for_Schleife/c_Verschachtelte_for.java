package T05_for_Schleife;

public class c_Verschachtelte_for {
    public static void main(String[] args) {

        /***********************************************************************************************************************************
         ██╗   ██╗███████╗██████╗ ███████╗ ██████╗██╗  ██╗ █████╗  ██████╗██╗  ██╗████████╗███████╗██╗  ████████╗
         ██║   ██║██╔════╝██╔══██╗██╔════╝██╔════╝██║  ██║██╔══██╗██╔════╝██║  ██║╚══██╔══╝██╔════╝██║  ╚══██╔══╝
         ██║   ██║█████╗  ██████╔╝███████╗██║     ███████║███████║██║     ███████║   ██║   █████╗  ██║     ██║
         ╚██╗ ██╔╝██╔══╝  ██╔══██╗╚════██║██║     ██╔══██║██╔══██║██║     ██╔══██║   ██║   ██╔══╝  ██║     ██║
          ╚████╔╝ ███████╗██║  ██║███████║╚██████╗██║  ██║██║  ██║╚██████╗██║  ██║   ██║   ███████╗███████╗██║
           ╚═══╝  ╚══════╝╚═╝  ╚═╝╚══════╝ ╚═════╝╚═╝  ╚═╝╚═╝  ╚═╝ ╚═════╝╚═╝  ╚═╝   ╚═╝   ╚══════╝╚══════╝╚═╝
         ***********************************************************************************************************************************/

        /**                                     Verschachtelte for-Schleifen (for-in-for)
         * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
         *  Eine verschachtelte Schleife ist "eine Schleife in einer anderen Schleife".
         *  Man verwendet sie z.B. zum Durchlaufen von 2D-Arrays, Tabellen, Mustern oder Kombinationen.
         *

         *  Häufig steuert die äußere Schleife z.B. die Zeilen und die innere die Spalten.
         * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
         */

        /*** Hinweise: * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
         *
         *   Aufbau:
         *      for(int i = 0; i < X; i++) {
         *          for(int j = 0; j < Y; j++) {
         *              // Innerer Schleifenblock
         *          }
         *      }
         *
         *      Beispiel: Ausgabe einer Tabelle mit Zeilen und Spalten
         *      Ausgabe:
         *      Zeile 0 Spalte 0
         *      Zeile 0 Spalte 1
         *      Zeile 0 Spalte 2
         *      Zeile 1 Spalte 0
         *      ...
         *
         *    - Der äußere Zähler (zumeist mit Index i) läuft z.B. über Zeilen
         *    - Der innere Zähler (zumeist mit Index j) läuft z.B. über Spalten
         *    - Die innere Schleife wird für jede Runde der äußeren Schleife vollständig durchlaufen
         *
         * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */

        /** BEISPIEL 1: Einfache verschachtelte Schleife **/
        for(int zeile = 0; zeile < 3; zeile++) {
            for(int spalte = 0; spalte < 4; spalte++) {
                System.out.println("Zeile " + zeile + " Spalte " + spalte);
            }
        }

        /** BEISPIEL 2: Ausgabe eines Rechtecks mit Sternchen **/
        System.out.println("\nSternchen-Rechteck:");
        for(int i = 0; i < 4; i++) {              // 4 Zeilen
            for(int j = 0; j < 6; j++) {          // 6 Spalten
                System.out.print("*");
            }
            System.out.println(); // Zeilenumbruch
        }

        /** BEISPIEL 3: Durchlauf eines 2D-Arrays **/
        int[][] zahlen = {
                {1, 2, 3},
                {4, 5, 6}
        };

        System.out.println("\n2D-Array Ausgabe:");
        for(int i = 0; i < zahlen.length; i++) {             // Zeilen
            for(int j = 0; j < zahlen[i].length; j++) {      // Spalten
                System.out.print(zahlen[i][j] + " ");
            }
            System.out.println();
        }

    }
}

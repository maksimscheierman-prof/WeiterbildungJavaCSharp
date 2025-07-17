package T06_while_Schleife;

import java.util.Scanner;

public class a_while {
    public static void main(String[] args) {

        /***********************************************************************************************************************************
         ██╗    ██╗██╗  ██╗██╗██╗     ███████╗
         ██║    ██║██║  ██║██║██║     ██╔════╝
         ██║ █╗ ██║███████║██║██║     █████╗
         ██║███╗██║██╔══██║██║██║     ██╔══╝
         ╚███╔███╔╝██║  ██║██║███████╗███████╗
         ╚══╝╚══╝ ╚═╝  ╚═╝╚═╝╚══════╝╚══════╝
         ***********************************************************************************************************************************/

        /**                                     While-Schleife kopfgesteuert
         * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
         *  Schleifen werden verwendet, um Code mehrfach auszuführen.
         *  Sie eignen sich besonders, wenn man vorab nicht weiß, wie oft die Schleife durchlaufen wird.
         *
         *  Die kopfgesteuerte While-Schleife prüft die Bedingung VOR jedem Durchlauf.
         *  Ist die Bedingung true → Code wird ausgeführt
         *  Ist die Bedingung false → Schleife wird beendet
         *
         * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
         */

        /*** Grundaufbau der while-Schleife: * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
         *
         *    while(Bedingung){
         *        // Dieser Code wird wiederholt ausgeführt,
         *        // solange die Bedingung true ist.
         *    }
         *
         *    Wichtig:
         *    Wenn sich die Bedingung nicht innerhalb der Schleife ändert,
         *    wird diese endlos ausgeführt.
         *
         * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */

        /*** Besondere KEYWORDS * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
         *
         *    break;        - Eine Schleife kann vorzeitig beendet werden
         *    continue    - Der Schleifendurchlauf wird übersprungen.
         * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */

        /*** Hinweis:  * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
         *
         *    Wenn sich die Bedingung nicht innerhalb der Schleife ändert,
         *    wird diese endlos ausgeführt.
         *
         * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */


        /** BEISPIEL 1: Hochzählen **/
            int i = 0;                                              // hilfsvariable für die Schleife
            while(i < 5) {                                          // So lange i kleiner als 5 ist.
                System.out.println("Wert von i kleiner 5: " + i);
                i++;                                                // Ohne diese Zeile würde die Schleife nie enden!
            }

        /** BEISPIEL 2: Benutzer-Eingabe mit Abbruchbedingung **/
            Scanner scan = new Scanner(System.in);
            String eingabe = "";                                    // Hilfsvariable für die Schleife

            while(!eingabe.equals("exit")) {                        // So lange nicht exit eingegeben wurde.
                System.out.print("Gib etwas ein. Tippe 'exit' zum Beenden: ");
                eingabe = scan.nextLine();
                System.out.println("Du hast eingegeben: " + eingabe);
            }

        /** BEISPIEL 3: Endlosschleife (nur mit Abbruch innen) **/
            int durchlauf = 0;
            while(true) {
                System.out.println("Durchlauf: " + durchlauf);
                durchlauf++;   // erhöht den Wert von durchlauf um genau 1.

                if(durchlauf == 3){
                    break; // Schleife wird bewusst beendet, Austrittsbedingung sollte am Ende der Schleife gestellt werden.
                }
            }


        /*** Hinweis:  * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
         *
         *   Eine while-Schleife eignet sich gut, um das Programm permanent offenzuhalten und
         *   nur auf einen bestimmten Input zu schließen. Ähnlich wie in Beispiel 3.
         *
         * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */
    }
}

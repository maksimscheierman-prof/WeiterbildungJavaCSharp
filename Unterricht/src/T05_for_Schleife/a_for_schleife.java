package T05_for_Schleife;

public class a_for_schleife {
    public static void main(String[] args) {

        /***********************************************************************************************************************************
         ███████╗ ██████╗ ██████╗       ███████╗██╗  ██╗██╗     ███████╗██╗███████╗███████╗
         ██╔════╝██╔═══██╗██╔══██╗      ██╔════╝██║  ██║██║     ██╔════╝██║██╔════╝██╔════╝
         █████╗  ██║   ██║██████╔╝█████╗███████╗███████║██║     █████╗  ██║█████╗  █████╗
         ██╔══╝  ██║   ██║██╔══██╗╚════╝╚════██║██╔══██║██║     ██╔══╝  ██║██╔══╝  ██╔══╝
         ██║     ╚██████╔╝██║  ██║      ███████║██║  ██║███████╗███████╗██║██║     ███████╗
         ╚═╝      ╚═════╝ ╚═╝  ╚═╝      ╚══════╝╚═╝  ╚═╝╚══════╝╚══════╝╚═╝╚═╝     ╚══════╝
         ***********************************************************************************************************************************/

        /**                                     Schleifensteuerung
         * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
         *  Schleifen ermöglichen es, Anweisungen mehrfach hintereinander auszuführen.
         *  Besonders nützlich, wenn etwas mehrfach wiederholt werden soll – z.B. bei Listen oder Zählschleifen.
         *
         *  Wir schauen uns hier die for-Schleife an.
         * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
         */

        /*** * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
         *    Die for-Schleife funktioniert nach dem Prinzip:
         *    "Zähle von Start bis Ende und führe etwas dabei aus."
         *
         *    Sie besteht aus drei Bestandteilen innerhalb der Klammern:
         *        1. Initialisierung      → Startwert der Schleifenvariable (z.B. int i = 0)
         *        2. Bedingung            → Solange diese Bedingung true ist, wird der Codeblock ausgeführt
         *        3. Inkrement/Dekrement  → Schrittweite (z.B. i++ oder i--)
         *
         *                        SYNTAX
         *
         *    for(Initialisierung; Bedingung; Inkrement){
         *        // Dieser Block wird wiederholt ausgeführt, bis die Bedingung nicht mehr gegegben ist.
         *    }
         *
         * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */

        /** BEISPIEL 1: Zähle von 0 bis 9 **/
        for(int i = 0; i < 10; i++) {
            System.out.println("Wert von i: " + i);
        }

        /** BEISPIEL 2: Rückwärts zählen **/
        for(int i = 5; i >= 0; i--) {
            System.out.println("Countdown: " + i);
        }

        /** BEISPIEL 3: Mit Schrittweite 2 **/
        for(int i = 0; i <= 10; i += 2) {
            System.out.println("Nur gerade Zahlen: " + i);
        }

        /** BEISPIEL 4: Mit for-Schleife durch Array iterieren **/
        int[] noten = {5, 6, 7, 8, 9};
        for(int i = 0; i < noten.length; i++) {
            System.out.println("Note an Position " + i + ": " + noten[i]);
        }

    }
}

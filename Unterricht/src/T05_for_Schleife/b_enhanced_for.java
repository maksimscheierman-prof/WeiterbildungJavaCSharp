package T05_for_Schleife;

public class b_enhanced_for {
    public static void main(String[] args) {

        /***********************************************************************************************************************************
         ███████╗███╗   ██╗██╗  ██╗ █████╗ ███╗   ██╗ ██████╗███████╗██████╗       ███████╗ ██████╗ ██████╗
         ██╔════╝████╗  ██║██║  ██║██╔══██╗████╗  ██║██╔════╝██╔════╝██╔══██╗      ██╔════╝██╔═══██╗██╔══██╗
         █████╗  ██╔██╗ ██║███████║███████║██╔██╗ ██║██║     █████╗  ██║  ██║█████╗█████╗  ██║   ██║██████╔╝
         ██╔══╝  ██║╚██╗██║██╔══██║██╔══██║██║╚██╗██║██║     ██╔══╝  ██║  ██║╚════╝██╔══╝  ██║   ██║██╔══██╗
         ███████╗██║ ╚████║██║  ██║██║  ██║██║ ╚████║╚██████╗███████╗██████╔╝      ██║     ╚██████╔╝██║  ██║
         ╚══════╝╚═╝  ╚═══╝╚═╝  ╚═╝╚═╝  ╚═╝╚═╝  ╚═══╝ ╚═════╝╚══════╝╚═════╝       ╚═╝      ╚═════╝ ╚═╝  ╚═╝
         ***********************************************************************************************************************************/

        /**                                     Schleifensteuerung
         * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
         *  Neben der klassischen for-Schleife gibt es eine verkürzte Variante:
         *  die sogenannte "enhanced for-Schleife" (auch "foreach-Schleife" genannt).
         *  Sie eignet sich besonders gut, um durch Arrays zu iterieren, ohne einen Zählindex zu verwenden.
         *
         * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
         */

        /*** * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
         *    Die enhanced for-Schleife funktioniert nach dem Prinzip:
         *    "Gehe jedes Element der Sammlung durch – automatisch."
         *
         *    Sie besteht aus zwei Bestandteilen innerhalb der Klammern:
         *        1. Datentyp + Variable    → Repräsentiert ein Element der Sammlung
         *        2. Sammlung/Array         → Das Array oder die Collection, durch die iteriert wird
         *
         *  ______________________________SYNTAX___________________________
         *
         *      for(Datentyp element : Sammlung){
         *            // Dieser Block wird für jedes Element ausgeführt.
         *      }
         *
         * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */

        /** BEISPIEL 1: Iteration durch ein Array von Ganzzahlen **/
        int[] zahlen = {3, 5, 7, 9};
        for(int zahl : zahlen) {
            System.out.println("Zahl: " + zahl);
        }

        /** BEISPIEL 2: Iteration durch ein Array von Strings **/
        String[] namen = {"Ali", "Mira", "Tom"};
        for(String name : namen) {
            System.out.println("Name: " + name);
        }

        /** BEISPIEL 3: Iteration durch ein Array von Kommazahlen **/
        double[] noten = {1.0, 2.3, 3.7};
        for(double note : noten) {
            System.out.println("Note: " + note);
        }

        /** BEISPIEL 4: Vergleich - normale for-Schleife vs. enhanced for-Schleife **/
        int[] werte = {10, 20, 30};

        // normale for-Schleife mit Index
        for(int i = 0; i < werte.length; i++) {
            System.out.println("Mit Index: " + werte[i]);
        }

        // enhanced for-Schleife bzw. foreach-Schleife
        for(int wert : werte) {
            System.out.println("Ohne Index: " + wert);
        }

    }

}

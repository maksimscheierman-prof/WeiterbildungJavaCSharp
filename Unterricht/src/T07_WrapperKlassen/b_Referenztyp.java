package T07_WrapperKlassen;

public class b_Referenztyp {
    public static void main(String[] args) {

        /***************************************************************************************************************************************************************
         ██████╗ ███████╗███████╗███████╗██████╗ ███████╗███╗   ██╗███████╗████████╗██╗   ██╗██████╗
         ██╔══██╗██╔════╝██╔════╝██╔════╝██╔══██╗██╔════╝████╗  ██║╚══███╔╝╚══██╔══╝╚██╗ ██╔╝██╔══██╗
         ██████╔╝█████╗  █████╗  █████╗  ██████╔╝█████╗  ██╔██╗ ██║  ███╔╝    ██║    ╚████╔╝ ██████╔╝
         ██╔══██╗██╔══╝  ██╔══╝  ██╔══╝  ██╔══██╗██╔══╝  ██║╚██╗██║ ███╔╝     ██║     ╚██╔╝  ██╔═══╝
         ██║  ██║███████╗██║     ███████╗██║  ██║███████╗██║ ╚████║███████╗   ██║      ██║   ██║
         ╚═╝  ╚═╝╚══════╝╚═╝     ╚══════╝╚═╝  ╚═╝╚══════╝╚═╝  ╚═══╝╚══════╝   ╚═╝      ╚═╝   ╚═╝
         ***************************************************************************************************************************************************************/

        /**                                     Referenztypen
         * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
         *  Referenztypen (Komplexe Datentypen) sind alle Datentypen, die nicht zu den primitiven Typen gehören.
         *  Dazu zählen: Strings, Arrays, ArrayLists, selbst definierte Klassen und viele weitere.
         *  Streng genommen sind in Java alle Klassen ein komplexer Datentyp.
         *
         *  Sie heißen "Referenzdatentypen", weil sie keine Werte direkt speichern,
         *  sondern nur eine Referenz (Adresse) auf ein Objekt im Speicher enthalten.
         *
         *  Wird ein Referenztyp kopiert oder übergeben, wird nur die Referenz kopiert – nicht das Objekt selbst!
         *
         * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
         */

        /* *******Abstraktes Beispiel, nur zur Gedankenstütze, Realität weicht ab!**************************************

            String s = "Hallo"
            String c = "Hallo"
            String f = "Bye"
           _______________ Bildliche Darstellung _________________
           Referenzen                         Speicher (String Pool)
           [ s, c   ]         -------->      [ String Objekt "Hallo" ]
           [ f      ]         -------->      [ String Objekt "Bye" ]

           Es wird das String Objekt "Hallo" erstellt und in den String-Pool abgelegt.
           s speichert die Referenz zum Objekt Hallo, c speichert die Referenz zum Objekt Hallo
           f speichert die Referenz zum Objekt Bye
         ***************************************************************************************************************/

        /*** * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
         *    Beispiele für RefernzDatentypen:
         *
         *    - String name = "Max";
         *    - int[] zahlen = {1, 2, 3};
         *    - ArrayList<String> namen = new ArrayList<>();
         *    - Scanner sc = new Scanner(System.in);
         *    - Eigene, selbst erstellte Klassen
         *
         *    Unterschied zu primitiven Datentypen:
         *    int x = 5;                      // x enthält direkt den Wert 5
         *    int[] arr = {1, 2, 3};          // arr enthält nur eine Speicheradresse zum Array
         *
         *
         * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */

        /** BEISPIEL 1: Referenzverhalten von Arrays **/
        int[] a = {10, 20, 30};
        int[] b = a;             // b zeigt auf dasselbe Array wie a !
        /*[ a, b   ]         -------->      [ Array objekt {10,20,30} ] */

        b[0] = 99;              // Wir Ändern das Objekt, auf das b zeigt.

        System.out.println("a[0]: " + a[0]); // Da a auf das GLEICHE Objekt zeigt, wie b, wird hier 99 ausgegeben.


        /** BEISPIEL 2: Vergleich von Referenztypen **/
        String s1 = "Hallo";        // Es wird ein String Objekt mit Wert "Hallo" erstellt.           /*   [s1,    ]  -------> ["Hallo"]   */
        String s2 = "Hallo";        // s2 zeigt auf dasselbe String Objekt wie s1                     /*   [s1, s2 ]  -------> ["Hallo"]   */

        String s3 = new String("Hallo"); // Durch "new" wird ein NEUES Objekt erstellt. s3 zeigt auf ein ANDERES String Objekt mit Wert "Hallo"
        /*  [s1, s2 ]  -------> ["Hallo"]
            [s3     ]  -------> ["Hallo"]   */

        System.out.println(s1 == s2);        // true, wir vergleichen Referenzen
        System.out.println(s1 == s3);        // false, wir vergleichen Referenzen
        System.out.println(s1.equals(s3));   // true , wir vergleichen Inhalte
                                             // Prinzipiell wollen wir Objekte nie mit == vergleichen, weil uns nur die Inhalte interessieren.

    }
}

package T04_Array;

public class b_2D_Arrays {
    public static void main(String[] args) {

        /***********************************************************************************************************************************
         ██████╗ ██████╗      █████╗ ██████╗ ██████╗  █████╗ ██╗   ██╗███████╗
         ╚════██╗██╔══██╗    ██╔══██╗██╔══██╗██╔══██╗██╔══██╗╚██╗ ██╔╝██╔════╝
          █████╔╝██║  ██║    ███████║██████╔╝██████╔╝███████║ ╚████╔╝ ███████╗
         ██╔═══╝ ██║  ██║    ██╔══██║██╔══██╗██╔══██╗██╔══██║  ╚██╔╝  ╚════██║
         ███████╗██████╔╝    ██║  ██║██║  ██║██║  ██║██║  ██║   ██║   ███████║
         ╚══════╝╚═════╝     ╚═╝  ╚═╝╚═╝  ╚═╝╚═╝  ╚═╝╚═╝  ╚═╝   ╚═╝   ╚══════╝
         ***********************************************************************************************************************************/

        /**                                     Zwei-dimensionale Arrays (2D-Arrays)
         * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
         *  Ein 2D-Array ist ein "Array von Arrays".
         *  Es eignet sich z.B. zur Darstellung von Tabellen, Matrizen oder Spielbrettern.
         *
         *  Aufbau:        Typ[][] name = new Typ[zeilen][spalten];
         *  Zugriff:       name[zeilenIndex][spaltenIndex];
         *  Index beginnt wie immer bei 0.
         *
         * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
         */

        /*** * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
         *    Beispiel für ein 2D-Array mit Zahlen:
         *
         *    int[][] zahlen = {
         *        {1, 2, 3},
         *        {4, 5, 6},
         *        {7, 8, 9}
         *    };
         *
         *    zahlen[0][0] → 1
         *    zahlen[2][1] → 8
         *
         *    Oder man erstellt es mit:
         *    int[][] matrix = new int[3][3];  // 3 Zeilen, 3 Spalten (alle mit 0 initialisiert)
         *
         *    Hinweis:  Ein Array kann im Prinzip beliebig viele Dimensionen annehmen.
         *              d.H. es gibt auch 3D Arrays, 4D Arrays, etc.
         * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */

        /** BEISPIEL 1: 2D-Array erstellen und befüllen **/
        int[][] tabelle = new int[2][3]; // 2 Zeilen, 3 Spalten

        tabelle[0][0] = 5;
        tabelle[0][1] = 10;
        tabelle[0][2] = 15;

        tabelle[1][0] = 20;
        tabelle[1][1] = 25;
        tabelle[1][2] = 30;
        /*
        {05,10,15}
        {20,25,30}
         */

        /** BEISPIEL 2: Zugriff auf einzelne Felder **/
        System.out.println("Wert in Zeile 1, Spalte 2: " + tabelle[0][1]); // 10

        /** BEISPIEL 3: Ausgabe mit verschachtelter Schleife **/
        System.out.println("Komplette Tabelle:");
        for(int i = 0; i < tabelle.length; i++) {            // äußere Schleife: Zeilen
            for(int j = 0; j < tabelle[i].length; j++) {     // innere Schleife: Spalten
                System.out.print(tabelle[i][j] + " ");
            }
            System.out.println(); // Zeilenumbruch
        }

        /** BEISPIEL 4: Initialisierung mit Werten **/
        int[][] zahlen = {
                {1, 2},
                {3, 4},
                {5, 6}
        };

        System.out.println("Zahl an Position [2][0]: " + zahlen[2][0]); // → 5

    }
}

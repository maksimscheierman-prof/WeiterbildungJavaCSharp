package T08_ArrayList;

import java.util.ArrayList;

public class b_2D_ArrayLists {
    public static void main(String[] args) {


    /**                                     2D ArrayLists
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     *  Eine 2D ArrayList funktioniert genau wie ein 2D Array.
     *  Wir müssen jedoch anders damit umgehen, bzw. es anders Programmieren.
     *
     *  Hierzu müssen wir uns vorstellen, dass eine 2D ArrayList nichts anderes ist
     *  als eine ArrayList innerhalb einer ArrayList
     *
     *  Schritt 1:
     *  Wir erstellen eine ArrayList (Also eine Liste, die bliebig viele Spalten annehmen kann)
     *  In jede dieser Spalten, legen wir eine neue ArrayList, die wiederrum selbst beliebig viele Spalten annehmen kann.
     *  Leichter ist es, wenn wir uns vorstellen, dass die Zweite ArrayList unendlich viele Zeilen hat.
     *
     *  Unterm Strich ist es egal, die Software denkt nicht in Horizontal und vertikal, das tun nur wir.
     *
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     */
        // Wir haben eine ArrayList in einer ArrayList, mit dem Namen StringMatrix

        // ArrayList erstellen:
        ArrayList< ArrayList<String> > StringMatrix = new ArrayList<>();

        // Zeilen hinzufügen:
        int zeilen = 5;
        for (int i = 0; i < zeilen; i++) {
            StringMatrix.add(new ArrayList<>()); // Neue Zeile hinzufügen
        }

        // Zeilen befüllen:
        StringMatrix.get(0).add("Z0, S0 | "); // Zeile 0, Spalte 0
        StringMatrix.get(0).add("Z0, S1 | "); // Zeile 0, Spalte 1
        StringMatrix.get(1).add("Z1, S0 | "); // Zeile 1, Spalte 0
        StringMatrix.get(1).add("Z1, S1 | "); // Zeile 1, Spalte 1


        // Ausgeben:
        System.out.print(StringMatrix.get(0).get(0));   // Zeile 0, Spalte 0
        System.out.println(StringMatrix.get(0).get(1)); // Zeile 0, Spalte 1
        System.out.print(StringMatrix.get(1).get(0));   // Zeile 1, Spalte 0
        System.out.println(StringMatrix.get(1).get(1)); // Zeile 1, Spalte 1
        System.out.println();

        System.out.println(StringMatrix);
        /*
        Ausgabe:
         - Elemente werden mit Kommas getrennt.
         - Das erste Array (übergeordnete) speichert wiederrum selbst Array Elemente
         - Die inneren Arrays speichern selbst die konkreten Strings.
         - Da wir jeweils nur zwei EIngaben gemacht haben, sind die letzten drei Werte leer.
        [ [ArrayImArray]       , [Array im Array]      , [], [], []]
        [[Z0, S0 | , Z0, S1 | ], [Z1, S0 | , Z1, S1 | ], [], [], []]


         */
    }
}

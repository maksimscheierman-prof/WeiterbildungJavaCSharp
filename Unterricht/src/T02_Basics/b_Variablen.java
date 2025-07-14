package T02_Basics;

public class b_Variablen {


    /***************************************************************************************
     ██╗   ██╗ █████╗ ██████╗ ██╗ █████╗ ██████╗ ██╗     ███████╗███╗   ██╗
     ██║   ██║██╔══██╗██╔══██╗██║██╔══██╗██╔══██╗██║     ██╔════╝████╗  ██║
     ██║   ██║███████║██████╔╝██║███████║██████╔╝██║     █████╗  ██╔██╗ ██║
     ╚██╗ ██╔╝██╔══██║██╔══██╗██║██╔══██║██╔══██╗██║     ██╔══╝  ██║╚██╗██║
      ╚████╔╝ ██║  ██║██║  ██║██║██║  ██║██████╔╝███████╗███████╗██║ ╚████║
       ╚═══╝  ╚═╝  ╚═╝╚═╝  ╚═╝╚═╝╚═╝  ╚═╝╚═════╝ ╚══════╝╚══════╝╚═╝  ╚═══╝
     **************************************************************************************/


    /**                                     INFO
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     *  - In der IT, bzw. Programmierung werden Daten in "Variablen" gespeichert.
     *  - Jede Variable hat einen "Datentyp", einen "Variablennamen" und einen "Wert".
     *  = Datentyp  : legt fest, welche Werte eine Variable annehmen darf und welche Operationen auf ihr ausgeführt werden dürfen.
     *  = Name      : kann jeden beliebigen Namen annehmen.
     *  = Wert      : Der gespeicherte Wert, mit dem gearbeitet werden kann.
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     */

    /**                                   Grundlegende Datentypen
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     *  Name        *   JAVA Code    *   Beispielwert   * speichert
     *  ************ **************** ****************** ***********************
     *  Integer     *     int        *  -5, 0, 42       * ganze Zahlen
     *  Float       *     float      *   19.99f         * Dezimalzahlen (einfach)
     *  Double      *     Double     *   3.14159265     * Dezimalzahlen (hohe Genauigkeit)
     *  Boolean     *     boolean    *   true, false    * speichert die Zustände wahr / falsch (1 / 0)
     *  Char        *     char       * 'A', 'B', 'C'    * einzelne Zeichen
     *  String      *     String     * "ABC", "Hallo"   * eine Zeichenkette
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     */

    /**                                   Variablen Deklarieren
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     *  Im folgenden werden alle Variablen einmal beispielhaft deklariert und initalisiert.
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */


        int     ichbinEinInteger = 0;
        float   temperatur = 38.2f;
        double  pi  = 3.14159265;
        boolean verstanden = false;  // kommt schon noch ;)
        char c = 'a';
        String meineNachricht = "Ich bin eine Aneinanderreihung von chars";

}

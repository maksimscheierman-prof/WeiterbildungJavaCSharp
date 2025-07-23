package T07_WrapperKlassen;

public class a_Wrapper {
    public static void main(String[] args) {

        /***********************************************************************************************************************************
         ██╗    ██╗██████╗  █████╗ ██████╗ ██████╗ ███████╗██████╗       ██╗  ██╗██╗      █████╗ ███████╗███████╗███████╗
         ██║    ██║██╔══██╗██╔══██╗██╔══██╗██╔══██╗██╔════╝██╔══██╗      ██║ ██╔╝██║     ██╔══██╗██╔════╝██╔════╝██╔════╝
         ██║ █╗ ██║██████╔╝███████║██████╔╝██████╔╝█████╗  ██████╔╝█████╗█████╔╝ ██║     ███████║███████╗███████╗█████╗
         ██║███╗██║██╔══██╗██╔══██║██╔═══╝ ██╔═══╝ ██╔══╝  ██╔══██╗╚════╝██╔═██╗ ██║     ██╔══██║╚════██║╚════██║██╔══╝
         ╚███╔███╔╝██║  ██║██║  ██║██║     ██║     ███████╗██║  ██║      ██║  ██╗███████╗██║  ██║███████║███████║███████╗
         ╚══╝╚══╝ ╚═╝  ╚═╝╚═╝  ╚═╝╚═╝     ╚═╝     ╚══════╝╚═╝  ╚═╝      ╚═╝  ╚═╝╚══════╝╚═╝  ╚═╝╚══════╝╚══════╝╚══════╝
         ***********************************************************************************************************************************/

        /**                                     Wrapper-Klassen
         * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
         *  Java kennt von Haus aus primitive Datentypen (z.B. int, double, boolean) und dazugehörige Wrapper-Klassen.
         *  Diese „verpacken“ primitive Werte als Objekte. Sie werden also zu "Referenztypen".
         *
         *  Dadurch erhalten die primitiven Datentypen zusätzliche Methoden, um mit Ihnen zu arbeiten.
         *
         *  Das ist z.B. notwendig für:
         *  - Speicherung in Collections wie `ArrayList`
         *  - Methoden, die Objekte erwarten
         *  - Nutzung objektorientierter Features (z.B. .equals(), .toString())
         *
         * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
         */

        /*** * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
         *    Zuordnung: primitiver Typ → Wrapper-Klasse
         *
         *    byte     → Byte
         *    short    → Short
         *    int      → Integer
         *    long     → Long
         *    float    → Float
         *    double   → Double
         *    char     → Character
         *    boolean  → Boolean
         * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */

         /***  Wichtige Konzepte: * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
          *
          *   - Autoboxing: Beschreibt das umwandeln won primitiven Werten in Wrapper
          *   - Unboxing:  Beschreibt das umwandeln von Wrapper Werten in primitve Werte
          *   => Das bedeutet die Werte können zwischen primitven und ihren Wrappern beliebig ausgetauscht werden
          *
          * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */

         /** BEISPIEL 0: Deklaration **/
         int primitiveZahl = 12;
         Integer wrapperZahl = 42;

        /** BEISPIEL 1: Autoboxing & Unboxing **/
        // Autoboxen (eine primitve Zahl in einer Wrappervariablen speichern)
        wrapperZahl = primitiveZahl;
        //Unboxing (eine Wrapperzahl in einer primitiven Zahl speichern)
        primitiveZahl = wrapperZahl;


        /** BEISPIEL 2: Wrapper-Methoden nutzen **/
        String text = "123";
        int zahlParsed = Integer.parseInt(text);    // parseInt wandelt einen text in eine Zahl
        zahlParsed = zahlParsed + 10;               // Wir erhöhen die umgewandelte Zahl um 10
        System.out.println("Zahl: " + zahlParsed);  // 133 wird ausgegeben.

        String text2 = Double.toString(3.14);     // Wir wandeln einen double in ein String.
        System.out.println("Text: " + text2);       // → "3.14"


        /***  NACHTEILE: * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
         *
         *   Wrapperklassen bieten viele Vorteile, doch wieso benutzen wir nicht ausschließlich Wrapper-Klassen
         *   anstelle von primitiven Datentypen?
         *   - Wrapper-Klassen sind Objekte und damit im speicher abgelegte Werte.
         *     Der Zugriff auf Sie ist deutlich langsamer als auf primitive Datentypen.
         *   - Ein int benötigt 4 Bytes, ein Integer weitaus mehr.
         *   - Ein primitiver Datentyp kann nicht "null" sein, das bedeutet er speichert immer einen Wert.
         *   - Ein Referenztyp kann hingegen auch auf einen leeren Objektspeicher zeigen, er speichert dann "null", was zu
         *     Fehlern führen kann.
         * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */
    }

}

package T03_Strings;

public class a_Info {
    public static void main(String[] args) {

        /***********************************************************************************************************************************
         ███████╗████████╗██████╗ ██╗███╗   ██╗ ██████╗
         ██╔════╝╚══██╔══╝██╔══██╗██║████╗  ██║██╔════╝
         ███████╗   ██║   ██████╔╝██║██╔██╗ ██║██║  ███╗
         ╚════██║   ██║   ██╔══██╗██║██║╚██╗██║██║   ██║
         ███████║   ██║   ██║  ██║██║██║ ╚████║╚██████╔╝
         ╚══════╝   ╚═╝   ╚═╝  ╚═╝╚═╝╚═╝  ╚═══╝ ╚═════╝
         ***********************************************************************************************************************************/

        /**                                     Datentyp: String (Text)
         * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
         *  Ein String ist eine Zeichenkette, also eine Folge von einzelnen Zeichen (char).
         *  Strings werden in doppelte Anführungszeichen geschrieben: "Hallo Welt"
         *  Ein String ist kein "standard" Datentyp (primitiver Datentyp)
         *  Ein String ist in java eine spezielle Klasse, die mit Methoden ausgestattet ist.
         *  Diese Methoden helfen uns mit dem String zu arbeiten.
         *
         *  Wenn ein Datentyp nichts weiter ist, als ein Datentyp der Werte speichert, nennt man dies einen primitiven Datentyp
         *  Primitive Datentypen werden immer kleingeschrieben.
         *  Wenn ein Datentyp um Methoden erweitert wird, spricht man von einem komplexen Datentyp.
         *  Komplexe Datentypen werden immer großgeschrieben.
         *
         * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
         */

        /*** Erstellung von Strings: * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
         *
         *
         *    String name = "Max";                      // Direkte Zuweisung
         *    String text = new String("Hallo");        // Erstellung mit Konstruktor (meist unnötig)
         *
         *    Strings können mit + verkettet werden:
         *    String begruessung = "Hallo " + name;     // begruessung speichert nun: "Hallo Max"
         *
         *    Wichtige Methoden:
         *    - length()                → Gibt die Länge des Strings zurück
         *    - equals(...)             → Vergleicht Inhalt von zwei Strings (Groß-/Kleinschreibung beachten!)
         *    - equalsIgnoreCase(...)   → Vergleich ohne Beachtung von Groß-/Kleinschreibung
         *    - substring(von, bis)     → Schneidet einen Teilstring heraus
         *    - charAt(index)           → Gibt das Zeichen an einer bestimmten Position zurück
         *    - contains("...")         → Prüft, ob Teilstring enthalten ist
         *    - indexOf(String s)       → Sucht die Position eines Teilstrings
         *    - replace(char alt, char neu) → Ersetzt Zeichen.
         *    - toLowerCase()           → Wandelt alles in Kleinbuchstaben
         *    - toUpperCase()           → Wandelt alles in Großbuchstaben
         *
         *      ... Es gibt noch viele weitere Methoden :)
         * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */

        /*** Hinweis: * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
         *      ACHTUNG: String-Vergleiche niemals mit == machen!
         *      Immer .equals(...) verwenden!
         *      Komplexe Datentypen werden als "Objekte" gespeichert. Für Strings wird ein spezieller Speicherbereich
         *      angelegt. Es kann vorkommen, dass auch wenn Strings den selben Inhalt speichern, sie an verschiedenen
         *      Orten gespeichert sind.
         *      Wenn man mit == vergleicht, wird nur geprüft ob die Strings auf dem selben Speicherbereich liegen!
         *      mit .equals(...) wird der Inhalt vergleicht.!
         * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */

        /** BEISPIEL 1: Grundlegende Operationen **/
        String name = "Maxime";
        String begruessung = "Hallo " + name;
        System.out.println(begruessung); // Gibt Hallo Maxime aus
        System.out.println("Länge: " + name.length()); // 6

        /** BEISPIEL 2: Vergleiche **/
        String eingabe = "ja";
        if(eingabe.equals("ja")) {
            System.out.println("Du hast mit ja geantwortet.");
        }

        if(eingabe.equalsIgnoreCase("JA")) {
            System.out.println("Du hast JA geschrieben (unabhängig von Groß-/Kleinschreibung).");
        }

        /** BEISPIEL 3: Teilstring & Zeichen **/
        String text = "Informatik";
        System.out.println("Erster Buchstabe: " + text.charAt(0));     // → I
        System.out.println("Ausschnitt: " + text.substring(0, 4));     // → Info
        System.out.println("Klein geschrieben: " + text.toLowerCase()); // → informatik

    }
}

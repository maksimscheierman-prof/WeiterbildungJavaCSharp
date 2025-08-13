package T12_Kommandozeilenargumenten;

public class Namen {

    /**
     * Über das String[] args können bei Programmstart über die Konsole dem Programm Werte übergeben werden
     * Diese Werte können dann in der main-Methode über das args-Array aufgerufen werden
     *
     * So öffnet ihr die Konsole korrekt:
     * -> Rechtsklick auf das Package, in dem sich eure Klasse mit main-Methode befindet
     * -> Open in -> Terminal
     *
     * Dort könnt ihr nun die Klasse mit folgender Syntax starten:
     *  java <Klassename>.java <Argumente>
     *
     * In diesem Beispiel
     *  java Namen.java Timo Marco Sergej
     *
     *  Die Argumente sind leerzeichen-getrennt, d.h. im obigen Beispiel hätte das args-Array
     *  die 3 Einträge [Timo], [Marco], [Sergej]
     *
     *  Wenn man ein Argument mit enthaltenem Leerzeichen eingeben möchte, kann man das gesamte
     *  Argument in Anführungszeichen setzen
     *
     *  Bsp.:
     *  java Namen.java "Timo Blomeyer" Marco Sergej
     *
     *  Durch die Anführungszeichen wird Timo Blomeyer als ein einzelnes Argument gesehen,
     *  ohne "" würden Timo und Blomeyer 2 separate Argumente sein
     *
     *  Typische Anwendungsfälle für Args:
     *  - Dateipfade (auf jedem Endgerät evtl. unterschiedlich)
     *  - Portnummer (z.B. auf welchem Port der Server starten soll)
     *
     */

    public static void main(String[] args) {
        System.out.println("Übergebene Namen: " + args.length);
        for (String name : args) {
            System.out.println(name);
        }
    }
}

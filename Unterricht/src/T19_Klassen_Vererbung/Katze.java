package T19_Klassen_Vererbung;

        /*
        Du bist hier:
        [ ] a_Info
        [x] Haustier
        [ ] Katze
        [ ] Hund
        [ ] MeineFarm
        [ ] Main
     */

/** Wir benutzen das keyword extends um zu zeigen, dass wir von Haustier erben. */
public class Katze extends Haustier{


    /** Attribute
     *  Katze erbt alle Attribute von Haustier, diese müssen nicht zusätzlich deklariert werden.
     *  String name
     *  String size
     *  String anzahlbeine
     * */


    public Katze(String name, int age){
        super(name,age,4);     // Wir müssen den Konstruktor der Parentclass aufrufen und befüllen.
                                            // Weil alle Katzen 4 Beine haben, können wir dies hardcoden.
    }

    public void miau(){                 // Katzen bekommen die Methode miau
        System.out.println("Miau");
    }
    public void zerkratzen(){
        System.out.println("AAH Meine Möbel!");
    }







}

package T19_Klassen_Vererbung;

   /*
        Du bist hier:
        [ ] a_Info
        [ ] Haustier
        [ ] Katze
        [ ] Hund
        [x] Tausenfuessler
        [ ] MeineFarm
        [ ] Main
     */

/** Wir benutzen das keyword extends um zu zeigen, dass wir von Haustier erben. */
public class Tausenfuessler extends Haustier{

    /** Attribute
     *  Katze erbt alle Attribute von Haustier, diese müssen nicht zusätzlich deklariert werden.
     *  String name
     *  String size
     *  String anzahlbeine
     * */
    public Tausenfuessler(String name){
        super(name,100000000,1000); // jaja tausendfüßler haben nicht tausend beine.
    }

    public void ascentToGod(){
        System.out.println("Ich habe die Geburt von Sternen erlebt");
        System.out.println("So wie auch ihren Untergang.");
        System.out.println("Nun sehet, wie ich selbst zum Stern aufsteigen werde");;
        int i = 0 / 0; // Systemcrash auslösen.
    }
}

package T19_Klassen_Vererbung;


        /*
        Du bist hier:
        [ ] a_Info
        [] Haustier
        [ ] Katze
        [x] Hund
        [ ] MeineFarm
        [ ] Main
     */

/** Wir benutzen das keyword extends um zu zeigen, dass wir von Haustier erben. */
public class Hund extends Haustier{


    /** Attribute
     *  Hund erbt alle Attribute von Haustier, diese müssen nicht zusätzlich deklariert werden.
     *  String name
     *  String size
     *  String anzahlbeine
     * */

    public Hund(String name, int age){
        super(name, age, 4); // Wir müssen den Konstruktor der parentclass aufrufen

    }

    public void bell(){
        System.out.println("WAU WAU");
    }

     public void aportieren(){
        for(int i = 0; i <= 20; i++){
            System.out.print("wirf den ball, ");
        }
         System.out.println(); // Enter
     }
}

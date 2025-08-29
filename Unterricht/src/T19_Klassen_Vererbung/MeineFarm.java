package T19_Klassen_Vererbung;

public class MeineFarm {

   /*
        Du bist hier:
        [ ] a_Info
        [] Haustier
        [ ] Katze
        [ ] Hund
        [x] MeineFarm
        [ ] Main
     */

    /**
     * Jetzt können wir Objekte von unseren Tieren anlegen.
     */

    private Katze katze1 = new Katze("tim",7);
    private Hund hund1 = new Hund("jarry", 8);
    private Tausenfuessler tf1 = new Tausenfuessler("goliath");


    public void runMeineFarm(){

        // Jetzt können wir auf die einzelnen Tiere zugreifen.
        System.out.println(" Tier 1: " + katze1.getName());
        katze1.miau();
        System.out.println(" Tier 2: " + hund1.getName());
        hund1.aportieren();
        System.out.println(" Tier 3: " + tf1.getName());
        tf1.ascentToGod();

    }





}

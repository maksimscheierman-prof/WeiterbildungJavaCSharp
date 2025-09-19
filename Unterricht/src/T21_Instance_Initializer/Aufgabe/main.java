package T21_Instance_Initializer.Aufgabe;

import java.util.ArrayList;
/**                                          MUSTERLÖSUNG
 *            !!!!!!!      ES WIRD STRENGSTENS EMPFOHLEN DIESE NICHT ANZUSEHEN !!!!!!
 *
 *                  Freigabe nachdem! Die Aufgabe zuende besprochen wurde!
 *
 *                              STEH DEINEM LERNERFOLG NICHT IM WEG
 *                                  PROBLEME LÖSEN = LERNEN
 */


/**
 *
 *
 *             uuuuuuuuuuuuuuuuuuuu
 *           u" uuuuuuuuuuuuuuuuuu "u
 *         u" u$$$$$$$$$$$$$$$$$$$$u "u
 *       u" u$$$$$$$$$$$$$$$$$$$$$$$$u "u
 *     u" u$$$$$$$$$$$$$$$$$$$$$$$$$$$$u "u
 *   u" u$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$u "u
 * u" u$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$u "u
 * $ $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ $
 * $ $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ $
 * $ $$$" ... "$...  ...$" ... "$$$  ... "$$$ $
 * $ $$$u `"$$$$$$$  $$$  $$$$$  $$  $$$  $$$ $
 * $ $$$$$$uu "$$$$  $$$  $$$$$  $$  """ u$$$ $
 * $ $$$""$$$  $$$$  $$$u "$$$" u$$  $$$$$$$$ $
 * $ $$$$....,$$$$$..$$$$$....,$$$$..$$$$$$$$ $
 * $ $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ $
 * "u "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$" u"
 *   "u "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$" u"
 *     "u "$$$$$$$$$$$$$$$$$$$$$$$$$$$$" u"
 *       "u "$$$$$$$$$$$$$$$$$$$$$$$$" u"
 *         "u "$$$$$$$$$$$$$$$$$$$$" u"
 *           "u """""""""""""""""" u"
 *             """"""""""""""""""""
 *
 *
 */





public class main {

    public static void main(String[] args){


        ArrayList<Tshirt> myTshirts = new ArrayList<>();
        ArrayList<Sweater> mySweaters = new ArrayList<>();

        for(int i = 0; i<412;i++){
            myTshirts.add(new Tshirt("semo","V"));
        }
        for(int i = 0; i<234;i++){
            myTshirts.add(new Tshirt("semo","O"));
        }
        for(int i = 0; i<253;i++){
            mySweaters.add(new Sweater());
        }
        for(int i = 0; i<101;i++){
            myTshirts.add(new Tshirt("semo","O"));
        }

        //Lass dir den Gesamtpreis für alle Kleidungen auf der Konsole ausgeben.

        double sweaterPrice = Sweater.getAmountSweater() * mySweaters.getFirst().getPrice();
        double tshirtPrice = Tshirt.getAmountTshirts() * myTshirts.getFirst().getPrice();
        System.out.println("Die Bestellung kostet: " + (sweaterPrice+tshirtPrice) + "€");

        System.out.println("Es gibt: " + Sweater.getAmountSweater() + " Pullover.");
        System.out.println("Es gibt: " + Tshirt.getAmountTshirts() + " Tshirts.");
    }
}

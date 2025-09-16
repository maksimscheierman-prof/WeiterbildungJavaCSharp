package T20_TryCatch.Aufgabe;

import java.io.IOException;
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

public class Main {
    public static void main(String[] args){

        /**
         *  *          3. Erstelle eine Main Methode
         *  *              a) Erstelle 200 Gürtel mit der Länge 80 cm
         *  *              b) Erstelle 100 Gürtel mit der länge 110 cm
         *  *              c) Erstelle 300 Gürtel mit der Länge 150 cm
         *  *          4. Lasse dir den Gesamtpreis ausgeben.
         *
         * */
        ArrayList<Belt> Bestellung = new ArrayList<>();

        for(int i = 0; i<200;i++){
            Bestellung.add(new Belt());
            try {
                Bestellung.get(i).generateBelt(80, 5);
            } catch (IOException e) {
                System.out.println("Dein Fehler: " + e);
            }
        }

        for(int i = 0; i<100;i++){
            Bestellung.add(new Belt());
            try {
                Bestellung.get(i).generateBelt(110, 5);
            } catch (IOException e) {
                System.out.println("Dein Fehler: " + e);
            }
        }
        for(int i = 0; i<300;i++){
            Bestellung.add(new Belt());
            try {
                Bestellung.get(i).generateBelt(150, 5);
            } catch (IOException e) {
                System.out.println("Dein Fehler: " + e);
            }
        }

        System.out.println("Länge: " + Belt.getTotalLength() + "Preis: "  + Belt.getPrice() + "Gesamtpreis: " + (Belt.getPrice()*Belt.getTotalLength()));

    }
}

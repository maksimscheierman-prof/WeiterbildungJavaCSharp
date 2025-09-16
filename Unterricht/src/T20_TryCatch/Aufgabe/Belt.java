package T20_TryCatch.Aufgabe;

import java.io.IOException;


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

/*  2. Erstelle eine Klasse Hose; b) Die Klasse soll von Kleidung erben */
public class Belt extends Clothes{
    /*       c) Die Klasse soll zusätzlich folgende Eigenschaften haben:
     *      - int Länge         // Soll die Länge des Gürtels in cm speichern.
     *      - int Löcher        // Soll die Anzahl der Löcher speichern.
     *      - static int anzahlGürtel  // Sol für jeden erstellten Gürtel eins hochzählen.*/

    int length = 0;
    int holes = 0;
    static int amountBelts = 0;

    static double price = 0;        // e) erstelle in der Klasse Hose eine neue static Variable price !
    static int totalLength = 0;     // g) Preis abhängig der Länge.

    {
        amountBelts++;
    }

    /* d) Die Klasse soll folgende Methoden haben:
     *     - generateBelt(int length, int holes){}
     *     - Die Methode soll eine IOException ausgeben wenn die länge des Gürtels kleiner 100 ist,
     *       oder wenn die Anzahl der Löcher kleiner als 3 ist. */

    public void generateBelt(int length, int holes) throws IOException {
       if(length<60){
           throw new IOException("Zu Kurz! Länge muss mindestens 60 cm sein!");
       }else if(holes<3){
           throw new IOException("Zu wenig Löcher! Mindestens 3 Löcher!");
       }else {
           this.length = length;
           this.holes = holes;
           totalLength = totalLength + length;
           calculatePrice();
       }
    }

/*     g) Der Preis für eine Gürtelbestellung soll von der Gesamtlänge abhängig sein.
 *        < 10.000 cm : 0,10 cent pro Meter.
 *        < 20.000 cm : 0,08 cent pro Meter.
 *        < 40.000 cm : 0,07 cent pro Meter.
 *        > 39.999 cm : 0,06 cent pro Meter.
 *
 *          Hinweis: vielleicht brauchst du eine zusätzliche static variable ;)
 *          Tipp: Du kannst eine neue Methode dafür anlegen und diese in generateBelt aufrufen.
 * */

    private void calculatePrice(){
        if(totalLength < 10000){
            price = 0.1;
        }
        else if(totalLength<20000){
            price = 0.08;
        }
        else if(totalLength <40000){
           price = 0.07;
        }
        else{
            price = 0.06;
        }


    }

/* f) erstelle in der Klasse Hose eine neue getter Methode für die statische Variable price!*/
    public static double getPrice(){
        return price;
    }

    public static double getTotalLength(){
        return totalLength;
    }


}

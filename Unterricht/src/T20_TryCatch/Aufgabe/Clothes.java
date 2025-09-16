package T20_TryCatch.Aufgabe;


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


/** 1. Erstelle eine Klasse Kleidung  */
public class Clothes {

/*
 *            1. Erstelle eine Klasse Kleidung
 *              a) Die Klasse soll folgende Eigenschaften haben:
 *                 - String         Stoff           // Soll die Art des Stoffes speichern
 *                 - static double  Preis           // soll den Preis speichern
 *                 - static int     anzahlKleidung  // Soll für jedes erstellte Kleidungsstück eins hochzählen.
 */
    private String fabric = "";
    private static double price = 0.0;
    private static int amountClothes = 0;

    //  anzahlKleidung // Soll für jedes erstellte Kleidungsstück eins hochzählen.
    {
        amountClothes++;
    }


/*
 *    b) Erstelle folgende Konsturktoren:
 *       - Standarkonstruktor
 *       - Konstruktor mit Parameter Stoff
 *       - Konstruktor mit Parameter Stoff, Preis
 * */

    public Clothes(){
        this.fabric = "abfallreste";
        this.price = 1000.99; // we tell them its made fom ... diamonds or... albino alpaka baby wool
    }
    public Clothes(String fabric){
        this.fabric = fabric;
        this.price = 1000.99;
    }

    public Clothes(String fabric, double price){
        this.fabric = fabric;
        this.price = price;
    }

/*
*       c) Erstelle getter und setter.
* */

    public String getFabric() {
        return fabric;
    }

    public static double getPrice() {
        return price;
    }

    public static int getAmountClothes() {
        return amountClothes;
    }
}

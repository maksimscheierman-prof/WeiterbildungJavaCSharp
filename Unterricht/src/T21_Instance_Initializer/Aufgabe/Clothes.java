package T21_Instance_Initializer.Aufgabe;


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
                 a) Die Klasse soll folgende Eigenschaften haben:
                - Stoff // Soll die Art des Stoffes speichern
                - Preis // soll den Preis speichern
                - anzahlKleidung // Soll für jedes erstellte Kleidungsstück eins hochzählen.
     */
    private String fabric = "";
    private double price = 0.0;
    private static int amountClothes = 0;

    //  anzahlKleidung // Soll für jedes erstellte Kleidungsstück eins hochzählen.
    {
        amountClothes++;
    }


    // Methoden
    public Clothes(){
        this.fabric = "abfallreste";
        this.price = 1000.99; // we tell them its made fom ... diamonds or... albino alpaka baby wool
    }


    public Clothes(String fabric, double price){
        this.fabric = fabric;
        this.price = price;
    }

        // Getter
    public String getFabric() {

        return fabric;
    }

    public double getPrice() {
        return price;
    }

    public static int getAmountClothes() {
        return amountClothes;
    }
}

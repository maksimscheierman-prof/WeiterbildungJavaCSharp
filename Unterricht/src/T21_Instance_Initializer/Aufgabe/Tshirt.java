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




public class Tshirt extends Clothes{

    private String brand ;
    private String collar;
    private static int amountTshirts;


    {
        amountTshirts++;
    }
        /** Konstruktoren */
// Standardkonstruktor: setzt marke auf "NoName", setzt Kragentyp auf "rund"
    public Tshirt() {
        super("Noname",0.05);
    }

// Konstruktor mit 2 Überladungen: setzt Marke und Kragentyp
    public Tshirt(String brand, String collar){
        super("Wolle",0.05);
        this.brand = brand;
        this.collar = collar;
    }

// Konstruktor mit 3 Überladungen setzt Marke, Kragentyp und Stoff.
    public Tshirt(String brand, String collar, String fabric){
        super(fabric,0.05);
        this.brand = brand;
        this.collar = collar;
    }
        /** Methoden */
// info() - Soll dem auffrufenden Programm als String die Marke, Stoff, Kragentyp und Preis zurückgeben. */
    public String info(){
        return ("Marke: " + this.brand + ". Stoff: " + super.getFabric() + ". Kragentyp: " + this.collar + ". Preis: "+ super.getPrice());
    }
        /** Getter */
// getAnzahlTshirts - hier sollen die Anzahl der erstellten Shirts zurückgegeben werden. */
     public static int getAmountTshirts(){
         return Tshirt.amountTshirts;
     }

}


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







public class Sweater extends Clothes {

    private String brand;
    private boolean hood;
    private static int amountSweater;

    {
        amountSweater++;
    }

    /**     Konstruktoren */
    // Standardkonstruktor: setzt marke auf "NoName", setzt Kragentyp auf "rund"
    public Sweater() {
        super("Noname",0.15);
        this.hood = false;
    }

    // Konstruktor mit 2 Überladungen: setzt Marke und Kappuze
    public Sweater(String brand, boolean hood){
        super("Wolle",0.15);
        this.brand = brand;
        this.hood = hood;
    }

    // Konstruktor mit 3 Überladungen setzt Marke, Kappuze  und Stoff.
    public Sweater(String brand, boolean hood, String fabric){
        super(fabric,0.15);
        this.brand = brand;
        this.hood = hood;
    }

     /**    Methoden */
    // info() - Soll dem auffrufenden Programm als String die Marke, Stoff, Kragentyp und Preis zurückgeben. */
    public String info(){
        return ("Marke: " + this.brand + ". Stoff: " + super.getFabric() + ". Kappuze: " + this.hood + ". Preis: "+ super.getPrice());
    }

    /**     Getter */
    //getAnzahlPullis    // hier sollen die Anzahl der erstellten Pulllis zurückgegeben werden.*/
    public static int getAmountSweater() {
        return amountSweater;
    }
}

package T17_Klassen_keyword_static;


public class Auto {

    /*
        Du bist hier:
        [x] 1. Auto
        [ ] 2. Main
     */

    /**                                     INFO
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     *  Static Variablen
     *      mit dem keyword "static" können Felder (Variablen) und Methoden von Klassen deklariert werden.
     *
     *      Merke:
     *       1. Variablen (Felder) und Methoden die mit static deklariert werden,
     *          sind nicht den von der Klasse abgeleiteten Objekten zugeordnet.
     *       2. Sie werden über den Klassennamen, nicht über das Objekt aufgerufen.
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     */


    /*** * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     * Beispiel: Wir erstellen eine Klasse "Auto"
     * In dieser Klasse erstellen wir drei Felder:
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */

    private String  marke = "";                     // Objektvariable  | String speichert die Marke
    private String serienNr = "";                   // Objektvariable  | speichert die SerienNr
    private static int      createdObjects = 0;     // Klassenvariable | static Variable. Diese Variable wird keinem Objekt speziell zugewiesen.

    //Konstruktor zum Anlegen des Autos.
    public Auto(String marke, String serienNr){
        this.marke          = marke;
        this.serienNr       = serienNr;
        createdObjects++;                             // Immer wenn wir den Konstruktor aufrufen, zählen wir fuhrpark hoch.
    }


    public String info(){
        return this.marke + " " + this.serienNr;
    }

    /*** * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     * getter/setter: die getter/setter für static variablen müssen ebenfalls static sein.
     * Da static Variablen zu keiner speziellen Instanz gehören muss der getter ebenfalls static sein.
     * damit auf die Variable ohne Instanz zugegriffen werden kann.
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */

    public static int getCreatedObjects() {
        return createdObjects;
    }

    /*** * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     *  Vermeide es static Variablen durch Instanzmethoden (Methoden ohne static) aufzurufen.
     *  Dies könnte zu Verwirrungen führen.
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */

}



package T21_Instance_Initializer;


public class Auto {

    /**                                     INFO
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     *  Die Theorie zu Instance Initializer kannst du in den Klassen:
     *  Theorie, TheorieBsp1, TheorieBsp2 nachlesen.
     *  Hier ein Beispiel mit der Klasse "Auto", bei der created Objects mit jeder Instanz hochgezählt werden soll.
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     */

    private String marke = "";                      // String speichert die Marke
    private String serienNr = "";                   // speichert die SerienNr
    private static int createdObjects = 0;          // static Variable. Diese Variable wird keinem Objekt speziell zugewiesen.

    /*** * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     * Der Instanzinitializer wird einmalig aufgerufen, bei jeder Instanz, noch vor dem Konstruktor!
     * Wir zählen in diesem Beispiel createdObjects immer um 1 hoch, ganz egal welcher Konstruktor aufgerufen wird.
     * Und das, ohne die Inkrementierung in alle Konstruktoren zu schreiben!
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */

    {
        System.out.println("Instance Initializer ausgeführt.");
        createdObjects++;
    }

    //Standardkonstruktor
    public Auto(){ }
    //Konstruktor zum Anlegen des Autos
    public Auto(String marke, String serienNr){
        this.marke          = marke;
        this.serienNr       = serienNr;
    }


    public String info(){
        return this.marke + " " + this.serienNr;
    }

    public static int getCreatedObjects() {
        return createdObjects;
    }

    public static void setCreatedObjects(int createdObjects) {
        Auto.createdObjects = createdObjects;
    }
}

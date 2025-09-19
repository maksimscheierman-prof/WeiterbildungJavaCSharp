package T21_Instance_Initializer;

public class TimeLogger {

    /**                                     INFO
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     * Praxisbeispiel:
     *  Eine Methode dieser Klasse soll messen wie viel Zeit vergangen ist, seit das Objekt zum ersten mal
     *  initalisiert wurde.
     *
     *  So könnte z.B. ein Timer programmiert werden.
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     */

    long startZeit = 0;
    String timerName = "noName";


    /*** * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     * Der Instanz Initalizer wird einmal aufgerufen, unabhängig davon welcher Konstruktor aufgerufen wird.
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */

    {
        startZeit = System.currentTimeMillis();             // Speichert die aktuelle Systemzeit in ms als "long int"
    }                                                       // Beim instanziieren der Klasse

    //              Konstruktoren
    public TimeLogger(){

    }

    public TimeLogger(String timerName){
        this.timerName = timerName;
    }

    //              Methoden
    public long getLaufzeit(){

        return System.currentTimeMillis() - startZeit;  //Die startzeit wird von der aktuellen Systemzeit abgezogen.
    }                                                   //Die Differenz = die Zeit seit dem das Objekt instanziiert wurde.

    // getter
    public long getStartZeit(){
        return startZeit;
    }
}

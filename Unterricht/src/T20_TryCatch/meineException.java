package T20_TryCatch;


    /** Wenn man ganz eigene Exceptions schreiben möchte, kann man eine Klasse erstellen
     * und diese von Exception erben lassen.*/

public class meineException extends Exception {

    // Zusätzlich wird der Konstruktor überschrieben.
    public meineException(String message) {
        super("MEINE EIGENE EXCEPTION" + message);
    }
}

package T21_Instance_Initializer;


/**                                     INFO
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * Gemeinsame Initialisierung:
 *  Wenn mehrere Konstruktoren dieselbe Initialisierungslogik teilen,
 *  kannst du diese Logik in einem IIB platzieren, um Redundanz zu vermeiden.
 *  Dies stellt sicher, dass die Initialisierung unabhängig davon erfolgt, welcher Konstruktor aufgerufen wird.
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 */

public class TheorieBsp1 {
    private int wert = 0;

    // Instance Initializer Block
    {
        wert = 42;
    }

    // Konstruktoren
    public TheorieBsp1() {
        System.out.println("Standardkonstruktor aufgerufen, Initwert: " + wert);
    }
    public TheorieBsp1(String text){
        System.out.println("Konstruktor mit Überladung aufgerufen, Initwert: " + wert);
    }
    public TheorieBsp1(String text, int zahl){
        System.out.println("Konstruktor mit 2 Überladungen aufgerufen, Initwert: " + wert);
    }

    /*** * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     *      Egal welcher der drei Konstruktoren aufgerufen wird.
     *      Der Wert wird immer auf 42 initialisiert.
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */


}
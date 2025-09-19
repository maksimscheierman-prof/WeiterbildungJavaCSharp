package T21_Instance_Initializer;


/**                                     INFO
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * Komplexe Initialisierung:
 *      Wenn die Initialisierung von Instanzvariablen komplex ist
 *      und nicht einfach in einer einzigen Zeile im Konstruktor erfolgen kann,
 *      kann ein IIB verwendet werden, um diese Logik zu kapseln.
 *      Dadurch wird der Code aufgeräumter.
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 */

public class TheorieBsp2 {
    private int[] zahlen;

    // Instance Initializer Block
    {
        zahlen = new int[10];
        for (int i = 0; i < zahlen.length; i++) {
            zahlen[i] = i * 2;
        }
        System.out.println("Array initialisiert");
    }

    /*** * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     *      Hier wird ein Array initalisiert, bei dem der Wert 2-mal größer ist, als die Stelle der Tabelle.
     *      Weil das ein eher komplexer Vorgang ist, lohnt sich eine Initialisierung über einen Instance-Initializer.
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */


    public TheorieBsp2() {

    }
}
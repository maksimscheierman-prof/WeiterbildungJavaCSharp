package T21_Instance_Initializer;

public class Theorie {

    /**                                     INFO
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     * Instance Initializer Blocks (IIBs) in Java sind spezielle Codeblöcke,
     * die verwendet werden, um Instanzvariablen zu initialisieren. Sie werden jedes Mal ausgeführt,
     * wenn eine Instanz der Klasse erstellt wird.
     * Instance-Initializer werden als immer als allererstes in einer Klasse aufgerufen.
     * sogar noch bevor der Konstruktor aufgerufen wird.
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     */

    private String meinText = "";


    /*** * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     * Um einen Instance Initalizer zu erstellen muss lediglich ein Klammernblock erstellt werden. { }
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */

    //Instance Initializer 1
    {
        meinText = "Instance Initializer 1 aufgerufen";
        System.out.println(meinText);  //Dies ist das erste das ausgeführt wird, wenn die Klasse aufgerufen wird.

    }

    public Theorie() {
        System.out.println("Konstruktor aufgerufen");
    }

    /*** * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     * Dabei ist es egal an welcher Stelle der InstanceInitializer erstellt wird.
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */

    //Instance Initializer 2
    {
        meinText = "Instance Initializer 2 aufgerufen.";
        System.out.println(meinText);
    }

    /*** * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     * Szenarien in denen es sinnvoll ist Instance Initializer zu nutzen findest du in:
     * TheorieBsp1 : Gemeinsame Initialisierung
     * TheorieBsp2 : Komplexe   Initialisierung
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */



}
package T18_Klassen_ConstructorChaining;

public class Main {

    public static void main(String[] args){
        /**                                     INFO
         * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
         * Beispielausführung der Klasse Katzenartige mit verschiedenen Konstruktoren
         * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
         */
        System.out.println("\nErstellen des Objektes Gepard:");
        Katzenartige Gepard = new Katzenartige("Gepard",100.0,50.0,200.0);
        // Es wird der Konstruktor mit 5 Parametern aufgerufen, weil dieser am ehesten übereinstimmt.

        System.out.println("\nErstellen des Objektes Loewe:");
        Katzenartige Loewe = new Katzenartige("Loewe","Antilopen",100.0,50.0,100.0);
        // Es wird der Konstruktor mit 7 Parametern aufgerufen, weil dieser am ehesten übereinstimmt.

        System.out.println("\nErstellen des Objektes Mieze:");
        Katzenartige Mieze = new Katzenartige();
        // Es wird der Standardkonstruktor aufgerufen.
    }

}


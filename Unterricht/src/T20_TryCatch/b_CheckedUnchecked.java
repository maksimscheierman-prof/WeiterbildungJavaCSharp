package T20_TryCatch;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class b_CheckedUnchecked {
    public static void main(String[] args){


        /**                                     INFO
         * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
         *          Es wird zwischen so genannten "checked" und "unchecked" Exceptions unterschieden.
         * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
         */

        /*
 ██████╗██╗  ██╗███████╗ ██████╗██╗  ██╗███████╗██████╗     ███████╗██╗  ██╗ ██████╗███████╗██████╗ ████████╗██╗ ██████╗ ███╗   ██╗███████╗
██╔════╝██║  ██║██╔════╝██╔════╝██║ ██╔╝██╔════╝██╔══██╗    ██╔════╝╚██╗██╔╝██╔════╝██╔════╝██╔══██╗╚══██╔══╝██║██╔═══██╗████╗  ██║██╔════╝
██║     ███████║█████╗  ██║     █████╔╝ █████╗  ██║  ██║    █████╗   ╚███╔╝ ██║     █████╗  ██████╔╝   ██║   ██║██║   ██║██╔██╗ ██║███████╗
██║     ██╔══██║██╔══╝  ██║     ██╔═██╗ ██╔══╝  ██║  ██║    ██╔══╝   ██╔██╗ ██║     ██╔══╝  ██╔═══╝    ██║   ██║██║   ██║██║╚██╗██║╚════██║
╚██████╗██║  ██║███████╗╚██████╗██║  ██╗███████╗██████╔╝    ███████╗██╔╝ ██╗╚██████╗███████╗██║        ██║   ██║╚██████╔╝██║ ╚████║███████║
 ╚═════╝╚═╝  ╚═╝╚══════╝ ╚═════╝╚═╝  ╚═╝╚══════╝╚═════╝     ╚══════╝╚═╝  ╚═╝ ╚═════╝╚══════╝╚═╝        ╚═╝   ╚═╝ ╚═════╝ ╚═╝  ╚═══╝╚══════╝
        */

        /*** * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
         *    checked Exceptions
         *
         *    Checked Exceptions sind Ausnahmen die während des kompilierens geprüft werden.
         *    Der Compiler stellt also sicher, dass diese Ausnahmen behandelt werden müssen!
         *
         *    Zu den häufigsten zählen:
         *    IOException, FileNotFoundException, ClassNotFoundException, SQLException,
         *    InterruptedException, NoSuchMethodException, IllegalAccessException, InstantiationException
         *
         * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */

        /**         BEISPIEL        */
       // FileReader datei1 = new FileReader("adresse der Datei");              // Der Compiler verbietet uns diese Funktion auszuführen
                                                                                // Weil die Methode FileReader einen "checked" Exception auswirft.

        /*** * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
         *   Entkommentiere Zeile 28 und du wirst sehen, dass der Compiler dir einen Fehler auswirft.
         *
         *   Es wird von dir erwartet! dass du die Zeile in einen try-catch Block einschließt!
         *   FileReader() wirft eine "FileNotFoundException" Exception aus.
         * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */
        try {
            FileReader datei2 = new FileReader("adresse der Datei");
        } catch (FileNotFoundException e) {
            System.out.println("Ein Fehler ist aufgetreten.");
            System.out.println("Fehler: " + e);
        }


        /*
██╗   ██╗███╗   ██╗ ██████╗██╗  ██╗███████╗ ██████╗██╗  ██╗███████╗██████╗     ███████╗██╗  ██╗ ██████╗███████╗██████╗ ████████╗██╗ ██████╗ ███╗   ██╗███████╗
██║   ██║████╗  ██║██╔════╝██║  ██║██╔════╝██╔════╝██║ ██╔╝██╔════╝██╔══██╗    ██╔════╝╚██╗██╔╝██╔════╝██╔════╝██╔══██╗╚══██╔══╝██║██╔═══██╗████╗  ██║██╔════╝
██║   ██║██╔██╗ ██║██║     ███████║█████╗  ██║     █████╔╝ █████╗  ██║  ██║    █████╗   ╚███╔╝ ██║     █████╗  ██████╔╝   ██║   ██║██║   ██║██╔██╗ ██║███████╗
██║   ██║██║╚██╗██║██║     ██╔══██║██╔══╝  ██║     ██╔═██╗ ██╔══╝  ██║  ██║    ██╔══╝   ██╔██╗ ██║     ██╔══╝  ██╔═══╝    ██║   ██║██║   ██║██║╚██╗██║╚════██║
╚██████╔╝██║ ╚████║╚██████╗██║  ██║███████╗╚██████╗██║  ██╗███████╗██████╔╝    ███████╗██╔╝ ██╗╚██████╗███████╗██║        ██║   ██║╚██████╔╝██║ ╚████║███████║
 ╚═════╝ ╚═╝  ╚═══╝ ╚═════╝╚═╝  ╚═╝╚══════╝ ╚═════╝╚═╝  ╚═╝╚══════╝╚═════╝     ╚══════╝╚═╝  ╚═╝ ╚═════╝╚══════╝╚═╝        ╚═╝   ╚═╝ ╚═════╝ ╚═╝  ╚═══╝╚══════╝
         */

        /*** * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
         *    unchecked Exceptions
         *
         *    Unchecked Exceptions treten während der Laufzeit des Programms auf.
         *    Sie werden nicht beim kompilieren geprüft. Der Compiler überlässt dir, ob du eine
         *    Ausnahme (try-catch) hinzufügen möchtest.
         *
         *    Zu den häufigsten unchecked Exceptions zählen:
         *    NullPointerException, ArrayIndexOutOfBoundsException, ArithmeticException, IllegalArgumentException
         *    ClassCastException, NumberFormatException, UnsupportedOperationException, IllegalStateException
         *
         * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */

        /**         BEISPIEL        */
        int zahl1       = 10;
        int zahl2       = 0;
        int ergebnis    = 0;
       //  ergebnis = zahl1/zahl2;
        /*** * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
         *   Entkommentiere die Zeile 81 und führe das Programm aus:
         *   Weil teilen durch 0 nicht möglich ist, wird eine "ArithmeticException" ausgelöst.
         *      Exception in thread "main" java.lang.ArithmeticException: / by zero
         * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */

        try{
            ergebnis = zahl1/zahl2;
        }catch(ArithmeticException e){
            System.out.println("Ein Fehler ist aufgetreten:");
            System.out.println("Fehlercode: " + e);
        }
    }

}

package T20_TryCatch;

import java.io.IOException;

public class c_theorie_throws {

    /**                                     INFO
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     *          Eine Methode die eine Exception auswirt benutzt das keyword "throws"
     *          Wir können auch eigene Methoden mit "throws" versehen um etwaiige Fehler abzufangen.
     *
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     */

    /** Beispiel 1  **/
    // Diese Methode überprüft das alter und wirft eine "ArithmeticException" aus.
    // ArithmeticException zählt zu den "unchecked" Exceptions
    static void checkAge(int age) throws ArithmeticException{       //mit throws geben wir an, dass eine Exception geworfen wird.
        if (age < 18){                                                                  // Wenn alter kleiner 18
            throw new ArithmeticException("Zugriff verweigert, du musst 18 sein.");     // Wirf neue Exception
        }else{
            System.out.println("Zugriff erlaubt.");
        }
    }

    /** Beispiel 2  **/
    // Diese Methode erwartet einen String mit "hi" oder "bye" als Parameter.
    // Enthält es etwas anderes wird eine neue IOException ausgeworfen.
    // IOException zählt zu den "checked" Exceptions.
    static void hiOrBye(String s) throws IOException {
        if (s.equals("hi") || s.equals("bye")) {
            System.out.println("Dir auch: " + s + " :)");
        } else {
            throw new IOException("Bitte nur hi oder bye eingeben!");
        }
    }

    /*** * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     *          AUSFÜHREN DER BEISPIELE
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */

    public static void main(String[] args){

        /*** * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
         * checkAge benutzt eine unchecked ArithmeticException, also ist der untere try-catch Block optional.
         * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */

        try {
            checkAge(17);
        } catch (ArithmeticException e) {
            System.out.println("Fehlermeldung: " + e);
        }

        /*** * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
         * StringToInt  benutzt eine   checked Exception, also ist der untere try-catch Block verpflichtend!
         * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */
        try {
            hiOrBye("hallo");
        } catch (IOException e) {
            System.out.println("Fehlermeldung: " + e);
        }

    }


}

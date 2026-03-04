package T20_TryCatch;
public class a_OverView {
    public static void main(String[] args){

    /*
    Quellen:    https://www.w3schools.com/java/java_ref_errors.asp
    */



    /**                                     INFO
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     *          Wenn java Code ausgeführt wird, können verschiedene Fehler auftreten.
     *          Wenn das passiert wird das Programm für gewöhnlich gestoppt und eine Fehlermeldung
     *          wird ausgegeben.
     *          Man sagt auch: Ein Fehler wird ausgeworfen:
     *          "Java throws an excpetion"
     *
     *          Mit "try" und "catch" keywords kann dieser Fehler "abgefangen" werden.
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     */


        /*** * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
         *     try, der innerhalb eines try Block geschriebene Code wird während seiner Laufzeit auf Errors geprüft.
         *
         *     catch, der innerhalb eines catch Block geschriebene Code wird ausgeführt,
         *     wenn ein fehler im try Block auftritt.
         * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */


        try{
            //Was hier drinn steht wird ausprobiert
        }catch(Exception e){
            //Was hier steht wird ausgeführt.
        }

        /*** * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
         *     BEISPIEL
         * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */

        int[] meinIntArray ={1,2,3};
        //System.out.println(meinIntArray[10]);

        /*** * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
         *     Wenn du den Code ausführst wird das Programm abbrechen
         *     und du wirst folgende Fehlermeldung erhalten:
         *
         *    Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 3
         *
         * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */

        /*** * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
         *     Mit einem try catch Block können wir diesen Fehler abfangen.
         *     Kommentiere Zeile 43 aus und starte das Programm erneut.
         * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */


        try{
            System.out.println(meinIntArray[10]);               // Es wird versucht diesen Code auszuführen.
        }catch (Exception e){                                       // Aufgrund des Fehlers
            System.out.println("Etwas ist schiefgelaufen.");   // wird stattdessen dieser Block ausgeführt.
        }

        /*** * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
         *     In der Klammer von catch steht (Exception e). Es gibt verschiedene Fehlerarten.
         *     Mit Exception e sind wir für jede Fehlerart bereit. "Exception e" ist universell nutzbar
         *     in e wird die Fehlernachricht gespeichert. Wir können Sie z.B. nutzen um Sie auf der Konsole auszugeben.
         * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */

        try{
            System.out.println(meinIntArray[10]);               // Es wird versucht diesen Code auszuführen.
        }catch (Exception e){                                       // Aufgrund des Fehlers
            System.out.println("Etwas ist schiefgelaufen.");    // wird stattdessen dieser Block ausgeführt.
            System.out.println("Fehlermeldung: " + e);          // Gib die Fehlermeldung auf der Konsole aus.
        }



        /*** * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
         *     Zur vollständigkeithalber:
         *      mit dem Schlüsselwort "finally" kann ein zusätzlicher Block ausgeführt werden - völlig unabhängig davon
         *      welches Ergebnis der try-catch Block hat.
         * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */
        try{
            System.out.println(meinIntArray[10]);               // Es wird versucht diesen Code auszuführen.
        }catch (Exception e){                                       // Aufgrund des Fehlers
            System.out.println("Etwas ist schiefgelaufen.");   // wird stattdessen dieser Block ausgeführt.
        }finally{
            System.out.println("Dies wird immer ausgeführt.");  //Wird ausgeführt unabhängig vom try-catch verhalten.
        }


                                    /*** ERROR / EXCEPTION TYPEN ***/

        /*
        ________Error/Exception____________	        _________  Description ________________________________
        ArithmeticError	                        Occurs when a numeric calculation goes wrong
        ArrayIndexOutOfBoundsException	        Occurs when trying to access an index number that does not exist in an array
        ClassFormatError	                    Occurs when a class file cannot be accessed
        ClassNotFoundException	                Occurs when trying to access a class that does not exist
        ConcurrentModificationException	        Occurs when an element is added or removed from iterables
        FileNotFoundException	                Occurs when a file cannot be accessed
        IncompatibleClassChangeError	        Occurs when there's been a change in a base class after a child class has already been initialized
        InputMismatchException	                Occurs when entering wrong input (e.g. text in a numerical input)
        InterruptedException	                Occurs when a Thread is interrupted while waiting/sleeping
        InvalidClassException	                Occurs when the Serialization runtime observes a problem with a class
        IOException	                            Occurs when an input or output operation fails
        NegativeArraySizeException	            Occurs when trying to create an array with negative size
        NoClassDefFoundError	                Occurs when the class is not found at runtime
        NoSuchFieldException	                Occurs when trying to access a class field/variable that does not exist
        NoSuchMethodException	                Occurs when trying to access a class method that does not exist
        NullPointerException	                Occurs when trying to access an object referece that is null
        NumberFormatException	                Occurs when it is not possible to convert a specified string to a numeric type
        RuntimeException	                    Occurs when an exception occurs at runtime
        StringIndexOutOfBoundsException	        Occurs when trying to access a character in a String that does not exist
        TypeNotPresentException	                Occurs when a type cannot be found
        IllegalArgumentException	            Occurs when when an illegal argument is passed to a method
        IllegalStateException	                Occurs when when a method is called at an illegal time
       */





    }
}

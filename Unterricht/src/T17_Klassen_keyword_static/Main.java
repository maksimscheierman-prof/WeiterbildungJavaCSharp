package T17_Klassen_keyword_static;

public class Main {

        /*
        Du bist hier:
        [x] 1. Auto
        [ ] 2. Main
     */


    public static void main(String[] args){



        /*** * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
         * Wir erstellen drei Instanzen (Objekte) von der Klasse Auto.
         * immer wenn wir den Konstruktor aufrufen:
         *                  new Auto();
         * zählen wir die static Variable "anzahlAutos" um 1 hoch. (Siehe Klasse Auto)
         * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */

        Auto meinAuto1 = new Auto("VW","SN1001");
        Auto meinAuto2 = new Auto("VW","SN1002");
        Auto meinAuto3 = new Auto("VW","SN1003");

        /*** * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
         * Weil die Methode getCreatedObjects() static ist,
         * können wir sie OHNE Objekt aufrufen.
         * Wir schreiben einfach den Klassennamen.Methode()
         * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */

        System.out.println("Anzahl Autos: " + Auto.getCreatedObjects());


        /*** * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
         * Weil die Methode getCreatedObjects() static ist,
         * können wir sie OHNE Objekt aufrufen.
         * Wir schreiben einfach den Klassennamen.Methode()
         * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */




    }
}

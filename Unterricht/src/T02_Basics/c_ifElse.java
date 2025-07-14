package T02_Basics;

public class c_ifElse {
public static void main(String[] args) {

    /***********************************************************************************************************************************
     ██╗███████╗     █████╗ ██████╗ ███████╗██████╗  █████╗  ██████╗ ███████╗
     ██║██╔════╝    ██╔══██╗██╔══██╗██╔════╝██╔══██╗██╔══██╗██╔════╝ ██╔════╝
     ██║█████╗█████╗███████║██████╔╝█████╗  ██████╔╝███████║██║  ███╗█████╗
     ██║██╔══╝╚════╝██╔══██║██╔══██╗██╔══╝  ██╔══██╗██╔══██║██║   ██║██╔══╝
     ██║██║         ██║  ██║██████╔╝██║     ██║  ██║██║  ██║╚██████╔╝███████╗
     ╚═╝╚═╝         ╚═╝  ╚═╝╚═════╝ ╚═╝     ╚═╝  ╚═╝╚═╝  ╚═╝ ╚═════╝ ╚══════╝
     ***********************************************************************************************************************************/


    /**                                     Ablaufsteuerung
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     *  Ablaufsteuerung beschreibt, wie der Programmfluss durch Anweisungen gesteuert wird.
     *  Zu den wichtigsten Steuerungsmechanismen gehören:
     *  Schleifen, Verzweigungen und Sprunganweisungen.
     *
     *  Wir schauen uns hier die If-Abfrage an.
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     */

    /*** * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     *    Die if-Abfrage funktioniert nach dem Prinzip:
     *    "Wenn-dann" Prinzip
     *    Es wird ein Variablen-Zustand abgefragt, nur wenn dieser Zustand "wahr" ist, wird
     *    der Codeblock der if-Abfrage ausgeführt.
     *    Optional kann eine if-Abfrage auch alternativverzweigungen haben.
     *
     *                      VARIANTE 1
     *    if(Bedingung){
     *      Wird ausgeführt wenn true
     *    }
     *                      VARIANTE 2
     *
     *    if(Bedingung 1){
     *        Wird ausgeführt wenn true
     *    }
     *    else{
     *       Wird ausgeführt wenn Bedingung false
     *    }
     *
     *                  VARIANTE 3
     *    if(Bedingung 1){
     *      Wird ausgeführt wenn true
     *    }
     *    else if(Bedingung 2){
     *      Wird ausgeführt wenn Bedingung 1 false, aber Bedingung 2 true
     *    }else{
     *      Wird ausgeführt wenn Bedingung 1 und 2 false sind.
     *    }
     *
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */


    /** BEISPIEL: **/
        int alter = 17; // Wir erstellen eine Variable Namens alter

        if(alter < 18){ // Prüft, ob die Variable alter kleiner als 18 ist.
            // hier der auszuführende Code
        }
        else if(alter < 13){    // Prüft, ob die Variable kleiner als 13 ist.
            // hier der auszuführende Code
        }else { // wird ausgeführt wenn keine der oberen abfragen zutrifft.
            // hier der auszuführende Code
        }



}
}

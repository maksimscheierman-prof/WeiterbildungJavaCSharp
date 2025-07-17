package T06_while_Schleife;

import java.util.Scanner;

public class b_do_while {
    public static void main(String[] args) {

        /***********************************************************************************************************************************
         ██████╗  ██████╗       ██╗    ██╗██╗  ██╗██╗██╗     ███████╗
         ██╔══██╗██╔═══██╗      ██║    ██║██║  ██║██║██║     ██╔════╝
         ██║  ██║██║   ██║█████╗██║ █╗ ██║███████║██║██║     █████╗
         ██║  ██║██║   ██║╚════╝██║███╗██║██╔══██║██║██║     ██╔══╝
         ██████╔╝╚██████╔╝      ╚███╔███╔╝██║  ██║██║███████╗███████╗
         ╚═════╝  ╚═════╝        ╚══╝╚══╝ ╚═╝  ╚═╝╚═╝╚══════╝╚══════╝
         ***********************************************************************************************************************************/

        /**                                     do-while-Schleife fußgesteuert
         * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
         *  Schleifen werden verwendet, um Code mehrfach auszuführen.
         *  Die do-while-Schleife ist "fußgesteuert", d.h. die Bedingung wird erst nach dem ersten Durchlauf geprüft.
         *
         *  Vorteil: Besonders geeignet für Eingabeschleifen, bei denen zuerst etwas passieren muss,
         *           bevor überprüft werden soll, ob wiederholt werden soll.
         *           Die Schleife wird dann auch ausgeführt, falls die Bedingung false ist.
         * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
         */

        /*** Grundaufbau der do-while-Schleife: * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
         *
         *    do {
         *        // Dieser Code wird **mindestens einmal** ausgeführt.
         *    } while(Bedingung);
         *
         * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */


        /** BEISPIEL 1: Hochzählen bis 4 **/
        int i = 0;
        do {
            System.out.println("Wert von i: " + i);
            i++;
        } while(i < 5);

        /** BEISPIEL 2: Benutzer-Eingabe mit Abbruchbedingung **/
        Scanner scan = new Scanner(System.in);
        String input;
        do {
            System.out.print("Gib etwas ein (oder 'exit' zum Beenden): ");
            input = scan.nextLine();
            System.out.println("Du hast eingegeben: " + input);
        } while(!input.equals("exit"));

        /** BEISPIEL 3: Bedingung ist von Anfang an false – Schleife wird trotzdem 1x ausgeführt **/
        int zahl = 9;
        do {
            zahl++;    // erhöht die zahl um genau 1.
            System.out.println("Dieser Code läuft mindestens einmal – auch wenn x >= 10 ist.");
        } while(zahl < 10);

    }
}

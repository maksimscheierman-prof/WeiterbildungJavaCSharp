package T02_Basics;

import java.util.Scanner;

public class d_Konsolenbefehle {
    public static void main(String[] args) {
        /**********************************************************************************************************************************
         ██╗  ██╗ ██████╗ ███╗   ██╗███████╗ ██████╗ ██╗     ███████╗███╗   ██╗    ██████╗ ███████╗███████╗███████╗██╗  ██╗██╗     ███████╗
         ██║ ██╔╝██╔═══██╗████╗  ██║██╔════╝██╔═══██╗██║     ██╔════╝████╗  ██║    ██╔══██╗██╔════╝██╔════╝██╔════╝██║  ██║██║     ██╔════╝
         █████╔╝ ██║   ██║██╔██╗ ██║███████╗██║   ██║██║     █████╗  ██╔██╗ ██║    ██████╔╝█████╗  █████╗  █████╗  ███████║██║     █████╗
         ██╔═██╗ ██║   ██║██║╚██╗██║╚════██║██║   ██║██║     ██╔══╝  ██║╚██╗██║    ██╔══██╗██╔══╝  ██╔══╝  ██╔══╝  ██╔══██║██║     ██╔══╝
         ██║  ██╗╚██████╔╝██║ ╚████║███████║╚██████╔╝███████╗███████╗██║ ╚████║    ██████╔╝███████╗██║     ███████╗██║  ██║███████╗███████╗
         ╚═╝  ╚═╝ ╚═════╝ ╚═╝  ╚═══╝╚══════╝ ╚═════╝ ╚══════╝╚══════╝╚═╝  ╚═══╝    ╚═════╝ ╚══════╝╚═╝     ╚══════╝╚═╝  ╚═╝╚══════╝╚══════╝
         **********************************************************************************************************************************/



            /**                                     Ein- und Ausgabe
             * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
             *  Um Text auf der Konsole auszugeben und Texteingaben von der Konsole zu lesen gibt es zwei
             *  einfache Möglichkeiten.
             * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
             */

            // Textausgabe
            System.out.print("Dieser Text wird ohne Zeilenumbruch ausgegeben. ");
            System.out.println("Dieser Text wird auf der Konsole ausgegeben. ");

            // Text von der Konsole lesen
            /*** * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
             *     Um text von der Konsole zu lesen müssen wir in java einen "Scanner" benutzen.
             *     Scanner ist ein Werkzeug, das bereits in der Java-Bibliothek vorhanden ist.
             *     Wir müssen dieses Werkzeug jedoch erstmal in unserem Code anlegen bevor wir es verwenden können.
             *
             *      Unser Scanner Werkzeug bekommt den Datentypen Scanner
             *      jedoch müssen wir in diesem Fall auch "new Scanner(System.in)" schreiben.
             *      Was es damit auf sich hat, werden wir später noch lernen.
             *      Vorerst geben wir uns damit zufrieden, dass Scanner ein Werkzeug ist, das uns hilft Eingaben zu lesen.
             * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */

            Scanner meinScanner = new Scanner(System.in);





    }
}

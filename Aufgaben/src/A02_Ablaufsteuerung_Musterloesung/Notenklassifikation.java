package A02_Ablaufsteuerung_Musterloesung;

import java.util.Scanner;

public class Notenklassifikation {

    public static void main(String[] args) {

        int eingabe = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Willkommen beim Notenrechner 1.0");
        System.out.println("Geben Sie die Puntkzahl ein zur Berechnung der Note und bestätigen Sie mit Enter:");
        eingabe = scan.nextInt();

        if (eingabe < 10) {
            System.out.println("Note 6");
        }
        else if (eingabe < 20) {
            System.out.println("Note 5");
        }
        else if (eingabe < 30) {
            System.out.println("Note 4");
        }
        else if (eingabe < 40) {
            System.out.println("Note 3");
        }
        else if (eingabe < 50) {
            System.out.println("Note 2");
        }
        else {
            System.out.println("Note 1");
        }
    }
}

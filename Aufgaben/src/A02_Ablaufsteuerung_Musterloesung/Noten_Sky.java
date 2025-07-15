package A02_Ablaufsteuerung_Musterloesung;

import java.util.Scanner;

public class Noten_Sky {


    public static void main(String[] args) {

    /** Scanner angelegt*/
        Scanner scanner = new Scanner(System.in);

    /** USER INTERFACE*/
        // startdesign
        System.out.println(" ______________________________________");
        System.out.println("|     Willkommen beim Notenumwandler   |");
        System.out.println("|--------------------------------------|");
        System.out.println("| Bitte gib deine erreichten Punkte an.|");
        System.out.println("|                                      |");
        System.out.println("|______________________________________|");
        System.out.println();

        // nimmt Leerzeichen weg
        String erreichtstring = scanner.nextLine().trim(); // " Hallo "   -> .trim()   -> "Hallo"

        // design bei punktzahl
        System.out.println(" ______________________________________");
        System.out.println("|                                      |");
        System.out.println("|     Bitte geben sie die maximal      |");
        System.out.println("|      erreichbare Punktzahl ein.      |");
        System.out.println("|                                      |");
        System.out.println("|______________________________________|");
        System.out.println();

        String maximumstring = scanner.nextLine().trim();

        float erreicht;
        float maximum;


        // strings zu floats machen und abbrechen wenn nich möglich
        try {
            erreicht = Float.parseFloat(erreichtstring);
            maximum = Float.parseFloat(maximumstring);}
        catch (NumberFormatException e) {
            System.out.println("Bitte nur gültige Zahlen eingeben.");
            return;
        }

        // bricht ab wenn werte nicht möglich
        if (erreicht > maximum || erreicht < 0 || maximum <= 0){
            System.out.println("Ungültige Eingabe!");
            return;
        }

        // prozentumrechnung
        double prozent = erreicht / maximum * 100;
        System.out.println("Du hast " + prozent + "% erreicht");


        //geht auch nur mit if und if else (array nur da zum kürzer fassen)

        // Prozentgrenzen in array
        double[] grenzen = {95, 90, 85, 80, 75, 70, 65, 60, 55, 50, 45, 40, 33, 27, 20, 0};


        // Notenschlüssel als array
        String[] noten = {
                "Note 1+ (15 Pkt)", "Note 1 (14 Pkt)", "Note 1- (13 Pkt)", "Note 2+ (12 Pkt)",
                "Note 2 (11 Pkt)", "Note 2- (10 Pkt)", "Note 3+ (9 Pkt)", "Note 3 (8 Pkt)",
                "Note 3- (7 Pkt)", "Note 4+ (6 Pkt)", "Note 4 (5 Pkt)", "Note 4- (4 Pkt)",
                "Note 5+ (3 Pkt)", "Note 5 (2 Pkt)", "Note 5- (1 Pkt)", "Note 6 (0 Pkt)"};

        // vergleicht prozent mit grenzen im array von links nach rechts (da ++) und gibt so note
        for (int i = 0; i < grenzen.length; i++) {
            if (prozent >= grenzen[i]) {
                System.out.println(noten[i]);
                System.out.println();
                break;
            }
        }
    }
}

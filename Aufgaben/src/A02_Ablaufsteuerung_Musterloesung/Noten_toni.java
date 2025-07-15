package A02_Ablaufsteuerung_Musterloesung;

import java.util.Scanner;

public class Noten_toni {
    public static void main(String[] args) {
    /**VARIABLEN**/
        int punkte = 0; /** int für Ganzzahlen*/
        /** SCANNER **/
        Scanner scan = new Scanner(System.in);      // SCANNER


        /** PUNKTEINGABEN **/
        System.out.println("Hier die Punktzahl eingeben:");
        punkte = scan.nextInt();






        /** NOTENSCHLÜSSEL **/
        if(punkte < 60) {
            System.out.println("Note 6");
        } else if(punkte < 90) {
            System.out.println("Note 5");
        } else if(punkte < 120) {
            System.out.println("Note 4");
        } else if(punkte < 137) {
            System.out.println("Note 3");
        } else if(punkte < 148) {
            System.out.println("Note 2");
        } else if(punkte < 151) {
            System.out.println("Note 1");
        }






    /** Beenden der Anwendung **/
        System.out.println("Ende mit beliebiger Taste!");
        scan.nextLine();


    }
}

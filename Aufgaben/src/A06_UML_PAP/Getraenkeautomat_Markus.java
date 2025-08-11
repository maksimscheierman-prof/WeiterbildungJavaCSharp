package A06_UML_PAP;

import java.util.Scanner;

public class Getraenkeautomat_Markus {
    public static void main(String[] args) {
        // Variablen
        String[] getraenke = {"Cola", "Wasser", "Eistee", "test"};
        double[] kosten = {2, 1, 1.5, 3};

        double eingezahlt;
        double restGeld;

        Scanner scn = new Scanner(System.in);

        // Programmschleife
        while (true) {

            // Variablen zurücksetzen
            eingezahlt = 0;
            restGeld = 0;

            // Ausgabe Getränke
            System.out.println("\n**********************");
            System.out.println("Getränkeliste:");
            for (int i = 0; i < getraenke.length; i++) {
                System.out.println("- " + (i + 1) + " " + getraenke[i] + " " + kosten[i] + " Euro");
            }
            System.out.println("**********************");

            // Eingabe
            System.out.println("Auswahl: (1 - " + getraenke.length + ")");
            int auswahlGetraenk;
            do {
                auswahlGetraenk = scn.nextInt();
            } while ((auswahlGetraenk - 1) < 0 || (auswahlGetraenk - 1) > getraenke.length - 1);

            System.out.println("Getränk " + getraenke[auswahlGetraenk - 1] + " gewählt, Preis: " + kosten[auswahlGetraenk - 1] + " Euro\n");

            // Ausgabe Zahlungsart
            System.out.println("\n**********************");
            System.out.println("Zahlungsart:");
            System.out.println("- 1 Karte");
            System.out.println("- 2 Bar");
            System.out.println("**********************");

            // Eingabe
            System.out.println("Auswahl: (1 - 2)");
            int auswahlZahlungsart = 0;
            do {
                auswahlZahlungsart = scn.nextInt();
            } while (auswahlZahlungsart < 1 || auswahlZahlungsart > 2);

            if (auswahlZahlungsart == 1) {
                // Simulation Prozess Kartenzahlung
                System.out.println("*** Kartenzahlung ***");
                System.out.println("Kartenzahlung wird abgewickelt...");
            } else {
                // Simulation Barzahlung
                System.out.println("*** Barzahlung ***");
                System.out.println("Preis: " + kosten[auswahlGetraenk - 1] + " Euro");
                System.out.println("Bitte Geld einwerfen");

                do {
                    System.out.println("Eingezahlt bisher: " + eingezahlt + " Euro.");
                    double tempEingabe = scn.nextDouble();
                    if (tempEingabe > 0) {
                        eingezahlt += tempEingabe;
                    }
                } while (eingezahlt < kosten[auswahlGetraenk - 1]);

                restGeld = eingezahlt - kosten[auswahlGetraenk - 1];
            }

            // Simulation Getränkeausgabe
            System.out.println("Ausgabe von " + getraenke[auswahlGetraenk - 1] + "\n");

            // Simulation Ausgabe von Rückgeld
            if (restGeld > 0) {
                System.out.println("Rückgabe von " + restGeld + " Euro.");
                restGeld = 0;
            }

            System.out.println("\nProgramm beendet... Neustart\n");
        }
    }
}

package A06_UML_PAP;

import java.util.Scanner;

public class Getraenkeautomat_Marco {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double preis = 0;
        double barzahlbetrag;
        double restbetrag;

        while (true) {
            //Bildschirmausgabe
            System.out.println("Wählen Sie ein Getränk aus. ");
            System.out.println("'1' für Cola ");
            System.out.println("'2' für Fanta ");
            System.out.println("'3' für Wasser ");

            //Eingabe
            int getraenkeWahl = input.nextInt();
            input.nextLine();


            //switch case
            switch (getraenkeWahl) {
                case 1:
                    preis = 2;
                    break;
                case 2:
                    preis = 1.8;
                    break;
                case 3:
                    preis = 1.5;
                    break;
            }

            //Zahlungsweise
            System.out.println("Wie soll gezahlt werden? 'bar' für Barzahlung und 'Karte' für Kartenzahlung. ");
            String zahlungsweise = input.nextLine();

            System.out.println("Bezahlen Sie bitte " + preis);

            if (zahlungsweise.equalsIgnoreCase("karte")) {

                System.out.println("Bitte Karte anlegen.");
                //void kartenzahlprozess();
            } else if (zahlungsweise.equals("bar")) {
                System.out.println("Welchen Geldbetrag möchten Sie einzahlen? ");
                barzahlbetrag = input.nextDouble();

                //Restbetrag bestimmen
                restbetrag = barzahlbetrag - preis;
                System.out.println("Es wird der Restbetrag von " + restbetrag + " ausgezahlt.");
            } else {
                System.out.println("Falsche Nutzereingabe. ");
            }


            System.out.println("Vielen Dank für Ihren Einkauf. Das Getränk wird nun ausgegeben. ");
        }
    }
}
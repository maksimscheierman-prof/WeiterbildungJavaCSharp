package A02_Ablaufsteuerung_Musterloesung;

import java.util.Scanner;

public class Temperaturwandler {

    public static void main(String[] args) {

        Scanner meinScanner = new Scanner(System.in);
        System.out.println("Welche Temperatur-Einheit soll ich umwandeln? 'C' für Celsius oder 'K' für Klevin");
        String input = meinScanner.nextLine();

        if (input.equals("C")) {
            System.out.println("Gib bitte die Temperatur in Celsius an: ");
            double celsius = meinScanner.nextDouble();
            double kelvin = celsius + 273.15;
            System.out.println("Die Temperatur von " + celsius + " entspricht in Kelvin " + kelvin);
        } else if (input.equals("K")) {
            System.out.println("Gib bitte die Temperatur in Kelvin an: ");
            double kelvin = meinScanner.nextDouble();
            double celsius = kelvin - 273.15;
            System.out.println("Die Temperatur von " + kelvin + " entspricht in Celsius " + celsius);
        } else {
            System.out.println("Falsche Eingabe, unzulässiger Wert!");
        }


    }
}

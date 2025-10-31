package ArraysUndTertiary;

import java.util.Random;

public class Aufgabe3 {
    public static void main(String[] args) {
        String[] raeume = {"Wohnzimmer", "Küche", "Schlafzimmer"};
        double[][] temperaturen = new double[raeume.length][24];
        Random rand = new Random();

        // Zufallswerte
        for (int r = 0; r < raeume.length; r++) {
            for (int h = 0; h < 24; h++) {
                temperaturen[r][h] = -10 + rand.nextDouble() * 40;
            }
        }

        double gesamtSumme = 0;
        int gesamtAnzahl = 0;

        for (int r = 0; r < raeume.length; r++) {
            double min = temperaturen[r][0];
            double max = temperaturen[r][0];
            double sum = 0;

            for (int h = 0; h < 24; h++) {
                double t = temperaturen[r][h];
                if (t < min) min = t;
                if (t > max) max = t;
                sum += t;
            }

            double avg = sum / 24;
            gesamtSumme += sum;
            gesamtAnzahl += 24;

            System.out.printf("%s → Min: %.2f°C | Max: %.2f°C | Durchschnitt: %.2f°C%n",
                    raeume[r], min, max, avg);
        }

        System.out.printf("%nGesamtdurchschnitt aller Räume: %.2f°C%n", gesamtSumme / gesamtAnzahl);
    }
}


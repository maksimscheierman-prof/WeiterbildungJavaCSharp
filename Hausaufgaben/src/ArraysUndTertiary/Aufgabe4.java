package ArraysUndTertiary;

import java.util.Random;

public class Aufgabe4 {
    public static void main(String[] args) {
        String[] raeume = {"Wohnzimmer", "Küche", "Schlafzimmer"};
        int wohnungen = 2;
        double[][][] temperaturen = new double[wohnungen][raeume.length][24];
        Random rand = new Random();

        // Zufallswerte
        for (int w = 0; w < wohnungen; w++) {
            for (int r = 0; r < raeume.length; r++) {
                for (int h = 0; h < 24; h++) {
                    temperaturen[w][r][h] = -10 + rand.nextDouble() * 40;
                }
            }
        }

        double gesamtSumme = 0;
        int gesamtAnzahl = 0;

        for (int w = 0; w < wohnungen; w++) {
            System.out.printf("Wohnung %d:%n", w + 1);
            for (int r = 0; r < raeume.length; r++) {
                double min = temperaturen[w][r][0];
                double max = temperaturen[w][r][0];
                double sum = 0;

                for (int h = 0; h < 24; h++) {
                    double t = temperaturen[w][r][h];
                    if (t < min) min = t;
                    if (t > max) max = t;
                    sum += t;
                }

                double avg = sum / 24;
                gesamtSumme += sum;
                gesamtAnzahl += 24;
                System.out.printf("  %s → Min: %.2f°C | Max: %.2f°C | Durchschnitt: %.2f°C%n",
                        raeume[r], min, max, avg);
            }
            System.out.println();
        }

        System.out.printf("Gesamtdurchschnitt über alle Wohnungen: %.2f°C%n",
                gesamtSumme / gesamtAnzahl);
    }
}


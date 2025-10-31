package ArraysUndTertiary;

import java.util.Random;

public class Aufgabe1 {
    public static void main(String[] args) {
        double[] temperaturen = new double[24];
        Random rand = new Random();

        // Zufällige Temperaturen zwischen -10 und +30 Grad
        for (int i = 0; i < temperaturen.length; i++) {
            temperaturen[i] = -10 + rand.nextDouble() * 40;
        }

        double min = temperaturen[0];
        double max = temperaturen[0];
        double summe = 0;

        for (int i = 0; i < temperaturen.length; i++) {
            double t = temperaturen[i];
            String status = t > 25 ? "zu warm" : (t < 5 ? "zu kalt" : (t >= 20 ? "perfekt" : "okay"));
            System.out.printf("Stunde %02d: %.2f°C → %s%n", i, t, status);

            if (t < min) min = t;
            if (t > max) max = t;
            summe += t;
        }

        double durchschnitt = summe / temperaturen.length;
        System.out.printf("%nMin: %.2f°C | Max: %.2f°C | Durchschnitt: %.2f°C%n", min, max, durchschnitt);
    }
}


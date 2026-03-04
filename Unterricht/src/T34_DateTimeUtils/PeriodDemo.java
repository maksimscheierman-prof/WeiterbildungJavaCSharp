package T34_DateTimeUtils;

import java.time.*;

import java.time.LocalDate;
import java.time.Period;

public class PeriodDemo {

    public static void main(String[] args) {

        // -------------------------------------------------------------
        // 1. Grundlagen
        // -------------------------------------------------------------
        LocalDate heute = LocalDate.now();
        LocalDate start = LocalDate.of(2000, 5, 12);

        // Berechnung einer Period
        Period p = Period.between(start, heute);

        // -------------------------------------------------------------
        // 2. Immutability
        // Period-Objekte sind unveränderlich.
        // Jede Veränderungsmethode (plus/minus) erzeugt ein neues Objekt.
        // -------------------------------------------------------------
        Period plusEins = p.plusMonths(1);
        Period minusZwei = p.minusDays(2);

        // -------------------------------------------------------------
        // 3. Hilfsmethode für lesbare Ausgabe
        // -------------------------------------------------------------
        System.out.println("Beispiel Period:");
        System.out.println("Von " + start + " bis " + heute + ": " + formatPeriod(p));
        System.out.println("plus 1 Monat: " + formatPeriod(plusEins));
        System.out.println("minus 2 Tage: " + formatPeriod(minusZwei));

        System.out.println("ist Null? " + p.isZero());
        System.out.println("ist Negativ? " + p.isNegative());

        Period normalisiert = Period.of(1, 14, 0).normalized();
        System.out.println("normalisiert: " + formatPeriod(normalisiert));

        // -------------------------------------------------------------
        // 4. Beispiel: Alter berechnen
        // -------------------------------------------------------------
        LocalDate geburtstag = LocalDate.of(1990, 3, 25);
        Period alter = Period.between(geburtstag, heute);

        System.out.println();
        System.out.println("Alter:");
        System.out.println(formatPeriod(alter));


        // Immutability
        Period original = Period.of(1, 2, 10);
        // 1 Jahr, 2 Monate, 10 Tage

        // plus() erzeugt ein komplett neues Objekt
        Period plus = original.plusMonths(3);

        // minus() erzeugt ebenfalls ein neues Objekt
        Period minus = original.minusDays(5);

        //konkretes Beisipel
        Period vertragsLaufzeit = Period.ofYears(2).plusMonths(3);

        Period checkpoint = vertragsLaufzeit.minusMonths(6);

        /*
        Durch Immutability gilt:

        • Die ursprüngliche Vertragslaufzeit bleibt unverändert
        • Keine Berechnung kann aus Versehen die Vertragsdauer beschädigen
        • Besonders wichtig bei großen Projekten und mehreren Entwicklerinnen und Entwicklern
        */

        System.out.println("Original Period:   " + formatPeriod(original));
        System.out.println("plus 3 Monate:     " + formatPeriod(plus));
        System.out.println("minus 5 Tage:      " + formatPeriod(minus));
    }

    // -------------------------------------------------------------
    // Hilfsmethode für schöne Ausgabe einer Period
    // -------------------------------------------------------------
    public static String formatPeriod(Period p) {
        return p.getYears() + " Jahre, "
                + p.getMonths() + " Monate, "
                + p.getDays() + " Tage";
    }



}



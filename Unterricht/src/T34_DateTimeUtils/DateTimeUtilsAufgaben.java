package T34_DateTimeUtils;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTimeUtilsAufgaben {

    // 1. Aktuelles Datum und Uhrzeit als LocalDateTime ausgeben
    public static void aktuelleDatumUhrzeit() {
        LocalDateTime jetzt = LocalDateTime.now();
        System.out.println("1. Aktuelles Datum und Uhrzeit: " + jetzt);
    }

    // 2. Unterschied in Stunden und Minuten zwischen zwei LocalDateTime-Objekten
    public static void unterschiedInStundenUndMinuten(LocalDateTime start, LocalDateTime ende) {
        long stunden = ChronoUnit.HOURS.between(start, ende);
        long minuten = ChronoUnit.MINUTES.between(start, ende) % 60;
        System.out.println("2. Unterschied: " + stunden + " Stunden und " + minuten + " Minuten");
    }

    // 3. Datum und Uhrzeit 3 Monate und 10 Tage in der Vergangenheit
    public static void datumVergangenheit() {
        LocalDateTime vergangen = LocalDateTime.now().minusMonths(3).minusDays(10);
        System.out.println("3. Vor 3 Monaten und 10 Tagen: " + vergangen);
    }

    // 4. Aktuelles Datum als LocalDate ausgeben
    public static void aktuellesDatum() {
        LocalDate heute = LocalDate.now();
        System.out.println("4. Aktuelles Datum: " + heute);
    }

    // 5. Zum aktuellen Datum 5 Tage hinzufügen
    public static void datumPlusFuenfTage() {
        LocalDate plus5 = LocalDate.now().plusDays(5);
        System.out.println("5. In 5 Tagen: " + plus5);
    }

    // 6. Anzahl der Tage zwischen zwei LocalDate-Instanzen
    public static void tageZwischen(LocalDate start, LocalDate ende) {
        long tage = ChronoUnit.DAYS.between(start, ende);
        System.out.println("6. Tage zwischen " + start + " und " + ende + ": " + tage + " Tage");
    }

    // 7. Aktuelle Uhrzeit als LocalTime ausgeben
    public static void aktuelleUhrzeit() {
        LocalTime jetzt = LocalTime.now();
        System.out.println("7. Aktuelle Uhrzeit: " + jetzt);
    }

    // 8. Drei Stunden zur aktuellen Uhrzeit hinzufügen
    public static void uhrzeitPlusDreiStunden() {
        LocalTime plus3 = LocalTime.now().plusHours(3);
        System.out.println("8. In 3 Stunden: " + plus3);
    }

    // 9. Dauer zwischen zwei LocalTime-Instanzen in Minuten
    public static void dauerInMinuten(LocalTime start, LocalTime ende) {
        long minuten = ChronoUnit.MINUTES.between(start, ende);
        System.out.println("9. Minuten zwischen " + start + " und " + ende + ": " + minuten + " Minuten");
    }

    // 10. Aktuelles Datum im Format „dd.MM.yyyy“
    public static void datumFormatiert() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String formatiert = LocalDate.now().format(formatter);
        System.out.println("10. Formatiertes Datum: " + formatiert);
    }

    // 11. Aktuelles Datum und Uhrzeit im Format „yyyy-MM-dd HH:mm:ss“
    public static void datumUhrzeitFormatiert() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formatiert = LocalDateTime.now().format(formatter);
        System.out.println("11. Formatiertes Datum & Uhrzeit: " + formatiert);
    }

    // 12. String im Format „yyyy/MM/dd“ in LocalDate umwandeln
    public static void stringZuDatum(String datumString) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate datum = LocalDate.parse(datumString, formatter);
        System.out.println("12. String \"" + datumString + "\" als LocalDate: " + datum);
    }

    // 13. Anzahl der Jahre zwischen zwei LocalDate-Instanzen
    public static void jahreZwischen(LocalDate start, LocalDate ende) {
        int jahre = Period.between(start, ende).getYears();
        System.out.println("13. Jahre zwischen " + start + " und " + ende + ": " + jahre + " Jahre");
    }

    // 14. Zeitraum zwischen zwei LocalDate-Instanzen in Monaten und Tagen
    public static void zeitraumInMonatenUndTagen(LocalDate start, LocalDate ende) {
        Period p = Period.between(start, ende);
        System.out.println("14. Zeitraum: " + p.getMonths() + " Monate und " + p.getDays() + " Tage");
    }

    // 15. Zeitraum zwischen zwei LocalDate-Instanzen in Jahren, Monaten und Tagen
    public static void zeitraumInJahrenMonatenTagen(LocalDate start, LocalDate ende) {
        Period p = Period.between(start, ende);
        System.out.println("15. Zeitraum: " + p.getYears() + " Jahre, " + p.getMonths() + " Monate, " + p.getDays() + " Tage");
    }

    // --- Test im main() ---
    public static void main(String[] args) {

        aktuelleDatumUhrzeit();

        LocalDateTime startDT = LocalDateTime.of(2025, 1, 1, 10, 0);
        LocalDateTime endeDT = LocalDateTime.of(2025, 1, 1, 15, 30);
        unterschiedInStundenUndMinuten(startDT, endeDT);

        datumVergangenheit();
        aktuellesDatum();
        datumPlusFuenfTage();

        LocalDate startD = LocalDate.of(2024, 12, 25);
        LocalDate endeD = LocalDate.of(2025, 1, 10);
        tageZwischen(startD, endeD);

        aktuelleUhrzeit();
        uhrzeitPlusDreiStunden();

        LocalTime startT = LocalTime.of(8, 0);
        LocalTime endeT = LocalTime.of(10, 45);
        dauerInMinuten(startT, endeT);

        datumFormatiert();
        datumUhrzeitFormatiert();
        stringZuDatum("2025/11/12");

        jahreZwischen(LocalDate.of(2000, 1, 1), LocalDate.now());
        zeitraumInMonatenUndTagen(LocalDate.of(2025, 1, 1), LocalDate.of(2025, 11, 12));
        zeitraumInJahrenMonatenTagen(LocalDate.of(2000, 1, 1), LocalDate.now());
    }
}


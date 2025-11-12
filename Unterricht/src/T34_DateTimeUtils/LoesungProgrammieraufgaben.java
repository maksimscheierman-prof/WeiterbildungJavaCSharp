package T34_DateTimeUtils;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LoesungProgrammieraufgaben {

    // 1. Aktuelles Datum und Uhrzeit als LocalDateTime ausgeben
    public static void printCurrentDateTime() {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Aktuelles Datum und Uhrzeit: " + now);
    }

    // 2. Unterschied in Stunden und Minuten zwischen zwei LocalDateTime-Objekten berechnen
    public static void printDifferenceInHoursAndMinutes(LocalDateTime start, LocalDateTime end) {
        long hours = ChronoUnit.HOURS.between(start, end);
        long minutes = ChronoUnit.MINUTES.between(start, end);
        System.out.println("Unterschied: " + hours + " Stunden und " + minutes + " Minuten");
    }

    // 3. Datum und Uhrzeit 3 Monate und 10 Tage in der Vergangenheit berechnen
    public static void printPastDateTime() {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime past = now.minusMonths(3).minusDays(10);
        System.out.println("Vor 3 Monaten und 10 Tagen: " + past);
    }

    // 4. Aktuelles Datum als LocalDate ausgeben
    public static void printCurrentDate() {
        LocalDate today = LocalDate.now();
        System.out.println("Heutiges Datum: " + today);
    }

    // 5. Zum aktuellen Datum 5 Tage hinzufügen
    public static void printDatePlusFiveDays() {
        LocalDate futureDate = LocalDate.now().plusDays(5);
        System.out.println("Datum in 5 Tagen: " + futureDate);
    }

    // 6. Anzahl der Tage zwischen zwei LocalDate-Instanzen berechnen
    public static void printDaysBetween(LocalDate start, LocalDate end) {
        long days = ChronoUnit.DAYS.between(start, end);
        System.out.println("Tage zwischen den Daten: " + days);
    }

    // 7. Aktuelle Uhrzeit als LocalTime ausgeben
    public static void printCurrentTime() {
        LocalTime now = LocalTime.now();
        System.out.println("Aktuelle Uhrzeit: " + now);
    }

    // 8. Drei Stunden zur aktuellen Uhrzeit hinzufügen
    public static void printTimePlusThreeHours() {
        LocalTime newTime = LocalTime.now().plusHours(3);
        System.out.println("In 3 Stunden ist es: " + newTime);
    }

    // 9. Dauer zwischen zwei LocalTime-Instanzen in Minuten berechnen
    public static void printMinutesBetween(LocalTime start, LocalTime end) {
        long minutes = Duration.between(start, end).toMinutes();
        System.out.println("Dauer in Minuten: " + minutes);
    }

    // 10. Aktuelles Datum im Format „dd.MM.yyyy“ ausgeben
    public static void printFormattedCurrentDate() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String formattedDate = LocalDate.now().format(fmt);
        System.out.println("Formatiertes Datum: " + formattedDate);
    }

    // 11. Aktuelles Datum und Uhrzeit im Format „yyyy-MM-dd HH:mm:ss“ ausgeben
    public static void printFormattedCurrentDateTime() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = LocalDateTime.now().format(fmt);
        System.out.println("Formatiertes Datum und Uhrzeit: " + formattedDateTime);
    }

    // 12. String im Format „yyyy/MM/dd“ in ein LocalDate umwandeln
    public static void parseDateFromString(String dateStr) {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate date = LocalDate.parse(dateStr, fmt);
        System.out.println("Eingelesenes Datum: " + date);
    }

    // 13. Anzahl der Jahre zwischen zwei LocalDate-Instanzen berechnen
    public static void printYearsBetween(LocalDate start, LocalDate end) {
        int years = Period.between(start, end).getYears();
        System.out.println("Jahre zwischen den Daten: " + years);
    }

    // 14. Zeitraum zwischen zwei LocalDate-Instanzen in Monaten und Tagen berechnen
    public static void printMonthsAndDaysBetween(LocalDate start, LocalDate end) {
        Period p = Period.between(start, end);
        System.out.println("Zeitraum: " + p.getMonths() + " Monate und " + p.getDays() + " Tage");
    }

    // 15. Zeitraum zwischen zwei LocalDate-Instanzen in Jahren, Monaten und Tagen ausgeben
    public static void printFullPeriod(LocalDate start, LocalDate end) {
        Period p = Period.between(start, end);
        System.out.println("Zeitraum: " + p.getYears() + " Jahre, " +
                p.getMonths() + " Monate und " + p.getDays() + " Tage");
    }

    public static void main(String[] args) {
        System.out.println("===== LocalDateTime =====");
        printCurrentDateTime();
        printDifferenceInHoursAndMinutes(LocalDateTime.now().minusHours(5).minusMinutes(30), LocalDateTime.now());
        printPastDateTime();

        System.out.println("\n===== LocalDate =====");
        printCurrentDate();
        printDatePlusFiveDays();
        printDaysBetween(LocalDate.of(2023, 5, 1), LocalDate.now());

        System.out.println("\n===== LocalTime =====");
        printCurrentTime();
        printTimePlusThreeHours();
        printMinutesBetween(LocalTime.of(9, 0), LocalTime.now());

        System.out.println("\n===== DateTimeFormatter =====");
        printFormattedCurrentDate();
        printFormattedCurrentDateTime();
        parseDateFromString("2024/07/20");

        System.out.println("\n===== Period =====");
        printYearsBetween(LocalDate.of(2020, 3, 12), LocalDate.now());
        printMonthsAndDaysBetween(LocalDate.of(2025, 1, 1), LocalDate.now());
        printFullPeriod(LocalDate.of(2020, 1, 1), LocalDate.now());
    }

}

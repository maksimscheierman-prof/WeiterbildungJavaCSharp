package A009_20251105_Commanline_Textanalyzer.textanalyzer;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class TextAnalyzerApp {

    private static final Scanner SC = new Scanner(System.in);
    private static String currentText = "";

    public static void main(String[] args) {
        TextAnalyzer analyzer = new TextAnalyzer();

        while (true) {
            printMenu();
            String choice = SC.nextLine().trim();

            try {
                switch (choice) {
                    case "1" -> { // Text von Konsole
                        Handler h = new ConsoleHandler(SC);
                        currentText = h.getText();
                        analyzer.setText(currentText);
                        System.out.println("\n✅ Text übernommen.\n");
                    }
                    case "2" -> { // Datei einlesen
                        System.out.print("Pfad zur .txt-Datei: ");
                        String path = SC.nextLine().trim();
                        Handler h = new FileHandler(Path.of(path));
                        currentText = h.getText();
                        analyzer.setText(currentText);
                        System.out.println("\n✅ Datei gelesen.\n");
                    }
                    case "3" -> { // Beispieltext laden
                        Handler h = new FileHandler(Path.of("beispiel.txt"));
                        currentText = h.getText();
                        analyzer.setText(currentText);
                        System.out.println("\n✅ Beispieltext aus 'beispiel.txt' geladen.\n");
                    }
                    case "4" -> { // Aktuellen Text anzeigen
                        ensureTextPresent();
                        System.out.println("\n--- Aktueller Text ---\n" + currentText + "\n");
                    }
                    case "5" -> { // Grundstatistik
                        ensureTextPresent();
                        System.out.println(analyzer.prettyStats());
                    }
                    case "6" -> { // Längstes, kürzestes, häufigstes Wort
                        ensureTextPresent();
                        System.out.println("Längstes Wort:   " + analyzer.longestWord().orElse("-"));
                        System.out.println("Kürzestes Wort:  " + analyzer.shortestWord().orElse("-"));
                        System.out.println("Häufigstes Wort: " + analyzer.mostFrequentWord().orElse("-"));
                        System.out.println();
                    }
                    case "7" -> { // Palindrome
                        ensureTextPresent();
                        var pals = analyzer.palindromes();
                        System.out.println("Gefundene Palindrome (" + pals.size() + "): " + pals + "\n");
                    }
                    case "8" -> { // String-Pool-Demo
                        StringPoolDemo.demonstrate();
                        System.out.println();
                    }
                    case "9" -> { // Beenden
                        System.out.println("👋 Auf Wiedersehen!");
                        return;
                    }
                    default -> System.out.println("Bitte eine gültige Option wählen (1–9).\n");
                }
            } catch (NoTextProvidedException e) {
                System.out.println("⚠️ Fehler: " + e.getMessage() + "\n");
            } catch (IOException e) {
                System.out.println("⚠️ Datei/IO-Fehler: " + e.getMessage() + "\n");
            } catch (Exception e) {
                System.out.println("⚠️ Unerwarteter Fehler: " + e.getMessage() + "\n");
            }
        }
    }

    private static void ensureTextPresent() throws NoTextProvidedException {
        if (currentText == null || currentText.isBlank()) {
            throw new NoTextProvidedException("Es wurde noch kein Text eingegeben oder geladen.");
        }
    }

    private static void printMenu() {
        System.out.println("""
                ==============================
                TEXT-ANALYZER – Pflichtaufgabe
                ==============================
                1) Text in die Konsole eingeben
                2) .txt-Datei einlesen
                3) Beispieltext aus beispiel.txt laden
                4) Aktuellen Text anzeigen
                5) Statistik anzeigen (Wörter/Zeichen)
                6) Längstes/Kürzestes/Häufigstes Wort
                7) Palindrome anzeigen
                8) Stringpool-Unterschied demonstrieren
                9) Beenden
                ------------------------------
                Auswahl: """);
    }
}

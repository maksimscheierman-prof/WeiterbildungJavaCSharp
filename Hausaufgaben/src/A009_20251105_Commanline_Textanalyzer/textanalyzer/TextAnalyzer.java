package A009_20251105_Commanline_Textanalyzer.textanalyzer;

import java.text.BreakIterator;
import java.util.*;
import java.util.stream.Collectors;

public class TextAnalyzer {

    private String text = "";
    private List<String> words = List.of();

    public void setText(String text) {
        this.text = (text == null) ? "" : normalize(text);
        this.words = extractWords(this.text);
    }

    // --- Grundstatistik ---
    public int wordCount() { return words.size(); }
    public int charCountWithSpaces() { return text.length(); }
    public int charCountWithoutSpaces() { return text.replaceAll("\\s+", "").length(); }

    // --- Wörter ---
    public Optional<String> longestWord() {
        return words.stream().max(Comparator.comparingInt(String::length));
    }
    public Optional<String> shortestWord() {
        return words.stream().min(Comparator.comparingInt(String::length));
    }
    public Optional<String> mostFrequentWord() {
        if (words.isEmpty()) return Optional.empty();
        Map<String, Long> freq = words.stream()
                .collect(Collectors.groupingBy(w -> w, Collectors.counting()));
        return freq.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey);
    }

    // --- Palindrome ---
    public static boolean isPalindrome(String s) {
        if (s == null) return false;
        String clean = s.toLowerCase(Locale.ROOT)
                .replaceAll("[^\\p{L}\\p{Nd}]", "");
        int i = 0, j = clean.length() - 1;
        while (i < j) {
            if (clean.charAt(i++) != clean.charAt(j--)) return false;
        }
        return clean.length() >= 2;
    }

    public List<String> palindromes() {
        return words.stream()
                .filter(TextAnalyzer::isPalindrome)
                .distinct()
                .sorted()
                .toList();
    }

    // --- Statistik-Ausgabe ---
    public String prettyStats() {
        return """
               ----------------- STATISTIK -----------------
               Wörter gesamt:               %d
               Zeichen (mit Leerzeichen):   %d
               Zeichen (ohne Leerzeichen):  %d
               Längstes Wort:               %s
               Kürzestes Wort:              %s
               Häufigstes Wort:             %s
               Palindrome:                  %s
               ------------------------------------------------
               """.formatted(
                wordCount(),
                charCountWithSpaces(),
                charCountWithoutSpaces(),
                longestWord().orElse("-"),
                shortestWord().orElse("-"),
                mostFrequentWord().orElse("-"),
                palindromes()
        );
    }

    // --- Hilfsmethoden ---
    private static String normalize(String s) {
        return s.replace('„','"')
                .replace('“','"')
                .replace('–','-')
                .replace('—','-');
    }

    private static List<String> extractWords(String s) {
        if (s == null || s.isBlank()) return List.of();
        List<String> result = new ArrayList<>();
        BreakIterator it = BreakIterator.getWordInstance(Locale.GERMAN);
        it.setText(s);
        int start = it.first();
        for (int end = it.next(); end != BreakIterator.DONE; start = end, end = it.next()) {
            String tok = s.substring(start, end).trim();
            if (tok.matches("[\\p{L}\\p{Nd}]+")) {
                result.add(tok.toLowerCase(Locale.ROOT));
            }
        }
        return result;
    }
}


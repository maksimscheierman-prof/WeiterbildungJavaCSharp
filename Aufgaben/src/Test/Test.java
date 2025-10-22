package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

class Test {
    public static void main(String[] args) {
        // Beispiel 1: Liste von Strings
        List<String> words = new ArrayList<>(Arrays.asList("Apfel", "Banane", "Kiwi", "", "Birne", "Orange", ""));
        System.out.println("Vor removeIf: " + words);

        // Entfernt alle leeren Strings
        words.removeIf(x -> x.isEmpty());
        System.out.println("Nach removeIf(x -> x.isEmpty()): " + words);

        // Entfernt alle Strings, deren Länge > 5 ist
        words.removeIf(x -> x.length() > 5);
        System.out.println("Nach removeIf(x -> x.length() > 5): " + words);
    }
}

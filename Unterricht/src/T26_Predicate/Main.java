package T26_Predicate;

import java.util.List;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        List<String> words = List.of("Hallo", "Apfel", "Elefant", "Java");

        // 1. Originalstrings
        System.out.println("Original:");
        transformStrings(words, s -> s)
                .forEach(System.out::println);

        // 2. Großbuchstaben
        System.out.println("\nGroßbuchstaben:");
        transformStrings(words, String::toUpperCase)
                .forEach(System.out::println);

        // 3. Vokale ersetzen
        System.out.println("\nVokale ersetzt:");
        transformStrings(words, s -> s.replaceAll("[AEIOUaeiou]", "Y"))
                .forEach(System.out::println);
    }

    public static List<String> transformStrings(List<String> list, StringTransformer transformer) {
        return list.stream()
                .map(transformer::transform)
                .collect(Collectors.toList());
    }
}

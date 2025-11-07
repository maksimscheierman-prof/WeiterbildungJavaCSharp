package T32_WdhCollections;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        // HashMap erstellen
        Map<String, Integer> stadtEinwohner = new HashMap<>();

        // Einträge hinzufügen
        stadtEinwohner.put("Berlin", 3769000);
        stadtEinwohner.put("Hamburg", 1841000);
        stadtEinwohner.put("München", 1472000);
        stadtEinwohner.put("Köln", 1086000);

        // Einwohnerzahl einer bestimmten Stadt ausgeben
        String stadt = "München";
        System.out.println("Einwohnerzahl von " + stadt + ": " + stadtEinwohner.get(stadt));

        // Alle Elemente der Map ausgeben
        System.out.println("\nAlle Städte in der Map:");
        for (Map.Entry<String, Integer> eintrag : stadtEinwohner.entrySet()) {
            System.out.println(eintrag.getKey() + " -> " + eintrag.getValue());
        }
    }
}

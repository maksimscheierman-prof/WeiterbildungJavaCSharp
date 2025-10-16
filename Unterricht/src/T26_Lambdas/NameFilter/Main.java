package T26_Lambdas.NameFilter;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Anna", "Ben", "Anja", "Chris", "Alex", "Tom");

        // 🔹 Lambda für Namen, die mit A beginnen
        NameFilter startsWithA = name -> name.startsWith("A");

        // 🔹 Lambda für Namen, die länger als 4 Buchstaben sind
        NameFilter longerThan4 = name -> name.length() > 4;

        System.out.println("Namen, die mit A beginnen:");
        printFiltered(names, startsWithA);

        System.out.println("\nNamen, die länger als 4 Buchstaben sind:");
        printFiltered(names, longerThan4);
    }

    // Hilfsmethode, die das Filter-Interface verwendet
    static void printFiltered(List<String> list, NameFilter filter) {
        for (String name : list) {
            if (filter.test(name)) {
                System.out.println(name);
            }
        }
    }
}


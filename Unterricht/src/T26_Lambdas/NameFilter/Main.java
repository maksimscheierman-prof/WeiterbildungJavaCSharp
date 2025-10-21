package T26_Lambdas.NameFilter;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        /*
        List<String> names = Arrays.asList("Anna", "Ben", "Anja", "Christoph", "Alex", "Tom", "Inna" ,"Hubertus", "Jens", "Antonio");

        // 🔹 Lambda für Namen, die mit einem Vokal beginnen
        NameFilter startsWithVocal = name -> name.matches("(?i)^[aeiou].*");

        // Wörter beginnen mit dem Buchstaben J?
        NameFilter startsWithJ = name -> name.toLowerCase().startsWith("j");

        // Wörter sind mindestens 6 Zeichen lang und beginnen mit einem Vokal?
        NameFilter startsWithVocalAndLongerThan6 = name -> name.matches("(?i)^[aeiou].*") && name.length() > 6;

        // 🔹 Lambda für Namen, die länger als 4 Buchstaben sind
        NameFilter longerThan5 = name -> name.length() > 5;

        System.out.println("Namen, die mit einem Vokal beginnen:");
        printFiltered(names, startsWithVocal);

        System.out.println("\nNamen, die mit J beginnen:");
        printFiltered(names, startsWithJ);

        System.out.println("\nNamen, die 6 Zeichen lang und  mit einem Vokal beginnen:");
        printFiltered(names, startsWithVocalAndLongerThan6);

        System.out.println("\nNamen, die länger als 5 Buchstaben sind:");
        printFiltered(names, longerThan5);
        */


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


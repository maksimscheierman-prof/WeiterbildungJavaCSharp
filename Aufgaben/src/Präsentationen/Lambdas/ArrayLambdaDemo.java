package Präsentationen.Lambdas;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Predicate;

public class ArrayLambdaDemo {

    public static void main(String[] args) {

        /*
        // Anonyme Klasse (vor Java 8)
        Comparator<Integer> alt = new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return a - b; // positive Zahl bedeutet: a > b
            }
        };

        boolean istGroesser = alt.compare(20, 10) > 0;
        System.out.println("20 > 10 (alt): " + istGroesser);

        // Lambda-Version
        Predicate<Integer> neu = x -> x > 10;

        System.out.println("20 > 10 (neu): " + neu.test(20));
*/

        // Array- / Stream-Beispiel
        int[] arr = {1, 20, 5, 30, 4};

        int summe = Arrays.stream(arr)
                .filter(x -> x > 10)
                .sum();

        System.out.println("Summe aller Zahlen > 10: " + summe);



        // Aufgabe: Summe aller geraden Zahlen
        int sumGera = Arrays.stream(arr)
                .filter(x -> x % 2 == 0)
                .sum();

        System.out.println("Summe aller geraden Zahlen: " + sumGera);
    }
}


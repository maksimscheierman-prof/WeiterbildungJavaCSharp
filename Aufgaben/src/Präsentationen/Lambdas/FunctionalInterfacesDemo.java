package Präsentationen.Lambdas;

import java.time.LocalDate;
import java.util.function.*;

public class FunctionalInterfacesDemo {

    public static void main(String[] args) {

        /*
        // Predicate: prüft eine Bedingung
        Predicate<Integer> istGerade = x -> x % 2 == 0;
        System.out.println("4 ist gerade: " + istGerade.test(4));

        // Function: wandelt einen Wert um
        Function<String, Integer> laenge = s -> s.length();
        System.out.println("Länge von 'Hallo': " + laenge.apply("Hallo"));

        // Consumer: nutzt einen Wert, gibt aber nichts zurück
        Consumer<String> ausgabe = s -> System.out.println("Ausgabe: " + s);
        ausgabe.accept("Test");

        // Supplier: liefert einen Wert ohne Eingabe
        Supplier<Double> zufallswert = () -> Math.random();
        System.out.println("Zufallswert: " + zufallswert.get());
}}
        */

        Predicate<String> istLaenger5 = s -> s.length() > 5;
        System.out.println("Das Wort 'General' ist länger als 5 Buchstaben:\nso "
                + istLaenger5.test("General"));

        Function<String, String> zuGross = s -> s.toUpperCase();
        System.out.println(zuGross.apply("java ist cool"));
        // Ausgabe: JAVA IST COOL

        Consumer<Integer> quadratAusgabe = x -> System.out.println("Ergebnis: " + (x * x));
        quadratAusgabe.accept(7);
        // Ausgabe: Ergebnis: 49

        Supplier<LocalDate> aktuellesDatum = () -> LocalDate.now();
        System.out.println("Heute ist: " + aktuellesDatum.get());

    }
}
package T26_Lambdas.AufgabeCalculator;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 📘 Schritt 1: Lambdas für die vier Grundrechenarten
        Calculator add = (a, b) -> a + b;
        Calculator subtract = (a, b) -> a - b;
        Calculator multiply = (a, b) -> a * b;
        Calculator divide = (a, b) -> b != 0 ? a / b : 0;

        // 📗 Schritt 2: Map zur Verknüpfung von Symbolen mit Operationen
        Map<String, Calculator> operations = new HashMap<>();
        operations.put("+", add);
        operations.put("-", subtract);
        operations.put("*", multiply);
        operations.put("/", divide);

        // 📙 Schritt 3: Benutzer-Eingabe
        Scanner sc = new Scanner(System.in);

        System.out.print("Erste Zahl: ");
        int a = sc.nextInt();

        System.out.print("Zweite Zahl: ");
        int b = sc.nextInt();

        System.out.print("Operation (+, -, *, /): ");
        String op = sc.next();

        // 📒 Schritt 4: Operation ausführen
        Calculator calc = operations.get(op);

        if (calc != null) {
            int result = calc.calculate(a, b);
            System.out.println("Ergebnis: " + result);
        } else {
            System.out.println("Ungültige Operation!");
        }

        sc.close();
    }
}


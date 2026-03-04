package Präsentationen.Lambdas;

public class LambdaCalculator {

    // Functional Interface für Operationen
    interface Operation {
        int calc(int a, int b);
    }

    public static void main(String[] args) {

        Operation add = (a, b) -> a + b;
        Operation mul = (a, b) -> a * b;

        System.out.println("3 + 4 = " + add.calc(3, 4));
        System.out.println("3 * 4 = " + mul.calc(3, 4));

        // Aufgabe: weitere Operation hinzufügen
        Operation sub = (a, b) -> a - b;
        System.out.println("10 - 3 = " + sub.calc(10, 3));


    }
}



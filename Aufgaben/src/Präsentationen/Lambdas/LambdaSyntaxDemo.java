package Präsentationen.Lambdas;

public class LambdaSyntaxDemo {

    interface Aktion {
        void run();
    }

    interface Berechner {
        int calc(int x);
    }

    interface Rechner2 {
        int calc(int a, int b);
    }

    interface AktionMitParam {
        void run(String name);
    }

    public static void main(String[] args) {


        // Ohne Parameter
        Aktion test = () -> System.out.println("Test!");
        test.run();

        // Ein Parameter
        Berechner verdoppeln = x -> x * 2;
        System.out.println("2 * 2 = " + verdoppeln.calc(2));

        // Zwei Parameter
        Rechner2 add = (a, b) -> a + b;
        System.out.println("3 + 4 = " + add.calc(3, 4));

        // Mit Block
        Berechner kompliziert = (x) -> {
            int y = x + 1;
            return y * 2;
        };
        System.out.println("Komplexe Berechnung (3): " + kompliziert.calc(3));


        //Aufgabe
        // 1. Ohne Parameter
        Aktion halloOhneParam = () -> System.out.println("Hallo!");
        halloOhneParam.run();

        // 2. Mit einem Parameter
        AktionMitParam halloMitParam = name -> System.out.println("Hallo, " + name + "!");
        halloMitParam.run("Anna");

        // 3. Mit Block (mehrere Zeilen)
        AktionMitParam halloMitBlock = (name) -> {
            String message = "Willkommen, " + name + "!";
            System.out.println(message);
        };
        halloMitBlock.run("Felix");
    }
}


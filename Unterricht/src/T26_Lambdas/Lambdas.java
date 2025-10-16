package T26_Lambdas;

/**
 * ================================================
 * 1. Funktionale Interfaces in Java
 * ================================================
 *
 * Ein funktionales Interface ist ein Interface mit genau einer abstrakten Methode.
 * Beispiele aus der Java-API: Runnable, Callable, Comparator, Predicate.
 *
 * Typische Eigenschaften:
 *  - Nur eine abstrakte Methode (z. B. test(...) bei Predicate)
 *  - Können mit Lambda-Ausdrücken oder anonymen Klassen verwendet werden
 *  - Oft mit der Annotation @FunctionalInterface versehen
 *
 * Beispiel:
 *      Runnable r = () -> System.out.println("Läuft!");
 *      Predicate<Integer> p = n -> n > 0;
 *
 */

interface Calculator {
    int calculate(int a, int b);
}

/**
 * ================================================
 * 2. Eigenes Interface Calculator
 * ================================================
 *
 * Schritt 1: Definiere ein Interface mit einer Methode:
 *
 *      interface Calculator {
 *          int calculate(int a, int b);
 *      }
 *
 * Schritt 2: Schreibe mehrere Implementierungen:
 *
 *      class PlusCalculator implements Calculator {
 *          public int calculate(int a, int b) { return a + b; }
 *      }
 *
 *      class MinusCalculator implements Calculator {
 *          public int calculate(int a, int b) { return a - b; }
 *      }
 *
 * Nachteil:
 *  - Wenn du 10 verschiedene Rechenarten brauchst, musst du 10 Klassen anlegen
 *  - Das ist umständlich und unübersichtlich
 */

class PlusCalculator implements Calculator {
    public int calculate(int a, int b) { return a + b; }
}

class MinusCalculator implements Calculator {
    public int calculate(int a, int b) { return a - b; }
}

/**
 * ================================================
 * 3. Anonyme Klassen
 * ================================================
 *
 * Eine anonyme Klasse erlaubt dir, eine einmalige Implementierung zu schreiben,
 * ohne eine eigene Klasse zu erstellen.
 *
 * Beispiel:
 *
 *      Calculator adder = new Calculator() {
 *          @Override
 *          public int calculate(int a, int b) {
 *              return a + b;
 *          }
 *      };
 *
 * Vorteil:
 *  - Keine separaten Klassen nötig
 *  - Nur dort implementiert, wo gebraucht
 */

class CalculatorDemo {
    public static void main(String[] args) {

        // ===== Anonyme Klassen =====
        Calculator adder = new Calculator() {
            @Override
            public int calculate(int a, int b) {
                return a + b;
            }
        };
        System.out.println("Addition (anonyme Klasse): " + adder.calculate(3, 4));

        Calculator subtractor = new Calculator() {
            @Override
            public int calculate(int a, int b) {
                return a - b;
            }
        };
        System.out.println("Subtraktion (anonyme Klasse): " + subtractor.calculate(7, 2));

        /**
         * ================================================
         * 4. Lambda-Ausdrücke
         * ================================================
         *
         * Da Calculator ein funktionales Interface ist (nur eine Methode),
         * kannst du die Syntax stark verkürzen:
         *
         * Beispiel:
         *      Calculator add = (a, b) -> a + b;
         *
         * Vorteile:
         *  - Kürzere Schreibweise
         *  - Übersichtlich & direkt
         *  - Kein Boilerplate-Code (keine neuen Klassen)
         */

        // ===== Lambda-Ausdrücke =====
        Calculator add = (a, b) -> a + b;
        Calculator add2 = (int a , int b) -> a + b;
        //Calculator add3 = a, b -> a + b;  Klammern ganz wichtig!

        Calculator add4 = (a, b) -> {
            int x = 499;
            return a + b + x;
        };                                      //Bei mehrzeiligem Lambda, {} und return nicht vergessen

        Calculator subtract = (a, b) -> a - b;
        Calculator multiply = (a, b) -> a * b;
        Calculator divide = (a, b) -> a / b;


        System.out.println("Addition (Lambda): " + add.calculate(3, 4));
        System.out.println("Subtraktion (Lambda): " + subtract.calculate(8, 2));
        System.out.println("Multiplikation (Lambda): " + multiply.calculate(5, 3));
        System.out.println("Division (Lambda): " + divide.calculate(9, 3));

        /**
         * ================================================
         * 5. Zusammenfassung & Reflexion
         * ================================================
         *
         * Ansatz           | Vorteile                              | Nachteile
         * -----------------|---------------------------------------|-------------------------------
         * Eigene Klassen   | Klar strukturierte Implementierung    | Viel Schreibaufwand, unflexibel
         * Anonyme Klassen  | Schnell umsetzbar, keine Dateien nötig| Unübersichtlich bei häufiger Nutzung
         * Lambdas          | Kurz, lesbar, ideal für funktionale   | Nur bei 1 Methode möglich
         *                  | Interfaces                            |
         *
         * Verwendung in der Java API:
         *
         *      List.sort((a,b) -> a.compareTo(b));
         *      stream.filter(n -> n > 0);
         *      forEach(e -> System.out.println(e));
         */
    }
}

package T26_Lambdas.AufgabeCalculator;

public class Main2 {
    public static void main(String[] args) {

        Calculator plus = new Calculator() {
            @Override
            public int calculate(int a, int b) {
                return a + b;
            }
        };

        Calculator minus = new Calculator() {
            @Override
            public int calculate(int a, int b) {
                return a - b;
            }
        };

        Calculator multiply = new Calculator() {
            @Override
            public int calculate(int a, int b) {
                return a * b;
            }
        };

        Calculator divide = new Calculator() {
            @Override
            public int calculate(int a, int b) {
                return b != 0 ? a / b : 0;
            }
        };

        System.out.println("Plus: " + plus.calculate(8, 2));
        System.out.println("Minus: " + minus.calculate(8, 2));
        System.out.println("Mal: " + multiply.calculate(8, 2));
        System.out.println("Geteilt: " + divide.calculate(8, 2));
    }
}


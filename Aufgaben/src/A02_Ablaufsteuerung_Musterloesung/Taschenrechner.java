package A02_Ablaufsteuerung_Musterloesung;

import java.util.Scanner;

public class Taschenrechner {

    public static void main(String[] args) {

        Scanner calc = new Scanner(System.in);
        double n1 = 0;
        double n2 = 0;

        double answer = 0;

        System.out.println("Calculator - First number:");
        n1 = calc.nextDouble();
        System.out.println("Second number:");
        n2 = calc.nextDouble();

        calc.nextLine();

        System.out.println("Choose your operator:");
        char operator = calc.nextLine().charAt(0);

        if (operator == '+') {
            answer = n1 + n2;
        } else if (operator == '-') {
            answer = n1 - n2;
        } else if (operator == '*') {
            answer = n1 * n2;
        } else if (operator == '/') {
            if (n2 == 0) {
                System.out.println("Division durch 0 ist nicht erlaubt!");
                return;
            }
            answer = n1 / n2;
        } else {
            System.out.println("Ungültiger Operator");
            return;
        }

        System.out.println("Answer " + answer);
        System.out.println("Press any button to close");
        calc.nextLine();
    }
}

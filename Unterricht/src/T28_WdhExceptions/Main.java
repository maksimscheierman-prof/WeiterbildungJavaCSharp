package T28_WdhExceptions;

public class Main {
    public static void causeArrayException() {
        int[] numbers = {1, 2, 3};
        System.out.println(numbers[5]); // -> ArrayIndexOutOfBoundsException
    }

    public static void causeNullPointer() {
        String text = null;
        System.out.println(text.length()); // -> NullPointerException
    }

    public static void main(String[] args) {
        try {
            System.out.println(1 + 2 + 3);
            System.out.println("Answer is " + (1 + 2 + 3));
            System.out.println(1 + 2 + 3 + "="+ (3 +3));

            //causeArrayException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Arrayfehler: " + e);
        }

        try {
            causeNullPointer();
        } catch (NullPointerException e) {
            System.out.println("Nullzeigerfehler: " + e);
        }
    }
}


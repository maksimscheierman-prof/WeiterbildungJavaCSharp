package T28_WdhExceptions;

import java.io.FileNotFoundException;

// Eigene Exception (unchecked)
class MyRuntieException extends RuntimeException {
}

public class Programmfluss {

    public static void main(String[] args) {
        try {
            methodAbcd();
        } catch (MyRuntieException ne) {
            System.out.print("A");
        } catch (Exception e) {
            System.out.print("X");
        }
    }

    // Diese Methode kann eine Exception werfen → daher "throws Exception"
    public static void methodAbcd() {
        try {
            // Der ternäre Operator entscheidet zur Laufzeit, welche Exception geworfen wird.
            // Da FileNotFoundException (checked) und MyRuntieException (unchecked)
            // keinen gemeinsamen "unchecked" Supertyp haben, ist der gemeinsame Typ Exception.
            throw 3 < 10 ? new MyRuntieException() : new FileNotFoundException();
        }
        catch (FileNotFoundException ie) {
            System.out.println("I");
        }
        catch (Exception re) {
            System.out.print("B");
        }
    }
}


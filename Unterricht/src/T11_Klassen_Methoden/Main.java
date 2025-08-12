package T11_Klassen_Methoden;

public class Main {

    /*
        Du bist hier:
        [ ] Kapitel 1. Minispiel
        [x] Kapitel 2. Main
     */

    // Die Main Methode fungiert als Einstiegspunkt in das System.
    // Sie ist public also von überall aus sichtbar.
    // Sie ist static, das bedeutet sie gehört zur Klasse und nicht zu einem einzelnen Objekt
        // Was das bedeutet klammern wir erstmal aus. Dies benötigen wir zum aktuellen Zeitpunkt noch nicht. :)

    public static void main(String[] args) {

        Minispiel ms = new Minispiel(); // Wir legen das Objekt von unserem Minispiel an
       // ms.isLowerThan50(100);  // Auf diese Methode haben wir hier keinen zugriff, weil sie privat ist.
        ms.startGame();                 // Wir rufen die einzige public Methode von unserem Spiel auf.
                                        // Sie startete den gameloop

    }
}

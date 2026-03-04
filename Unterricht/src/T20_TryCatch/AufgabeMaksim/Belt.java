package T20_TryCatch.AufgabeMaksim;

import java.io.IOException;

class Belt {
    private final int length; // in cm

    public Belt(int length) throws IOException {
        if (length < 80 || length > 170) {
            throw new IOException("Ungültige Gürtel-Länge: " + length + " cm. Erlaubt sind nur 80–170 cm.");
        }
        this.length = length;
    }

    public int getLength() {
        return length;
    }
}
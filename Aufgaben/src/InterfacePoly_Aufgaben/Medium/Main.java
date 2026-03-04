package InterfacePoly_Aufgaben.Medium;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Medium> medienListe = new ArrayList<>();

        medienListe.add(new Buch("Der Hobbit", "J.R.R. Tolkien"));
        medienListe.add(new Zeitschrift("National Geographic", 203));
        medienListe.add(new Buch("1984", "George Orwell"));
        medienListe.add(new Zeitschrift("Spiegel", 41));

        for (Medium medium : medienListe) {
            if (medium instanceof Buch) {
                Buch buch = (Buch) medium;
                System.out.println("Dieses Buch wurde von " + buch.getAutor() + " geschrieben.");
            }

            medium.zeigeInfo();
            System.out.println(); // Leerzeile für bessere Lesbarkeit
        }
    }
}

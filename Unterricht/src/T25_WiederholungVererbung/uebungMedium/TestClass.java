package T25_WiederholungVererbung.uebungMedium;

import java.util.ArrayList;

public class TestClass {
    public static void main(String[] args) {
        ArrayList<Medium> medienListe = new ArrayList<>();

        // 10 Objekte (5 Bücher, 5 Zeitschriften)
        medienListe.add(new Buch("Der Herr der Ringe", "J.R.R. Tolkien"));
        medienListe.add(new Buch("Harry Potter", "J.K. Rowling"));
        medienListe.add(new Buch("Die Verwandlung", "Franz Kafka"));
        medienListe.add(new Buch("Faust", "Johann Wolfgang von Goethe"));
        medienListe.add(new Buch("1984", "George Orwell"));

        medienListe.add(new Zeitschrift("National Geographic", 202));
        medienListe.add(new Zeitschrift("Spiegel", 45));
        medienListe.add(new Zeitschrift("Time", 30));
        medienListe.add(new Zeitschrift("Geo", 18));
        medienListe.add(new Zeitschrift("Wired", 99));

        // Ausgabe aller Informationen
        for (Medium m : medienListe) {
            if(m instanceof Buch) {
                m.zeigeInfo();
                System.out.println("Dieses Buch wurde von " + ((Buch) m).getAuthor());
            }

        }
    }
}

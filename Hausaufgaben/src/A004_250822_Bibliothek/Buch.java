package A003_250822_Bibliothek;

import java.util.ArrayList;
import java.util.Random;

public class Buch {
    private String Author;
    private String Titel;
    private String Genre;
    private Integer Seitenanzahl;
    private Integer ISBN;
    private Integer Anzahl;

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getTitel() {
        return Titel;
    }

    public void setTitel(String titel) {
        Titel = titel;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    public Integer getSeitenanzahl() {
        return Seitenanzahl;
    }

    public void setSeitenanzahl(Integer seitenanzahl) {
        Seitenanzahl = seitenanzahl;
    }

    public Integer getISBN() {
        return ISBN;
    }

    public void setISBN(Integer ISBN) {
        this.ISBN = ISBN;
    }

    public Integer getAnzahl() {
        return Anzahl;
    }

    public void setAnzahl(Integer anzahl) {
        Anzahl = anzahl;
    }

    //Constructor
    public Buch(String author, String titel, String genre, Integer seitenanzahl, Integer ISBN, Integer anzahl) {
        Author = author;
        Titel = titel;
        Genre = genre;
        Seitenanzahl = seitenanzahl;
        this.ISBN = ISBN;
        Anzahl = anzahl;
    }

    //Methods
    public static void createInitialBooks(ArrayList<Buch> buecher) {
        String[] authors = {"Goethe", "Schiller", "Kafka", "Hesse", "Mann", "Zweig", "Brecht", "Grass", "Böll", "Muschg"};
        String[] titles = {"Die Reise", "Der Schatten", "Licht und Dunkel", "Das Geheimnis", "Sturm der Zeit", "Die Brücke", "Traumfänger", "Weg ins Unbekannte", "Der Turm", "Die Stadt"};
        String[] genres = {"Roman", "Drama", "Lyrik", "Fantasy", "Krimi", "Thriller", "Biografie", "Historisch", "Science Fiction", "Satire"};

        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            String author = authors[rand.nextInt(authors.length)];
            String titel = titles[rand.nextInt(titles.length)];
            String genre = genres[rand.nextInt(genres.length)];
            int seitenanzahl = 100 + rand.nextInt(900); // zwischen 100 und 1000 Seiten
            int isbn = 1000000 + rand.nextInt(9000000); // zufällige 7-stellige ISBN
            int anzahl = 1 + rand.nextInt(20); // zwischen 1 und 20 Exemplare

            buecher.add(new Buch(author, titel, genre, seitenanzahl, isbn, anzahl));
        }
    }
    public static void showBooks(ArrayList<Buch> buecher) {
        if (buecher.isEmpty()) {
            System.out.println("Keine Bücher vorhanden.");
        } else {
            System.out.println("=== Bücherliste ===");
            for (int i = 0; i < buecher.size(); i++) {
                System.out.println((i + 1) + ". " + buecher.get(i));
            }
        }
    }
    // toString Methode für einfache Ausgabe
    @Override
    public String toString() {
        return "Titel: " + Titel +
                ", Autor: " + Author +
                ", Genre: " + Genre +
                ", Seiten: " + Seitenanzahl +
                ", ISBN: " + ISBN +
                ", Anzahl: " + Anzahl;
    }
}

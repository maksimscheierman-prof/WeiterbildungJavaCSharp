package T25_WiederholungVererbung.uebungMedium;

public class Buch extends Medium{

    private String author;

    public Buch(String title, String author) {
        super(title);
        this.author = author;
    }

    public void zeigeInfo() {
        System.out.println("Buch: " + getTitle() + " von " + this.author);
    }

    public String getAuthor() {
        return author;
    }
}

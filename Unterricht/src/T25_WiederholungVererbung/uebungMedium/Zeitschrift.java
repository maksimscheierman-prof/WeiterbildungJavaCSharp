package T25_WiederholungVererbung.uebungMedium;

public class Zeitschrift extends Medium{

    private int ausgabenNummer;

    public Zeitschrift(String title, int ausgabenNummer) {
        super(title);
        this.ausgabenNummer = ausgabenNummer;
    }

    @Override
    public void zeigeInfo() {
        System.out.println("Zeitschrift:" + getTitle() + ", Ausgabe: " + this.ausgabenNummer);
    }
}

package A16_AbstrakteKlassen;

abstract class Tier {
    protected String name;

    public Tier(String name) {
        this.name = name;
    }

    // jede Tierart gibt einen Laut von sich
    public abstract void geraeuschMachen();

    // gemeinsame Methode für alle Tiere
    public void schlafen() {
        System.out.println(name + " schläft gerade...");
    }
}

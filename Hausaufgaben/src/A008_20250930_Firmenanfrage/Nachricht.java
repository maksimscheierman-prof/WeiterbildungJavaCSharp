package A008_20250930_Firmenanfrage;


// Abstrakte Basisklasse
abstract class Nachricht {
    protected String text;

    public Nachricht(String text) {
        this.text = text;
    }

    // jede Nachricht kann verschickt werden
    public abstract long send();

    // vollständige Anzeige
    public abstract void anzeigen();

    // Vorschau
    public void vorschau(int n) {
        if (text.length() > n) {
            System.out.println("Vorschau: " + text.substring(0, n) + "...");
        } else {
            System.out.println("Vorschau: " + text);
        }
    }
}
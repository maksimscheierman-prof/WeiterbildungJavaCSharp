package A16_AbstrakteKlassen;

public class Main {
    public static void main(String[] args) {
        Tier[] tiere = {
                new Hauskatze("Minka"),
                new Raubkatze("Simba"),
                new Hund("Bello")
        };

        for (Tier t : tiere) {
            System.out.println("\n--- " + t.getClass().getSimpleName() + " ---");
            t.geraeuschMachen();
            t.schlafen();

            // Polymorphie + spezifische Methoden
            if (t instanceof Hauskatze) {
                ((Hauskatze) t).spielen();
                ((Hauskatze) t).schnurren();
            } else if (t instanceof Raubkatze) {
                ((Raubkatze) t).jagen();
                ((Raubkatze) t).schnurren();
            } else if (t instanceof Hund) {
                ((Hund) t).apportieren();
            }
        }
    }
}

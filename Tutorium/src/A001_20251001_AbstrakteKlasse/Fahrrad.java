package A001_20251001_AbstrakteKlasse;

class Fahrrad extends Vehicle {
    public Fahrrad(String name) {
        super(name);
    }

    // MUSS move() implementieren, weil Vehicle abstrakt ist
    @Override
    public void move() {
        System.out.println(name + " fährt mit Muskelkraft.");
    }
}

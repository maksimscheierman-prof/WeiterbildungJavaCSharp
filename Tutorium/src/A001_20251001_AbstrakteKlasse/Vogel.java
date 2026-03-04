package A001_20251001_AbstrakteKlasse;

class Vogel extends Vehicle implements Flyable{
    public Vogel(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(name + " hüpft und läuft ein wenig.");
    }

    @Override
    public void fly() {
        System.out.println(name + " fliegt durch die Lüfte.");
    }
}

package A16_AbstrakteKlassen;

abstract class Katze extends Tier {
    public Katze(String name) {
        super(name);
    }

    public void schnurren() {
        System.out.println(name + " schnurrt zufrieden.");
    }
}

package A16_AbstrakteKlassen;

class Hund extends Tier {
    public Hund(String name) {
        super(name);
    }

    @Override
    public void geraeuschMachen() {
        System.out.println(name + " bellt: Wuff Wuff!");
    }

    public void apportieren() {
        System.out.println(name + " bringt den Ball zurück.");
    }
}

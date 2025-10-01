package A16_AbstrakteKlassen;

class Hauskatze extends Katze {
    public Hauskatze(String name) {
        super(name);
    }

    @Override
    public void geraeuschMachen() {
        System.out.println(name + " miaut: Miau!");
    }

    public void spielen() {
        System.out.println(name + " spielt mit einem Wollknäuel.");
    }
}

package A16_AbstrakteKlassen;

class Raubkatze extends Katze {
    public Raubkatze(String name) {
        super(name);
    }

    @Override
    public void geraeuschMachen() {
        System.out.println(name + " brüllt laut: Roooar!");
    }

    public void jagen() {
        System.out.println(name + " geht auf die Jagd.");
    }
}

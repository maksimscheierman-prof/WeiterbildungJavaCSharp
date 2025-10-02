package A001_20251001_AbstrakteKlasse;

class Flugzeug extends MotorVehicle implements Flyable {
    public Flugzeug(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(name + " rollt zur Startbahn.");
    }

    @Override
    public void fuel() {
        System.out.println(name + " wird mit Kerosin betankt.");
    }

    @Override
    public void fly() {
        System.out.println(name + " hebt ab und fliegt durch die Luft.");
    }
}


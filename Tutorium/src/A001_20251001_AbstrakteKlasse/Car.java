package A001_20251001_AbstrakteKlasse;

class Car extends MotorVehicle {
    public Car(String name) {
        super(name);
    }

    // MUSS move() implementieren (von Vehicle geerbt)
    @Override
    public void move() {
        System.out.println(name + " fährt mit Motor.");
    }

    // MUSS fuel() implementieren (von MotorVehicle abstrakt)
    @Override
    public void fuel() {
        System.out.println(name + " wird mit Benzin oder Diesel betankt.");
    }
}

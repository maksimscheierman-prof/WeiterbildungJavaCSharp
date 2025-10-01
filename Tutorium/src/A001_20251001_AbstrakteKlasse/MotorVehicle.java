package A001_20251001_AbstrakteKlasse;

abstract class MotorVehicle extends Vehicle {
    public MotorVehicle(String name) {
        super(name);
    }

    // zusätzliche abstrakte Methode
    public abstract void fuel();
    // move() bleibt weiterhin abstrakt -> MUSS in konkreten Subklassen implementiert werden
}

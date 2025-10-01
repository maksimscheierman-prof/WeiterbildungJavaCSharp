package A001_20251001_AbstrakteKlasse;

abstract class Vehicle {
    protected String name;

    public Vehicle(String name) {
        this.name = name;
    }

    // abstrakte Methode -> MUSS in Subklassen implementiert werden
    public abstract void move();

    // konkrete Methode
    public void printType() {
        System.out.println("Ich bin ein Fahrzeug");
    }
}

package A001_20251001_AbstrakteKlasse;

public class Main {
    public static void main(String[] args) {
        Vehicle bike = new Fahrrad("Mountainbike");
        bike.printType();
        bike.move();

        Car car = new Car("VW Golf");
        car.printType();
        car.move();
        car.fuel();
    }
}

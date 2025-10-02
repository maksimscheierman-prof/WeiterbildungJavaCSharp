package A001_20251001_AbstrakteKlasse;

public class Main {
    public static void main(String[] args) {
        /*
        Vehicle bike = new Fahrrad("Mountainbike");
        bike.printType();
        bike.move();

        Car car = new Car("VW Golf");
        car.printType();
        car.move();
        car.fuel();
*/
        Vogel bird = new Vogel("Spatz");
        bird.printType();
        bird.move();
        bird.fly();

        Flugzeug plane = new Flugzeug("Boeing 747");
        plane.printType();
        plane.move();
        plane.fuel();
        plane.fly();

        // Auch über das Interface Flyable nutzbar:
        Flyable f1 = bird;
        Flyable f2 = plane;

        f1.fly();
        f2.fly();
    }
}

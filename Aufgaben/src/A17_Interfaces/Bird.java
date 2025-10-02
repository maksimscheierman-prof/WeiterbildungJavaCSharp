package A17_Interfaces;

import A17_Interfaces.interfaces.CanFly;

public class Bird implements CanFly {

    private final String name;
    private int altitudeMeters = 0;
    private int airspeedKmh = 0;
    private final double wingspanM;

    public Bird(String name, double wingspanM) {
        this.name = name;
        this.wingspanM = wingspanM > 0 ? wingspanM : CanFly.DEFAULT_WINGSPAN_M;
    }

    @Override
    public void takeOff() {
        System.out.println(name + " flaps wings and takes off.");
        setAirspeed(CanFly.MIN_TAKEOFF_SPEED_KMH + 20);
        setAltitude(CanFly.DEFAULT_CRUISE_ALTITUDE_M / 4);
    }

    @Override
    public void fly(double distanceMeters) {
        System.out.printf("%s flies %.0f meters at %d km/h.%n", name, distanceMeters, airspeedKmh);
    }

    @Override
    public void land() {
        System.out.println(name + " glides down and lands.");
        setAirspeed(0);
        setAltitude(0);
    }

    @Override
    public void setAltitude(int altitudeMeters) {
        if (!CanFly.isAltitudeValid(altitudeMeters)) {
            throw new IllegalArgumentException("Invalid altitude: " + altitudeMeters);
        }
        this.altitudeMeters = altitudeMeters;
    }

    @Override
    public void setAirspeed(int kmPerHour) {
        this.airspeedKmh = Math.max(0, kmPerHour);
    }

    public static void main(String[] args) {
        Bird b = new Bird("Owl", 0.064);
        b.takeOff();
        b.fly(200);
        b.land();
    }

}

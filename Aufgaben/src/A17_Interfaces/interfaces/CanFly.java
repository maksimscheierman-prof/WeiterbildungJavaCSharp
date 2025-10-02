package A17_Interfaces.interfaces;

public interface CanFly {

    int DEFAULT_CRUISE_ALTITUDE_M = 1000;
    int MAX_SAFE_ALTITUDE_M = 12000;
    int MIN_TAKEOFF_SPEED_KMH = 10;
    double DEFAULT_WINGSPAN_M = 1.0;

    /**
     * Initiate takeoff. Implementation decides how to accelerate, rotate, etc.
     */
    void takeOff();

    /**
     * Fly forward for the given horizontal distance (meters).
     */
    void fly(double distanceMeters);

    /**
     * Land the flying object safely.
     */
    void land();

    /**
     * Set current altitude (meters). Implementor persists/uses this state).
     */
    void setAltitude(int altitudeMeters);

    /**
     * Set current airspeed (km/h).
     */
    void setAirspeed(int kmPerHour);

    /**
     * Validate altitude (meters).
     */
    static boolean isAltitudeValid(int altitudeMeters) {
        return altitudeMeters >= 0 && altitudeMeters <= MAX_SAFE_ALTITUDE_M;
    }

}

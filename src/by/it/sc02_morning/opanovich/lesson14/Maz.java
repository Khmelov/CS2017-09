package by.it.sc02_morning.opanovich.lesson14;


/**
 * Class with unique name "Maz" and sound "У-у-у-у".
 */
public class Maz extends Car{

    /**
     * Construct a Maz with speed limitation up to 80 km/h.
     * @param speed initialise speed of the Maz
     */
    public Maz(int speed) {
        super((speed > 80) ? 80 : speed);
        beepSound = "У-у-у-у";
    }

    /**
     * Returns string with "Maz"
     * @return String with the name of vehicle
     */
    @Override
    public String toString() {
        return "Maz";
    }
}

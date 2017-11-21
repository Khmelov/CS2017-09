package by.it.sc02_morning.opanovich.lesson14;

/**
 * Class with unique name "Mercedes" and sound "Фа-фа". Have limited speed up to 200 km/h.
 */
public class Mercedes extends Car{

    /**
     * Construct a Mercedes with speed limitation up to 200 km/h.
     * @param speed initialise speed of the Mercedes
     */
    public Mercedes(int speed) {
        super((speed > 200) ? 200 : speed);
        beepSound = "Фа-фа";
    }

    /**
     * Returns string with "Mercedes"
     * @return String with the name of vehicle
     */
    @Override
    public String toString() {
        return "Mercedes";
    }
}

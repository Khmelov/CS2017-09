package by.it.sc02_morning.opanovich.lesson14;

/**
 * Class with implementation fire().
 */
public class Car extends AbstractCar{

    /**
     * Constructs an car with the speed and sound of beep "Пи-бип".
     * @param speed initialise speed of the car
     */
    public Car(int speed) {
        super(speed);
        beepSound = "Пи-бип";
    }

    /**
     * Print to console information of ignition of vehicle engine.
     */
    void fire() {
        System.out.println(this + " включил зажигание");
    }
}

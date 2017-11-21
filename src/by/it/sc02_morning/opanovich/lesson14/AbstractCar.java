package by.it.sc02_morning.opanovich.lesson14;

/**
 * The class {@code AbstractCar} contains methods that operate vehicle.
 * @author Mickael
 */
abstract class AbstractCar {

    /**
     * The {@code int} value that represent speed of the car
     */
    private int speed;

    /**
     * The sound will be shown when vehicle blow horn.
     */
    String beepSound = "Пи-бип";

    /**
     * Constructor initialize speed of vehicle.
     * @param speed variable represents speed of vehicle
     */
    public AbstractCar(int speed) {
        this.speed = speed;
    }

    /**
     * Print to console information that vehicle goes with speed.
     */
    void start() {
        System.out.println(this + " поехал со скоростью " + speed + " км/ч");
    }

    /**
     * Print to console information that vehicle has stopped.
     */
    void stop() {
        System.out.println(this + " остановился");
    }

    /**
     * Print to console information that vehicle blow horn beepSound.
     */
    void beep() {
        System.out.println(this + " сигналит: " + beepSound + "!");
    }

    /**
     * {@inheritDoc}
     */
    abstract void fire();

    /**
     * Returns string with "Автомобиль"
     * @return String with the name of vehicle
     */
    @Override
    public String toString() {
        return "Автомобиль";
    }
}

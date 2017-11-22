package by.it.sc02_morning.bondarenko.lesson14;

abstract class AbstractCar {

    private int speed;

    int getSpeed() {
        return speed;
    }

    void setSpeed(int speed) {
        this.speed = speed;
    }

    abstract void start();

    abstract void stop();

    abstract void beep();

    abstract void fire();

}
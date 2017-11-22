package by.it.sc04_evening_tue_thu.migdasyova.lesson14;

public class AbstractCar {
    private int speed;

    public AbstractCar(int speed) {
        this.speed = speed;
    }

    void start() {
        System.out.println(this + " поехал со скоростью " + speed + " км/ч");
    }

    void stop() {
        System.out.println(this + " остановился");
    }

    void fire() {
        System.out.println(this + " включил зажигание");
    }
}

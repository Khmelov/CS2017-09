package by.it.sc04_evening_tue_thu.bukhtik.lesson14;

public abstract class AbstractCar {

    private int speed;

    AbstractCar(int speed) {
        this.speed = speed;
    }

    void start() {
        System.out.println(this.toString() + " поехал со скоростью " + speed + " км/ч");
    }

    void stop() {
        System.out.println(this + " остановился");
    }

    void beep() {
        System.out.println(this + " сигналит: Пи-бип!");
    }

    @Override
    public String toString() {
        return "Автомобиль";
    }

    abstract void fire();

}

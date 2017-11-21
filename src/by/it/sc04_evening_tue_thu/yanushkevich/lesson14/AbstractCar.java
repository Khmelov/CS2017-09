package by.it.sc04_evening_tue_thu.yanushkevich.lesson14;

public class AbstractCar {
    private int speed;

    AbstractCar(int speed) {
        this.speed = speed;
    }

    void fire() {
        System.out.println(this + " включил зажигание");
    }

    void start() {
        System.out.println(this + " поехал со скоростью " + speed + " км/ч");
    }

    void beep() {
        System.out.println(this + " сигналит: Пи-бип!");
    }

    void stop() {
        System.out.println(this + " остановился");
    }

    @Override
    public String toString() {
        return "Автомобиль";
    }
}

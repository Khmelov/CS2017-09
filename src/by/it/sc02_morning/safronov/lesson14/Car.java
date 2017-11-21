package by.it.sc02_morning.safronov.lesson14;

public class Car {
    private int speed;

    public Car(int speed) {
        this.speed = speed;
    }

    public void fire() {
        System.out.println(this + " включил зажигание");
    }

    void start() {
        System.out.println(this + " поехал со скоростью " + speed + " км/ч");
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
}
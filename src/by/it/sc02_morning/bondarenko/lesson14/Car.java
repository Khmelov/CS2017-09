package by.it.sc02_morning.bondarenko.lesson14;

public class Car extends AbstractCar{

    Car(int speed) {
        setSpeed(speed);
    }

    public String toString() {
        return "Автомобиль";
    }

    public void start() {
        System.out.println(this + " поехал со скоростью " + this.getSpeed() + " км/ч");
    }

    public void stop() {
        System.out.println(this + " остановился");
    }

    public void beep() {
        System.out.println(this + " сигналит: Пи-бип!");
    }

    public void fire() {
        System.out.println(this + " включил зажигание");
    }

}
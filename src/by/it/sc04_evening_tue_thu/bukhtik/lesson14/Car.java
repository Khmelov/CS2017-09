package by.it.sc04_evening_tue_thu.bukhtik.lesson14;

public class Car extends AbstractCar {
    /*private int speed;

    public Car(int speed) {
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
    }*/

    Car(int speed) {
        super(speed);
    }

    @Override
    void fire() {
        System.out.println(this + " включил зажигание");
    }
}

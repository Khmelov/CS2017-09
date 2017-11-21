package by.it.sc02_morning.golikov.lesson14;

public class Car extends AbstractCar {

    private int speed;

    public Car(int speed) {
        this.speed = speed;
    }

    void start() {

        System.out.println(this.toString() +" поехал со скоростью "+ speed +" км/ч");

    }

    void stop() {

        System.out.println(this.toString() +" остановился");

    }

    void beep() {

        System.out.println(this.toString() +" сигналит: Пи-бип!");

    }

    @Override

    public String toString() {

        return "Автомобиль";

    }
}

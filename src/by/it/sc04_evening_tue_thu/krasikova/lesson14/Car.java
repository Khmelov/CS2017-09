package by.it.sc04_evening_tue_thu.krasikova.lesson14;

public class Car {
    private int speed;
    public Car(int speed) {
        this.speed = speed;
    }
    void start() {
        System.out.println(this+" поехал со скоростью "+speed+" км/ч");
    }

    public String toString() {
        return "Автомобиль";
    }

    void stop() {
        System.out.println(this+" остановился");
    }

    void beep() {
        System.out.println("Автомобиль сигналит: Пи-бип!");
    }
}

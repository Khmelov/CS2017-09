package by.it.sc04_evening_tue_thu.shinkevich.lesson14;

public class Car extends AbstractCar {
    private int speed;
    public Car(int speed) {
        this.speed=speed;
    }

    void start() {
        System.out.println(this+" поехал со скоростью " +speed+" км/ч");
    }
    void stop() {
        System.out.println(this+" остановился");
    }
    void beep()  {
        System.out.println(this+" сигналит: Пи-бип!");
    }

    @Override
    public String toString() {
        return "Автомобиль";
    }
}

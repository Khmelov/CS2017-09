package by.it.sc04_evening_tue_thu.makarevich.lesson14;

public class Car extends AbstractCar {

    public Car(int speed) {
        super(speed);
    }

    @Override
    public String toString() {
        return "Автомобиль";
    }

    @Override
    void beep() {
        System.out.println(this+" сигналит: Пи-бип!");;
    }


}

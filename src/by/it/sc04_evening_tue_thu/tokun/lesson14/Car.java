package by.it.sc04_evening_tue_thu.tokun.lesson14;

public class Car extends AbstractCar {
    Car(int speed) {
        super(speed);
    }

    @Override
    void fire() {
        System.out.println(this + " включил зажигание");
    }
}

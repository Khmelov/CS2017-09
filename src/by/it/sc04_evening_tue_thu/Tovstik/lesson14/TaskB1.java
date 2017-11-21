package by.it.sc04_evening_tue_thu.Tovstik.lesson14;
/*
Доделываем или даже переделываем TaskA1

1) Скопируйте класс Car в AbstractCar.
2) Перестройте всё наследование так, чтобы TaskA1 работал точно так же, как и прежде,
но Car был потомком AbstractCar, причем методы Car и AbstractCar не дублировались.
3) Определите в AbstractCar абстрактный метод void fire()
4) Реализуйте этот метод во всех потомках. Например, Mercedes выведет в консоль: Mercedes включил зажигание.

Создайте метод main с тремя машинами, такой же как в TaskA1,
но каждая машина перед стартом должна включить зажигание.

*/

public class TaskB1 {
    public static void main(String[] args) {
        Car[] cars = new Car[]{
                new Car(100),
                new Maz(60),
                new Mercedes(150)
        };

        for(Car car : cars) {
            car.fire();
            car.start();
            car.beep();
            car.stop();
        }
    }

}

package by.it.sc02_morning.patsko.lesson14;
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
/** Класс содержит задание B1 lesson 14 курса "Основы CS"
 *  @author Аркадий Пацко
 *  @version 1.0
 */
public class TaskB1 {
    /**Главный метод программы. Создает массив объектов Car, в который заносятся
     * объекты Car, Maz и Mercedes с аргументами 100, 60, 150 соответственно.
     * Затем у каждого из них последовательно вызываются методы fire, start, beep и stop*/
    public static void main(String[] args) {
        Car[] car={new Car(100), new Maz(60), new Mercedes(150)};
        for (Car c : car) {
            c.fire();   c.start();  c.beep(); c.stop();
        }
    }
}


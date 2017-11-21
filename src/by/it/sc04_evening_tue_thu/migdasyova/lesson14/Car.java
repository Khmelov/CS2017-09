package by.it.sc04_evening_tue_thu.migdasyova.lesson14;
/*
1) Создайте класс Car c конструктором и методами:
Car(int speed)      - конструктор должен сохранить скорость в приватном поле speed, например 60
void start()        - метод должен вывести в консоль строку "Автомобиль поехал со скоростью 60 км/ч"
void stop()         - метод должен вывести в консоль строку "Автомобиль остановился"
void beep()         - метод выводит на консоль строку "Автомобиль сигналит: Пи-бип!"
String toString()   - метод возвращает строку "Автомобиль"*/

public class Car extends AbstractCar {
    Car(int speed) {
        super(speed);
    }

    void beep() {
        System.out.println(this + " сигналит: Пи-бип!");
    }

    @Override
    public String toString() {
        return "Автомобиль";
    }
}

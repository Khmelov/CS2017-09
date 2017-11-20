package by.it.sc04_evening_tue_thu.migdasyova.lesson14;

/*2) Создайте класс Maz, который отличается от Car тем, что
        вместо слова "Автомобиль" везде пишет "Maz"
        не может ехать быстрее, чем 80 км/ч
        метод void beep(), который выводит на консоль строку "Maz сигналит: У-у-у-у!"*/
public class Maz extends Car {
    Maz(int speed) {
        super(speed <= 80 ? speed : 80);
    }

    void beep() {
        System.out.println(this + " сигналит: У-у-у-у!");
    }

    @Override
    public String toString() {
        return "Maz";
    }
}

package by.it.sc04_evening_tue_thu.migdasyova.lesson14;

/*3) Создайте класс Mercedes, который отличается Car тем, что:
    вместо слова "Автомобиль" везде пишет "Mercedes"
    не может ехать быстрее, чем 200 км/ч
    метод void beep(), который выводит на консоль строку "Mercedes сигналит: Фа-фа!"*/
public class Mercedes extends Car {
    Mercedes(int speed) {
        super(speed <= 200 ? speed : 200);
    }

    void beep() {
        System.out.println(this + " сигналит: Фа-фа!");
    }

    @Override
    public String toString() {
        return "Mercedes";
    }
}

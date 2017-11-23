package by.it.sc02_morning.bondarenko.lesson14;

public class Mercedes extends Car {

    Mercedes(int speed) {
        super((speed > 200) ? 200 : speed);
    }

    @Override
    public String toString() {
        return "Mercedes";
    }

    @Override
    public void beep() {
        System.out.println(this + " сигналит: Фа-фа!");
    }

}
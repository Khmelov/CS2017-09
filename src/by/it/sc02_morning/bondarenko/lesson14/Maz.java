package by.it.sc02_morning.bondarenko.lesson14;

public class Maz extends Car {

    Maz(int speed) {
        super((speed > 80) ? 80 : speed);
    }

    @Override
    public String toString() {
        return "Maz";
    }

    @Override
    public void beep() {
        System.out.println(this + " сигналит: У-у-у-у!");
    }

}
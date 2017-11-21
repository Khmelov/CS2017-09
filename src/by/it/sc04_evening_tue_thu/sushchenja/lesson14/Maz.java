package by.it.sc04_evening_tue_thu.sushchenja.lesson14;

public class Maz extends Car{
    Maz(int speed) {
        super(speed<=200?speed:200);
    }

    @Override
    public String toString() {
        return "Maz";
    }

    @Override
    void beep() {
        System.out.println(this+" сигналит: У-у-у-у!");
    }
}



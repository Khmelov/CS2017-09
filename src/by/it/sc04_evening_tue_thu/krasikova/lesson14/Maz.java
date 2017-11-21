package by.it.sc04_evening_tue_thu.krasikova.lesson14;

public class Maz extends Car {
    Maz (int speed) {
        super(speed<=80?speed:80);
        }

    public String toString() {
        return "Maz";
    }
    void beep() {
        System.out.println(this+" сигналит: У-у-у-у!");
    }


}
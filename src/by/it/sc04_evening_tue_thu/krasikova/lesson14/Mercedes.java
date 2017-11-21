package by.it.sc04_evening_tue_thu.krasikova.lesson14;

public class Mercedes extends Car {
    Mercedes(int speed) {
        super(speed<=200?speed:200);
        }

    public String toString() {
        return "Mercedes";
    }
    void beep() {
        System.out.println(this+" сигналит: Фа-фа!");
    }


}
package by.it.sc02_morning.golikov.lesson14;

public class Mercedes extends Car {

    public Mercedes(int speed) {
        super((speed >80)?150:speed);
    }

    void beep() {

        System.out.println(this.toString() +" сигналит: Фа-фа!");

    }

    @Override

    public String toString() {

        return "Mercedes";

    }
}

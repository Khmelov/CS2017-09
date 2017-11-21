package by.it.sc02_morning.golikov.lesson14;

public class Maz extends Car {

    public Maz(int speed) {
        super((speed >80)?80:speed);

//        if (speed > 80)
//            speed = 80;
//        else
//            speed = speed;
    }

    void beep() {

        System.out.println(this.toString() +" сигналит: У-у-у-у!");

    }

    @Override

    public String toString() {

        return "Maz";

    }
}

package by.it.sc04_evening_tue_thu.bukhtik.lesson14;

public class Mercedes extends Car {

    Mercedes(int speed) {
        super(speed <= 200 ? speed : 200);
    }

    @Override
    public String toString() {
        return "Mercedes";
    }

    @Override
    void beep() {
        System.out.println(this + " сигналит: Фа-фа!");
    }

    @Override
    void fire() {
        System.out.println(this + " включил зажигание");
    }


}




package by.it.sc03_evening_mon_fri.kravchinskaja_.lesson14;

public class Mercedes extends Car {
    Mercedes(int speed) {
        super(speed<=200?speed:200);
    }

    @Override
    public String toString() {
        return "Mercedes";
    }

    @Override
    void beep() {
        System.out.println(this+" сигналит: Фа-фа!");
    }
}

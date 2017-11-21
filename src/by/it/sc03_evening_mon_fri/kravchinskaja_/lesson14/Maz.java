package by.it.sc03_evening_mon_fri.kravchinskaja_.lesson14;

public class Maz extends Car { {
}
    Maz(int speed) {
        super(speed<=80?speed:80);
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


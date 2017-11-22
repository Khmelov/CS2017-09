package by.it.sc04_evening_tue_thu.yanushkevich.lesson14;

public class Maz extends Car {
    Maz(int speed) {
        super((speed<80) ? speed : 80);

    }

  /*  void start() {
        System.out.println(this + " поехал со скоростью " + speed + " км.час");
    }*/

    void beep() {
        System.out.println(this + " сигналит: У-у-у-у!");
    }

   /* void stop() {
        System.out.println(this + " остановился");
    }*/

    @Override
    public String toString() {
        return "Maz";
    }
}



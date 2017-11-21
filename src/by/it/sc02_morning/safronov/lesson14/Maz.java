package by.it.sc02_morning.safronov.lesson14;

public class Maz extends Car {
    public Maz(int speed) {
        super((speed > 80) ? 80 : speed);
    }

    @Override
    public void beep() {
        System.out.println(this + " сигналит: У-у-у-у!");
    }
    @Override   public String toString(){
        return "Maz";
    }
}

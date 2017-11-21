package by.it.sc02_morning.serzhan.lesson14;

public abstract class AbstractCar {
    private int speed;
public AbstractCar(int speed){
    this.speed=speed;
}
    public int getSpeed() {
        return speed;
    }

    public abstract void fire();


    public abstract void start();


    public abstract void stop();


    public abstract void beep();


    @Override    public abstract  String toString();
}
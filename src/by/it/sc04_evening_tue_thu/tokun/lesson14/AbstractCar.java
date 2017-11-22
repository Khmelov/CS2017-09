package by.it.sc04_evening_tue_thu.tokun.lesson14;

abstract public class AbstractCar {
    private int speed;

    public AbstractCar(int speed) {
        this.speed = speed;
    }

    void start() {
        System.out.println(this + " поехал со скоростью " + speed + " км/ч");
    }
    void stop(){
        System.out.println(this + " остановился");
    }
    void beep(){
        System.out.println(this + " сигналит: Пи-бип!");
    }
    abstract void fire();

    @Override
    public String toString() {
        return "Автомобиль";
    }
}

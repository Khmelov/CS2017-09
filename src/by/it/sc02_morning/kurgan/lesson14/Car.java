package by.it.sc02_morning.kurgan.lesson14;

public class Car extends AbstractCar {
    private int speed;

    public Car(int speed) {
        this.speed = speed;
    }

    void start(){
        System.out.println(this+" поехал со скоростью " + speed + " км/ч");
    }

    void spot(){
        System.out.println(this+" остановился");
    }
    void beep(){
        System.out.println(this+" сигналит: Пи-бип!");
    }
    @Override
    public String toString() {
        return "Автомобиль";
    }
}
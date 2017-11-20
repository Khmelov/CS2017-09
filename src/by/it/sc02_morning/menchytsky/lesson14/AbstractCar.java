package by.it.sc02_morning.menchytsky.lesson14;

public class AbstractCar {
    private int speed;

    public AbstractCar(int speed) {
        this.speed = speed;
    }

    void fire(){
        System.out.println(this +" включил зажигание.");
    }
    void start(){
        System.out.println(this +" поехал со скоростью " + speed +" км/ч");
    }
    void stop(){
        System.out.println(this +" остановился ");
    }

    void beep(){
        System.out.println(this +" сигналит: Пи-бип! ");
    }
    @Override
    public String toString(){
        return "Автомобиль";
    }
}

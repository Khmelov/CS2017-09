package by.it.sc02_morning.serzhan.lesson14;

public class Car {
    private int speed;
    public Car(int speed){
        this.speed=speed;


    }
    void start(){
        System.out.println(this.toString()+" поехал со скоростью "+ speed + " км/ч");
    }
    void stop(){
        System.out.println(this.toString()+" остановился ");
    }
    void beep(){
        System.out.println(this.toString()+" сигналит: Пи-бип! "+ speed + " км/ч");
    }
    @Override
    public String toString(){
        return "Автомобиль";

    }
}

package by.it.sc02_morning.serzhan.lesson14;

public class Car extends AbstractCar {
    private int speed;
    public Car(int speed){
        super(speed);
    }
   public void fire(){
        System.out.println(this+" включил зажигание ");
    }
     public void start(){
        System.out.println(this+" поехал со скоростью "+ getSpeed() + " км/ч");
    }
     public void stop(){
        System.out.println(this+" остановился ");
    }
    public void beep(){
        System.out.println(this+" сигналит: Пи-бип! ");
    }
    @Override
    public String toString(){
        return "Автомобиль";

    }
}

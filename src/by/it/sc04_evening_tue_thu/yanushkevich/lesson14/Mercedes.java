package by.it.sc04_evening_tue_thu.yanushkevich.lesson14;

public class Mercedes extends Car {
    Mercedes(int speed) {
        super((speed<200) ? speed : 200);
    }
/*    void start(){
        System.out.println(this + " поехал со скоростью " + speed + " км.час");
    }*/

    void beep(){
        System.out.println(this + " сигналит: Фа-фа!");
    }

  /*  void stop(){
        System.out.println(this + " остановился");
    }*/

    @Override
    public String toString() {
        return "Mercedes";
    }

}
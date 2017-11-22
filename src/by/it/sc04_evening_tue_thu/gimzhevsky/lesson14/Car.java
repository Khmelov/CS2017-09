package by.it.sc04_evening_tue_thu.gimzhevsky.lesson14;
/** Класс, описывающий автомобиль*/
public class Car extends AbstractCar {
    /** <B>speed</B> - скорость автомобиля*/
    private int speed;
    /** Конструктор автомобиля, принимающий скорость автомобиля*/
    Car(int s){
        speed = s;
    }
    /**[Модель автомобиля] поехал со скоростью [speed] км/ч*/
    void start(){
       //System.out.println(this + " поехал со скоростью " + speed + " км/ч");
        //this с текстом то же самое, что и this.toString
        System.out.printf("%s поехал со скоростью %s км/ч\n", this,speed);
    }
    /**[Модель автомобиля] остановился*/
    void stop(){
        System.out.printf("%s остановился\n", this);
    }

    /**[Модель автомобиля] сигналит: [тип сигнала].*/
    void beep(){
        System.out.printf("%s сигналит: Пи-бип!\n",this);
    }

    @Override
    /**Возвращает значение Модели автомобиля по умолчанию (Автомобиль)*/

    public String toString() {
        return "Автомобиль";
    }
}

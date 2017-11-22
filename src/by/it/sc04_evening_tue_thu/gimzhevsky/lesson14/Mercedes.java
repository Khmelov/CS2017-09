package by.it.sc04_evening_tue_thu.gimzhevsky.lesson14;
/**Класс автомобиля Mercedes*/
public class Mercedes extends Car{
    /**Конструктор автомобиля Mercedes - принимает скорость (с ограничением максимальной скорости)*/
    Mercedes(int speed){
        super(speed<=200?speed:200);
    }
    /**Переопределение типа сигнала*/
    void beep(){
        System.out.printf("%s сигналит: Фа-фа!\n",this);
    }
    /**Переопределение модели авто*/
    public String toString(){
        return "Mercedes";
    }

}

package by.it.sc04_evening_tue_thu.gimzhevsky.lesson14;
/**Класс автомобиля Maz*/
public class Maz extends Car{
    /**Конструктор автомобиля Maz - принимает скорость (с ограничением максимальной скорости*/
    Maz(int speed){
        super(speed<=80?speed:80);
    }
    /**Переопределение звука сигнала*/
    void beep(){
        System.out.printf("%s сигналит: У-у-у-у!\n", this);
    }
    /**Переопределение модели авто*/
    public String toString(){
        return "Maz";
    }
}

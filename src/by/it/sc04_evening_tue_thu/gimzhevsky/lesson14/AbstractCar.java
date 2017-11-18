package by.it.sc04_evening_tue_thu.gimzhevsky.lesson14;
/** Абстрактный класс, расширяющий поведение машины(класса Car)*/
public abstract class AbstractCar {
    void fire(){
        /** Принимает параметр toString (модель автомобиля) и выводит состяние - "[Автомобиль] включил зажигание"*/
        System.out.printf("%s включил зажигание\n", this);
    }
}

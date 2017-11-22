package by.it.sc04_evening_tue_thu.gimzhevsky.lesson14;
/** Абстрактный класс, расширяющий поведение машины(класса Car)*/
public abstract class AbstractCar {
    /** Принимает параметр toString (модель автомобиля) и выводит состяние - "[Модель автомобиля] включил зажигание"*/
        void fire(){
        System.out.printf("%s включил зажигание\n", this);
    }
}

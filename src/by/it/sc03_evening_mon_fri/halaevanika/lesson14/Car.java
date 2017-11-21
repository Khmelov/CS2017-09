package by.it.sc03_evening_mon_fri.halaevanika.lesson14;
/**
 * Класс Car
 * @autor Халаева Вераника
 */

public class Car extends AbstractCar {
    /* Приватное поле speed*/
    private int speed;
    /**
     * Конструктор - сохраняет скорость в приватном поле
     * @param speed - скорость
     */
    public Car(int speed) {
        this.speed = speed;
    }
    /** функция для вывода в консоль строки */
    void start(){
        System.out.println(this + " поехал со скоростью " + speed + " км/ч");
    }
    /** функция для вывода в консоль строки */
    void stop(){System.out.println(this + " остановился");}
    /** функция для вывода в консоль строки */
    void beep(){System.out.println(this + " сигналит: Пи-бип!");}
   /** функция возвращает строку
    * @return "Автомобиль"
    **/
    public String toString(){
        return "Автомобиль";
    }


    @Override
    void fire() {
        System.out.println(this + " включил зажигание.");
    }
}

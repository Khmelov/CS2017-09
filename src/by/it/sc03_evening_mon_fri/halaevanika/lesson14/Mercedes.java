package by.it.sc03_evening_mon_fri.halaevanika.lesson14;
/**
 * Класс Mercedes наследник Car
 * @autor Халаева Вераника
 */

public class Mercedes extends Car {
    /**Конструктор*/
    public Mercedes(int speed) {
        super(speed>200?200:speed);
    }
    /** функция для вывода в консоль строки */
    void beep(){System.out.println(this + " сигналит: Фа-фа!");}

    @Override
    public String toString(){
        return "Mercedes";
    }
}

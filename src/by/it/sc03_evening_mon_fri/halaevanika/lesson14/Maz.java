package by.it.sc03_evening_mon_fri.halaevanika.lesson14;
/**
 * Класс Maz наследник Car
 * @autor Халаева Вераника
 */



public class Maz extends Car{

    public Maz(int speed) {
        super(speed>80?80:speed);
    }
    /** функция для вывода в консоль строки */
    void beep(){System.out.println(this + " сигналит: У-у-у-у!");}
@Override
    public String toString(){
        return "Maz";
    }
}

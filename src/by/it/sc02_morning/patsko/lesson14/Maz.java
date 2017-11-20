package by.it.sc02_morning.patsko.lesson14;
/**Подкласс суперкласса <b>Car</b> служит для хранения объектов со свойством <b>speed</b>
 * @author Аркадий Пацко
 * @version 1.0
 * */
public class Maz extends Car {
    /**Создает новый объект
     * @param speed Скорость автомобиля
     * @see Maz#Maz(int)
     * */
    Maz(int speed){
        super((speed>80)?80:speed);
    }
    /**Переопределение метода суперкласса Car.
     * Выводит на экран собщение "Maz сигналит: У-у-у-у!"
     * */
    @Override   public void beep(){
        System.out.println(this+" сигналит: У-у-у-у!");
    }
    /**Переопределение метода суперкласса Car.
     * @return Строка "Maz",
     * */
    @Override   public String toString(){
        return "Maz";
    }
}

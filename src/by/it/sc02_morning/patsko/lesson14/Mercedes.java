package by.it.sc02_morning.patsko.lesson14;
/**Подкласс суперкласса <b>Car</b> служит для хранения объектов со свойством <b>speed</b>
 * @author Аркадий Пацко
 * @version 1.0
 * */
public class Mercedes extends Car {
    /**Создает новый объект
     * @param speed Скорость автомобиля
     * @see Mercedes#Mercedes(int)
     * */
    Mercedes(int speed){
        super((speed>200)?200:speed);
    }
    /**Переопределение метода суперкласса Car.
     * Выводит на экран собщение "Mercedes сигналит: Фа-фа!"
     * */
    @Override   public void beep(){
        System.out.println(this+" сигналит: Фа-фа!");
    }
    /**Переопределение метода суперкласса Car.
     * @return Строка "Mercedes",
     * */
    @Override   public String toString(){
        return "Mercedes";
    }
}

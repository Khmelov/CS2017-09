package by.it.sc02_morning.patsko.lesson14;
/** Абстрактный класс служит для хранения объектов со свойством <b>speed</b>
 *  @author Аркадий Пацко
 *  @version 1.0
 * */
public abstract class AbstractCar {
    /**Свойство - скорость*/
    private int speed;

    /**Создает новый объект
     * @param speed Скорость автомобиля
     * @see AbstractCar#AbstractCar(int)
     * */
    public AbstractCar(int speed) {
        this.speed = speed;
    }

    /**Метод геттер. Получает значение свойства speed.
     * @return Значение свойства speed*/
    public int getSpeed() {
        return speed;
    }

    /**Абстрактный метод, реализуемый в классе Car*/
    public abstract void fire();

    /**Абстрактный метод, реализуемый в классе Car*/
    public abstract void start();

    /**Абстрактный метод, реализуемый в классе Car*/
    public abstract void stop();

    /**Абстрактный метод, реализуемый в классе Car*/
    public abstract void beep();

    /**Абстрактный метод, реализуемый в классе Car*/
    @Override    public abstract  String toString();
}

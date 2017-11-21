package by.it.sc04_evening_tue_thu.makarevich.lesson14;

/**
 * Создание суперкласса AbstractCar с состоянием скорости (переменная Speed).
 * @author Макаревич Татьяна
 * @version 1.0.0
 */
public class AbstractCar {
    /** Поле скорость */
    private  int speed;

    /** Метод определения значения скорости
     * @param sp - скорость.
     */
    void SetSpeed(int sp){speed=sp;};

    /** Метод получения значения скорости
     * @return возвращает значение скорости
     */
    int GetSpeed () {return speed;};

    /**
     * Конструктор - создание нового объекта с определяемым значением.
     * @param speed - скорость.
     */
    public AbstractCar (int speed) {
        this.speed = speed;
    }

    /** Метод выводит информацию о том, с какой скоростью поехал объект.
     */
    void start() {
        System.out.println(this+" поехал со скоростью " +speed+ " км/ч");
    };
    /** Метод выводит информацию о том, что объект остановился.
     */
    void stop(){
        System.out.println(this+" остановился ");
    };

    /** Метод выводит информацию о том, как сигналит объект.
     */
    void beep(){
        System.out.println(this+" сигналит: Пи-бип!");
    };

    /** Метод выводит информацию о том, что объект включил зажигание.
     */
    void fire(){ System.out.println(this+" включил зажигание");};
}

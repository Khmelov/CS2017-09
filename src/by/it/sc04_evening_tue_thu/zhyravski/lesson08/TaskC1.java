package by.it.sc04_evening_tue_thu.zhyravski.lesson08;

/*
Доработайте класс Dog.

1) Добавьте два новых поля с геттерами и сеттерми (!!!!)
private int weight; //вес собаки
private double power; //сила укуса собаки

2) Напишите экземплярный метод в классе Dog
boolean win(Dog otherDog)
    {... тело метода...}
который рассчитывает, кто из двух собак победит эта (this) или та (otherDog).

Расчет должен быть таким.
    Шансы на победу = 0.2 * возраст + 0.3 * вес + 0.5 * силу укуса.

Побеждает та собака, у которой больше шансов на победу.
Если победила эта (this), то метод win возвращает true, иначе false

3) Проверка.
В классе TaskC1 с клавиатуры через Scanner водятся две собаки в формате
кличка возраст вес сила
кличка возраст вес сила
(всего получается 8 чтений разных данных)

Создайте этих собак, определите победителя с помощью созданного
в классе Dog метода boolean win(Dog dog).
Напечатайте кличку победителя.
*/


import java.io.IOException;
import java.util.Scanner;

public class TaskC1 {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        String dog1Name = scanner.next();
        int dog1Age = scanner.nextInt();
        int dog1Weight = scanner.nextInt();
        double dog1Power = scanner.nextDouble();

        Dog dog1 = new Dog(dog1Name, dog1Age, dog1Weight, dog1Power);

        String dog2Name = scanner.next();
        int dog2Age = scanner.nextInt();
        int dog2Weight = scanner.nextInt();
        double dog2Power = scanner.nextDouble();

        Dog dog2 = new Dog(dog2Name, dog2Age, dog2Weight, dog2Power);

        if (dog1.win(dog2)) {

            System.out.println(dog1.getName());

        } else {

            System.out.println(dog2.getName());

        }

    }

}

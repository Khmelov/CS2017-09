package by.it.sc02_morning.menchytsky.lesson13;

import java.util.Arrays;
import java.util.Scanner;

/*
Напишите отдельный класс Salary который принимает в конструктор
массив double[]
конструктор сохраняет данные в приватный массив класса salary

напишите нестатические методы для Salary:
метод double getSum() - считает сумму всех зарплат.
метод double getSum(double percent) - считает сумму всех зарплат с надбавкой в percent%.

метод double[] getSalary() возвращает массив из приватного поля.
метод double[] getSalary(double percent) возвращает новый массив с надбавкой в percent%.
метод void setSalary(double percent) обновляет массив в приватном поле с надбавкой в percent%.

метод void sort() сортирует массив через Arrays.sort в приватном поле.
метод String toString() возвращает Arrays.toString для в приватного поля

 в методе main
 с консоли вводите заработные платы в массив чисел типа double размером в 12 элементов
 и передайте их в конструктор Salary
 выведите на консоль по очереди:

 неотсортированные зарплаты без надбавок
 сумму без надбавок.
 неотсортированные зарплаты с надбавкой в 20%
 сумму с этой надбавкой.
 отсортированные зарплаты с надбавкой в 50%
 сумму с этой надбавкой.
*/
public class TaskB1 {



    public static void main(String[] args) {

        double[] salaryNew = new double[12];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < salaryNew.length; i++) {
            salaryNew[i] = scanner.nextDouble();
        }
        Salary salary1 = new Salary(salaryNew);
        //1500 700 800 700 800 900 1000 800 1000 1250 1200 700
        System.out.println("неотсортированные зарплаты без надбавок = " + Arrays.toString(salary1.getSalary()));
        System.out.println("сумму без надбавок. " + salary1.getSum());
        System.out.println("неотсортированные зарплаты с надбавкой в 20% = " + Arrays.toString(salary1.getSalary(20)));
        System.out.println("сумму с этой надбавкой. " + salary1.getSum(20));
        salary1.QuickSort(salaryNew);
        System.out.println("отсортированные зарплаты с надбавкой в 50% = " + Arrays.toString(salary1.getSalary(50)));
        System.out.println("сумму с этой надбавкой. " + salary1.getSum(50));
    }
}

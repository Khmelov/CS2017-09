package by.it.sc04_evening_tue_thu.koktysh.lesson13;

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
        double[] salary = new double[12];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < salary.length; i++)
            salary[i] = sc.nextDouble();
        Salary s1 = new Salary(salary);
        System.out.println(s1.toString());
        System.out.println(s1.getSum());
        Salary s2 = new Salary(salary);
        s2.setSalary(20);
        System.out.println(s2.toString());
        System.out.println(s2.getSum());
        Salary s3 = new Salary(salary);
        s3.setSalary(50);
        s3.sort();
        System.out.println(s3.toString());
        System.out.println(s3.getSum());
    }


}

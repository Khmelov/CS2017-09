package by.it.sc02_morning.opanovich.lesson13;

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

    private static int N = 12;

    public static void main(String[] args) {

        double[] salary = new double[N];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < N; i++) {
            salary[i] = sc.nextInt();
        }

        Salary instance = new TaskB1().newSalary(salary);
        System.out.println(instance);
        System.out.println(instance.getSum());
        System.out.println(Arrays.toString(instance.getSalary(20)));
        System.out.println(instance.getSum(20));
        instance.sort();
        System.out.println(Arrays.toString(instance.getSalary(50)));
        System.out.println(instance.getSum(50));
    }

    public Salary newSalary(double[] salary) {
        return new Salary(salary);
    }

   /* выведите на консоль по очереди:

    неотсортированные зарплаты без надбавок
    сумму без надбавок.
    неотсортированные зарплаты с надбавкой в 20%
    сумму с этой надбавкой.
    отсортированные зарплаты с надбавкой в 50%
    сумму с этой надбавкой.*/
}

class Salary {

    private double[] salary;

    public Salary(double[] salary) {
        this.salary = salary.clone();
    }

    public double getSum() {
        double sum = 0;
        for (double each : salary) {
            sum += each;
        }
        return sum;
    }

    public double getSum(double persent) {
        double sum = 0;
        for (double each : salary) {
            sum += each;
        }
        return sum * (1 + persent / 100);
    }

    double[] getSalary() {
        return salary;
    }

    double[] getSalary(double percent) {
        double[] salaryPercent = salary.clone();
        for (int i = 0; i < salaryPercent.length; i++) {
            salaryPercent[i] = Math.ceil(salaryPercent[i] * (1 + percent / 100) * 10) / 10;
        }
        return salaryPercent;
    }

    void setSalary(double percent) {
        for (int i = 0; i < salary.length; i++) {
            salary[i] = Math.ceil(salary[i] * (1 + percent) * 10) / 10;
        }
    }

    void sort() {
        Arrays.sort(salary);
    }

    @Override
    public String toString() {
        return Arrays.toString(salary);
    }
}

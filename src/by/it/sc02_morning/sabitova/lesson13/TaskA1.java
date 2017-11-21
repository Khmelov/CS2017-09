package by.it.sc02_morning.sabitova.lesson13;

//напишите три статических метода,
//один метод double sum(double[] salary) - считает сумму всех зарплат.
//второй double[] add(double[] salary, double percent) вычисляет новый массив с надбавкой в percent%.
//третий void sort(double[] salary) сортирует массив salary.

// в методе main
// с консоли вводите заработные платы в массив размером в 12 элементов
// выведите на консоль по очереди:

// неотсортированные зарплаты без надбавок
// сумму без надбавок.
// неотсортированные зарплаты с надбавкой в 20%
// сумму с этой надбавкой.
// отсортированные зарплаты с надбавкой в 50%
// сумму с этой надбавкой.

import java.util.Arrays;
import java.util.Scanner;

public class TaskA1 {
    static final int N = 12;
    static void main(String[] args) {
        double[] salary = new double[N];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < N; i++) {
            salary[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(salary));
        System.out.println(sum(salary));
        System.out.println(Arrays.toString(add(salary, 0.2)));
        System.out.println(sum(add(salary, 0.2)));

        sort(salary);
        System.out.println(Arrays.toString(add(salary, 0.5)));
        System.out.println(sum(add(salary, 0.5)));
    }

    static void sort(double[] salary) {
        Arrays.sort(salary);
    }

    static double[] add(double[] salary, double percent) {
        double[] salaryPercent = salary.clone();
        for (int i = 0; i < salaryPercent.length; i++) {
            salaryPercent[i] = Math.ceil(salaryPercent[i] * (1 + percent) * 10) / 10;
        }
        return salaryPercent;
    }
    static double sum(double[] salary) {
        double sum = 0;
        for (double each : salary) {
            sum += each;
        }
        return sum;
    }
}

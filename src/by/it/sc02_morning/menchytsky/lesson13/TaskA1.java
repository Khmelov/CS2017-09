package by.it.sc02_morning.menchytsky.lesson13;

import java.util.Arrays;
import java.util.Scanner;

/*
напишите три статических метода,
один метод static double sum(double[] salary) - считает сумму всех зарплат.
второй static double[] add(double[] salary, double percent) вычисляет новый массив с надбавкой в percent%.
третий static void sort(double[] salary) сортирует массив salary.

 в методе main
 с консоли вводите заработные платы в массив размером в 12 элементов
 выведите на консоль по очереди:

 неотсортированные зарплаты без надбавок (используйте Arrays.toString)
 сумму без надбавок.
 неотсортированные зарплаты с надбавкой в 20% (используйте Arrays.toString)
 сумму с этой надбавкой.
 отсортированные зарплаты с надбавкой в 50% (используйте Arrays.toString)
 сумму с этой надбавкой.
*/
public class TaskA1 {

    static double[] mergeSort(double[] a, int l, int r) {
        if (l == r) {
            return new double[]{a[l]};
        }
        int m = (l + r) / 2;
        return merge(mergeSort(a, l, m), mergeSort(a, m + 1, r));
    }

    static double[] merge(double[] a, double[] b) {
        double[] result = new double[a.length + b.length];
        for (int i = 0, A = 0, B = 0; i < result.length; i++) {
            if (A == a.length) {
                result[i] = b[B++];
            } else if (B == b.length) {
                result[i] = a[A++];
            } else if (a[A] > b[B]) {
                result[i] = b[B++];
            } else {
                result[i] = a[A++];
            }
        }
        return result;
    }
    static double sum(double[] salary) {
        double sum = 0;
        for (int i = 0; i < salary.length; i++) {
            sum = sum + salary[i];
        }
        return sum;
    }

    static double[] add(double[] salary, double percent) {
        double[] addSalary = new double[salary.length];

        for (int i = 0; i < salary.length; i++) {
            addSalary[i] = salary[i] * (100 + percent) / 100;
        }
        return addSalary;
    }

    public static void main(String[] args) {
        double[] salary = new double[12];
        double[] sortSalary = new double[12];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < salary.length; i++) {
            salary[i] = scanner.nextDouble();
        }
        //1500 700 800 700 800 900 1000 800 1000 1250 1200 700
        System.out.println("не отсартированные зарплаты = " + Arrays.toString(salary));
        System.out.println("Сумма без надбавок =" + sum(salary));
        System.out.println("не отсартированные зарплаты с надбавкой 20% = " + Arrays.toString(add(salary, 20)));
        System.out.println("Сумма с надбавкой =" + sum(add(salary, 20)));
        sortSalary = mergeSort(salary, 0, salary.length-1);
        System.out.println("Oтсартированные зарплаты = " + Arrays.toString(sortSalary));
        System.out.println("Отсартированные зарплаты с надбавкой 50% = " + Arrays.toString(add(sortSalary, 50)));
        System.out.println("Сумма с надбавкой =" + sum(add(sortSalary, 50)));
    }

}
package by.it.sc02_morning.opanovich.lesson13;

import java.util.Scanner;

import static java.lang.Math.random;

/*
Свой поиск и вывод.

Повторите решение задачи B не используя класс Arrays (!!!!) и его методы.
Также добавьте в класс Salary два дополнительных консруктора которые принимают
1) массив String[]
2) произвольное количество чисел типа double (не массив)
*/

public class TaskC1 {

    private static int N = 12;

    public static void main(String[] args) {

        double[] salary = new double[N];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < salary.length; i++) {
            salary[i] = sc.nextInt();
        }

        Salary instance = new Salary(salary);
        System.out.println(instance);
        System.out.println(instance.getSum());
        System.out.println(instance.toString(instance.getSalary(20)));
        System.out.println(instance.getSum(20));
        instance.sort();
        System.out.println(instance.toString(instance.getSalary(50)));
        System.out.println(instance.getSum(50));
    }

    static void qSort(double[] a) {
        qSort(a, 0, a.length - 1);
    }

    private static void qSort(double[] a, int left, int right) {

        while (left < right) {
            int m = partition(a, left, right);
            qSort(a, left, m - 1);
            left = m + 1;
        }
    }

    private static int partition(double[] a, int left, int right) {

        swap(a, left, (int) (left + random() * (right - left + 1)));
        int i, j = left;
        for (i = left + 1; i <= right; i++) {
            if (a[left] >= a[i]) {
                j++;
                swap(a, j, i);
            }
        }
        swap(a, left, j);
        return j;
    }

    private static void swap(double[] a, int i, int j) {
        double temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}

class Salary {

    private double[] salary;

    Salary(double[] salary) {
        this.salary = salary.clone();
    }

    public Salary(String[] stringSalary) {
        for (int i = 0; i < stringSalary.length; i++) {
            salary[i] = Double.parseDouble(stringSalary[i]);
        }
    }

    public Salary(Double ... salary) {
        this.salary = new double[salary.length];
        for (int i = 0; i < salary.length; i++) {
            this.salary[i] = salary[i];
        }
    }

    double getSum() {
        double sum = 0;
        for (double each : salary) {
            sum += each;
        }
        return sum;
    }

    double getSum(double persent) {

        return getSum() * (1 + persent / 100);
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
        salary = getSalary(percent);
    }

    void sort() {
        TaskC1.qSort(salary);
    }

    @Override
    public String toString() {
        StringBuffer out = new StringBuffer("");
        out.append("[");
        for (int i = 0;;) {
            out.append(salary[i]);
            i++;
            if (i < salary.length) {
                out.append(", ");
            } else {
                break;
            }
        }
        out.append("]");
        return out.toString();
    }

    public String toString(double[] salary) {
        StringBuffer out = new StringBuffer("");
        out.append("[");
        for (int i = 0;;) {
            out.append(salary[i]);
            i++;
            if (i < salary.length) {
                out.append(", ");
            } else {
                break;
            }
        }
        out.append("]");
        return out.toString();
    }
}


package by.it.sc04_evening_tue_thu.yanushkevich.lesson13;

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

    static double sum(double[] salary) { //считает сумму всех зарплат.
        double sum = 0;
        for (double s : salary) {
            sum = sum + s;
        }
        return sum;
    }

    static double[] add(double[] salary, double percent) { //вычисляет новый массив с надбавкой в percent%.
        double[] result = new double[salary.length];
        for (int i = 0; i < salary.length; i++) {
           // result[i] = salary[i] * 1.20;
           result[i] = salary[i] * (100 + percent) / 100;
        }
        return result;
    }

    static void sort(double[] salary) { // сортирует массив salary.

        Arrays.sort(salary);

    }

    public static void main(String[] args) {
        double[] salary = new double[12];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 12; i++) {
        salary[i] = sc.nextDouble();
         //   salary[i] = (int) (Math.random() * 88) + 10; // [10;99] (max - min + 1) + min
        }

        System.out.println("1. Исходные зарплаты= " + Arrays.toString(salary));
       /* for (double item : salary) {
            System.out.println(item);
        }*/

        System.out.println("2. Сумма зарплат= " + sum(salary));

        double [] s20 =add(salary,20);

        System.out.println("3. заплаты с надбавкой 20%= " + Arrays.toString(s20));
        System.out.println("4. Сумма зарплат +20%= " + sum(s20));

        double [] s50 =add(salary,50);
        sort(s50);

        System.out.println("5. Отсортированные заплаты с надбавкой 20%= " + Arrays.toString(s50));
        System.out.println("6. Сумма зарплат +50%= " + sum(s50));
    }

}

package by.it.sc04_evening_tue_thu.rumiantsau.lesson13;

import java.lang.reflect.Array;
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
    static double sum(double[] salary){
        double sum = 0;
        for(int i = 0; i < salary.length; i++){
            sum = sum + salary[i];
        }
        return sum;
    }

    static double[] add(double[] salary, double percent) {
        double[] salaryPlus = new double[salary.length];
        for(int i = 0; i < salaryPlus.length; i++){
            salaryPlus[i] = salary[i] * (100 + percent) / 100;
        }
        return salaryPlus;
    }

    static void sort(double[] salary) {
        Arrays.sort(salary);
    }

    public static void main(String[] args){
        double[] salaries = new double[12];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < salaries.length; i++){
            salaries[i] = sc.nextDouble();
        }

        System.out.println(Arrays.toString(salaries));
        System.out.println(sum(salaries));

        System.out.println(Arrays.toString(add(salaries, 20)));
        System.out.println(sum(add(salaries, 20)));

        sort(salaries);
        salaries = add(salaries, 50);
        System.out.println(Arrays.toString(salaries));
        System.out.println(sum(salaries));
    }
}

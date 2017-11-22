package by.it.sc02_morning.kurgan.lesson13;

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

    private static double sum(double[] salary){
        double sum=0;
        for (double s : salary) {
            sum=sum+s;
        }
        return sum;
    }
    private static double[] add(double[] salary, double percent) {
        double [] result=new double [salary.length];
        for (int i = 0; i < salary.length; i++) {
            result [i]=salary[i]+salary[i]*(percent/100);
        }
        return result;

    }
    static void sort(double[] salary) {
        Arrays.sort(salary);
    }

    public static void main(String[] args) {
        double [] salary = new double[12];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i <salary.length ; i++) {
            salary [i]=sc.nextDouble();
        }
        System.out.println(Arrays.toString(salary)); // 1
        System.out.println(sum(salary)); // 2
        System.out.println(Arrays.toString((add(salary, 20)))); // 3
        double [] mas=add(salary,20);
        System.out.println(sum(mas)); // 4
        mas=add(salary, 50);
        Arrays.sort(mas);
        System.out.println(Arrays.toString(mas));
        System.out.println(sum(mas));
    }

}

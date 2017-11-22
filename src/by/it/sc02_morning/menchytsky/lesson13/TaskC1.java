package by.it.sc02_morning.menchytsky.lesson13;
/*
Свой поиск и вывод.

Повторите решение задачи B не используя класс Arrays (!!!!) и его методы.
Также добавьте в класс Salary два дополнительных консруктора которые принимают
1) массив String[]
2) произвольное количество чисел типа double (не массив)
*/

import java.util.Arrays;
import java.util.Scanner;

public class TaskC1 {
    public static void main(String[] args) {

        double[] salaryNew = new double[12];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < salaryNew.length ; i++) {
            salaryNew[i] = scanner.nextDouble();
        }
        Salary salary1 = new Salary(salaryNew);

        //1500 700 800 700 800 900 1000 800 1000 1250 1200 700

        System.out.println("неотсортированные зарплаты без надбавок = " + salary1.toString(salary1.getSalary()));
        System.out.println("сумму без надбавок. " + salary1.getSum());

        System.out.println("неотсортированные зарплаты с надбавкой в 20% = " + salary1.toString(salary1.getSalary(20)));
        System.out.println("сумму с этой надбавкой. " + salary1.getSum(20));

        salary1.QuickSort(salaryNew);
        //salary1.sort();
        System.out.println("отсортированные зарплаты с надбавкой в 50% = " + salary1.toString(salary1.getSalary(50)));
        System.out.println("сумму с этой надбавкой. " + salary1.getSum(50));
}

}

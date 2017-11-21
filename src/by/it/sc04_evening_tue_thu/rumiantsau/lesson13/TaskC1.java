package by.it.sc04_evening_tue_thu.rumiantsau.lesson13;
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

    public static void printArray(double[] arr) {
        for(int i = 0; i < arr.length; i++) {
            if (i == 0) {
                System.out.print("[");
            }
            if (i == arr.length - 1) {
                System.out.println(arr[i] + "]");
                break;
            }
            System.out.print(arr[i] + ", ");
        }
    }

    public static void main(String[] args) {
        double[] salaries = new double[12];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < salaries.length; i++){
            salaries[i] = sc.nextDouble();
        }

        Salary s = new Salary(salaries);

        System.out.println(s);
        System.out.println(s.getSum());

        double[] tmp;

        tmp = s.getSalary(20);
        printArray(tmp);
        System.out.println(s.getSum(20));

        s.privateSort();
        tmp = s.getSalary(50);
        printArray(tmp);
        System.out.println(s.getSum(50));
    }
}

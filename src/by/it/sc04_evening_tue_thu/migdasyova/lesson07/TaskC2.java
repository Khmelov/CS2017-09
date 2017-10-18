package by.it.sc04_evening_tue_thu.migdasyova.lesson07;

/* Задачка на сортировку
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/

import java.util.Scanner;

public class TaskC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[20];

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        sort(array);

        for (int i = 0; i < array.length; i++) {
            int k = array.length - i - 1;
            System.out.println(array[k]);
        }
    }

    public static void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = array.length - 1; j >= i; j--) {
                if (array[j] < array[j - 1]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }
}

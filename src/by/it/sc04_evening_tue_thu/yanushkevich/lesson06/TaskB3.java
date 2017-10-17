package by.it.sc04_evening_tue_thu.yanushkevich.lesson06;

/*
Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N, которое должно быть больше 0
2. потом вводит N чисел с консоли типа int
3. выводит на экран максимальное, минимальное и среднее арифметическое из введенных N чисел.


Требования:
1. Программа должна считывать числа с клавиатуры.
2. Программа должна выводить строку "Minimum = " минимальное число в формате int.
3. Программа должна выводить строку "Maximum = " максимальное число в формате int.
4. Программа должна выводить строку "Average = " среднее арифметическое в формате double.
 */

import java.util.Scanner;


public class TaskB3 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int min = 0;
        int max = 0;
        int sum = 0;
        double avg = 0;

        for (int i = 0; i < N; i++) {
            int input = sc.nextInt();
            if (i == 0) {
                min = input;
                max = input;
            }

            sum = sum + input;

            min = min(min, input);
            max = max(max, input);
        }
        avg = (double) sum / N;

        System.out.println("Minimum = " + min);
        System.out.println("Maximum = " + max);
        System.out.println("Average = " + avg);
    }

    private static int min(int a, int b) {
        return (a < b) ? a : b;
    }

    private static int max(int a, int b) {
        return (a < b) ? b : a;
    }
}

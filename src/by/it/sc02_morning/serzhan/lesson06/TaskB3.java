package by.it.sc02_morning.serzhan.lesson06;

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


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TaskB3 {
    public static void main(String[] args) {
        int min = 0, max = 0;
        double avg = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0;i < n;i++) {
            int m = sc.nextInt();
            if (i==0) {
                min = m;
                max = m;
                avg = m;
            }
            else {
                if (m < min) min = m;
                if (m > max) max = m;
                avg = avg + m;
            }
        }
        System.out.println("Minimum = " + min);
        System.out.println("Maximum = " + max);
        System.out.println("Average = " + avg/n);
    }
}



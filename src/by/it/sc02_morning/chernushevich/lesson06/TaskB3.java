package by.it.sc02_morning.chernushevich.lesson06;

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


import javafx.beans.binding.IntegerBinding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import static java.util.Collections.*;

public class TaskB3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double aver;
        double s = 0;
        int n = sc.nextInt();

        ArrayList<Integer> list = new ArrayList();
        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            list.add(k);
            s = s + k;

            System.out.println("Minimum = " + min(list));
            System.out.println("Maximum = " + max(list));
            System.out.println("Average = " + (double) s / n);
        }
    }
}
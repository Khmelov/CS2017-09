package by.it.sc04_evening_tue_thu.zhyravski.lesson06;

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
import java.io.IOException;
import java.io.InputStreamReader;

public class TaskB3 {

    public static void main(String[] args) throws IOException {

        int min;
        int max;
        int sum = 0;
        double avr;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(reader.readLine());

        int[] numbers = new int[N];

        for (int i = 0; i < N; i++) {

            numbers[i] = Integer.parseInt(reader.readLine());

        }

        min = numbers[0];

        for (int curNum : numbers) {

            if (curNum < min) {

                min = curNum;

            }

        }

        max = numbers[0];

        for (int curNum : numbers) {

            if (curNum > max) {

                max = curNum;

            }

        }

        for (int i = 0; i < N; i++) {

            sum += numbers[i];

        }

        avr = (double) sum / (double) N;

        System.out.println("Minimum = " + min);
        System.out.println("Maximum = " + max);
        System.out.println("Average = " + avr);

    }

}

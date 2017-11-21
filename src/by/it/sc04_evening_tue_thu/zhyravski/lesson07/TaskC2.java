package by.it.sc04_evening_tue_thu.zhyravski.lesson07;

/* Задачка на сортировку
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaskC2 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] arrNums = new int[20];

        for (int i = 0; i < arrNums.length; i++) {

            arrNums[i] = Integer.parseInt(reader.readLine());

        }

        sort(arrNums);

        for (int i = 0; i < arrNums.length; i++) {

            System.out.println(arrNums[i]);

        }

    }





    public static void sort(int[] array) {

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length - 1; j++) {

                int tmp = 0;

                if (array[j] < array[j + 1]) {
                    tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }

            }

        }

    }

}

package by.it.sc04_evening_tue_thu.motuz.lesson07;

/* Массив из чисел в обратном порядке
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 целых чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.

Например, для такого ввода
1 2 3 4 5 6 7 8 9 0

вывод ожидается такой
0
9
8
7
6
5
4
3
2
1

*/


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TaskA1 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int x = 0; x < arr.length; x++) {
        }
        for (int x = 0; x < arr.length / 2; x++) {
            int tmp = arr[x];
            arr[x] = arr[arr.length - x - 1];
            arr[arr.length - x - 1] = tmp;
        }
        for (int x = 0; x < arr.length; x++) {
            System.out.println(arr[x]);
        }
    }
}

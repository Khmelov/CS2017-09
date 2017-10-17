package by.it.sc04_evening_tue_thu.yanushkevich.lesson06;
/*
Рисуем долларовый прямоугольник
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник высотой m и шириной n из знаков $.

Пример: m=2, n=4
$$$$
$$$$

Требования:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна выводить числа на экран.
3. Программа должна выводить прямоугольник размером m на n из знаков $.
4. В программе должен использоваться цикл for.

 */

import java.util.Scanner;

public class TaskA2 {
    public static void main(String[] args) {
      // System.out.println("Введите два числа:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("$");
            }
            System.out.println();

            //if (i != a - 1) System.out.println(); //перевод каждой строки кроме последней

            // если нужно пробелы между символами
            //  $ $ $
            //  $ $ $

            /*  for (int i = 0; i < a; i++) {
            for (int j = 0; j < b - 1; j++) {
                System.out.print("$ ");
            }
            System.out.print("$"); //последний символ в строке
            if (i != a - 1) System.out.println(); //перевод каждой строки кроме последней*/
        }

    }

}


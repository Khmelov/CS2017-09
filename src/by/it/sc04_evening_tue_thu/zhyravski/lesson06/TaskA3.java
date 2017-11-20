package by.it.sc04_evening_tue_thu.zhyravski.lesson06;
/*
Треугольник из $
Прочитать переменную size с клавиатуры

Используя цикл for вывести на экран
прямоугольный треугольник из букв алфавита (ENGLISH), начиная с буквы A со сторонами size * size.

Пример
Ввод: 10
Вывод:
A
AB
ABC
ABCD
ABCDE
ABCDEF
ABCDEFG
ABCDEFGH
ABCDEFGHI
ABCDEFGHIJ
*/

import java.util.Scanner;

public class TaskA3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        char letter = 'A';

        for (int i = 0; i < size; i++) {

            for (int j = 0; j <= i; j++) {

                System.out.print((char)(letter + j));

            }

            System.out.println();

        }

    }

}

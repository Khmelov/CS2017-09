package by.it.sc04_evening_tue_thu.yanushkevich.lesson06;
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

        String[] alfabet = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        //
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(alfabet[j]);
            }
            System.out.println();

        }
    }

}

package by.it.sc02_morning.karenda.lesson06;
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
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        for (int a = 1; a <= size; a++) {
            char res ='A';
                    for ( int b = 1; b <=a; b++)
            System.out.print(res++);
            System.out.println();
        }
    }

}

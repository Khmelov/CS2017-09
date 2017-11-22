package by.it.sc02_morning.serzhan.lesson06;
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

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TaskA3 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(reader.readLine());
        int c;
        char i;
        char q = 'A';

        for (c = 1; c <= size; c++) {
            for (i = 'A'; i <= q; i++) {
                System.out.print(i);
            }
            System.out.println();
            q++;
        }
    }
}





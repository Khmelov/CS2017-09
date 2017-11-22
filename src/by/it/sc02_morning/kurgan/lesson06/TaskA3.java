package by.it.sc02_morning.kurgan.lesson06;
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
        Scanner sc=new Scanner(System.in);
        int size;
        size=sc.nextInt();
        for (int i = 1; i <=size ; i++) {
            char a='A';
            for (int j = 1; j <=i ; j++) {
                System.out.print(a++);
            }
            System.out.println();
        }
    }}
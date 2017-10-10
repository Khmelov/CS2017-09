package by.it.sc04_evening_tue_thu.Tovstik.lesson04;

/*
Lesson 04. Task A1. Калькулятор.
Напишите программу, которая считывает с клавиатуры два целых числа a и b
после этого выводит через пробел:

сумму, разность, произведение, частное и остаток от деления
этих чисел двух чисел (результат выводится как тип int).

после этого еще раз выводит через пробел
сумму, разность, произведение, частное и остаток от деления
этих чисел двух чисел (но результат выводится как тип double).

Для считывания данных с клавиатуры используйте метод nextInt() объекта класса Scanner.
Создать Scanner можно так:
Scanner sc=new Scanner(System.in);

Требования:
1. В программе необходимо создать объект типа Scanner.
2. Программа должна считывать два числа типа int с клавиатуры.
3. Программа должна дважды выводить в строку пять чисел через пробел.
4. Программа должна выводить int сумму, разность, произведение, частное и отстаток от деления этих чисел двух чисел.
4. Программа должна выводить double сумму, разность, произведение, частное и отстаток от деления этих чисел двух чисел.

Пример:

Ввод:
7 2
Вывод:
9 5 14 3 1
9.0 5.0 14.0 3.5 1.0

 */
import java.util.Scanner;

class TaskA1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int isum = a + b;
        int iraz = a - b;
        int iumn = a * b;
        int idel = a / b;
        int irem = a % b;

        double dsum = (double) a + b;
        double draz = (double) a - b;
        double dumn = (double) a * b;
        double ddel = (double) a / b;
        double drem = (double) a % b;


        System.out.println(isum + " " + iraz + " " + iumn + " " + idel + " " + irem);

        System.out.println(dsum + " " + draz + " " + dumn + " " + ddel + " " + drem);

    }

}

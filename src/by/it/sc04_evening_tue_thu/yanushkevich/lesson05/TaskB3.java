package by.it.sc04_evening_tue_thu.yanushkevich.lesson05;


/*
С клавиатуры вводится некоторое число.
Пусть считается сумма int sum=1+2+3+4+5+... и т.д.
Каждая цифра суммы выводится в консоль через запятую (без пробела).
Остановите вывод до того, как сумма превысит введенное число.
Например:
Ввод:
122
Вывод:
1,3,6,10,15,21,28,36,45,55,66,78,91,105,120,
Ввод:
15
Вывод:
1,3,6,10,15,
Ввод:
14
Вывод:
1,3,6,10,
 */

import java.util.Scanner;

public class TaskB3 {

    public static void main(String[] args) {
        System.out.println("Ведите число. Будет считаться сумма натуральных чисел");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        int sum = 0;

        while (i <= n) {
            if (sum > n) {
                break;
            }
            i++;
            if (sum != 0) {
                System.out.print(sum + ",");
            }
            sum += i;

        }

    }
}

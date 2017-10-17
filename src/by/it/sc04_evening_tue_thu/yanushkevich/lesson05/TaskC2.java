package by.it.sc04_evening_tue_thu.yanushkevich.lesson05;

import java.util.Scanner;

/*
На входе вводится число и месяц 2017 года.
Программа должна выводить номер дня года, считая 1 января первым днем,
а 31 декабря 365-м.
Пример:
Ввод:
1 1
Вывод
1
Ввод:
31 12
Вывод
365
Ввод:
13 9
Вывод
256
 */
public class TaskC2 {
    public static void main(String[] args) {

        int[] year2017 = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        int sum = 0;
        System.out.print("Введите число и месяц через пробел?\nБудет подсчитан номер дня в 2017 году\n");
        Scanner sc = new Scanner(System.in);
        int dat = sc.nextInt();
        int mon = sc.nextInt();

        for (int i = 0; i < mon-1; i++)
            sum=sum+year2017[i];
        System.out.println(sum+dat);

    }
}


package by.it.sc04_evening_tue_thu.zhyravski.lesson05;

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

        Scanner scanner = new Scanner(System.in);

        int day = scanner.nextInt();
        int month = scanner.nextInt();

        int[] daysOfMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int numOfDays = day;

        for (int i = 0; i < (month - 1); i++) {
            numOfDays += daysOfMonths[i];
        }

        System.out.println(numOfDays);

    }

}

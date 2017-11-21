package by.it.sc02_morning.chernushevich.lesson05;

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
        Scanner sc=new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        switch (y){
            case 1:
                int day1 = 0;
                System.out.println(day1+x);
                break;
            case 2:
                int day2 = 31;
                System.out.println(day2+x);
                break;
            case 3:
                int day3 = 59;
                System.out.println(day3+x);
                break;
            case 4:
                int day4 = 90;
                System.out.println(day4+x);
                break;
            case 5:
                int day5 = 120;
                System.out.println(day5+x);
                break;
            case 6:
                int day6 = 151;
                System.out.println(day6+x);
                break;
            case 7:
                int day7 = 181;
                System.out.println(day7+x);
                break;
            case 8:
                int day8 = 212;
                System.out.println(day8+x);
                break;
            case 9:
                int day9 = 243;
                System.out.println(day9+x);
                break;
            case 10:
                int day10 = 273;
                System.out.println(day10+x);
                break;
            case 11:
                int day11 = 304;
                System.out.println(day11+x);
                break;
            case 12:
                int day12 = 334;
                System.out.println(day12+x);
                break;

        }
    }

}
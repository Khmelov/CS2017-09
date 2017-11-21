package by.it.sc02_morning.chernushevich.lesson03;

import java.util.Scanner;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и 4 раза выводит их сумму с обозначением системы счисления на экран в
ДЕСЯТИЧНОМ ДВОИЧНОМ ШЕСТНАДЦАТИРИЧНОМ ВОСЬМИРИЧНОМ виде

Ввод:
34 26

Вывод:
DEC:34+26=60
BIN:100010+11010=111100
HEX:22+1a=3c
OKT:42+32=74
*/
class TaskC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        System.out.printf("DEC:%d+%d=%d%n",i,j,(i+j));
        String a = Integer.toBinaryString(i);
        String b = Integer.toBinaryString(j);
        String s = Integer.toBinaryString(i+j);
        System.out.printf("BIN:%s+%s=%s%n",Integer.toBinaryString(i),Integer.toBinaryString(j),Integer.toBinaryString(i+j));
        System.out.printf("HEX:%x+%x=%x%n",i,j,i+j);
        System.out.printf("OKT:%o+%o=%o%n",i,j,i+j);
    }
}
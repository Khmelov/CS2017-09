package by.it.sc03_evening_mon_fri.tutina.lesson03;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и выводит их сумму на экран в виде

Ввод:
34 26

Вывод:
Sum = 26
*/
import java.util.Scanner;
class TaskC1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int i=sc.nextInt();
        int j=sc.nextInt();
        int k=i+j;
        System.out.println("Sum = "+k);

    }


}

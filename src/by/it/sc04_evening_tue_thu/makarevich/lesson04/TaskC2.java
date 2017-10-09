package by.it.sc04_evening_tue_thu.makarevich.lesson04;
/*
    Сумма цифр четырехзначного числа

    Реализуйте метод sumDigitsInNumber(int number).
    Метод на вход принимает целое четырехзначное число.
    Нужно посчитать сумму цифр этого числа, и вернуть эту сумму.

    Пример:
    Метод sumDigitsInNumber вызывается с параметром 5467.

    Пример вывода:
    22

    Требования:
    1. В методе sumDigitsInNumber не могут быть использованы никакие дополнительные классы.
    2. Метод sumDigitsInNumber(int) должен быть не приватным и статическим.
    3. Метод sumDigitsInNumber должен возвращать значение типа int.
    4. Метод sumDigitsInNumber не должен ничего выводить на экран.
    5. Метод sumDigitsInNumber должен правильно возвращать сумму всех цифр в числе number.
*/

import java.util.Scanner;

public class TaskC2 {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
                 int i=sc.nextInt();
         int sum=sumDigitsInNumber(i);
        System.out.println(+sum);
    }
    public static int sumDigitsInNumber(int i) {
        int t=i/1000;
        int h=(i-t*1000)/100;
        int d=(i-t*1000-h*100)/10;
        int e=(i-t*1000-h*100-d*10);
        int sum1=t+h+d+e;
        return sum1;
    }




    }





//    public static void main(String[] args) {
//        System.out.println(sumDigitsInNumber(5467));
//    }


package by.it.sc04_evening_tue_thu.makarevich.lesson13;
/*
Свой поиск и вывод.

Повторите решение задачи B не используя класс Arrays (!!!!) и его методы.
Также добавьте в класс Salary два дополнительных консруктора которые принимают
1) массив String[]
2) произвольное количество чисел типа double (не массив)
*/

import java.util.Scanner;

public class TaskC1 {
    public static void main(String[] args) {
        double [] m=new double[12];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i <m.length ; i++) {
            m [i]=sc.nextDouble();
        }

        Salary salary = new Salary(m);
        salary.getSalary();
        System.out.println(); // перевод строки
        System.out.println(salary.getSum());

        Salary salary20=new Salary(m);
        salary20.setSalary(20);
        salary20.getSalary();
        System.out.println(); // перевод строки

        System.out.println(salary.getSum(20));

        salary.setSalary(50);
        salary.sortWithoutArrays();
        salary.getSalary();
        System.out.println(); // перевод строки
        System.out.println(salary.getSum());
    }

}

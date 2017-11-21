package by.it.sc04_evening_tue_thu.gimzhevsky.lesson13;
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
        double[] salary = new double[12];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < salary.length; i++)
            salary[i] = sc.nextDouble();
        //String s[] = new String[]{"12","11","10","9","8","7","6","5","4","3","2","1"};
       /* double d1 = 1.0;
        double d2 = 2.0;
        double d3 = 3.0;*/
        Salary s1 = new Salary(salary);
        System.out.println(s1.toString());
        System.out.println(s1.getSum());
        Salary s2 = new Salary(salary);
        s2.setSalary(20);
        System.out.println(s2.toString());
        System.out.println(s2.getSum());
        Salary s3 = new Salary(salary);
        s3.setSalary(50);
        s3.sort();
        System.out.println(s3.toString());
        System.out.println(s3.getSum());
    }
}

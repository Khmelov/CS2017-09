package by.it.sc02_morning.patsko.lesson13;
/*
Свой поиск и вывод.

Повторите решение задачи B не используя класс Arrays (!!!!) и его методы.
Также добавьте в класс Salary два дополнительных консруктора которые принимают
1) массив String[]
2) произвольное количество чисел типа double (не массив)
*/

import java.util.Locale;
import java.util.Scanner;

public class TaskC1 {
    public static void main(String[] args) {
        double[] salary=new double[12];
        Scanner scan=new Scanner(System.in);
        for (int i = 0; i < salary.length; i++) {
            salary[i]=scan.nextDouble();
        }
        Salary s = new Salary(salary);

        System.out.println(s);
        System.out.println(s.getSum());
        System.out.println(s.doubleArrayToString(s.getSalary(20)));
        System.out.printf(Locale.ENGLISH,"%.1f\n",s.getSum(20));
        s.sort();
        s.setSalary(50);
        System.out.println(s);
        System.out.println(s.getSum());
    }

}

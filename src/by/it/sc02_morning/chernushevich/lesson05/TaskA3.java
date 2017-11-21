package by.it.sc02_morning.chernushevich.lesson05;
/*
Существует ли пара?
Ввести с клавиатуры три целых числа.
Определить, имеется ли среди них хотя бы одна пара равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел.
Если все три числа равны между собой, то вывести все три.

Требования:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна содержать System.out.println() или System.out.print()
3. Если два числа равны между собой, необходимо вывести числа на экран.
4. Если все три числа равны между собой, необходимо вывести все три.
5. Если нет равных чисел, ничего не выводить.

Пример для чисел 1 2 2:
2 2

Пример для чисел 2 2 2:
2 2 2

 */

import java.util.Scanner;

public class TaskA3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        int j=sc.nextInt();
        int k=sc.nextInt();
        if ((i==j)&&(i==k))
            System.out.println(i+" "+j+" "+k);
        else if (i==j)
            System.out.println(i+" "+j);
        else if (i==k)
            System.out.println(i+" "+k);
        else if (j==k)
            System.out.println(j+" "+k);
    }

}

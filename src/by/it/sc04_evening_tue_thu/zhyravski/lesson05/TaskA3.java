package by.it.sc04_evening_tue_thu.zhyravski.lesson05;
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

        Scanner scanner = new Scanner(System.in);

        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();

        if (first == second) {

            if (first == third) {
                System.out.println(first + " " + second + " " + third);
            } else {
                System.out.println(first + " " + second);
            }

        } else if (first == third) {

            System.out.println(first + " " + third);

        } else if (second == third) {

            System.out.println(second + " " + third);

        } else {



        }

    }

}

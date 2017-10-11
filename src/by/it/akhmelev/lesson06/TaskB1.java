package by.it.akhmelev.lesson06;

import java.util.Scanner;

/*
Суммирование
Вводить с клавиатуры числа и считать их сумму.
Если пользователь ввел -1, вывести на экран сумму и завершить программу.
-1 должно тоже учитываться в сумме.


Требования:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна выводить число на экран.
3. Программа должна посчитать сумму введенных чисел.
Если пользователь ввел -1, вывести на экран сумму и завершить программу.
4. В программе должен использоваться цикл for или цикл while.
*/
public class TaskB1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int sum=0;
        do {
            int i = scanner.nextInt();
            sum+=i;
            if (i==-1) break;
        } while (true);
        System.out.println("Minimum = "+sum);
    }


}
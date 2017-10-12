package by.it.sc04_evening_tue_thu.makarevich.lesson05;

/*
Напишите программу которая спрашивает у пользователя:
Какую вы хотите зарплату в $$$?

После ввода суммы, программа анализирует полученное значение
и если введенная цифра меньше 300 или больше 3000 программа выводит на экран:
Мы вам перезвоним!

Иначе выводит в цикле по переменной int month от 0 до 14 рассчитанную зарплату.
В летние месяцы - выводится введенная сумма с названием месяца.
В несуществующие месяцы 0, 13 и 14 выводится сумма в $0.0
в остальные месяцы выводится указанная сумма с премией в 50%.

Сделайте так, чтобы в тот месяц, когда получилась зарплата в $666 цикл после вывода прерывался.

Пример работы программы (у вас должно быть так же, до символа):

Какую вы хотите зарплату в $$$?
2000
За месяц 0 начислено $0.0
За январь начислено $3000.0
За февраль начислено $3000.0
За март начислено $3000.0
За апрель начислено $3000.0
За май начислено $3000.0
За июнь начислено $2000.0
За июль начислено $2000.0
За август начислено $2000.0
За сентябрь начислено $3000.0
За октябрь начислено $3000.0
За ноябрь начислено $3000.0
За декабрь начислено $3000.0
За месяц 13 начислено $0.0
За месяц 14 начислено $0.0

*/
import java.util.Scanner;

public class TaskC1 {
    public static void main(String[] args) {
        System.out.println("Какую вы хотите зарплату в $$$?");
         Scanner sc=new Scanner(System.in);
                 int i=sc.nextInt();
                 double a = i/2 +i;
                 if (i<300 || i>3000) System.out.println("Мы вам перезвоним!");
                 else
                     done:
                             for (int month = 0; month <=14 ; month++) {
                                 switch (month) {
                                     case 0:
                                         System.out.println("За месяц" + " " + month + " начислено $0.0");
                                         break;
                                     case 1:
                                         System.out.println("За январь начислено $" + a);
                                         if (a==666.0) break done;
                                         break;
                                     case 2:
                                         System.out.println("За февраль начислено $" + a);
                                         if (a==666.0) break done;
                                         break;
                                     case 3:
                                         System.out.println("За март начислено $" + a);
                                         if (a==666.0) break done;
                                         break;
                                     case 4:
                                         System.out.println("За апрель начислено $" + a);
                                         if (a==666.0) break done;
                                         break;
                                     case 5:
                                         System.out.println("За май начислено $" + a);
                                         if (a==666.0) break done;
                                         break;
                                     case 6:
                                         System.out.println("За июнь начислено $" + (double) i);
                                         if (a==666.0) break done;
                                         else if (a!=666.0 && (double)i==666.0) break done;
                                         break;
                                     case 7:
                                         System.out.println("За июль начислено $" + (double) i);
                                         if (a==666.0) break done;
                                         else if (a!=666.0 && (double)i==666.0) break done;
                                         break;
                                     case 8:
                                         System.out.println("За август начислено $" + (double) i);
                                         if (a==666.0) break done;
                                         else if (a!=666.0 && (double)i==666.0) break done;
                                         break;
                                     case 9:
                                         System.out.println("За сентябрь начислено $" + a);
                                         if (a==666.0) break done;
                                         break;
                                     case 10:
                                         System.out.println("За октябрь начислено $" + a);
                                         if (a==666.0) break done;
                                         break;
                                     case 11:
                                         System.out.println("За ноябрь начислено $" + a);
                                         if (a==666.0) break done;
                                         break;
                                     case 12:
                                         System.out.println("За декабрь начислено $" + a);
                                         if (a==666.0) break done;
                                         break;
                                     case 13:
                                         System.out.println("За месяц" + " " + month + " начислено $0.0");
                                         break;
                                     case 14:
                                         System.out.println("За месяц" + " " + month + " начислено $0.0");
                                         break;
                                 }
                             }
                     }

    }



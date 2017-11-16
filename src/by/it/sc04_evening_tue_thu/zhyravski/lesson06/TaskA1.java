package by.it.sc04_evening_tue_thu.zhyravski.lesson06;
/*
Вывести на экран квадрат из 10х10 символов $.
После каждого символа нужно ставить пробел.
Нужно использовать всего ОДИН цикл while.
Разрешается использовать также опреатор if.
Буквы в каждой строке не разделять.

Пример вывода на экран:
$ $ $ $ $ $ $ $ $ $
$ $ $ $ $ $ $ $ $ $
$ $ $ $ $ $ $ $ $ $
$ $ $ $ $ $ $ $ $ $
$ $ $ $ $ $ $ $ $ $
$ $ $ $ $ $ $ $ $ $
$ $ $ $ $ $ $ $ $ $
$ $ $ $ $ $ $ $ $ $
$ $ $ $ $ $ $ $ $ $
$ $ $ $ $ $ $ $ $ $

*/

public class TaskA1 {

    public static void main(String[] args) {

        int size = 10;

        int row = 0;

        while (size > 0) {

            System.out.print("$ ");

            size--;

            if (size == 0) {

                size = 10;

                row++;

                System.out.println();

            }

            if (row == 10) {

                break;

            }

        }

    }

}

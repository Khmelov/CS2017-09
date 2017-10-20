package by.it.sc04_evening_tue_thu.rumiantsau.lesson07;

/*
Создайте список строк.
Вводите строки с клавиатуры, пока пользователь не введет слово END.
Каждую введенную строку, кроме слова END добавьте в список типа ArrayList.

Напечатайте список, не используйте для этого цикл.
Список - это объект. Его можно просто напечатать, как переменную.

Для вот такого ввода:
ONE
TWO
THREE
FOUR
FIVE
END
Ожидается такой вывод:
[ONE, TWO, THREE, FOUR, FIVE]

*/
import java.util.ArrayList;
import java.util.Scanner;

public class TaskA2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<String>();
        String tpInputString;

        while (true){
            tpInputString = sc.next();

            if (tpInputString.equals("END")) break;

            list.add(tpInputString);
        }

        System.out.println(list.toString());
    }
}
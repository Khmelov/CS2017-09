package by.it.sc02_morning.chernushevich.lesson07;
/*
Создайте 5 различных строчек в списке
1. Создайте список строк.
2. Добавьте в него 5 различных строчек.
3. Выведите его размер на экран.
4. Используя цикл выведите его содержимое на экран, каждое значение с новой строки.
*/


import java.util.ArrayList;

public class TaskB1 {
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>();
        str.add("Uno");
        str.add("Duo");
        str.add("Tri");
        str.add("4ty");
        str.add("Pyt");
        System.out.println(str.size());
        for (String value:str) {
            System.out.println(value);
        }
    }
}

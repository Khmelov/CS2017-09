package by.it.sc04_evening_tue_thu.zhyravski.lesson07;
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

        ArrayList<String> listOfStrings = new ArrayList<String>();

        listOfStrings.add("Hello, world!");
        listOfStrings.add("Hello, world!!");
        listOfStrings.add("Hello, world!!!");
        listOfStrings.add("Hello, world!!!!");
        listOfStrings.add("Hello, world!!!!!");

        System.out.println(listOfStrings.size());

        for (int i = 0; i < listOfStrings.size(); i++) {

            System.out.println(listOfStrings.get(i));

        }

    }

}

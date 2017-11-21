package by.it.sc02_morning.chernushevich.lesson07;
/*
Три массива
1.  Введите с клавиатуры 20 чисел, сохраните их в список и рассортируйте по трём другим спискам:
    Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
    Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2.  Статический метод void printList(List<Integer> list) должен выводить на экран
    все элементы переданного ему списка list, каждый элемент - с новой строки.
3.  Используя метод printList выведите ваши три списка на экран.
    Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskC1 {
    public static void main(String[] args) throws Exception
    {
        ArrayList<Integer> main_list=new ArrayList<>();
        ArrayList<Integer> list1=new ArrayList<>();     //элементы делятся на 3
        ArrayList<Integer> list2=new ArrayList<>();     //элементы делятся на 2
        ArrayList<Integer> list3=new ArrayList<>();     //остальные

        int x;
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < 20; i++) {
            x=sc.nextInt();
            main_list.add(x);
            //main_list.set(i,sc.nextInt());
        }
        for(int i = 0; i < main_list.size(); i++) {
            x=main_list.get(i);
            if(x%3==0){
                list1.add(x);
                if(x%2==0) list2.add(x);
            }
            else    if(x%2==0) list2.add(x);
            else list3.add(x);
        }
        printList(list1);
        printList(list2);
        printList(list3);
    }

    private static void printList(List<Integer> list) {
        for (Integer aList : list) System.out.println(aList);
    }
}
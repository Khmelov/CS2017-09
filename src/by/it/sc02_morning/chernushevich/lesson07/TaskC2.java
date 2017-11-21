package by.it.sc02_morning.chernushevich.lesson07;

/* Задачка на сортировку
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/

import java.util.Scanner;

public class TaskC2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        sort(arr);
        for (int x: arr) {
            System.out.println(x);
        }
    }

    private static void sort(int[] array) {
        int tmp;
        for (int i = 1; i < array.length; i++) {
            for (int j = array.length-1; j >= i; j--) {
                if(array[j-1]<array[j]){
                    tmp=array[j-1];
                    array[j-1]=array[j];
                    array[j]=tmp;
                }
            }
        }
    }
}

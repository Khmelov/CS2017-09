package by.it.sc04_evening_tue_thu.yanushkevich.lesson12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

/*
Первая строка содержит число 1<=n<=10000, вторая - n натуральных чисел, не превышающих 10.
Выведите упорядоченную по неубыванию последовательность этих чисел.

При сортировке реализуйте метод с вычислительной сложностью не более, чем O(n)
*/

public class B_CountSort {


    int[] countSort(InputStream stream) throws FileNotFoundException {
        //подготовка к чтению данных
        Scanner scanner = new Scanner(stream);
        //!!!!!!!!!!!!!!!!!!!!!!!!!     НАЧАЛО ЗАДАЧИ     !!!!!!!!!!!!!!!!!!!!!!!!!
        //размер массива
        int n = scanner.nextInt();
        int[] points=new int[n];

        //читаем точки
        for (int i = 0; i < n; i++) {
            points[i]=scanner.nextInt();
        }
        System.out.println("исходный массив=" + Arrays.toString(points));
        //тут реализуйте логику задачи с применением сортировки подсчетом

        //LK12 p46 СОРТИРОВКА ПОДСЧЕТОМ (просто, но эфективно на небольших массивах

        int[] mas = new int[10];    //M создаем вспомогательный заполненный нулями массив, размерность 10 - по значению максимально возможного числа
        for (int i = 0; i < points.length; i++) {
            mas[points[i]]++;       //M  увеличивам на единицу значение по индексу равному значению в исходном массиве
        }
        System.out.println("массив подсчета=" + Arrays.toString(mas));

        int[] result = new int[points.length]; //M будущий массив отсортированный
        int b = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 1; j <= mas[i]; j++) {
                result[b] = i;
                b++;
            }
        }

        return result;

      /*  красивая реализация с while
      int[] result = new int[n];
        int position = 0;
        for (int i = 0; i < mas.length; i++) {
            while(mas[i] > 0){
                result[position++] = i;
                mas[i]--;

            }
        }*/




        //!!!!!!!!!!!!!!!!!!!!!!!!!     КОНЕЦ ЗАДАЧИ     !!!!!!!!!!!!!!!!!!!!!!!!!
      //  return points;
    }


    public static void main(String[] args) throws FileNotFoundException {
        String root = System.getProperty("user.dir") + "/src/";
        InputStream stream = new FileInputStream(root + "by/it/akhmelev/lesson12/dataB.txt");
        B_CountSort instance = new B_CountSort();
        int[] result=instance.countSort(stream);
        for (int index:result){
            System.out.print(index+" ");
        }
    }

}

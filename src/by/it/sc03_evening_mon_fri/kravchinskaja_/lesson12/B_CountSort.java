package by.it.sc03_evening_mon_fri.kravchinskaja_.lesson12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
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
        int min =10000;
        int max = 0;
        for (int i = 0; i < n; i++) {
            points[i]=scanner.nextInt();
            if (points[i]>max) max=points[i];
            if (points[i]<min) min=points[i];
        }
        //тут реализуйте логику задачи с применением сортировки подсчетом
        int [] count =  new int [max-min+1];
        for (int i = 0; i< points.length; i++){
            count[points[i]-min]++;
        }
        int idx=0;
        for (int i = 0; i< count.length; i++){
            for (int j = 0; j<count[i]; j++){
                points[idx++]= i+min;
            }
        }
        //!!!!!!!!!!!!!!!!!!!!!!!!!     КОНЕЦ ЗАДАЧИ     !!!!!!!!!!!!!!!!!!!!!!!!!
        return points;
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

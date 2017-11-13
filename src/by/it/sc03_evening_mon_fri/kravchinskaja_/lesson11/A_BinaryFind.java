package by.it.sc03_evening_mon_fri.kravchinskaja_.lesson11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

/*
В первой строке источника данных даны:
        - целое число 1<=n<=100000 (размер массива)
        - сам массив A[1...n] из n различных натуральных чисел,
          не превышающих 10E9, в порядке возрастания,
Во второй строке
        - целое число 1<=k<=10000 (сколько чисел нужно найти)
        - k натуральных чисел b1,...,bk не превышающих 10E9 (сами числа)
Для каждого i от 1 до kk необходимо вывести индекс 1<=j<=n,
для которого A[j]=bi, или -1, если такого j нет.

        Sample Input:
        5 1 5 8 12 13
        5 8 1 23 1 11

        Sample Output:
        3 1 -1 1 -1

(!)
Обратите внимание на смещение начала индекса массивов JAVA относительно условий задачи
Т.е. в Java массивы адресуются начиная с 0, а в задаче начиная с 1.
Обязательно учтите этот момент в решении, тест проверяет индексы как в задаче.
*/

public class A_BinaryFind {
    int[] findIndex(InputStream stream) throws FileNotFoundException {
        //подготовка к чтению данных
        Scanner scanner = new Scanner(stream);
        //!!!!!!!!!!!!!!!!!!!!!!!!!     НАЧАЛО ЗАДАЧИ     !!!!!!!!!!!!!!!!!!!!!!!!!
        //размер отсортированного массива
        int n = scanner.nextInt();
        //сам отсортированный массива
        int[] a=new int[n];
        for (int i = 1; i <= n; i++) {
            a[i-1] = scanner.nextInt();
        }

        //размер массива индексов
        int k = scanner.nextInt();
        int[] result=new int[k];
        for (int i = 0; i < k; i++) {
            result[i]=-1;
            int value = scanner.nextInt();
            //тут реализуйте бинарный поиск индекса
            //для значения value в саммиве a
            //результат поиска сохраните в result[i]

            int leftIndex = 0;
            int rightIndex = a.length - 1;

            while (leftIndex < rightIndex) {

                int middleIndex = (leftIndex + rightIndex) / 2;

                if (a[middleIndex] == value) {

                    result[i] = middleIndex + 1;

                }
                if (a[leftIndex] == value) {

                    result[i] = leftIndex + 1;

                }
                if (a[rightIndex] == value) {

                    result[i] = rightIndex + 1;

                }

                if (value > a[middleIndex]) {

                    leftIndex = middleIndex + 1;

                } else {

                    rightIndex  = middleIndex - 1;

                }

            }





        }
        //!!!!!!!!!!!!!!!!!!!!!!!!!     КОНЕЦ ЗАДАЧИ     !!!!!!!!!!!!!!!!!!!!!!!!!
        return result;
    }


    public static void main(String[] args) throws FileNotFoundException {
        String root = System.getProperty("user.dir") + "/src/";
        InputStream stream = new FileInputStream(root + "by/it/akhmelev/lesson11/dataA.txt");
        A_BinaryFind instance = new A_BinaryFind();
        //long startTime = System.currentTimeMillis();
        int[] result=instance.findIndex(stream);
        //long finishTime = System.currentTimeMillis();
        for (int index:result){
            System.out.print(index+" ");
        }
    }

}


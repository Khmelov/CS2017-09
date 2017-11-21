package by.it.sc02_morning.opanovich.lesson12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.random;

/*
Это тот случай когда задача A будет довольно сложной.
Если вы не решите ее за предложенное время, на ближайшем занятии
мы обсудим верное решение. Оно довольно простое, но не очевидное.

Задача. Видеорегистраторы и площадь.

На площади установлены камеры.
Известны данные о том, когда каждая из них включалась и выключалась (отрезки работы)
Известен список событий на площади (время начала каждого события).
Вам необходимо определить для каждого события сколько камер его записали.

В первой строке задано два целых числа:
    число включений камер (отрезки) 1<=n<=50000
    число событий (точки) 1<=m<=50000.

Следующие n строк содержат по два целых числа ai и bi (ai<=bi) -
координаты концов отрезков (время работы одной какой-то камеры).
Последняя строка содержит m целых чисел - координаты точек (время начала каждого события).
Все координаты не превышают 10E8 по модулю (!).

Точка считается принадлежащей отрезку, если она находится внутри него или на границе.

Для каждой точки в порядке их появления во вводе выведите,
скольким отрезкам она принадлежит.
    Sample Input:
    2 3
    0 5
    7 10
    1 6 11
    Sample Output:
    1 0 0

Подсказки и проверка решения:
1) самый быстрый алгоритм имеет сложность O(n log n)
2) этот код имеет внутренний класс Segment, можно добавить другие по аналогии
3) заготовку программы придется довольно изрядно доработать
*/

public class A_QSort {

    //отрезок
    private class Segment implements Comparable<Segment>{
        int start;
        int stop;

        Segment(int start, int stop){

            if (start > stop) {
                this.start = stop;
                this.stop = start;
            } else {
                this.start = start;
                this.stop = stop;
            }
        }

        @Override
        public int compareTo(Segment otherSegment) {
            //подумайте, что должен возвращать компаратор отрезков
            //и нужен ли он вообще.
            if (start == otherSegment.start) {
                return 0;
            } else if (start > otherSegment.start) {
                return 1;
            } else {
                return -1;
            }
        }

        @Override
        public String toString() {
            return "("+start +":" + stop +')';
        }
    }


    int[] getAccessory(InputStream stream) throws FileNotFoundException {
        //подготовка к чтению данных
        Scanner scanner = new Scanner(stream);
        //!!!!!!!!!!!!!!!!!!!!!!!!!     НАЧАЛО ЗАДАЧИ     !!!!!!!!!!!!!!!!!!!!!!!!!
        //число отрезков отсортированного массива
        int n = scanner.nextInt();
        Segment[] segments=new Segment[n];
        //число точек
        int m = scanner.nextInt();
        int[] points=new int[m];
        int[] result=new int[m];

        //читаем сами отрезки
        for (int i = 0; i < n; i++) {
            //читаем начало и конец каждого отрезка
            segments[i]=new Segment(scanner.nextInt(),scanner.nextInt());
        }
        System.out.println("segments="+ Arrays.toString(segments));
        //читаем точки
        for (int i = 0; i < m; i++) {
            points[i]=scanner.nextInt();
        }
        System.out.println("points="+ Arrays.toString(points));
        //тут реализуйте логику задачи
        //ОБЯЗАТЕЛЬНО с применением быстрой сортировки
        qSort(segments);

        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < segments.length && segments[j].start <= points[i]; j++) {
                if (points[i] <= segments[j].stop) {
                    result[i]++;
                }
            }
        }

        //!!!!!!!!!!!!!!!!!!!!!!!!!     КОНЕЦ ЗАДАЧИ     !!!!!!!!!!!!!!!!!!!!!!!!!
        return result;
    }

    private static void qSort(Object[] a) {
        qSort(a, 0, a.length - 1);
    }

    private static void qSort(Object[] a, int left, int right) {
        if (left >= right) {
            return;
        }
        int m = partition(a, left, right);
        qSort(a, left, m - 1);
        qSort(a, m + 1, right);
    }

    private static int partition(Object[] a, int left, int right) {

        swap(a, left, (int) (left + random() * (right - left + 1)));
        int i, j = left;
        for (i = left + 1; i <= right; i++) {
            if (((Comparable) a[left]).compareTo(a[i]) >= 0) {
                j++;
                swap(a, j, i);
            }
        }
        swap(a, left, j);
        return j;
    }

    private static void swap(Object[] a, int l, int r) {
        Object temp = a[l];
        a[l] = a[r];
        a[r] = temp;
    }

    public static void main(String[] args) throws FileNotFoundException {
        String root = System.getProperty("user.dir") + "/src/";
        InputStream stream = new FileInputStream(root + "by/it/sc02_morning/opanovich/lesson12/dataA.txt");
        A_QSort instance = new A_QSort();
        int[] result=instance.getAccessory(stream);
        System.out.println("result="+ Arrays.toString(result));
    }
}

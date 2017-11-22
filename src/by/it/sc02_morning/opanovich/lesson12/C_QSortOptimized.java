package by.it.sc02_morning.opanovich.lesson12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import static java.lang.Math.random;

/*
Видеорегистраторы и площадь 2.
Условие то же что и в задаче А.

        По сравнению с задачей A доработайте алгоритм так, чтобы
        1) он оптимально использовал время и память:
            - за стек отвечает элиминация хвостовой рекурсии,
            - за сам массив отрезков - сортировка на месте
            - рекурсионные вызовы должны проводится на основе 3-разбиения

        2) при поиске подходящих отрезков для точки реализуйте метод бинарного поиска,
        помните при реализации, что поиск множественный
        (т.е. отрезков, подходящих для точки, может быть много)

    Sample Input:
    2 3
    0 5
    7 10
    1 6 11
    Sample Output:
    1 0 0

*/


public class C_QSortOptimized {

    private static final int ON = 1;
    private static final int OFF = -1;

    public static void main(String[] args) throws FileNotFoundException {
        String root = System.getProperty("user.dir") + "/src/";
        InputStream stream = new FileInputStream(root + "by/it/sc02_morning/opanovich/lesson12/dataC.txt");
        C_QSortOptimized instance = new C_QSortOptimized();
        int[] result=instance.getAccessory2(stream);
        System.out.println("result="+ Arrays.toString(result));
    }

    class Event implements Comparable<Event> {
        int time;
        int numCam;

        Event(int time, int numCam) {
            this.time = time;
            this.numCam = numCam;
        }

        @Override
        public int compareTo(Event other) {
            if (this.time < other.time) {
                return -1;
            } if (this.time == other.time) {
                return 0;
            }
            return 1;
        }
    }

    private static void swap(Object a, Object b) {
        Object temp = a;
        a = b;
        b = temp;
    }

    private static void swap(ArrayList a, int l, int r) {
        Object temp = a.get(l);
        a.set(l, a.get(r));
        a.set(r, temp);
    }

    int[] getAccessory2(InputStream stream) throws FileNotFoundException {

        //подготовка к чтению данных
        Scanner scanner = new Scanner(stream);

        //число отрезков отсортированного массива
        int n = scanner.nextInt();
        ArrayList<Event> events = new ArrayList<>();

        //число точек
        int m = scanner.nextInt();
        int[] points=new int[m];
        int[] result=new int[m];

        //читаем сами отрезки
        for (int i = 0; i < n; i++) {
            int start = scanner.nextInt();
            int stop = scanner.nextInt();
            if (start > stop) {
                swap(start, stop);
            }
            events.add(new Event(start, ON));
            events.add(new Event(stop, OFF));
        }

        // make events in order and nums to number of cameras on
        events.add(new Event(Integer.MIN_VALUE, 0));
        events.add(new Event(Integer.MAX_VALUE, 0));

        qSort(events);

        for (int i = 1; i < events.size();) {
            if (events.get(i).time == events.get(i - 1).time) {
                events.get(i - 1).numCam += events.get(i).numCam;
                events.remove(i);
            } else {
                events.get(i).numCam += events.get(i - 1).numCam;
                i++;
            }
        }

        //читаем точки
        for (int i = 0; i < m; i++) {
            points[i]=scanner.nextInt();
        }
        System.out.println("points="+ Arrays.toString(points));

//      binary search
        for (int i = 0; i < m; i++) {   //for dots
            int j = binarySearch(events, points[i], 0, events.size() - 1);
                if (points[i] == events.get(j).time) {
                    result[i] = (events.get(j - 1).numCam < events.get(j).numCam) ? events.get(j).numCam : events.get(j - 1).numCam;
                } else {
                    result[i] = events.get(j - 1).numCam;
                }
        }

        return result;
    }

    public static int binarySearch(ArrayList<Event> list, int thisTime, int start, int end) {
        
        if (start + 1 == end) {
            return end;
        }
        int middle = start + (end - start) / 2;
        if (list.get(middle - 1).time < thisTime && thisTime <= list.get(middle).time) {
            return middle;
        } else if (thisTime < list.get(middle).time) {
            return binarySearch(list, thisTime, start, middle);
        } else {
            return binarySearch(list, thisTime, middle, end);
        }
    }

    private static void qSort(ArrayList a) {

        qSort(a, 0, a.size() - 1);
    }

    private static void qSort(ArrayList a, int lo, int hi) {

        int left, right;
        while (lo < hi) {
            int[] temp = partition(a, lo, hi);
            left = temp[0];
            right = temp[1];
            qSort(a, lo, left - 1);
            lo = right + 1;
        }
    }

    private static int[] partition(ArrayList<Event> a, int left, int right) {

        swap(a, left, (int) (left + random() * (right - left + 1)));
        int i, j;
        for (i = left + 1, j = i; j <= right;) {
            if (a.get(j).compareTo(a.get(left)) == -1) {
                swap(a, i++, j++);
            } else if (a.get(j).compareTo(a.get(left)) == 1) {
                swap(a, j, right--);
            } else {
                j++;
            }
        }
        swap(a, left, --i);
        return new int[]{i, right};
    }

}

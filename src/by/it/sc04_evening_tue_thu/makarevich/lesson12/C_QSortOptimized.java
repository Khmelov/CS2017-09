package by.it.sc04_evening_tue_thu.makarevich.lesson12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

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

    private class Event implements Comparable<Event>{
        int time;
        int type;

        public Event(int time, int type) {
            this.time=time;
            this.type=type;
        }
        @Override
        public int compareTo(Event otherEvent) {
            return 0;
            // продумать корпоратор
        }
        public String toString(){
            return "("+time+ ":" + type+")";
        }
    }

    //отрезок
    private class Segment  implements Comparable<Segment>{
        int start;
        int stop;

        public Segment(int start, int stop){
            this.start = start;
            this.stop = stop;
            //тут можно доделать конструктор на случай если
            //концы отрезков придут в обратном порядке
        }
        @Override
        public int compareTo(Segment otherSegment) {
            //подумайте, что должен возвращать компаратор отрезков
            //и нужен ли он вообще.
            return 0;
        }
        @Override
        public String toString() {
            return "("+start +":" + stop +')';
        }
    }

    private int partition(int[] a, int left, int right) {
        int x=a[left];
        int j=left;
        for (int i = left+1; i <=right ; i++) {
            if (a[i]<=x) {
                j++;
                int tmp=a[j];
                a[j]=a[i];
                a[i]=tmp;
            }
            int tpm =a[j];
            a[j]=a[left];
            a[left]=tpm;
        }

        return j;
    }
    private void qSort(int [ ] a, int left, int right) {
        while (left < right) {
            int m = partition(a, left, right);
            qSort(a, left, m - 1);
            left=m+1;
        }   //элиминация хвостовой рекурсии
    }


    int[] getAccessory2(InputStream stream) throws FileNotFoundException {
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
        Event[] events = new Event[2*n+m];
        int counterEvent=0;

        //читаем сами отрезки
        for (int i = 0; i < n; i++) {
            //читаем начало и конец каждого отрезка
            segments[i]=new Segment(scanner.nextInt(),scanner.nextInt());
            events[counterEvent++]=new Event(segments[i].start,+1);
            events[counterEvent++]=new Event(segments[i].stop,-1);
        }
        System.out.println("segments="+ Arrays.toString(segments));
        //читаем точки

        for (int i = 0; i < m; i++) {
            points[i]=scanner.nextInt();
            events[counterEvent++]=new Event(points[i],0);
        }
        System.out.println("points="+ Arrays.toString(points));

        System.out.println("events="+Arrays.toString(events));


        for (int i = 1; i <events.length ; i++) {
            for (int j = 1; j <=events.length-i; j++) {
                if (events[j].time<events[j-1].time){
                    Event tmp=events[j];
                    events[j]=events[j-1];
                    events[j-1]=tmp;
                }
            }
        }

        System.out.println("sorted events="+Arrays.toString(events));

        int p=0;
        int camOm=0;
        for (int i = 0; i < events.length; i++) {
            if (events[i].type==0) {
                result[p]=camOm;
                p++;
            }
            else camOm=camOm+events[i].type;

        }
        //тут реализуйте логику задачи с применением быстрой сортировки
        //в классе отрезка Segment реализуйте нужный для этой задачи компаратор


        //!!!!!!!!!!!!!!!!!!!!!!!!!     КОНЕЦ ЗАДАЧИ     !!!!!!!!!!!!!!!!!!!!!!!!!
        return result;
    }


    public static void main(String[] args) throws FileNotFoundException {
        String root = System.getProperty("user.dir") + "/src/";
        InputStream stream = new FileInputStream(root + "by/it/akhmelev/lesson12/dataC.txt");
        C_QSortOptimized instance = new C_QSortOptimized();
        int[] result=instance.getAccessory2(stream);
        System.out.println("result="+ Arrays.toString(result));
    }

}

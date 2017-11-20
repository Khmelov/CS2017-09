package by.it.sc02_morning.menchytsky.lesson13;

import java.util.Arrays;

public class Salary {
        private double[] salary;

        Salary(double[] s) {
            salary = s;
        }

        public double getSum() {
            double sum = 0;
            for (int i = 0; i < salary.length; i++) {
                sum = sum + salary[i];
            }
            return sum;
        }

        public double getSum( double percent){
            return getSum() * (100 + percent) / 100;
        }

        public double[] getSalary(){
            return salary;
        }

        public double[] getSalary(double percent){
            double[] addSalary = new double[salary.length];
            for (int i = 0; i < salary.length ; i++) {
                addSalary[i] = salary[i] * (100 + percent) / 100;
            }
            return addSalary;
        }

        void setSalary(double percent){
            for (int i = 0; i < salary.length; i++) {
                salary[i] = salary[i] * (100 + percent) / 100;
            }
        }

    void QuickSort(double[] a){
        QuickSort(a, 0, a.length-1);
    }

    void QuickSort(double[] a, int l, int r) {
        if (l >= r)
            return;
        int m = partition(a, l, r);
        QuickSort(a, l, m - 1);
        QuickSort(a, m + 1, r);
    }

    int partition(double[] a, int l, int r) {
        double x = a[l];
        int j = l;
        for (int i = l + 1; i <= r; i++) {
            if (a[i] <= x) {
                j = j + 1;
                double tmp = a[j];
                a[j] = a[i];
                a[i] = tmp;
            }
        }
        double tmp = a[j];
        a[j] = a[l];
        a[l] = tmp;
        return j;
    }


        public String toString(double[] salary ){

            StringBuilder s = new StringBuilder();
            s.append("[");
            for (int i = 0; i < salary.length-1 ; i++) {
                s.append(salary[i]).append(",");
            }
          //  s.append(salary[salary.length - 1]).append("]");
            return s.append("]").toString();
          //  return Arrays.toString(salary);
        }
    }


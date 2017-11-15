package by.it.sc04_evening_tue_thu.rumiantsau.lesson13;

import java.util.Arrays;

class Salary{
    private double[] salary;
    private int cnt;

    private double getFactor(double percent){
        return (100 + percent) / 100;
    }

    public double getSum() {
        double sum = 0;
        for(int i = 0; i < this.cnt; i++) {
            sum = sum + this.salary[i];
        }
        return sum;
    }

    public double getSum(double percent) {
        return this.getSum() * this.getFactor(percent);
    }

    public double[] getSalary() {
        return this.salary;
    }

    public double[] getSalary(double percent){
        double[] tmp = new double[this.cnt];
        double f = this.getFactor(percent);

        for(int i = 0; i < this.cnt; i++){
            tmp[i] = (int) this.salary[i] * f;

            tmp[i] = tmp[i] * 100;
            int x = (int) Math.round(tmp[i]);
            tmp[i] = (double) x / 100;
        }
        return tmp;
    }

    public void setSalary(double percent) {
        double f = this.getFactor(percent);

        for(int i = 0; i < this.cnt; i++) {
            this.salary[i] = this.salary[i] * f;
        }
    }

    public void sort() {
        Arrays.sort(this.salary);
    }

    public void privateSort() {
        this.qSort(this.salary, 0, this.cnt - 1);
    }

    private void qSort(double[] a, int left, int right) {
        if (left >= right)
            return;

        int m = partition(a, left, right);
        qSort(a, left, m - 1);
        qSort(a, m + 1, right);
    }

    private int partition(double[] a, int left, int right) {
        double x = a[left];
        int j = left;

        for (int i = left + 1; i <= right; i++){
            if (a[i] < x) {
                j++;
                double tmp = a[j];
                a[j] = a[i];
                a[i] = tmp;
            }
        }

        double tmp = a[j];
        a[j] = a[left];
        a[left] = tmp;

        return j;
    }

    public String toString() {
        return Arrays.toString(this.salary);
    }

    public Salary(double[] arr) {
        this.cnt = arr.length;
        this.salary = new double[this.cnt];
        for(int i = 0; i < this.cnt; i++){
            this.salary[i] = arr[i];
        }
    }

    public Salary(String[] arr){
        // ?
    }

    //public Salary(double ... arr) {
    //  Не согласуется с конструктором ч-з массив
    //}
}

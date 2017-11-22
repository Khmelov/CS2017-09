package by.it.sc02_morning.golikov.lesson13;

import java.util.Arrays;

public class Salary {

    private double[] sal;
    public Salary(double[] salary) {
        sal = salary;
    }

    public double getSum() {
        double sum = 0;
        for (double s : sal) {
            sum += s;
        }
        return sum;
    }

    public double getSum(double percent) {
        double sum = 0;
        for (double s : sal) {
            sum += s * (100 + percent) / 100;
        }
        return sum;
    }

    public double[] getSalary() {
        return sal;
    }

    public double[] getSalary(double percent) {
        double[] tmp = new double[sal.length];
        for (int i = 0; i < sal.length; i++) {
            tmp[i] = sal[i] * (100 + percent) / 100;
        }
        return tmp;
    }

    void setSalary(double percent) {
        for (int i = 0; i < sal.length; i++) {
            sal[i] = sal[i] * (100 + percent) / 100;
        }
    }

    void sort () {
        Arrays.sort(sal);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

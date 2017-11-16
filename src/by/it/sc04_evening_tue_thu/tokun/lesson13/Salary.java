package by.it.sc04_evening_tue_thu.tokun.lesson13;

import java.util.Arrays;

public class Salary {
    private double [] salary = new double[12];

    Salary (double[] salary) {
        this.salary = salary;
    }

    double getSum (double [] salary) {
        double sum = 0;
        for (double v : salary) {
            sum = sum + v;
        }
        return sum;
    }

    double getSum() {
        double sum = 0;
        for (double v : salary) {
            sum = sum + v;
        }
        return sum;
    }

    double getSum(double percent) {
        double sum = 0;
        for (double v : salary) {
            sum = sum + v;
        }
        return sum  * (100 + percent)/100;
    }

    double[] getSalary() {
        return salary;
    }

    double[] getSalary(double percent){
        double[] newSalary = new double[12];
        for (int i = 0; i < salary.length ; i++) {
            newSalary[i] = salary[i] * (100 + percent)/100;
        }
        return newSalary;
    }

    void setSalary(double percent) {
        for (int i = 0; i < salary.length; i++) {
            salary[i] = salary[i]*(100 + percent)/100;
        }
    }

    void sort() {
        Arrays.sort(salary);
    }

    @Override
    public String toString() {
        return Arrays.toString(salary);
    }

}

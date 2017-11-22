package by.it.sc02_morning.liplianina.lesson13;

import java.util.Arrays;

public class Salary {

    private double[] salary = new double[12];

    Salary(double[] salary) {this.salary = salary;}

    double getSum() {
        double sum = 0;
        for (double s : salary) {
            sum += s;
        }
        return sum;
    }

    double getSum(double percent) {
        double sum = 0;
        for (int i = 0; i < salary.length; i++) {
            sum += salary[i];
        }
        return  sum * ((100 + percent)/100);
    }

    double[] getSalary() {
        return salary;
    }

    double[] getSalary(double percent) {
        double[] result = new double[salary.length];
        for (int i = 0; i < salary.length; i++) {
            result[i] = salary[i] + salary[i] * percent / 100;
        }
        return result;
    }

    void setSalary(double percent) {
        for (int i = 0; i < salary.length; i++) {
            salary[i] = salary[i];
        }
    }

    void sort() {
        Arrays.sort(salary);
    }

    @Override
    public String toString() { return Arrays.toString(salary); }
}

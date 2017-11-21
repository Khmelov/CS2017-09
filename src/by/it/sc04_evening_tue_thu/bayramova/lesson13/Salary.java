package by.it.sc04_evening_tue_thu.bayramova.lesson13;

import java.util.Arrays;
import java.util.Scanner;

public class Salary {
    double[] salary;
    Salary(double arr[]) {
        this.salary=new double[arr.length];
        this.salary=Arrays.copyOf(arr, arr.length);
    }

    double getSum() {
        double sum=0;
        for (double s : salary) {
            sum=sum+s;
        }
        return sum;
    }

    double getSum(double percent) {
        return this.getSum()*((100+percent)/100);
    }

    void sort() {
        Arrays.sort(salary);
    }

    public double[] getSalary() {
        return salary;
    }

    public double[] getSalary(double percent) {
        double[] result=new double[salary.length];
        for (int i = 0; i < salary.length; i++) {
            result[i]=salary[i]*(100+percent)/100;
        }
        return result;
    }


    private void setSalary(double percent) {
        for (int i = 0; i < salary.length; i++) {
            salary[i]=salary[i]*(100+percent)/100;
        }

    }

    private void stringToString() {
        Arrays.toString(salary);
    }
}

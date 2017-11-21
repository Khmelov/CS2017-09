package by.it.sc02_morning.serzhan.lesson13;

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

    void sort(){
        Arrays.sort(salary);
    }

    public String toString(){
        return Arrays.toString(salary);
    }
}


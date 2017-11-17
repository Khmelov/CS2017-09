package by.it.sc04_evening_tue_thu.sushchenja.lesson13;

import java.util.Arrays;

public class Salary {
    private double[] salary;

    Salary(double[] s) {
        salary = new double[s.length];
        for (int i = 0; i < s.length; i++)
            this.salary[i] = s[i];
    }

    double getSum() {  //метод double getSum() - считает сумму всех зарплат.
        double sum = 0;
        for (int i = 0; i < salary.length; i++)
            sum = sum + salary[i];
        return sum;
    }

    double getSum(double percent) { //метод double getSum(double percent) - считает сумму всех зарплат с надбавкой в percent%.
        double sum = 0;
        for (int i = 0; i < salary.length; i++)
            sum = sum + salary[i] * (100 + percent) / 100;
        return sum;
    }

    double[] getSalary() { //метод double[] getSalary() возвращает массив из приватного поля.
        return salary;
    }

    double[] getSalary(double percent) { //метод double[] getSalary(double percent) возвращает новый массив с надбавкой в percent%.
        double[] tmp = new double[salary.length];
        for (int i = 0; i < salary.length; i++)
            tmp[i] = salary[i] * (100 + percent) / 100;
        return tmp;
    }

    void setSalary(double percent) { //метод void setSalary(double percent) обновляет массив в приватном поле с надбавкой в percent%.
        for (int i = 0; i < salary.length; i++) {
            salary[i] = salary[i] * (100 + percent) / 100;
        }
    }


    void sort() { //метод void sort() сортирует массив через Arrays.sort в приватном поле.
        Arrays.sort(salary);
    }

    public String toString() { //метод String toString() возвращает Arrays.toString для в приватного поля
        String s = Arrays.toString(salary);
        return s;
    }
}

package by.it.sc04_evening_tue_thu.migdasyova.lesson13;

import java.util.Arrays;

/*
Напишите отдельный класс Salary который принимает в конструктор
массив double[]
конструктор сохраняет данные в приватный массив класса salary

напишите нестатические методы для Salary:
метод double getSum() - считает сумму всех зарплат.
метод double getSum(double percent) - считает сумму всех зарплат с надбавкой в percent%.

метод double[] getSalary() возвращает массив из приватного поля.
метод double[] getSalary(double percent) возвращает новый массив с надбавкой в percent%.
метод void setSalary(double percent) обновляет массив в приватном поле с надбавкой в percent%.

метод void sort() сортирует массив через Arrays.sort в приватном поле.
метод String toString() возвращает Arrays.toString для в приватного поля*/
public class Salary {
    private double[] salary = new double[12];

    Salary(double[] salary) {
        this.salary = salary;
    }

    double getSum() {
        double sum = 0;
        for (double s : salary) {
            sum += s;
        }
        return sum;
    }

    double getSum(double percent) {
        double sum = 0;
        for (double s : salary) {
            sum = sum + s;
        }
        return sum * (100 + percent) / 100;
    }

    double[] getSalary() {
        return salary;
    }

    double[] getSalary(double percent) {
        double[] percentSalary = new double[12];
        for (int i = 0; i < salary.length; i++) {
            percentSalary[i] = salary[i] * (100 + percent) / 100;
        }
        return percentSalary;
    }

    void setSalary(double percent) {
        for (int i = 0; i < salary.length; i++) {
            salary[i] *= (100 + percent) / 100;
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

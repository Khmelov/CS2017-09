package by.it.sc04_evening_tue_thu.yanushkevich.lesson13;

import java.util.Arrays;

public class Salary {

    private double[] salary;

    Salary(double[] mas) { //конструктор сохраняет принятиый массив в приватный
        salary = mas;
    }

    double getSum() { //считает сумму всех зарплат
        double sum = 0;
        for (double s : salary) {
            sum = sum + s;
        }
        return sum;
    }

    double getSum(double percent) { //считает сумму всех зарплат с надбавкой в percent%.
        double sum = getSum() * ((100 + percent) / 100);
         /* double sum = 0;
            for (int i = 0; i < salary.length; i++) {
                sum = sum + (salary[i] * (100 + percent) / 100);*/
        return sum;
    }

    double[] getSalary() { //возвращает массив из приватного поля
        return salary;
    }


    double[] getSalary(double percent) { //возвращает новый массив с надбавкой в percent%.
        double[] result = new double[salary.length];
        for (int i = 0; i < salary.length; i++) {
            result[i] = salary[i] * (100 + percent) / 100;
        }
        return result;
    }

    void setSalary(double percent) { // обновляет массив в приватном поле с надбавкой в percent%.
        for (int i = 0; i < salary.length; i++) {
            salary[i] = salary[i] * ((100 + percent) / 100);
            //salary[i] =* ((100 + percent) / 100)
        }
    }


    void sort() { //сортирует массив через Arrays.sort в приватном поле.
        Arrays.sort(salary);
    }

    @Override
    public String toString() {
        return "Salary{" +
                "salary=" + Arrays.toString(salary) +
                '}';
    }

}


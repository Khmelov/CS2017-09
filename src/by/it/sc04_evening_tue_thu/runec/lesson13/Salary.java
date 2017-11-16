package by.it.sc04_evening_tue_thu.runec.lesson13;

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

import java.util.Arrays;

public class Salary {
    private double [] salary;

    Salary (double[]s){//отдельный класс Salary который принимает в конструктор массив double[]
        salary=s;
    }

    public double getSum(){//считает сумму всех зарплат.
        double sum=0;
        for (int i = 0; i <salary.length ; i++) {
            sum=sum+salary[i];
        }
        return sum;
    }

    public double getSum(double percent){//считает сумму всех зарплат с надбавкой в percent%.
        return getSum()*(100+percent)/100;
    }

    public double[] getSalary(){//возвращает массив из приватного поля.
        return salary;
    }


    double[] getSalary(double percent){//возвращает новый массив с надбавкой в percent%.
        double [] newsalary=new double[salary.length];
        for (int i = 0; i <salary.length ; i++) {
            newsalary[i]=salary[i]*(100+percent)/100;
        }
        return newsalary;
    }


    void setSalary(double percent){//обновляет массив в приватном поле с надбавкой в percent%.
        for (int i = 0; i <salary.length ; i++) {
            salary[i]=salary[i]*(100+percent)/100;
        }
    }

    void sort(){//сортирует массив через Arrays.sort в приватном поле.
        Arrays.sort(salary);
    }


    public String toString(){//возвращает Arrays.toString для в приватного поля
        return Arrays.toString(salary);
    }


}

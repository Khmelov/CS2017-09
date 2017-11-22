package by.it.sc02_morning.kurgan.lesson13;

import java.util.Arrays;

public class Salary {

    private double [] salary;
    private String [] salaryString;


    Salary(double[] salary){
        this.salary = salary;
    }

    Salary(String[] salaryString){
        this.salaryString = salaryString;
    }

    void Salary(double ... v){ }

    double getSum() {
        double sum=0;
        for (double s : salary) {
            sum=sum+s;
        }
        return sum; }// считает сумму всех зарплат.

    double getSum(double percent) {
        double [] result=new double [salary.length];
        double sum=0;
        for (int i = 0; i < salary.length; i++) {
            result [i]=salary[i]+salary[i]*(percent/100);
            sum=sum+result[i];
        }
        return sum; } // считает сумму всех зарплат с надбавкой в percent%.

    public double[] getSalary() {
        for (int i = 0; i <salary.length ; i++) {
            System.out.print(salary[i]+", ");
        }
        return salary; } // возвращает массив из приватного поля.

    double[] getSalary(double percent){
        return salary; } // возвращает новый массив с надбавкой в percent%.

    void setSalary(double percent) {
        double [] mas=new double[salary.length];
        for (int i = 0; i < salary.length; i++) {
            mas [i]=salary[i]+salary[i]*(percent/100);
        }
        this.salary=mas;
    } //обновляет массив в приватном поле с надбавкой в percent%.

    void sort(){
        Arrays.sort(salary);
    } // сортирует массив через Arrays.sort в приватном поле.

    public String toString(){
        return Arrays.toString(salary);
    } // возвращает Arrays.toString для в приватного поля

    void sortWithoutArrays(){
        for (int i = 1; i < salary.length; i++) {
            for (int j = 1; j<=salary.length-i ; j++) {
                if (salary[j]<salary[j-1]) {
                    double tmp = salary[j];
                    salary [j]=salary[j-1];
                    salary[j-1]=tmp;
                }
            }
        }
    }

}
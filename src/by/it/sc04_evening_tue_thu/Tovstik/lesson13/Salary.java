package by.it.sc04_evening_tue_thu.Tovstik.lesson13;

import java.util.Arrays;

class Salary
{
    private double[] salary;
    private int a;


    public double getSum()
    {
        int a;
        double sum = 0;
        for (int i = 0; i <this.a ; i++)
        {
            sum = sum + this.salary[i];
        }
        return sum;
    }


    public double getSum(double percent)
    {
        return this.getSum() * (100 + percent)/100;
    }


    public double[] getSalary()
    {
        return this.salary;
    }


    public double[] getSalary(double percent)
    {
        double[] tmp = new double[this.a];

        for(int i = 0; i < this.a; i++)
        {
        tmp[i] = (int) this.salary[i] * (100+ percent) / 100;
        tmp[i] = tmp[i] * 100;
        int x = (int) Math.round(tmp[i]);
        tmp[i] = (double) x / 100;
        }
        return tmp;
    }


    void setSalary(double percent)
    {
        for (int i = 0; i <this.a ; i++)
        {
            this.salary[i] = this.salary[i] * (100+ percent)/100;
        }
    }


    public void sort()
    {
        Arrays.sort(this.salary);
    }


    public String toString()
    {
        return Arrays.toString(this.salary);

    }

}

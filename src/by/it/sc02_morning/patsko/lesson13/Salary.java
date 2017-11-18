package by.it.sc02_morning.patsko.lesson13;

public class Salary {
    private double[] fieldSalary;

    public Salary(double[] sal){
        fieldSalary=sal;
    }
    public Salary(String[] sal){
        fieldSalary=new double[sal.length];
        for (int i = 0; i < sal.length; i++) {
            fieldSalary[i]=Double.parseDouble(sal[i]);
        }
    }
    public Salary(Double...sal){
        fieldSalary=new double[sal.length];
        for (int i = 0; i < sal.length; i++) {
            fieldSalary[i]= sal[i];
        }
    }
    public double getSum(){// считает сумму всех зарплат.
        double sum=0;
        for (int i = 0; i < fieldSalary.length; i++) {
            sum+=fieldSalary[i];
        }
        return sum;
    }
    public double getSum(double percent){// считает сумму всех зарплат с надбавкой в percent%.
        double sum=0;
        for (int i = 0; i < fieldSalary.length; i++) {
            sum+=fieldSalary[i]+fieldSalary[i]*percent/100;
        }
        return sum;
    }
    public double[] getSalary(){//возвращает массив из приватного поля.
        return fieldSalary;
    }

    public double[] getSalary(double percent){//возвращает новый массив с надбавкой в percent%.
        double[] result = new double[fieldSalary.length];
        for (int i = 0; i < result.length; i++) {
            result[i]=fieldSalary[i]+fieldSalary[i]*percent/100;
        }
        return result;
    }
    public void setSalary(double percent){//обновляет массив в приватном поле с надбавкой в percent%.
        for (int i = 0; i < fieldSalary.length; i++) {
            fieldSalary[i]+=fieldSalary[i]*percent/100;
        }
    }
    public String doubleArrayToString(double[] arr){
        String s="[";
        for (int i = 0; i < arr.length-1; i++) {
            s+=arr[i]+", ";
        }
        s+=arr[arr.length-1]+"]";
        return s;
    }
    public void swap(int a, int b){
        double tmp=fieldSalary[a];
        fieldSalary[a]=fieldSalary[b];
        fieldSalary[b]=tmp;
    }
    //    public void sort(){
//        Arrays.sort(fieldSalary);
//    }
    public void sort(){
        this.sort(0, fieldSalary.length-1);
    }
    public void sort(int begin, int end){//быстрая сортировка с разбиением на 3 отрезка
        int l=begin, r=end;
        double pivot=fieldSalary[(begin+end)>>>1];
        while(l<=r){
            while((fieldSalary[l]<pivot)&&(l<end)) l++;
            while((pivot<fieldSalary[r])&&(r>begin)) r--;

            if(l<=r) this.swap(l++,r--);
        }
        if(begin<r) sort(begin,r);
        if(l<end) sort(l, end);
    }
    @Override
    public String toString(){
        return doubleArrayToString(getSalary());
    }
}

package by.it.sc04_evening_tue_thu.koktysh.lesson13;

public class Salary {
    private double[] salary;
    /*Salary (double[] s){
        salary = new double [s.length];
        for (int i = 0; i<s.length; i++) {
            this.salary[i] = s[i];
        }
    }*/
    Salary(String[]s){
        salary = new double [s.length];
        for (int i = 0; i<s.length; i++){
            this.salary[i]=Double.parseDouble(s[i]);
        }
    }
    Salary(double ... s){
        salary = new double [s.length];
        for (int i = 0; i<s.length; i++)
            this.salary[i]=s[i];
    }
    double getSum(){
        double sum = 0;
        for (int i = 0; i< salary.length; i++)
            sum = sum + salary[i];
        return sum;
    }
    double getSum (double percent){
        return getSum()*(percent+100)/100;
    }
    double[] getSalary(){
        return salary;
    }
    double[] getSalary(double percent){
        double [] s = new double[salary.length];
        for (int i = 0; i< salary.length; i++)
            s[i]= (salary[i]*100 + percent)/100;
        return s;
    }
    void setSalary(double percent){
        for (int i = 0; i< salary.length; i++)
            salary[i]= salary[i]*(100 + percent)/100;
    }


    public String toString(){
        String s="[";
        for (int i = 0; i<salary.length-1; i++){
            s=s+salary[i]+", ";
        }
        s=s+salary[salary.length-1] + "]";
        return s;
    }

    private int partition(int left, int right) {
        double x = salary[left];
        int j = left;
        for (int i = left+1; i<=right; i++){
            if (salary[i] <= x){
                j=j+1;
                double tmp = salary[j];
                salary[j] = salary[i];
                salary[i] = tmp;
            }
        }

        double tmp = salary[j];
        salary[j] = salary[left];
        salary[left] = tmp;
        return j ;
    }

    private void sort (int left, int right){
        if (left >= right)
            return;
        int m = partition(left, right);
        sort(left, m-1);
        sort(m+1, right);
    }

    public void sort() {
        sort( 0, salary.length-1);
    }

}

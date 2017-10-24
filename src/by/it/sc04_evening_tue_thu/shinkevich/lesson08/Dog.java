package by.it.sc04_evening_tue_thu.shinkevich.lesson08;

public class Dog {

    private String name;
    private int age;

    String getName(){
        return name;
        }
        public void  setName(String name){
        this.name = name;
        }

        int getAge(){
            return age;

        }
        public void  setAge(int age){
            this.age=age;
        }
        public String toString(){
            return  "Кличка: " +name+". "+"Возраст: "+age;

        }



}
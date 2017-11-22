package by.it.sc02_morning.kurgan.lesson08;

public class Dog {
    private String name;
    private int age;


    String getName() {
        return this.name;
    }

    void setName(String name) {
        this.name = name;
    }

    int getAge() {
        return this.age;
    }

    void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return String.format("Кличка: %s. Возраст: %d", name, age);
    }


}

package by.it.sc04_evening_tue_thu.zhyravski.lesson08;

public class Dog {

    private String name;

    private int age;

    private int weight;

    private double power;

    public Dog() {

    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dog(String name, int age, int weight, double power) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.power = power;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public double getPower() {
        return power;
    }

    public String toString() {
        return "Кличка: " + getName() + ". Возраст: " + getAge();
    }

    public boolean win(Dog otherDog) {

        double chanceThisDog = 0.2 * age + 0.3 * weight + 0.5 * power;

        double chanceOtherDog =  0.2 * otherDog.getAge() + 0.3 * otherDog.getWeight() + 0.5 * otherDog.getPower();

        if (chanceThisDog > chanceOtherDog) {

            return true;

        } else {

            return false;

        }

    }

}

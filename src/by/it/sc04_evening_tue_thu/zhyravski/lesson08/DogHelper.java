package by.it.sc04_evening_tue_thu.zhyravski.lesson08;

public class DogHelper {

    public static void printAllNames(Dog[] dogs) {

        for (int i = 0; i < dogs.length; i++) {

            System.out.print(dogs[i].getName() + " ");

        }

    }

    public static double averageAge(Dog[] dogs) {

        double sumOfAge = 0;

        for (int i = 0; i < dogs.length; i++) {

            sumOfAge += dogs[i].getAge();

        }

        return sumOfAge / dogs.length;

    }

}

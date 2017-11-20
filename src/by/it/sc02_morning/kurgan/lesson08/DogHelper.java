package by.it.sc02_morning.kurgan.lesson08;

public class DogHelper {
    static void printAllNames(Dog[] dogs){
        for (Dog dog : dogs) {
            System.out.print(dog.getName() + " ");
        }
    }

    static double averageAge(Dog[] dogs){
        int sum = 0;
        for (Dog dog : dogs) {
            sum += dog.getAge();
        }
        return (double)sum/dogs.length;
    }
}

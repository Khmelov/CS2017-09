package by.it.sc03_evening_mon_fri.gukish.lesson08;

public class DogHelper {
    static void printAllNames(Dog[] localdogs) {
        for (Dog d : localdogs)
            System.out.println(d.getName() + " ");
    }

    static double averageAge(Dog[] dogs) {
        double sum = 0;
        for (Dog d : dogs) {
            sum = sum + d.getAge();
            return sum / dogs.length;

        }
        return sum;
    }
}

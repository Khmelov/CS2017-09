package by.it.sc04_evening_tue_thu.yanushkevich.lesson04;

/*
    Сумма цифр четырехзначного числа

    Реализуйте метод sumDigitsInNumber(int number).
    Метод на вход принимает целое четырехзначное число.
    Нужно посчитать сумму цифр этого числа, и вернуть эту сумму.

    Пример:
    Метод sumDigitsInNumber вызывается с параметром 5467.

    Пример вывода:
    22

    Требования:
    1. В методе sumDigitsInNumber не могут быть использованы никакие дополнительные классы.
    2. Метод sumDigitsInNumber(int) должен быть не приватным и статическим.
    3. Метод sumDigitsInNumber должен возвращать значение типа int.
    4. Метод sumDigitsInNumber не должен ничего выводить на экран.
    5. Метод sumDigitsInNumber должен правильно возвращать сумму всех цифр в числе number.
*/
public class TaskC2 {

    static int sumDigitsInNumber(int a) {

        int d4 = (int) (a / 1000);
        int d3 = (int) ((a - d4 * 1000) / 100);
        int d2 = (int) ((a - d4 * 1000 - d3 * 100) / 10);
        int d1 = a % 10;

       /* int d2 = (int)(a % 100)/10;
        int d3 = (int)(a % 1000)/100;
        int d4 = (int) (a/1000);*/

        System.out.println(d4 + " " + d3 + " " + d2 + " " + d1);
        return (d1 + d2 + d3 + d4);

    }


    public static void main(String[] args) {

        System.out.println(sumDigitsInNumber(5467));
    }

}

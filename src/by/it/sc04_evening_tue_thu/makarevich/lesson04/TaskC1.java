package by.it.sc04_evening_tue_thu.makarevich.lesson04;

/*
Lesson 04. Конвертер температуры

Метод convertCelsiumToFahrenheit(int celsium) принимает значение в градусах Цельсия.
Метод должен переводить температуру и возвращать значение в градусах Фаренгейта.

Температура по Цельсию TC и температура по Фаренгейту TF связаны следующим соотношением:
TC = (TF – 32) * 5/9

Пример:
В метод convertCelsiumToFahrenheit на вход подается значение 40.

Пример вывода:
104.0


Требования:
1. Метод convertCelsiumToFahrenheit(int) должен быть не приватным и статическим.
2. Метод convertCelsiumToFahrenheit должен возвращать значение типа double.
3. Метод convertCelsiumToFahrenheit не должен ничего выводить на экран.
4. Метод convertCelsiumToFahrenheit должен правильно переводить градусы Цельсия
в градусы Фаренгейта и возвращать это число.*/


import java.util.Scanner;

class TaskC1 {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
                 int celsium=sc.nextInt();
                 double fahrenheit=convertCelsiumToFahrenheit(celsium);
        System.out.println(fahrenheit);
        }
        public static double convertCelsiumToFahrenheit(int celsium){
        double f=(celsium*1.8)+32;
            return f;
        }
    }











//    public static void main(String[] args) {
//        System.out.println(convertCelsiumToFahrenheit(40));
//    }



package by.it.sc04_evening_tue_thu.zhyravski.lesson05;

/*
Вывести таблицу умножения 10 x 10 (двоныйм циклом),
но вывод должен быть словами:

Ожидаемый вывод:
два умножить на два равно четыре
два умножить на три равно шесть
два умножить на четыре равно восемь
два умножить на пять равно десять
два умножить на шесть равно двенадцать
два умножить на семь равно четырнадцать
два умножить на восемь равно шестнадцать
два умножить на девять равно восемнадцать
два умножить на десять равно двадцать
три умножить на два равно шесть
три умножить на три равно девять
три умножить на четыре равно двенадцать
...
и т.д. до фразы
...
десять умножить на десять равно сто
*/

public class TaskC3 {

    public static void main(String[] args) {

        for (int i = 2; i <= 10; i++) {

            for (int j = 2; j <= 10; j++) {

                System.out.println(intToString(i) + " умножить на " + intToString(j) + " равно " + intToString(i * j) + " ");

            }

        }

        //System.out.println(intToString(21));

    }

    public static String intToString(int number) {

        String firstWord = "";
        String secondWord = "";
        String result = "";

        if (((number % 10) == 0) || (((double)number / (double) 10) > 2)) {
            switch (number / 10) {
                case 1:
                    firstWord = "десять";
                    break;
                case 2:
                    firstWord = "двадцать";
                    break;
                case 3:
                    firstWord = "тридцать";
                    break;
                case 4:
                    firstWord = "сорок";
                    break;
                case 5:
                    firstWord = "пятьдесят";
                    break;
                case 6:
                    firstWord = "шестьдесят";
                    break;
                case 7:
                    firstWord = "семьдесят";
                    break;
                case 8:
                    firstWord = "восемьдесят";
                    break;
                case 9:
                    firstWord = "девяносто";
                    break;
                case 10:
                    firstWord = "сто";
            }
        }

        if ((((double)number / (double)10) > 2 && (number % 10) > 0) || (number < 10)) {
            switch (number % 10) {
                case 1:
                    secondWord = "один";
                    break;
                case 2:
                    secondWord = "два";
                    break;
                case 3:
                    secondWord = "три";
                    break;
                case 4:
                    secondWord = "четыре";
                    break;
                case 5:
                    secondWord = "пять";
                    break;
                case 6:
                    secondWord = "шесть";
                    break;
                case 7:
                    secondWord = "семь";
                    break;
                case 8:
                    secondWord = "восемь";
                    break;
                case 9:
                    secondWord = "девять";
                    break;
            }
        }

        if (number > 10 && number < 20) {

            switch (number) {
                case 11:
                    firstWord = "одиннадцать";
                    break;
                case 12:
                    firstWord = "двенадцать";
                    break;
                case 13:
                    firstWord = "тринадцать";
                    break;
                case 14:
                    firstWord = "четырнадцать";
                    break;
                case 15:
                    firstWord = "пятнадцать";
                    break;
                case 16:
                    firstWord = "шестнадцать";
                    break;
                case 17:
                    firstWord = "семнадцать";
                    break;
                case 18:
                    firstWord = "восемнадцать";
                    break;
                case 19:
                    firstWord = "девятнадцать";
                    break;
            }

        }

        /*switch (number) {
            case 1:
                firstWord = "один";
                break;
            case 2:
                firstWord = "два";
                break;
            case 3:
                firstWord = "три";
                break;
            case 4:
                firstWord = "четыре";
                break;
            case 5:
                firstWord = "пять";
                break;
            case 6:
                firstWord = "шесть";
                break;
            case 7:
                firstWord = "семь";
                break;
            case 8:
                firstWord = "восемь";
                break;
            case 9:
                firstWord = "девять";
                break;
            default:
                firstWord = "" + number;
        }*/

        if (firstWord != "" && secondWord != "") {

            result = firstWord + " " + secondWord;

        } else if (firstWord != "" && secondWord == "") {

            result = firstWord;

        } else {

            result = secondWord;

        }


        return result;

    }

}

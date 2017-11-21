package by.it.sc02_morning.chernushevich.lesson05;

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
        for (int i=2; i<=10; i++) {
            for (int j=2;j<=10;j++) {
                System.out.println(ts(i)+"умножить на "+ts(j)+"равно "+ts(i*j));
            }
        }
    }

    static String ts(int n) {
        String s="";
        switch (n/100){
            case 1: s=s+"сто ";break;
            case 2: s=s+"двести ";break;
            case 3: s=s+"триста ";break;
            case 4: s=s+"четыреста ";break;
            case 5: s=s+"пятьсот ";break;
            case 6: s=s+"шестьсот ";break;
            case 7: s=s+"семьсот ";break;
            case 8: s=s+"восемьсот ";break;
            case 9: s=s+"девятьсот ";break;
        }
        switch (n%100/10){
            case 1: switch (n%100%10){
                case 0: s=s+"десять ";break;
                case 1: s=s+"одинадцать ";break;
                case 2: s=s+"двенадцать ";break;
                case 3: s=s+"тринадцать ";break;
                case 4: s=s+"четырнадцать ";break;
                case 5: s=s+"пятнадцать ";break;
                case 6: s=s+"шестнадцать ";break;
                case 7: s=s+"cемнадцать ";break;
                case 8: s=s+"восемнадцать ";break;
                case 9: s=s+"девятнадцать ";break;
            } break;
            case 2: s=s+"двадцать ";break;
            case 3: s=s+"тридцать ";break;
            case 4: s=s+"сорок ";break;
            case 5: s=s+"пятьдесят ";break;
            case 6: s=s+"шестьдесят ";break;
            case 7: s=s+"семьдесят ";break;
            case 8: s=s+"восемьдесят ";break;
            case 9: s=s+"девяносто ";break;
        }
        if (n%100/10!=1) switch (n%100%10) {
            case 0: break;
            case 1: s=s+"один ";break;
            case 2: s=s+"два ";break;
            case 3: s=s+"три ";break;
            case 4: s=s+"четыре ";break;
            case 5: s=s+"пять ";break;
            case 6: s=s+"шесть ";break;
            case 7: s=s+"семь ";break;
            case 8: s=s+"восемь ";break;
            case 9: s=s+"девять ";break;
        }
        return s;
    }
}
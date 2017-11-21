package by.it.sc04_evening_tue_thu.zhyravski.lesson09;

/*
 * Даны целые числа 1<=n<=1E18 и 2<=m<=1E5,
 * необходимо найти остаток от деления n-го числа Фибоначчи на m.
 * время расчета должно быть не более 2 секунд
 */

import java.math.BigInteger;
import java.util.ArrayList;

public class FiboC1 {

    private long startTime = System.currentTimeMillis();

    private long time() {
        return System.currentTimeMillis() - startTime;
    }

    public static void main(String[] args) {
        FiboC1 fibo = new FiboC1();
        int n = 999999999;
        int m = 321;
        //int m = 4;
        System.out.printf("fasterC(%d)=%d \n\t time=%d \n\n", n, fibo.fasterC(n, m), fibo.time());
    }

    long fasterC(long n, int m) {
        //решение практически невозможно найти интуитивно
        //вам потребуется дополнительный поиск информации
        //см. период Пизано

        ArrayList<BigInteger> modValues = new ArrayList<>();

        ArrayList<BigInteger> fiboValues = new ArrayList<>();

        fiboValues.add(BigInteger.ZERO);
        modValues.add(BigInteger.ZERO);

        fiboValues.add(BigInteger.ONE);
        modValues.add(BigInteger.ONE);

        fiboValues.add(BigInteger.ONE);
        modValues.add(BigInteger.ONE);

        BigInteger bigM = BigInteger.valueOf(m);

        for (int i = 3; i < n; i++) {

            BigInteger currentFibo = fiboValues.get(i - 1).add(fiboValues.get(i - 2));

            if (currentFibo.mod(bigM).equals(BigInteger.ONE) && modValues.get(i - 1).equals(BigInteger.ZERO)) {

                break;

            } else {

                fiboValues.add(currentFibo);

                modValues.add(currentFibo.mod(bigM));

            }

        }

        /*for (BigInteger x : modValues) {

            System.out.println(x);

        }*/

        //int modValuesSize = Math.toIntExact(n %(long)modValues.size());
        int modValuesSize = (int)n % modValues.size();

        return modValues.get(modValuesSize).longValue();
    }


}


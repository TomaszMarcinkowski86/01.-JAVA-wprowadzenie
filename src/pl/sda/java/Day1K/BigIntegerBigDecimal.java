package pl.sda.java.Day1K;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigIntegerBigDecimal {
    public static void main(String[] args) {

        BigInteger a = new BigInteger("12232652665626");

        double x = 0.02;
        double y = 0.03;

        System.out.println(x-y); // double jest niedoskonały zaokrąglenia np.

        BigDecimal xx = new BigDecimal("0.02");
        BigDecimal yy = new BigDecimal("0.03");
        System.out.println(xx.subtract(yy));  // odejmowanie przy pomocy metody na obiekcie. Inaczej nie odejmiemy bo to obiekty są.

        // tak też będzie źle
        BigDecimal xxx = new BigDecimal(0.02);
        BigDecimal yyy = new BigDecimal(0.03);
        System.out.println(xxx.subtract(yyy));

        // ale tak też będzie dobrze
        BigDecimal xxxx = BigDecimal.valueOf(0.02);
        BigDecimal yyyy = BigDecimal.valueOf(0.03);
        System.out.println(xxxx.subtract(yyyy));

    }
}

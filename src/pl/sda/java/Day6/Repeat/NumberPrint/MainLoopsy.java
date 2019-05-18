package pl.sda.java.Day6.Repeat.NumberPrint;

import java.util.Collections;

public class MainLoopsy {

    /* 1. Wypisz wszystkie liczby z zakresu 20 do 123.
   2. Wypisz wszystkie liczby z zakresu -40 do 15.
   3. Wypisz wszystkie liczby z zakresu 1 do 100 w kolejności od największej do najmniejszej
   4. Wypisz wszystkie liczby parzyste z przedziału 0 do 100.
   5. Dla liczb z przedziału 0 do 100 podaj informację, czy są podzielne przez 2, 3 i 5,
       w następujący sposób:
       0, podzielne przez: 2, 3, 5
       1
       2, podzielne przez: 2
       3, podzielne przez: 3
       4, podzielne przez: 2
       5, podzielne przez: 5
       6, podzielne przez: 2, 3
       7
       8, podzielne przez: 2
       9, podzielne przez: 3
       10, podzielne przez: 2, 5
       */

    public static void main(String[] args) {

        // int number1=20;
        for (int i = 20; i <= 123; i++) {
            // number1=i;
            //  System.out.println(number1);
            System.out.println(i);
        }
        System.out.println();
        int number2;
        for (int i = -40; i < 15; i++) {
            number2 = i;
            System.out.println(number2);
        }
        System.out.println();
        int number3 = 1;
        for (int i = 100; i > 0; i--) {
            number3 = i;
            System.out.println(number3);
        }
        System.out.println();
        // int number4=1;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0)
                //number4= i;
                System.out.println(i);
        }
        System.out.println();
        for (int i = 0; i <= 100; i++) {
            System.out.println(i);
            if ((i % 2 == 0) ||(i % 3 == 0) || (i % 5 == 0)) {
                System.out.println(", podzielne przez:");
                if (i % 2 == 0) {
                    System.out.println("2");
                }
                if (i % 3 == 0) {
                    if (i % 2 == 0) {
                        System.out.println(", ");
                    }
                    System.out.println(3);
                }
                if (i % 5 == 0) {
                    if ((i % 2 == 0) || (i % 3 == 0)) {
                        System.out.println(", ");
                    }
                    System.out.println(5);
                }
            }
        }
    }
}



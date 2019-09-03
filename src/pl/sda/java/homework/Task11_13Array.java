package pl.sda.java.homework;

import java.util.Scanner;

public class Task11_13Array {
    public static void main(String[] args) {

        /*12. Napisz metodę pobierającą od użytkownika 5 różnych
              liczb całkowitych za pomocą pętli for,
             • Po zakończeniu pobierania wypisz sumę oraz średnią
              wszystkich pobranych liczb.
             • Wypisz najmniejszą oraz największą z
             podanych przez użytkownika liczb
             */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczę. System wyswietli ich sumę, średnią największą i najmniejszą");
        int sum = 0;
        double srednia = 0;
        int[] tab = {scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};
        int min = tab[0];
        int max = tab[0];
        for (int i : tab) {
            sum += i;
            srednia = (double) sum / tab.length; //doubla dałem bo sum typu int i wynik był niedokładny

            if (min > i) {
                min = i;
            }
            if (max < i) {
                max = i;
            }

            //int sum = Arrays.stream(tab).sum(); można też tak
        }
        System.out.println("Suma podanych przez Ciebie elementów: " + sum);
        System.out.println("Srednia podanych przez Ciebie elementów: " + srednia);
        System.out.println("Max wartość: " + max + ", Min wartość " + min);


        reverseArray(tab);
        for (int element : tab) {
            System.out.println(element);
        }

        System.out.println("suma: " + (ArraySum(tab, 2, 4)));
    }

    /*13. Utwórz metodę, która jako parametr przyjmuje tablicę
     i zwraca nową tablicę z liczbami w odwrotnej kolejności.*?
        */
    public static int[] reverseArray(int[] tab) {
        for (int left = 0, right = tab.length - 1; left < right; left++, right--) {
            // swap the values at the left and right indices
            int temp = tab[left];
            tab[left] = tab[right];
            tab[right] = temp;
        }
        return tab;

    }
                /*11. Utwórz metodę, która przyjmuje trzy parametry - tablicę oraz dwie liczby.
        Metoda ma zwrócić sumę elementów w podanym przedziale.
        Dla `([1, 2, 3, 4, 5], 2, 4)`
        zwróci `12`, bo `3 + 4 + 5`*/

    public static int ArraySum(int[] tab, int a, int b) {
        int sum = 0;
        for (int i = a; i <=b; i++) {
             sum += tab[i];
        }return sum;
    }
}




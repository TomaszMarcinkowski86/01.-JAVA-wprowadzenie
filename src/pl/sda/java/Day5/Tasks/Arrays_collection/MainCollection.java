package pl.sda.java.Day5.Tasks.Arrays_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainCollection {
    public static void main(String[] args) {
        /*0.  Dla zadań z literką "p" wypisz zawartość kolekcji na konsolę
          1.  Stwórz klasę MainKolekcje wraz z metodą Main (skrót: psvm)
          2p. Stwórz tablicę przechowującą liczby całkowite oraz zainicjalizuj ją następującymi liczbami:
              31, 12, 5, 7, -3, 123, 6, 0
          3p. Posortuj elementy tablicy od najmniejszego do największego (pomocna będzie klasa Arrays)
          4p. Posortuj elementy tablicy od największego do najmniejszego (klasa Arrays + klasa Collections)*/

        Integer[] numbers = {31, 12, 5, 7, -3, 123, 6, 0};// Integer nie int bo sort Collection.reverseOrder tego wymaga
        System.out.println(numbers); // wyświetli jakieś dziwne znaki trzeba kolekcje do Stringa
        System.out.println(Arrays.toString(numbers)); // wyświetli jak wpisalo
        //numbers.<> nie mamy metody sort w tablicy
        Arrays.sort(numbers);                         //sortowanie naturalne przy wykorzystaniu Arrays
        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers, Collections.reverseOrder()); //sortowanie w odworotnej kolejności
        System.out.println(Arrays.toString(numbers));


    }
}

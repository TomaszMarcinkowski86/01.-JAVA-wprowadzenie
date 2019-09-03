package pl.sda.java.Day2K;

import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {

        int badExample[] = new int[5]; // dont do this
        int[] tab = new int[5];
        tab[0] = 1;
        tab[1] = 5;
        tab[2] = 4;
        tab[3] = 3;
        tab[4] = 20;

//        int[] anotherTab={1,5,6,2,4,}; // skrócona wersja tej na dole
        int[] anotherTab = new int[]{1, 5, 6, 2, 4,};
        printElementsOfArrayFor(anotherTab); //wywołanie metody
        printElementsOfArrayForEach(tab);
        System.out.println(printPrettyArray(tab));
        System.out.println(Arrays.toString(tab));
        System.out.println(Arrays.toString(minAndMaxValue(tab)));

      //  Arrays.stream(anotherTab)
         //       .forEach();

           }

    // metoda która przy pomocy pętli for wyrzuci wszystkie elementy tablicy
    public static void printElementsOfArrayFor(int[] tab) {
        System.out.println("wyrzucenie elementów przy pomocy For");
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);

        }
    }

    // metoda któa wyrzuci przy pomocy petli foreach wszystkie elementy //pętla ta przejdzie po każdym elemencie
    public static void printElementsOfArrayForEach(int[] tab) {
        System.out.println("wyrzucenie elementów przy pomocy Foreach");
        for (int element : tab) {
            System.out.println(element);
        }

    }

    // mamy wyrzucić taką tablicę jako string [1,5,4,3,20]
    public static String printPrettyArray(int[] tab) {
        String result = "[ ";
        int counter = 1;

        for (int element : tab) {
            result = result + element;
            if (counter <= tab.length - 1) {
                result = result + ",";
            }
            counter++;
        }
        return result + "]";
    }

    // znależć max i min value w Array
    // dobrym sposobem jest przyjęcie np pierwszego elementu jako max i min a potem przyrównać
    public static int[] minAndMaxValue(int[] tab) {
        int min = tab[0];
        int max = tab[0];
        for (int element : tab) {
            if (min > element){
                min=element;
                }
            if (max<element){
                max=element;
            }
       }
       return new int[]{min,max};
    }
}

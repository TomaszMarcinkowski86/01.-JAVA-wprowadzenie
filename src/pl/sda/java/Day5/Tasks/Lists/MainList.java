package pl.sda.java.Day5.Tasks.Lists;

import java.util.*;

public class MainList {
    /*5. Stwórz listę przechowującą ciągi znaków
  6p. Dodaj do listy następujące wyrazy:
      kot, pies, bocian, aligator, zebra, chomik, kaczka
  7p. Odwróć kolejność wyrazów na liście
  8p. Posortuj listę alfabetycznie
  9p. Wymieszaj elementy na liście w losowy sposób
  10p. Posortuj listę alfabetycznie w odwrotnej kolejności*/

    public static void main(String[] args) {

        ArrayList<String> animals=new ArrayList<>();
        animals.add("kot");
        animals.add("pies");
        animals.add("bocian");
        animals.add("aligator");

        System.out.println(animals);
        System.out.println();

        Collections.reverse(animals);
        System.out.println(animals);
        System.out.println();

        Collections.sort(animals);
        System.out.println(animals);
        System.out.println();

        Collections.shuffle(animals); // wymiesza losowo. za każdym razem inaczej
        //Random random = new Random(5); // to też wymiesza zawsze w ten sam sposób. Za każdym razem wymiesza tak samo
        // Collections.shuffle(animals, new Random()); // Możliwość przekazania obiektu Random ze specyficznym sposobem losowania
        System.out.println(animals);
        System.out.println();

        animals.sort(Comparator.reverseOrder());
        System.out.println(animals);


    }






}

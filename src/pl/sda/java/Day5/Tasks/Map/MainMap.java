package pl.sda.java.Day5.Tasks.Map;

import java.util.HashMap;
import java.util.Map;

public class MainMap {
    /*14. Stwórz kolekcję, która będzie przechowywać mapowanie liczb całkowitych na słowa
       (2 -> dwa, 5 -> pięć)
   15p. Dodaj następujące liczby wraz z odpowiedniemi słowami:
       5, 3, 10, 100, 0
   16p. Wyświetl słowo pod liczbą 1
   17p. Wyświetl wszystkie przechowywane liczby
   18p. Wyświetl wszystkie przechowywane słowa
   19p. Wyświetl liczby wraz z odpowidającymi im słowami
       (np. 1 = jeden)*/

    public static void main(String[] args) {

        Map<Integer, String> integerToString = new HashMap<>();
        integerToString.put(5, "pięć");
        integerToString.put(3, "trzy");
        integerToString.put(10, "dziesięć");
        integerToString.put(100, "sto");
        integerToString.put(0, "zero");

        System.out.println(integerToString);
        integerToString.put(1, new String("jeden"));
        System.out.println(integerToString);

        System.out.println(integerToString.get(5)); // to wyrzuci "pięć"
        System.out.println(integerToString.keySet()); // to wyrzuci cyferki "key"
        System.out.println(integerToString.values()); // to wyrzuci wyrazy
        System.out.println(integerToString.entrySet()); //

    }
}

package pl.sda.java.Day8.Task.Generic_task;

import java.util.List;

public class Main {

    /*1. Stwórz klasę generyczną o nazwie QuickList
   2. Stwórz konstruktor, który przyjmuje dowolną liczbę parametrów danego typu (varargs)
   3. Stwórz metodę toList, która zwróci parametry podane w konstruktorze jako listę
   */

    public static void main(String[] args) {
        QuickList<String> stringQuickList= new QuickList<>("text1", "text2", "text3", "abs");
        List<String> words = stringQuickList.toList();
        System.out.println(words);

    }
}

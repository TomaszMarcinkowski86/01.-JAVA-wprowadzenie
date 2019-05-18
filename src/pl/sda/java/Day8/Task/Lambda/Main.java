package pl.sda.java.Day8.Task.Lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {
        LambdaExample lambdaExample = new LambdaExample();

        Integer powerResult = lambdaExample.power().apply(5); // żeby użyć trzeba apply
        System.out.println(powerResult);

        Integer sum = lambdaExample.add().apply(2, 5);
        System.out.println(sum);

        Path path = Paths.get("src", "pl", "sda", "resources", "panTadeusz.txt");

        //////////////strumienie są czesto wolniejsze zależy os sytuacji//////
        ////////////////////Stream/////////różnica/////// 100 linii ale wczytujemy do pamięci tylko np 3 czy ile nam potrzeba/////////////////////
        Stream<String> lines = Files.lines(path); // przygotowanie strumienia. Tu określamy typ i potem poniżej on wie że ma Stringi czy coś innego
        //strumienie można raz przetworzyć potem się zamykają dlatego tu przypisaliśmy to do listy
        List<String> parsedLisnes = lines.filter(line -> line.contains("."))    //metoda filtr bierze te które są zdeklarowane w filtrze (linia z "a", linia z "." itd.
                .filter(line -> line.contains("a")) // line - nazwa własna
                .map(line -> line.toLowerCase())
                .collect(Collectors.toList()); // przekazujemy do kolekcji bo przetwarza się raz i się zamyka to zamieniamy to na listę np i można póxniej tego użyć
        System.out.println(parsedLisnes);


        ///////Treadycyjne użycie for /////////różnica//////////////tu wczytujemy do pamięci 100 linii potem filtr i nowy obiekt który jeszcze ma np 3 liniie ////////////
        List<String> parsedLinesFromList = new ArrayList<>(); // przygotowujemy listę
        List<String> linesLine = Files.readAllLines(path); // wczytanie z pliku
        for (String line : linesLine) {     // przejscie po wszystkich liniach
            if (line.contains(".") && line.contains("a")) {
                line = line.toLowerCase(); // "mapowanie" zmiana liter na małe
                parsedLinesFromList.add(line); // dodanie przetworzonej linii do wynikowej listy
            }
        }
        System.out.println(parsedLinesFromList);

        List<String> words = new ArrayList<>();
        words.add("Ala ma kota");
        words.add("Dzień dobry!");
        words.add("Adodaj coś");

        List<String> result =
                words.stream() // utworzenie streama z listy. dzieki temu możemy użyć wszystkich metod dostępnych dla streamu.
                        .filter(word -> word.contains("!")) // bierzemy tylko linie z wykrzyknikiem
                        .map(word -> word.split(" ")) // dzielimy linie spacja " "  na słowa. po wykonaniu instrukcji będzie tablica łancuchów znakowych 2 elementy. tu mamy strumien listy
                        .map(wordArray -> Arrays.asList(wordArray)) // zamieniamy tablicę stringów na listę Stringów
                        .flatMap(list -> list.stream()) // zamienia listę na strumień dzięki czemu przetwarzamy pojedyńcze słowa zamiast listy słów
                        .collect(Collectors.toList()); // zamieniamy strumień na listę
        System.out.println(result);


       Map<String, Integer> wordsToCount = new HashMap<>();
        wordsToCount.put("a", 1);
        wordsToCount.put("b", 10);
        wordsToCount.put("c", 1);
        wordsToCount.put("d", 15);
        wordsToCount.put("e", 1);
        System.out.println(wordsToCount);

        /////////////Nie Działa /////usuwanie  słów które występują raz////////
//        //duplicateWords.entrySet()
//        for (Map.Entry<String, Integer> keyValue : wordsToCount.entrySet()){
//            if(keyValue.getValue()==1){
//                wordsToCount.remove(keyValue.getKey());
//            }
//        }
        ////////////////  ITERATOR ///////////////////////można z innymi pętlami używać///////////////
        // Set <klucz, wartość>/<String,Integer>
        Set<Map.Entry<String, Integer>> entrySet = wordsToCount.entrySet(); //pobieramy wszystie pary klucz wartość
        // iterator jest najczęściej używany gdzy potrzebujemy usuwać elementy w trakcie przechodzenia
        Iterator<Map.Entry<String, Integer>> iterator = entrySet.iterator(); // pobieramy iteratora
        while (iterator.hasNext()){ // pętla while będzie wykonywana dopóki isnieje kolejny element (hasNext sprawdza czy jest kolejny element)
            Map.Entry<String, Integer> nextKeyValue = iterator.next();
            if (nextKeyValue.getValue()==1){
                iterator.remove();
            }
        }
        System.out.println();
        System.out.println(wordsToCount);

        //to samo co wyżej z użyciem wyrażenia lambda (keyValue->keyValue.getValue()==1), tu nie ma streama działamy na Secie (removeIf)
        wordsToCount.entrySet() // pobieramy kolekcję (entrySet)
                .removeIf(keyValue->keyValue.getValue()==1);
        System.out.println();
        System.out.println(wordsToCount);


    }
}

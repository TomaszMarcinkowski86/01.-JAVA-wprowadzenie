package pl.sda.java.Day7.Task.ReadFileFromFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class WordCounter {

    /* 16. Stwórz klasę WordCounter
       17. Stwórz metodę loadFile, która jako argument przyjmuje ścieżkę
           do pliku (Path) i zapisuje zawartoś pliku jako listę Stringów
       18. Dodaj metodę countWords, która zwróci liczbę wyrazów z wczytanego pliku
                (skorzystać z metody split na Stringu)
       19. Dodaj metodę uniqueWords, która zwróci kolekcję unikalnych słów
       20. Dodaj metodę countDuplicatedWords, która zwróci kolekcję słów wraz
        z liczbą wystąpienia danego słowa (użyj Map)
            */

    //TODO:  fix failing tests  // komentarze view --> tool windows-->TODO można to wyświetlić/wyszukać
    //FIXME :  test are broken


    private List<String> fileContent;

    public void loadFile(Path path) throws IOException {
        fileContent = Files.readAllLines(path); // wynikiem metody jest lista linii (każdy element listt jest osobną linią w pliku)
    }
////////////////////////SKOMENTOWAŁEM BO NIŻEJ ZOPTYMALIZUJEMY KOD BO TU 2 RAZY PRZECHODZIMY PO LINIACH I SŁOWA ZLICZAMY)////////////////////
//    public int coutWords() {
//        int wordsCout = 0;
//        for (String line : fileContent) {
//            String[] words = line.split(" "); // dzielimy linie po spacji
//            wordsCout += words.length;
//        }
//        return wordsCout;
//    }
//
//    public Set<String> uniqueWords() {
//        Set<String> uniqueWords = new HashSet<>(); // pusty set bedziemy tu wpychać słowa które z pętli weżmiemy. Set to unikalne słowa
//        for (String line : fileContent) { // przechodzimy po wszystkich liniach
//            String[] words = line.split(" "); // dzilimy linie na słowa
////            for (String word : words) {
////                uniqueWords.add(word);    // prymitywny sopsób dodania każdego słowa do Setu
////            }
//            List<String> listOfWords = Arrays.asList(words); // zamiana tablicy na listę
//            uniqueWords.addAll(listOfWords); // dodanie wszystkich słów z listy do setu. Działa jak wyższy for
//        }
//        return uniqueWords;
//    }


    public int coutWords() {
        return getWords().size(); // używamy metody tej która jest niżej, skraca to kod bo tą metodę możemy użyć w 2 miejscach.
    }

    public Set<String> uniqueWords() {
        return new HashSet<>(getWords()); // pobieramy listę wszystkich słów i tworzymy nowy Set z elementów listy
//        List<String> words = getWords();
//        Set<String> uniqueWords = new HashSet<>(words);
//        return uniqueWords();
    }
    //zliczmay zduplikowane slowa
    public Map<String, Integer> coutDuplicateWords(){
        Map<String, Integer> wordsToCount = new HashMap<>(); // pusta mapa
        List<String> words =getWords(); // pobieramy listę wsztstkich słów
        for(String word : words){ // w pętli lecimy po wszystkich słowach
            Integer count = wordsToCount.get(word); // pobieramyy ilość wystąpięń danego słowa null jeśli danego słowa nie byłow w mapie
            if(count != null){
                wordsToCount.replace(word , count+1);  // zmieniamy licznik wystąpienie
//                wordsToCount.put(word , count+1);  to samo co wyżej
            }else{
                wordsToCount.put(word, 1); // dane słowo nie było wcześniej w mapie
            }
        }
        return  wordsToCount;
    }

    private List<String> getWords() {
        List<String> worsdList = new ArrayList<>(); // przygotowujemy listę wynikową
        for (String line : fileContent) { // przechodzimy po wszystkich liniach
            line = line.toLowerCase(); // zamienimy wszystkie znaki na małe litery
            String[] words = line.split("[ ,.():;?!]" ); // dzielimy linie na słowa - szukamy spacji i mamy poszczególne słowa. zmieniliśmy na regex
            // to co w [ ] to regex znaki regularne. żeby dodać ] to trzeba \]
            List<String> lineWords = Arrays.asList(words); // zamieniamy tablicę na listę
            worsdList.addAll(lineWords); // dodajemy słowa do wynikowej listy

        }
        // usunięcie pustych znaków bo regex dzieli po dowolnym ze znaków ale jak mamy np ", " to pomiedzy jest pusty
        // Collection. singletonList - tworzymy listę z pojedynczym elementem i nie możemy jej modyfikować ani dodawać ani odejmować elementu
        List<String> immutableList = Collections.singletonList("");
        worsdList.removeAll(immutableList); // usuwa puste znaki z listy wyżej
       // worsdList.removeAll(Collections.singletonList("")); // krócej
      //  worsdList.removeAll(Arrays.asList("", null)); // to samo co wyżej
        return worsdList;
    }

}




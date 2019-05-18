package pl.sda.java.Day7.Task.ReadFileFromFile;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        WordCounter wordCounter =new WordCounter();
        Path panTadeuszPath= Paths.get("src","pl","sda","resources", "panTadeusz.txt");
        try {
            wordCounter.loadFile(panTadeuszPath);
            int wordCount = wordCounter.coutWords();
            System.out.println("Iolść słów to: " + wordCount);
            Set<String> uniqueWords = wordCounter.uniqueWords();
            System.out.println(uniqueWords.size());
 //           System.out.println(uniqueWords);
            Map<String, Integer> duplicateWordCount = wordCounter.coutDuplicateWords();
            System.out.println(duplicateWordCount);
        } catch (IOException e) {
            System.out.println("taki plik nie istnieje: " + panTadeuszPath);
        }
    }
}

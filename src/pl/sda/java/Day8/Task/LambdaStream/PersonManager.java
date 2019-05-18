package pl.sda.java.Day8.Task.LambdaStream;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PersonManager {

    private List<Person> people; // deklarujemy listę


    public void load(Path path) throws IOException {
        Stream<String> lines = Files.lines(path); // przygotowujemy strumień z zawartością pliku
       people = lines.filter(line->line.contains(";"))// tylko linie zawierające średnik
                .map(line->line.split(";")) // dzielimy linie po znaku średnika, wynikiem tablica dla każdej z linii
                .map(lineArray ->new Person(lineArray[0],lineArray[1])) // zamieniamy tablicę na obiekt typu person. od tego momentu mamy strumień typu preson
                .collect(Collectors.toList());  // skończyliśmy przetwarzanie. zamieniamy strumień na listę.
    }

    public List<Person> getPeople() {
        return people;
    }


    ////////////////to samo co wyżej tylko metoda statyczna  ////////////////////
    public static List<Person> loadStaticPeople(Path path) throws IOException {
        Stream<String> lines = Files.lines(path); // przygotowujemy strumień z zawartością pliku
        return  lines.filter(line->line.contains(";"))// tylko linie zawierające średnik
                .map(line->line.split(";")) // dzielimy linie po znaku średnika, wynikiem tablica dla każdej z linii
                .map(lineArray ->new Person(lineArray[0],lineArray[1])) // zamieniamy tablicę na obiekt typu person. od tego momentu mamy strumień typu preson
                .collect(Collectors.toList());  // skończyliśmy przetwarzanie. zamieniamy strumień na listę.
    }
}

package pl.sda.java.Day8.Task.LambdaStream;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        /* 1. Stwórz klasę Person przechowującą imię oraz nazwisko oraz konstruktor i metodę toString
           2. Stwórz klasę PersonManager, która przechowuje listę obiektów Person
           3. Dodaj metodę load, która jako argument przyjmuje zmienną typu Path i
              wczytuje plik jako strumień (Files.lines)
           4. Odfiltruj ze strumienia wiersze, które nie mają średnika (filter)
           5. Zamień wiersz na tablicę stringów poprzez rozdzielenie po symbolu średnika (map)
           6. Zamień tablicę stringów na obiekt Person, gdzie pierwszy
              element to imię, a drugi nazwisko (map)
              a. użyc collect(Collector.toList())
           7. Dodaj metodę zwracającą listę obiektów Person
           8. Stwórz plik people.txt o następującej zawartości:
              Adam;Kowalski
              qwettrtcvc
              Tadeusz;Banan
              Witold;Poziomka
              wwwwwww
              Zenon;Iksinski
           9. Stwórz klasę Main z metodą psvm
           10. Stwórz obiekt PersonManager i wczytaj powyższy plik
         */

        PersonManager personManager= new PersonManager();
        Path peoplePath =  Paths.get("src", "pl", "sda", "resources", "people.txt");
        personManager.load(peoplePath);  // wczytujemy plik
        List<Person> peopleList = personManager.getPeople(); // pobieramy przetworzone osoby z pliku
        System.out.println(peopleList);


        /// mamy metode statyczną to nie muszę tworzyć nowego obiektu tylko mogę to wywołać
        List<Person> people2 = PersonManager.loadStaticPeople(peoplePath); // wywołanie metody statycznej bezpośrednio z nazwy klasy. Nie musimy mieć nowego obiektu jak wyżej
        System.out.println(people2);
    }
}

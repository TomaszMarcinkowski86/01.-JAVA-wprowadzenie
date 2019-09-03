package pl.sda.java.interfacing;

/**
 * @author Michal Jaszczyk
 **/
public class Main {
    public static void main(String[] args) {

        /*
        1. Zaimplementuj parser dla plików z rozszerzeniem ".zxc"
        2. Dodaj instancję (nowy obiekt) stworzonego parsera w klasie Main (sprawdź rezultaty)
        3. Zaimplementuj parser dla plików z rozszerzeniem ".abc", tak aby
           zamieniał ciąg znaków abc na spacje
        4. Dodaj instancję stworzonego parsera w klasie Main (sprawdź rezultaty)
        5. Zaimplementuj dodatkowy parser dla plików z rozszerzeniem ".txt", tak aby
           zamieniał spacje na znaki zapytania
          */

        // Stworzenie klasy z główną logiką aplikacji
        FileConverter fileConverter = new FileConverter();
        // Konfiguracja głównej klasy
        fileConverter.addParser(new TxtFileParser());

        //////////// moje ZxcFileParser/////////////////////////
        fileConverter.addParser(new ZxcFileParser());
        // moje AbcFileParser
        fileConverter.addParser(new AbcFileParser());
        // moje TxtileParserTwo
        fileConverter.addParser(new TxtFileParserTwo());
        ///////////////////////////////////


        // Wywołanie funkcjonalności głównej klasy
        fileConverter.displayConvertedFiles();






    }
}

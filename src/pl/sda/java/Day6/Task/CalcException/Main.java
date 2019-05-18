package pl.sda.java.Day6.Task.CalcException;

public class Main {
    public static void main(String[] args) {

        /*1. Stwórz klasę Calculator z metodą divide przyjmującą 2 argumenty typu
             double i zwracającą wynik dzielenia jako double
          2. Stwórz klasę DivideByZeroException rozszerzającą klasę Exception
          3. Rzuć wyjątkiem DivideByZeroException w metodzie divide,
             w przypadku jeżeli ktoś chce dzielić przez 0
          4. Dodaj klasę Main wraz z metodą Main, stwórz kalkulator oraz
             wywołaj metodę divide
           5. Otocz wywołanie metodu divide w klasie Main w blok try-catch
         */

        Calculator calculator = new Calculator();

        try {
            System.out.println("tworzenie pliku temp");
            System.out.println("wynik " + calculator.divide(2, 1));
            System.out.println("wynik " + calculator.divide(2, 0));
            System.out.println("Usun plik temp");      // to sie nie wykona bo mamy wyjątek. tu umieszczamy metody które zależa od wyniku tych wyżej
        } catch (DivideByZeroException e) {
            e.printStackTrace();
            System.out.println("Chciałeś podzielić przez 0, sprawdź podane liczby"); // to się wykona gdy pojawi sie wyjątek. Nie ma wyjątku nie wykona się tu można umieszczać metody które
            // nie zależą od tych w których mogą być wyjątki
        } finally {
            System.out.println("usuń plik");
            System.out.println("Finally oznacza że ta sekcja zawsze sie wykona"); // zawsze się wykona czy będzie wyjątek czy nie
            System.out.println("Sprzatanie po bloku try gdyby np try tworzył plik tymczasowy to jak poleci wyjątek to nie usunie");
        }
        System.out.println("kolejne instrukcje");
    }
}


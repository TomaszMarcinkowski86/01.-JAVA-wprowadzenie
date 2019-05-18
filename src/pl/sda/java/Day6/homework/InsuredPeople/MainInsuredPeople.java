package pl.sda.java.Day6.homework.InsuredPeople;

public class MainInsuredPeople {
    public static void main(String[] args) {
        /* 2**. Zaprojektuj system do przechowywania danych osób ubezpieczonych
     a. Stwórz klasę Osoba zawierające następujące dane: imię, nazwisko, data urodzenia
     b. Stwórz konstruktor, który jako argumenty przyjmuje podane wyżej pola
     c. Stwórz gettery do podanych wyżej pól
     d*. Stwórz własną implementację equals i hashCode (Alt + Insert -> Generate equals & hashCode) tak,
           aby equals sprawdzał czy imię, nazwisko i data urodzenia są takie same dla porównywanych obiektów
     e*. Stwórz klasę Ubezpieczyciel, która będzie przechowywać mapowanie numeru pesel na osobę (wykorzystując klasę Osoba)
     f*. W klasie Ubezpieczyciel dodaj metodę dodajOsobe, która jako argumenty będzie przyjmować numer pesel i osobę
     g*. W klasie Ubezpieczyciel dodaj metodę znajdzOsobe, która jako argument przyjmuje numer pesel i zwraca obiekt typu Osoba
     h**. Dostosuj metodę dodajOsobe w klasie Ubezpieczyciel tak, aby zwracała true jeżeli osoby o podanym numerze psesel nie było w bazie,
           a false jeśli taka osoba była już w bazie (dane tej osoby powinny zostać niezmienione)
     i**. W klasie Ubezpieczyciel dodaj metodę aktualizujOsobe, która jako argument przyjmuje numer pesel oraz osobę
           metoda ta powinna zwrócić false jeśli nie ma osoby o podanym pesel w bazie a true jeżeli jest i następnie zaktualizować dane tej osoby
     j**. Stwórz klasę Main z metodą startową aplikacji (Main) i wewnątrz niej stwórz instancję klasy Ubezpieczyciel
           oraz przetestuj zachowanie metod z poprzednich punktów
           */
        Osoba tomMarcinkowski = new Osoba("Tomasz", "Marcinkowski", "24/01/1986");
        Osoba radKowalski = new Osoba("Radosław", "Kowalski", "20/11/1999");
        Osoba annaStuard = new Osoba("Anna", "Stuard", "13/07/1995");
    }
}

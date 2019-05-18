package pl.sda.java.Day7.Task.Building;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

public class Main {
     /*
    1. Stwórz klasę abstrakcyjną Building
   2. Dodaj prywatne pole finalne numberOfFloors jako liczba całkowita oraz zainicjalizuj je
       w konstruktorze na podstawie parametru podanego w argumencie
   3. Dodaj getter do powyższego pola, tak aby klasy dziedziczące
       nie mogły zmienić jego implementacji
   4. Stwórz enum BuildingType z następującymi wartościami:
       CIVIL, MEDICAL, RESIDENTIAL, EDUCATIONAL, OTHER
   5. Dodaj metodę publiczną abstrakcyjną w klasie Building - getBuildingType,
       która zwraca typ BuildingType
       public abstract BuildingType getBuildingType();
   6. Stwórz interfejs OpeningHours
   7. Do powyższego interfejsu dodaj metody openFrom i openTo
       zwracające obiekt LocalTime i przyjmujące jako argument DayOfWeek
   8. Dodaj metodę statyczną currentDay zwracającą aktualny dzień tygodnia
       jako zmienną typu DayOfWeek
   9. Dodaj metodę domyślną isOpen przyjmującą dwa argumenty -
       DayOfWeek i LocalTime oraz zawsze zwracającą wartość true
   10. Dodaj klasę Shop rozszerzającą klasę Building
       oraz implementującą interfejs OpeningHours
   11. Dodaj niezbędne implementacje
   12. W klasie Main dodaj metodę psvm i sprawdź działanie klasy Shop
     */

    public static void main(String[] args) {
 /// tworzymy shop żeby sprawdzić działanie

        Map<DayOfWeek, TimeRange> openingHours = new HashMap<>();

        Shop zabka = new Shop(openingHours);
        boolean isOpen = zabka.isOpen(
                DayOfWeek.MONDAY,
                LocalTime.of(12,0)
        );
        System.out.println("czy zabka jest otwarta o 12 "+ isOpen);
        try {
            LocalTime localTime =zabka.openFrom(DayOfWeek.FRIDAY);
            System.out.println("W piątek godz otwarcia to " + localTime);
        } catch (MissingDayOfWeekException e) {
            System.out.println("w dniu " + e.getMissingDayOfWeek()+ "zamknięte" ); // z ecteptiona wyciągamy dzień bo zapamietaliścmy
            System.out.println(String.format("w dniu %s zamknięte ", e.getMissingDayOfWeek()));  // komunikat ten sam co wyżej,
            // string format zamienia kolejne %s na to co po przecinku

        }

    }
}


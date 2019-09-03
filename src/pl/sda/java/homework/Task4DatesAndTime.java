package pl.sda.java.homework;

import java.time.LocalDateTime;

public class Task4DatesAndTime {

    /*4. Zadeklarujcie pięć zmiennych typu int: minuta, godzina, rok, miesiac, dzien.
    Przypiszcie im odpowiednie wartości odczytując z zegara systemowego
    (użyjcie klasy LocalDateTime - my używaliśmy do tej pory tylko Date).
    Wydrukujcie bieżący czas zgodnie ze schematem: ”12:23 23.11.2017”
Zmodyfikujcie zadanie, aby można było oprócz daty i godziny wyświetlić ile minut minęło od północy.
Dla wcześniejszego przykładu z zadania będzie to 743.
Zmodyfikujcie program, tak aby pokazywał ile procent doby już minęło.
Dodajcie wyświetlanie ile sekund zostało do końca doby. (edited) */

    public static void main(String[] args) {

        LocalDateTime ActualDateAndTime = LocalDateTime.now();
        //System.out.println(ActualDateAndTime);
        int hour= ActualDateAndTime.getHour();
        int minute = ActualDateAndTime.getMinute();
        int year= ActualDateAndTime.getYear();
        int month= ActualDateAndTime.getMonthValue();
        int day= ActualDateAndTime.getDayOfMonth();
        System.out.println(hour + ":"+minute+" "+day+"."+month+"."+year);
        int midnightMinute=hour*60+minute;
        System.out.println("od północy minęło "+(midnightMinute) +" minut.");
        int percentOfDay=((midnightMinute*100)/(24*60));
        System.out.println("minęło" + (percentOfDay) + " procent doby");

    }
}

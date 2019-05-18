package pl.sda.java.Day6.homework.AlergicCalendar;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AlergicCalendar {

   public static void main(String[] args) {


        RangeOfDate rangeTrawa = new RangeOfDate("20.3 ", " 15.7");
        RangeOfDate rangeGrzyby = new RangeOfDate("10.6 ", " 25.10");
        RangeOfDate rangeTruskawki = new RangeOfDate("10.5 ", " 20.6");

        Map<String, RangeOfDate> alergenAktivDate = new TreeMap<>();
        alergenAktivDate.put("Trawa", rangeTrawa);
        alergenAktivDate.put("Grzyby", rangeGrzyby);
        alergenAktivDate.put("Truskawki", rangeTruskawki);

        System.out.println(alergenAktivDate.keySet());
        System.out.println(alergenAktivDate.values().toString()); // nie wyświetla wartosci /// czemu nie ?? ///

    }


}

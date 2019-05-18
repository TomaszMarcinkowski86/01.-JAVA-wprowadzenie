package pl.sda.java.Day7.Task.Building;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;

public interface OpeningHours {

    LocalTime openFrom(DayOfWeek dayOfWeek) throws MissingDayOfWeekException;
    LocalTime openTo(DayOfWeek dayOfWeek) throws MissingDayOfWeekException;

    static DayOfWeek currentDay(){
        return LocalDate.now().getDayOfWeek(); // pobierze aktualną datę i zwróci dzień tygodnia
    }

    default boolean isOpen(DayOfWeek dayOfWeek, LocalTime localTime) {
        return false;
    }
}


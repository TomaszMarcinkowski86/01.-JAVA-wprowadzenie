package pl.sda.java.Day7.Task.Building;

import java.time.DayOfWeek;

public class MissingDayOfWeekException extends Exception {
//    zapamiętujemy którego dnia dygodnia brakowałoa
    private DayOfWeek missingDayOfWeek;

    public MissingDayOfWeekException( DayOfWeek missingDayOfWeek) { // konstruktorów się nie dziedziczy to musieliśmy stworzyć własny
        super("Brak następującego dnia tygodnia: " + missingDayOfWeek);
        this.missingDayOfWeek=missingDayOfWeek;
    }

    public DayOfWeek getMissingDayOfWeek() {
        return missingDayOfWeek;
    }
}

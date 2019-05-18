package pl.sda.java.Day7.Task.Building;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.Map;

public class Shop extends Building implements OpeningHours {

    private Map<DayOfWeek, TimeRange> openingHours;

    public Shop(Map<DayOfWeek, TimeRange> openingHours) { // ktoś nam będzie podawał te godziny otwarcia
        super(1);  // tu przyjeliśmy że tworząc sklep będzie on miał 1 piętro
        this.openingHours=openingHours;
    }

    @Override
    public buildingType getBuildingType() {
        return buildingType.CIVIL; // każdy sklep będzie cywilny
    }

    @Override
    public LocalTime openFrom(DayOfWeek dayOfWeek) throws MissingDayOfWeekException {
        TimeRange timeRange = openingHours.get(dayOfWeek); // dzien tygodnia na zakres godzin
        if (timeRange != null) {
            return timeRange.getOpenFrom();
        } else {
            throw new MissingDayOfWeekException(dayOfWeek);
        }
    }

    @Override
    public LocalTime openTo(DayOfWeek dayOfWeek) throws MissingDayOfWeekException{
        TimeRange timeRange = openingHours.get(dayOfWeek); // dzien tygodnia na zakres godzin
        if (timeRange != null) { // sprawdzamy czy taki dzień jest w naszej mapie
            return timeRange.getOpenFrom(); // zwracamy godziny otwarcia
        } else { // jeśli nie rzucamy wyjątkiem
            throw new MissingDayOfWeekException(dayOfWeek);
        }
    }

    @Override
    public boolean isOpen(DayOfWeek dayOfWeek, LocalTime localTime) {
        if(openingHours.containsKey(dayOfWeek)){// sprawdza czy w danym dniu jest otwarty
            TimeRange timeRange=openingHours.get(dayOfWeek);
            if (localTime.isAfter(timeRange.getOpenFrom().minusSeconds(1))&& localTime.isBefore(timeRange.getOpenTo().plusSeconds(1)));
        }
        return true;
    }
}

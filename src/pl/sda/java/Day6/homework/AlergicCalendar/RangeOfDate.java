package pl.sda.java.Day6.homework.AlergicCalendar;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;


public class RangeOfDate {

    private LocalDate start;
    private LocalDate end;

    DateTimeFormatter df = DateTimeFormatter.ofPattern("dd.MM");
    private String startShort = df.format(start);
    private String endShort = df.format(end);

    public RangeOfDate(String startShort, String endShort) {
        this.startShort = startShort;
        this.endShort = endShort;
    }

    public RangeOfDate(String startShort) {
        this.startShort = startShort;
    }

    public RangeOfDate(LocalDate start, LocalDate end) {
        this.start = start;
        this.end = end;
    }

    public LocalDate getStart() {
        return start;
    }

    public LocalDate getEnd() {
        return end;
    }

    public String getStartShort() {
        return startShort;
    }

    public String getEndShort() {
        return endShort;
    }


}
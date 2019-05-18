package pl.sda.java.Day6.homework.InsuredPeople;

import java.util.Date;
import java.util.Objects;

public class Osoba {

    private String imie;
    private String nazwisko;
    private String dataUrodzenia;

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getDataUrodzenia() {
        return dataUrodzenia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Osoba osoba = (Osoba) o;
        return Objects.equals(imie, osoba.imie) &&
                Objects.equals(nazwisko, osoba.nazwisko) &&
                Objects.equals(dataUrodzenia, osoba.dataUrodzenia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie, nazwisko, dataUrodzenia);
    }

    public Osoba(String imie, String nazwisko, String dataUrodzenia) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;


    }
}

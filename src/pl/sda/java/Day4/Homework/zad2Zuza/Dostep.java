package Zadanie2;

public class Dostep {
    private String nazwaSali;
    private String nazwaOsoby;
    private boolean dostep;

    public Dostep(String nazwaSali, String nazwaOsoby, boolean dostep) {
        this.nazwaSali = nazwaSali;
        this.nazwaOsoby = nazwaOsoby;
        this.dostep = dostep;
    }

    @Override
    public String toString() {
        return "sala: " + nazwaSali + " osoba: " + nazwaOsoby + " dostep: " + dostep;
    }

    public String getNazwaSali() {
        return nazwaSali;
    }

    public String getNazwaOsoby() {
        return nazwaOsoby;
    }

    public boolean isDostep() {
        return dostep;
    }
}

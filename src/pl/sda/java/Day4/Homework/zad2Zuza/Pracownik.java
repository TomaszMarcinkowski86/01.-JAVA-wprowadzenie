package Zadanie2;

public abstract class Pracownik  {
    private String stanowisko;
    private int dostepDoSal;

    public Pracownik(String stanowisko, int dostepDoSal) {
        this.stanowisko = stanowisko;
        this.dostepDoSal = dostepDoSal;
    }

    public String getStanowisko() {
        return stanowisko;
    }

    public int getDostepDoSal() {
        return dostepDoSal;
    }
}

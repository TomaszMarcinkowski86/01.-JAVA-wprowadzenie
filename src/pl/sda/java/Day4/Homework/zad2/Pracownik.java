package pl.sda.java.Day4.Homework.zad2;

public abstract class  Pracownik {

   private  int poziomDostepu;

    private String[] stanowisko; // = {"Wozny", "Dyrektor","Nauczyciel","Uczen"};

    public int getPoziomDostepu() {
        return poziomDostepu;
    }

    public String[] getStanowisko() {
        return stanowisko;
    }

    public Pracownik(int poziomDostepu, String[] stanowisko) {
        this.poziomDostepu = poziomDostepu;
        this.stanowisko = stanowisko;

    }
}

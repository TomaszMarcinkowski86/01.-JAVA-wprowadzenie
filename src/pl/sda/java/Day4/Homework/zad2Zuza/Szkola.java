package Zadanie2;

import java.util.ArrayList;
import java.util.Arrays;

public class Szkola {
    ArrayList<Sala> listaSal = new ArrayList<>();
    GabinetDyrektora gabinetDyrektora = new GabinetDyrektora();
    PokojNauczycielski pokojNauczycielski = new PokojNauczycielski();
    PomieszczenieGospodarcze pomieszczenieGospodarcze = new PomieszczenieGospodarcze();
    SalaLekcyjna salaLekcyjna = new SalaLekcyjna();
    Szatnia szatnia = new Szatnia();
    Pracownik dyrektor = new Dyrektor();
    Pracownik nauczyciel = new Nauczyciel();
    Pracownik wozny = new Wozny();
    Pracownik uczen = new Uczen("zwykly uczen", 0);
    Pracownik uczen2 = new Uczen("przewodniczacy klasy", 1);
    Pracownik[] listaPracownikow = new Pracownik[]{dyrektor, nauczyciel, uczen, uczen2, wozny};

    public ArrayList<Sala> utworzListeSal() {
        listaSal.add(gabinetDyrektora);
        listaSal.add(pokojNauczycielski);
        listaSal.add(pomieszczenieGospodarcze);
        listaSal.add(salaLekcyjna);
        listaSal.add(szatnia);
        return listaSal;
    }

    public void wypiszDostep() {
        ArrayList<String> bezDostepu = new ArrayList<>();
        for (Sala sala : listaSal) {
            bezDostepu.clear();
            System.out.println(sala.nazwa());
            System.out.print("   DOSTEP MA:  ");
            for (Pracownik osoba : listaPracownikow) {
                if (sala.otworz(osoba.getDostepDoSal())) {
                    System.out.print(osoba.getStanowisko() + ",  ");
                } else {
                    bezDostepu.add(osoba.getStanowisko());
                }
            }
            System.out.println();
            System.out.println("   BRAK DOSTEPU DLA: " + bezDostepu);
            System.out.println();
        }
    }

    public ArrayList<Dostep> podajDostep() {
        ArrayList<String> bezDostepu = new ArrayList<>();
        ArrayList<Dostep> listaDostepu = new ArrayList<>();
        for (Sala sala : listaSal) {
            bezDostepu.clear();
            for (Pracownik osoba : listaPracownikow) {
                boolean wartosc = false;
                if (sala.otworz(osoba.getDostepDoSal())) {
                    wartosc = true;
                }
                Dostep element = new Dostep(sala.nazwa(), osoba.getStanowisko(), wartosc);
                listaDostepu.add(element);
            }

        }

        return listaDostepu;
    }


}

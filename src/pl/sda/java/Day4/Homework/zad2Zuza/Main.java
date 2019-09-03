package Zadanie2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Uczen uczenZwykly = new Uczen("zwykly uczen", 0);
        System.out.println(uczenZwykly.getStanowisko());

        Szkola szkola = new Szkola();
        szkola.utworzListeSal();
        szkola.wypiszDostep();

        //_____________________________________________________________________METODA ZWRACANIA (POPRZEDNIA TYLKO WYSWIETLAŁA

        System.out.println("druga metoda");

        System.out.println(szkola.podajDostep());
        System.out.println();

        System.out.println("Ci co maja dostep:");
        for (Dostep element : szkola.podajDostep()) {
            if(element.isDostep()){
                System.out.println(element);
            }

        }

    }
}

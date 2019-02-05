package pl.sda.java.Day4;

public abstract class PrzykladKlasyAbstrakcyjnej {

    // nie ma ograniczeń jeśli chodzi o typ zmiennych czy typ metod
    // klasa abstrakcyjna może rozszerzać inne klasy


    private int a;
    public int a1;
    protected int a2;
    int a3;

    public abstract int fun5();  // nie da się wywołać tu tej metody ale nie musi nic zwracać
                                 // wymusi implementację takiej metody w każdej klasie która dziedziczy z tej klasy
}

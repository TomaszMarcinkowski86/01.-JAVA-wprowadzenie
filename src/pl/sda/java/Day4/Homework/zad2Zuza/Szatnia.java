package Zadanie2;

public class Szatnia implements Sala {
    @Override
    public boolean otworz(int dostep) {
        return true;
    }

    @Override
    public String nazwa() {
        return "szatnia ";
    }
}

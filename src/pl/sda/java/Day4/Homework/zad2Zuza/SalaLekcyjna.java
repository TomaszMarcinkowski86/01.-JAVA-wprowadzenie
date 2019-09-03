package Zadanie2;

public class SalaLekcyjna implements Sala {
    @Override
    public boolean otworz(int dostep) {
        if (dostep>=1){
            return true;
        }return false;
    }

    @Override
    public String nazwa() {
        return "sala lekcyjna ";
    }
}

package Zadanie2;

public class PokojNauczycielski implements Sala {
    @Override
    public boolean otworz(int dostep) {
        if (dostep>=2){
            return true;
        }return false;
    }

    @Override
    public String nazwa() {
        return "pokoj nauczycielski ";
    }
}

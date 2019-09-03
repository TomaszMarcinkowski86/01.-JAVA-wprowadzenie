package Zadanie2;

public class GabinetDyrektora implements Sala {
    @Override
    public boolean otworz(int dostep) {
        if(dostep==3){
            return true;
        }
        return false;
    }

    @Override
    public String nazwa() {
        return "gabinet dyrektora ";
    }
}

package pl.sda.java.Day4;

public enum PalletColor {

    // W enumie definiujemy stałe wartości. Np jak tu plateta kolorów
    RED(1),
    WHITE(34),
    BLACK(3),
    YELLOW(4);

    private int number;

    PalletColor(int number) {  //konstruktor jak go dodamy to przy RED
        this.number = number;
    }

    public int getNumber(){
        return number;
    }

    public static PalletColor getColor(int number){
        for(PalletColor  tempColor: PalletColor.values()){
            if (tempColor.number==number ){
                return tempColor;
            }
        }
        return null;
    }
}

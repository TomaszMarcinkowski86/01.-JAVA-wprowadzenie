package pl.sda.java.Day4;

public class MainEnum {
    public static void main(String[] args) {

        PalletColor kolor1 = PalletColor.BLACK;// przypisanie koloru z Enuma
        System.out.println(kolor1.getNumber());         //
        System.out.println(PalletColor.RED.getNumber());

        pomaluj(PalletColor.YELLOW);
        pomaluj(PalletColor.getColor(3));
        PalletColor black = PalletColor.valueOf("black".toUpperCase());
        pomaluj(black);

    }
    public static void pomaluj(PalletColor palletColor){
        System.out.println("Malunj na kolor numer "+ palletColor.getNumber());
        System.out.println("Maluj na "+ palletColor);

    }
}

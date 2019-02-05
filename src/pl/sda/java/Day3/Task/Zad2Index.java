package pl.sda.java.Day3.Task;

public class Zad2Index {

    private double srednia;
    private Zad1Person daneOsoba;
    private int[] oceny;



    public Zad2Index(Zad1Person daneOsoba) {
        this.daneOsoba = daneOsoba;
    }
    public double getSrednia() {
        return srednia;
    }
    public boolean isZagrozenie() {
        for(int ocena:oceny){
            if(ocena<=2){
                return true;
            }
        }
        return false;
    }
    public Zad1Person getDaneOsoba() {
        return daneOsoba;
    }
    public int[] getOceny() {
        return oceny;
    }
    public void setOceny(int[] oceny) {
        this.oceny = oceny;
    }
    public  double srednia() {
        double suma = 0;
        for (int i = 0; i < oceny.length; i++) {
            suma = suma + oceny[i];

        }
         return suma/oceny.length;

    }
}


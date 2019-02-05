package pl.sda.java.Day3.Task;

public class Main {
    public static void main(String[] args) {

        Zad1Person TM=new Zad1Person("Tomasz", "Marcinkowski",33,'M');
        Zad2Index indeksTM=new Zad2Index(TM);
        int[] oceny = new int[]{2,3,5,6,2,3,4,4,2};
        indeksTM.setOceny(oceny);
        double srednia = indeksTM.srednia();
        System.out.println(srednia);
        System.out.println();
        }
    }


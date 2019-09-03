package pl.sda.java.Day1K;

import java.util.Scanner;

public class Method {

    public static final double INCH_TO_METER_MULTIPLIER = 0.0254;

    public static void main(String[] args) {

        //klasyczne podejćie bez metody
        int a=5;
        int b=6;
        System.out.println(a+b);


        //wywołanie metody tej która jest poniżej - te metody nic nie zwracają
        printSum(a,b);
        printSum(2,4);

        //ta metoda coś nam zwróci
        int result = returnSum(a,b);
        System.out.println(result);//może być tak wyprintowane

        System.out.println(returnSum(a,b)); //można to wyprintować bez tej linijki powyżej (linia17)

        // wywołanie metody inchToMeter z użyciem skanera przy okazji
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę cali do konwersji: ");
        double inches = scanner.nextInt();
        System.out.println(inchToMeter(inches));


    }

    public static void printSum(int a, int b) { // metoda nic nie zwraca ( bo mamy void) - tylko się wykonyje tu wyprintuje coś

        System.out.println("efekt działania metody printSum: " +(a+b));
    }

    public static int returnSum(int a, int b)  { // metoda zwróci wynik (sumę typu int(mamy int))
        return a+b;


    }
    public static double inchToMeter(double inches ) {

        return inches*INCH_TO_METER_MULTIPLIER;
    }


}

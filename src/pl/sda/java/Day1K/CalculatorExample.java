package pl.sda.java.Day1K;

import java.util.Scanner;

public class CalculatorExample {
    public static void main(String[] args) {  // args - argumenty, nazwa własna może być dowolne ale przyjęło się args

        Scanner scanner = new Scanner(System.in);
        //powołaj nowy obiekt typu skaner
        // System.in - system input

        System.out.println("Podaj pierwszą liczbę: ");
        int firstValue = scanner.nextInt();

        System.out.println("Podaj drugą liczbę: ");
        int secondValue = scanner.nextInt();


        System.out.println("a+b = " + (firstValue + secondValue));
        System.out.println("a-b = " + (firstValue - secondValue));
        System.out.println("a/b = " + (firstValue / secondValue));
        System.out.println("a*b = " + (firstValue * secondValue));
        System.out.println("absolute value of |a-b|: " + Math.abs((firstValue - secondValue)));
        System.out.println("max value a i b: " + Math.max(firstValue, secondValue));  // max value
        System.out.println("power a do b: " + Math.pow(firstValue, secondValue));  // potęgowanie




    }
}

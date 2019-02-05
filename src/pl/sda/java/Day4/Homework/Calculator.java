package pl.sda.java.Day4.Homework;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        /*1. Stwórz klasę Kalkulator o następujących funkcjonalnościach:
   a. Dodawanie 2 liczb
   b. Odejmowanie 2 liczb
   c. Mnożenie 2 liczb
   d. Dzielenie 2 liczb
   e. Reszta z dzielenia 2 liczb
   f*. Zwracanie największej liczby z tablicy liczb całkowitych
   g*. Sumowanie wszystkich liczb z tablicy liczb całkowitych
   h*. Wyliczanie średniej z tablicy liczb zmiennoprzecinkowych
   i*. Potęgowanie 2 liczb (pierwszy argument podniesiony do potegi z drugiego argumentu)
*/
        int[] tab = {1, 3, 4, 3, 56, 43};
        double[] doubleTab = {2.3,3.3,5,7.6};

        System.out.println(arrayOperation(tab));
        System.out.println(sumArray(tab));
        System.out.println(average(doubleTab));


    }

    public static void Calc() {
        Scanner scanner = new Scanner(System.in);
        double number1;
        double number2;
        System.out.println("Witaj w kalkulatorze");
        System.out.println("Podaj 2 liczy: ");

        number1 = scanner.nextDouble();
        number2 = scanner.nextDouble();
        int sign;
        boolean end = true;

        do {
            System.out.println("Wybierz działanie:");
            System.out.println("1: suma, 2: róznica, 3: mnożenie, 4: dzielenie");
            System.out.println("5: reszta z dzielenia, 6: podniesienie 1-sej liczby do potęgi 2-giej");
            System.out.println("0: koniec");
            sign = scanner.nextInt();
            {
                if (sign == 1) {
                    System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
                } else if (sign == 2) {
                    System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));
                } else if (sign == 3) {
                    System.out.println(number1 + " * " + number2 + " = " + (number1 * number2));
                } else if (sign == 4) {
                    System.out.println(number1 + " / " + number2 + " = " + (number1 / number2));
                } else if (sign == 5) {
                    System.out.println("Reszta z dzielenia = " + (int) (number1 % number2));
                } else if (sign == 6) {
                    System.out.println("Potęgownaie = " + Math.pow(number1, number2));
                } else if (sign == 0) {
                    end = true;
                    break; // dopiero zadziałało jak to wstawiłem
                } else
                    System.out.println("Wybrałeś nieprawidłowy znak");
            }
        } while (end);
//    } while (end=true); nie działało czemu??


    }

    public static int arrayOperation(int[] tab) {
        int maxValue = tab[0];
        for (int i = 1; i < tab.length; i++) {
            if (tab[i] > maxValue) {
                maxValue = tab[i];
            }
        }
        return maxValue;
    }

    public static int sumArray(int[] tab) {
        int sum = tab[0];
        for (int i = 0; i < tab.length; i++) {
            sum +=tab[i];
        }
        return sum;
    }
    public static double average(double[] doubleTab){
        double sum = doubleTab[0];
        for (int i = 0; i < doubleTab.length; i++) {
            sum +=doubleTab[i];
        }
         return sum/doubleTab.length;
    }


}




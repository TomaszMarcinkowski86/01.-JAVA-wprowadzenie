package pl.sda.java.homework;

public class Task8LoopsInne {
    public static void main(String[] args) {

        /*Utwórz metodę, do której przekazujesz dwa parametry (np  min  i  max )
         a następnie wyswietlasz wszystkie liczby z podanego przedziału
         Utwórz metodę, do której przekazujesz dwa parametry.
         Metoda ma wyświetlić wszystkie potęgi pierwszej liczby do momentu przekroczenia drugiej liczby.
         printCubesOfNumbers - wyswietlenie kolejnych liczb z wybranego zakresu i ich sześcianów
         countdown - odliczanie w dół po podaniu liczby startowej
         printMultiplications - wypisanie wyników mnożenia podanej liczby przez kolejne liczby całkowite do tej liczby włącznie
         */
        MinMax(5, 20);
        PowAndNumber(2,20);
    }

    public static int MinMax(int min, int max) {
        for (int i = min; i <= max; i++) {
            System.out.println(i);
        }
        return max; // wskoczyło z automatu czemu min - działa też max czy to jest poprawne czy dodać jakąś zminną na wyjście inną
    }

    public static void PowAndNumber(int num1, int num2) {
        for (int i = num1; i <= num2; i++) {
            double powNum1 = Math.pow(i, 2);
            if (powNum1 < num2) {
                System.out.println("liczba " + i + " do kwadratu " + " = " + powNum1);
            }
        }

    }
}
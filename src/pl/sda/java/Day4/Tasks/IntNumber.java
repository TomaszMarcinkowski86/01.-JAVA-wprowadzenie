package pl.sda.java.Day4.Tasks;

public class IntNumber {
    /*Cwiczenie 3 ---
     6. Stwórz klasę, która przechowuje tablicę liczb całkowitych
     7. Dodaj konstruktor, który jako argument przyjmuje tablicę liczb całkowitych
     8. Dodaj metodę, która wypisze na konsolę 2 najmniejsze oraz 2 największe
       liczby z podanej tablicy*/

    private int[] numbers;

    public IntNumber(int[] numbers) {
        this.numbers = numbers;
    }

    public void twoMaxAndTwoMin(int[] numbers) {
        if (numbers.length < 2) {
            System.out.println("Tablica liczb musi mieć min 2 elementy");
        } else {
            int min1 = numbers[0];
            int min2 = numbers[1];
            int max1 = numbers[0];
            int max2 = numbers[1];

            for (int i = 1; i < numbers.length; i++) {
                if (min1 > numbers[i]) {
                    min2 = min1;
                    min1 = numbers[i];
                } else if (min2 > numbers[i]) {
                    min2 = numbers[i];
                }
                if (max1 < numbers[i]) {
                    max2 = max1;
                    max1 = numbers[i];
                } else if (max2 < numbers[i]) {
                    max2 = numbers[i];
                }
            }
            System.out.println("Min1: " + min1);
            System.out.println("Min2: " + min2);
            System.out.println("Max1: " + max1);
            System.out.println("Max2: " + max2);
        }
    }
}

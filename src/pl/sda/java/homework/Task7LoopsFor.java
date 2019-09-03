package pl.sda.java.homework;

public class Task7LoopsFor {
    public static void main(String[] args) {

        /*7. metodki z pętlami:
             printCubesOfNumbers - wyswietlenie kolejnych liczb z wybranego zakresu i ich sześcianów
             countdown - odliczanie w dół po podaniu liczby startowej
             printMultiplications - wypisanie wyników mnożenia podanej
             liczby przez kolejne liczby całkowite do tej liczby włącznie
         */
        printCubesOfNumbers(3);
        countdown(10);
        printMultiplications(5);

    }
    public static void printCubesOfNumbers( int limit){
        for (int i = 0; i < limit; i++) {
            double cubes = Math.pow(i,3);
            System.out.println(i +" sześcian tej liczby "+ i + "^3 to "+cubes);
        }
    }
    public static void countdown(int startNumber){
        for (int i = startNumber; i >=0; i--) {
            System.out.println(i);
        }
    }
    public static void printMultiplications(int liczba){
        for (int i = 0; i <= liczba ; i++) {
            int result = i*liczba;
            System.out.println(i +" * " + liczba+" = " +result);

        }
    }


}

package pl.sda.java.homework;



public class Task3Numbers {
    public static void main(String[] args) {

        /*3. Napiszcie program określający wartość liczby.
Jeśli liczba jest dodatnia to podaje:
-dla zakresu 0..100 podaje "mała liczba dodatnia"
-dla zakresu 101..1000 podaje "liczba dodatnia"
-dla zakresu 1001.. "duża liczba dodatnia"
Analogicznie dla wartości ujemnych*/

        System.out.println(sizeNumbers(-2449343));
    }

    public static String sizeNumbers(int a) {

        if (a <= -1001) {
            return "Duża liczba ujemna";
        } else if ((a <= -101) && (a > -1001)) {
            return "liczba ujemna";
        } else if ((a < 0) && (a > -101)) {
            return "Mała liczba ujemna";
        } else if ((a > 0) && (a <= 100)) {
            return "Mała liczba dodatnia";
        } else if ((a >= 101) && (a <= 1000)) {
            return "Liczba dodatnia";
        } else if ((a >= 1001)) {
            return "Duża liczba dodatnia";
        } else
            return "Liczba = 0";

    }
}


package pl.sda.java.homework;

import java.math.BigDecimal;

public class Task6UserMethods {
    public static void main(String[] args) {

/* sprawdzanie czy podany String jest pusty albo nullowy -> `boolean`
 >* zamiana `String` na `BigDecimal` z zaokrąglaniem do trzech miejsc po przecinku (od połowy w górę)
 >* zamiana podanej temperatury w stopniach `Celsiusza` na `Fahrenheita`
 >* zamiana podanej temperatury w stopniach `Fahrenheita` na `Celsiusza`
 >* zamiana podanej prędkości `km/h` (kilometrów na godzinę) na `mph` (mil na godzinę)
 >* zamiana podanej prędkości `km/h` (kilometrów na godzinę) na `m/s` (metrów na sekundę)
 >* zamiana podanej liczby minut na liczbę **pełnych** kwadransów (np. `45 -> 3`, `59 -> 3`)
 >* DODAJCIE CO NAJMNIEJ TRZY **WŁASNE** METODY PRZELICZAJĄCE WARTOŚCI*/

        System.out.println(checkString("asad"));
        System.out.println(stringToBigDecimal("2333.456567"));
        System.out.println(celsiusToFarenheit(25.0));
        System.out.println(farenheitToCelsius(77));
        System.out.println(kmhToMph(100));
        System.out.println(kmhToMs(100));
        System.out.println(minutsToFullQuaters(77));
        System.out.println(fullDaysInHours(360));
        System.out.println(DaysOfWorkInHours(360));

        System.out.println(BeerToPromile(1,5.5,80,"k"));
    }

    public static boolean checkString(String test) {
        boolean check;
        if (test.equals(null)||test.equals("")) {
            return true;
        } else {
            return false;
        }
    }
    public static BigDecimal stringToBigDecimal(String number){
        double number2 = Double.valueOf(number);  // zmiana ze stringa na doubla
        BigDecimal result = BigDecimal.valueOf(number2); // z doubla na BigDecimal
        return result.setScale(3,BigDecimal.ROUND_CEILING);
    }
    public static double celsiusToFarenheit(double c){
       double tempF = ((c * 9/5.0) +32);
       return tempF;
    }
    public static double farenheitToCelsius(double f) {
        double tempC = ((f - 32) * 5 / 9.0);
        return tempC;
    }
    public static double kmhToMph(double kmh) {
        double mph = Math.round((kmh * 0.621371)*100); // zaokrąglenie w górę ((przelicznik)*100żeby 2 miejsca więcej
        return mph = mph/100; // dzielimy przez 100 żeby zostawić 2 miejsca po przecinku
    }
    public static double kmhToMs(double kmh) {
        double ms = Math.round((kmh / 3.6)*100); // zaokrąglenie w górę ((przelicznik)*100żeby 2 miejsca więcej
        return ms = ms/100; // dzielimy przez 100 żeby zostawić 2 miejsca po przecinku
    }
    public static int minutsToFullQuaters(int minuts){
        int result =minuts/15;
        return result;
    }
    public static int fullDaysInHours(int hours){
        int result = hours/24;
        return result;
    }
    public static int DaysOfWorkInHours(int hours){
        int result = hours/8;
        return result;
    }
    // dane do obliczeń stad: http://piro.wikidot.com/teoria
    //prosty przelicznik ilości wypitych piw na promile - do dopracowania szczegółów należy uwzględnić więcej
    public static double BeerToPromile(int numberOfBigBeers, double alcoholInBeer, int mass, String male){
        double alcoholMl = numberOfBigBeers*500*(alcoholInBeer/100); //liczba piw * pól litrowe piwo*procentowa zawartość/100
        double alkoholGram = alcoholMl*0.79; // aklohol w ml * ęstość alkoholu
        double bodyFluids;
        if(male.equals("k"))
            {
                bodyFluids = 0.6;
            }
            else if (male.equals("m")) {
                bodyFluids = 0.7;
            } else
                bodyFluids = 0;

        double bodyFluidsOfYou = bodyFluids*mass;
        double result = Math.round((alkoholGram/bodyFluidsOfYou)*100);
        return result/100;

    }

}

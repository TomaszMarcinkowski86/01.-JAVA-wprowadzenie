package pl.sda.java.homework;

import java.util.Scanner;

public class Task1Conversion {
    public static void main(String[] args) {

        /*Cześć. Jak się czujesz?" <pobranie wartości String - o tym jak się czujecie>
"Cieszę się, że czujesz się " ... -> wyświetlenie wartości
"Jak masz na imię?" <pobranie wartości imienia>
"Ile masz lat?" <pobranie wartości lat>
imie + " masz " + wiek + " lat" -> wypisanie wartości
"Ile masz wzrostu (dokładnie!)?" <pobranie wartości wzrostu>
imie + " masz " + wzrost + " cm" -> wypisanie wartości
"A jak czujesz się teraz?" <pobranie wartości i reużycie zmiennej o samopoczuciu>
"Cieszę się, że czujesz się " -> wyswietlenie samopoczucia*/

        Scanner scanner = new Scanner(System.in);


        System.out.println("Cześć. Jak się czujesz?");
        String feel = scanner.nextLine();
        System.out.println("Cieszę się że czujesz się " + feel + " .");
        System.out.println("Jak masz na imię ?");
        String name = scanner.nextLine();
        System.out.println("Ile masz lat ?");
        int age = scanner.nextInt();
        System.out.println(name + " masz " + age + " lat.");
        System.out.println("Ile masz wzrostu ?");
        int stature = scanner.nextInt();
        System.out.println(name + " masz " + stature + " cm.");
        System.out.println("A jak się czujesz teraz ? ");
        String feelEnd = scanner.next();  // czemu tu .nextLine nie zadziałała przeskakuje do kolejnej linii
        System.out.println("Cieszę się, że czujesz się " + feelEnd + ".");


    }
}

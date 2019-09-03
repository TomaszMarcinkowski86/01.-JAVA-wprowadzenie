package pl.sda.java.homework;

import java.util.Scanner;

public class Task16Welcome {
    public static void main(String[] args) {

        /*16. Napisz program, który po podaniu kodu języka (dostępne PL, EN, DE, FR) wyświetli odpowiedni napis powitalny (przy użyciu "switch")
        w danym języku (dla PL – „Dzień dobry. Witam serdecznie”, dla EN – „Good morning. Welcome!”, dla DE – „Guten Morgen. Herzlich Willkommen!”,
        dla FR – „Bonne matin.
        Bienvenue!”). Jeżeli wprowadzony kod nie odpowiada żadnemu z powyższych program powinien o tym poinformować i przywitać się w języku angielskim.
         */
        Welcome();
    }


    public static void Welcome() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz język: PL, EN, DE, FR:");
        switch (scanner.nextLine()) {
            case "PL":
            case "pl":
                System.out.println("Dzień dobry. Witam serdecznie");
                break;
            case "EN":
            case "en":
                System.out.println("Good morning. Welcome!");
                break;
            case "DE":
            case "de":
                System.out.println("Guten Morgen. Herzlich Willkommen!");
                break;
            case "FR":
            case "fr":
                System.out.println("Bonne matin. Bienvenue!!");
                break;
            default:
                System.out.println("Bad language code!! Try again! Welcome!");
                break;
        }
    }
}

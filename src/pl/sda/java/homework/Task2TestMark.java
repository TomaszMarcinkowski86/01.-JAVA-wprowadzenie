package pl.sda.java.homework;

import java.util.Scanner;

public class Task2TestMark {


    public static void main(String[] args) {

        /*2. Napiszcie program, który pyta o ilość uzyskanych punktów z testu (0-100), a następnie wystawia ocenę
         (gdzie 50 punktów zalicza test, a każde następne 10 podwyższa ocenę o 1,
         tak że 90-100 punktów daje najwyższą możliwą ocenę czyli 6). Użyj zagnieżdżonej instrukcji if … else if … else
        */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ile masz punktów z testu ?");
        int points = scanner.nextInt();
        if (points<50){
            System.out.println("Nie zdałeś !!!");
        }
        else if ((points>=50) &&(points<60)){
            System.out.println("Ledwo zdałeś na 2");
        }
        else if ((points>=60)&&(points<70)){
            System.out.println("Twoja ocena to 3");
        }
        else if ((points>=70)&&(points<80)){
            System.out.println("Twoja ocena to 4");
        }
        else if ((points>=80)&&(points<90)){
            System.out.println("Twoja ocena to 5");
        }
        else if ((points>=90)&&(points<=100)){
            System.out.println("Twoja ocena to 5");
        }
        else
            System.out.println("Niemożliwe test miał 100 pkt jakim cudem uzyskałeś "+ points +" ptk ??");


    }
}

package pl.sda.java.homework;

public class Taks10forWhileDoWhile {

    public static void main(String[] args) {
        /*10. Napisz metodę, która wyświetli na ekranie liczby od 1 do 20
        i zaznaczy przy każdej z nich, czy jest to liczba parzysta, czy nieparzysta.
        Zrób to:
        wykorzystując pętlę for
        wykorzystując pętlę while
        wykorzystując pętle do…while
        */
        //loopsyFor(5);
        //loopsyWhile(5);
        loopsyDoWhile(5);
    }

    public static void loopsyFor(int num) {
        for (int i = 1; i <= num; i++) {
            String oddOrEven;
            if ((i %2) == 0) {
                oddOrEven = " parzystą ";
            } else {
                oddOrEven = " nieparzystą ";
            }
            System.out.println("liczba " + i + " jest liczbą " + oddOrEven);
        }
    }
    public static void loopsyWhile(int num) {
        int i = 0;
        while(i<num){
            i= i+1 ;
            String oddOrEven;
            if ((i %2) == 0) {
                oddOrEven = " parzystą ";
            } else {
                oddOrEven = " nieparzystą ";
            }
            System.out.println("liczba " + i + " jest liczbą " + oddOrEven);

        }
    }
    public static void loopsyDoWhile(int num) {
        int i = 0;
        do{
            i= ++i;
            String oddOrEven;
            if ((i %2) == 0) {
                oddOrEven = " parzystą ";
            } else {
                oddOrEven = " nieparzystą ";
            }
            System.out.println("liczba " + i + " jest liczbą " + oddOrEven);
        }while
            (i <num);


    }
}

package pl.sda.java.homework;



import java.util.Scanner;

public class Task15Calc {
    public static void main(String[] args) {
  /*Należy napisać program przyjmujący dwie liczby (scanner) i wykonujący na nich różne działania w pętli while
  (w zależności od wyboru - "+", "-" itd - tu można użyć if...else lub switch).
  Program powinien zakończyć działanie po wpisaniu "koniec".
   */
calc();

    }
    public static void calc(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj 2 liczby i znak działania do wykonania: ");
        double a =scanner.nextDouble();
        double b =scanner.nextDouble();
        String sign;
        boolean end=true;
        do{
            System.out.println("Wybierz znak (+), (-), (*), (/) lub (end) by zakonczyc");
            sign=scanner.next();
            scanner.nextLine();
            switch (sign){
                case "+":
                    System.out.println(a +"+"+b+"="+(a+b));
                    break;
                case "-":
                    System.out.println(a +"-"+b+"="+(a-b));
                    break;
                case "*":
                    System.out.println(a +"*"+b+"="+(a*b));
                    break;
                case "/":
                    System.out.println(a +"/"+b+"="+(a/b));
                    break;
                case "end":
                    end=false;
                    break;
            }
        }while (end);

    }
}

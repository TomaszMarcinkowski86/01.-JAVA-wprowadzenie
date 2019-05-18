package pl.sda.java.Day8.Task.Wielowatkowosc2;

public class Main {

    /* 1. Stwórz klasę, która dziedziczy po Thread
       2. Napisz w powyższej klasie metodę run, która będzie wypisywać liczby parzyste od 1 do 50 z opóźnieniem 250 milisekund
       3. Stwórz klasę, która implementuje interfejs Runnable
       4. Zaimplementuj w powyższej klasie metodę run, która będzie wypisywać liczby nieparzyste od 50 do 1 z opóźnieniem 250 milisekund
       5. Stwórz klasę Main z metodą main (psvm) wraz obiektami obu klas i wywołał na nich metodę start
   */

    public static void main(String[] args) {
        ExtendedThread2 extendedThread2=new ExtendedThread2();
        extendedThread2.start();
        ImplementsRunnable2 implementsRunnable2=new ImplementsRunnable2();
        new Thread(implementsRunnable2).start();

        //////////////żeby szybko wystartować nowy wątek /////////od Javy 8 /////
        new Thread(()->{
            System.out.println("PING");
                    }).start();
        ////////to samo co wyżej ////////// wyżej krócej ;)
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("PONG");
            }
        }).start();
    }
}

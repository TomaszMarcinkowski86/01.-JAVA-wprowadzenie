package pl.sda.java.Day8.Task.Wielowatkowosc;

import java.util.TreeSet;
import java.util.concurrent.CyclicBarrier;

public class Main {
    public static void main(String[] args) {
      Thread threadOne = new ExtendingThread(); // przygotowanie nowego wątku
      threadOne.start(); // żeby się uruchomiło w nowym wątku .start
//      threadOne.run(); // .run się uruchomi w tym samym wątku co nasza główna aplikacja

        ImplementRunable threadTwo = new ImplementRunable();
        new Thread(threadTwo).start(); // uruchomienie nowego wątku w przypadku implementacji interfejsu. musimy przekazać do obiektu klasy Thread,
        // bo tu nie ma normalnie opcji .start  jest tylko start
    }
}

/////////////////////java.util.concurrent. - pakiet dla wielowątkowości/////////////////////////

////////////////rzeczy dodatkowe trudne dotyczące wieleowatkowości////////////

// CyclicBarrier.await(); //////informuje że dany wątek zakończył obliczenia
//   private CyclicBarrier cyclicBarrier;
//    public ExtendingThread(CyclicBarrier cyclicBarrier){
//        this.cyclicBarrier = cyclicBarrier;
//    }
// CountDownLatch.await(); ////// zatrzymuje wątek, do momentu aż countDownLatch dojdzie do 0
// synchronized ()         //////
//////////////////////////////////////////////////////////////////////////


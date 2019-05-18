package pl.sda.java.Day6.Task.Exceptions;

import java.io.IOException;

public class MainExceptions {
    public static void main(String[] args) throws Exception {

        methodThatThrowsException(3);
        try {
            methodThatThrowsUncheckedException();
        } catch (NullPointerException e) { // kolejność ma znaczenie który wyjątek najpierw obsługujemy
        } catch  (RuntimeException e) {
            e.printStackTrace();
            // tu możemy obsłużyć wyjątek lub go zignorować.
        }
        methodThatExecuteMethodWithException();
        // methodThatThrowsException(111);   to wyrzuci wyjątek na konsolę bo wartość większa od 100
        System.out.println("koniec programu");
    }
    /////////WYJĄTKI------EXCEPTIONS/////////

    public static void methodThatThrowsException(int number) throws Exception { // metoda rzucająca wyjątkami
        if (number > 100) {                                     // tego np nie jesteśmy w stanie obsłużyć więc "rzucamy wyjątkiem"
            throw new Exception();
            //   throw new IOException(); wyjątek wejścia wyjścia
        }
        System.out.println("koniec metody");
    }

    public static void methodThatExecuteMethodWithException() {
        try {
            methodThatHandlesException(102);     // może zostać rzucony wyjątek
            System.out.println("zwykłe instrukcje"); // jak wyjątek bedzie rzucony to te instrukcje sie nie wykonają.
        } catch (IOException e) {              // przy tym to tu obsługujemy wyjątek żeby apka działała prawidłowo mimo coś. Alt Enter druga linijka
            e.printStackTrace();
        } // w catch łapiemy wyjątek  i reszta instrukcji leci normalnie
        System.out.println("normalne działanie metody");

    }

    public static void methodThatHandlesException(int num) throws IOException {
        if (num > 100) {
            throw new IOException();
        }
    }

    public static void methodThatThrowsUncheckedException() {
        throw new RuntimeException();        // wyjątek którego nie musimy obsługiwać
        // jak nie jesteśmy w stanie w żaden sposób tego obsłużyć
        ////popularne /////
        //throw new NullPointerException();
        //throw new IndexOutOfBoundsException(); // jka przekroczymy zakres tablicy

    }
}


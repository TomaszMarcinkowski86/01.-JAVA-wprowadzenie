package pl.sda.java.Day6.Task.MyOwnException;

public class MyException extends Exception {

    public MyException(String message) { // konstruktory pobrane
        super(message);
    }

    public MyException(String message, Throwable cause) {
        super(message, cause);
    }
}

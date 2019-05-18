package pl.sda.java.Day6.Task.CalcException;

public class DivideByZeroException extends Exception {
    public DivideByZeroException(String message) {
        super(message);
    }

    public DivideByZeroException(String message, Throwable cause) {
        super(message, cause);
    }

}

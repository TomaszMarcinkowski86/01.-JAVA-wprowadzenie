package pl.sda.java.Day6.Task.CalcException;

public class Calculator {

    public  double divide(double a, double b) throws DivideByZeroException {
        if(b==0){
            throw new DivideByZeroException("Nie dziel przez 0");
        }
        return a/b;
    }

}

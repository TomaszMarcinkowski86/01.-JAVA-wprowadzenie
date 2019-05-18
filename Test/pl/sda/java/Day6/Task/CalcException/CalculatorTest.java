package pl.sda.java.Day6.Task.CalcException;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void shoutDivideBySomeNumberDifferentThanZero() throws DivideByZeroException { //zielona strzala pozwala uruchomić metodę jako test
        //given
        Calculator calculator =new Calculator();
        //when
        double result = calculator.divide(3,1);
        //then - tu sprawdzamy czy wynik jest poprawny używamy Assert
        Assert.assertEquals(3,result,0.1);

    }
    @Test
    public void shoutDFail() throws DivideByZeroException { //zielona strzala pozwala uruchomić metodę jako test
        //given
        Calculator calculator =new Calculator();
        //when
        double result = calculator.divide(3,2);
        //then - tu sprawdzamy czy wynik jest poprawny używamy Assert
        Assert.assertEquals(3,result,0.1);
    }
    @Test (expected = DivideByZeroException.class)  // spodzieamy się rzucenie wyjątku. będziemy sprawdzać czy wyjątek się wykona
    public void shoudDivideByZero() throws DivideByZeroException {
        //given
        Calculator calculator =new Calculator();
        //when
        double result = calculator.divide(3,0);
        //then
        //Assert.assertEquals(0,result,0.1); //- tu nic w tej sekcji nie piszemy bo spodziewmy się wyjątku
    }

}
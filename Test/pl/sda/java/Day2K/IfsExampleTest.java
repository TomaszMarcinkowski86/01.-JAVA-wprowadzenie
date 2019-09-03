package pl.sda.java.Day2K;

import com.sun.org.apache.xpath.internal.functions.FuncFalse;
import org.junit.Test;
import pl.sda.java.Day2K.IfsExample;

import static org.junit.Assert.*;

public class IfsExampleTest {

    @Test
    public void ShouldNotAnswerBecauseWeAreSleep() {
        boolean isMama=true;
        boolean isMorning=true;
        boolean isAsleep=true;


        boolean result = IfsExample.answerCell(isMama, isMorning,isAsleep);


        assertFalse(result);

    }

    @Test
    public void ShouldNotAnswerBecauseWeAreNotSleepAndIsMorningAndIsNotMama() {
        boolean isMama=false;
        boolean isMorning=true;
        boolean isAsleep=false;


        boolean result = IfsExample.answerCell(isMama, isMorning,isAsleep);


        assertFalse(result);
}
}

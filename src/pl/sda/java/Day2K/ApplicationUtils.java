package pl.sda.java.Day2K;

public class ApplicationUtils {  // tu nie będzie metody main. to oznacza że metody jako takiej nie edzie można uruchomić samej.
    // będą z niej korzystać inne metody

    public static double convertToDouble(String text) {
        return Double.parseDouble(text);
    }

    public static Double convertToDoubleObject(String text) {

        if (text ==null){ // warunrk że jeśli text == null to zrwóc null - możemy tak zrobić bo mamy typ Obiektowy (duży Double)
            return null;
        }else {
            return Double.valueOf(text);
        }

        }

    }





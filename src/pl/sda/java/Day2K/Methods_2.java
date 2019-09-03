package pl.sda.java.Day2K;

public class Methods_2 {
    public static void main(String[] args) {
      String someText = "3.7";
        ApplicationUtils.convertToDouble(someText);
        System.out.println(someText);

        someText=someText + "   ";
        ApplicationUtils.convertToDouble(someText);
        System.out.println(someText);

        someText=null;
        ApplicationUtils.convertToDoubleObject(someText);
        System.out.println(someText);
    }
}

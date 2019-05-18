package pl.sda.java.Day7.Task.Calculator_Args;

public class Calculator {

//    public int sum(int[] numbers) {
//        int sum = 0;
//        for (int number : numbers) {
//            sum += number;
////          sum= sum+number   to samo co wyżej
//        }
//        return sum;
//    }

    public int sum (int ... numbers){
        int sum = 0;
        for (int number : numbers) {
            sum += number;
//          sum= sum+number   to samo co wyżej
        }
        return sum;
    }

}

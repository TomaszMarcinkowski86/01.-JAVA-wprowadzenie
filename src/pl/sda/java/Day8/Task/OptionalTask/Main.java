package pl.sda.java.Day8.Task.OptionalTask;

public class Main {
    public static void main(String[] args) {
        NumberMapping numberMapping = new NumberMapping();
        numberMapping.add(5, "text1");
        System.out.println(numberMapping.get(5).isPresent()); // isPresent sprawdza czy zawiera wartość jakąś dany klucz
        System.out.println(numberMapping.get(3).isPresent());
    }
}

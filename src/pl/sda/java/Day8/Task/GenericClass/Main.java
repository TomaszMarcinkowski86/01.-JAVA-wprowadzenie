package pl.sda.java.Day8.Task.GenericClass;

import pl.sda.java.Day8.Task.LambdaStream.Person;

public class Main {
    public static void main(String[] args) {

        // Utworzenie nowego obiektu klasy generycznej (w <> podajemy typ)
        GenericClass<String> genericClass = new GenericClass<>();
        genericClass.set("Hello world");
        String someString = genericClass.get();
        System.out.println(someString);

        // możemy podać tylko typ po klasie Number
        MoreRestrictedGenericClass<Long> genericClass2 = new MoreRestrictedGenericClass<>();
        double result = genericClass2.add(4L, 6L);
        System.out.println(result);

        GenericMethod genericMethod = new GenericMethod();
        genericMethod.print("addf"); // przykład użycia klasy generyczne
        genericMethod.print(5);
        genericMethod.print(new Person("aaa", "bbb"));
    }
}

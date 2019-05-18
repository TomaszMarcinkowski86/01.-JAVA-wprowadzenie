package pl.sda.java.Day8.Task.GenericClass;

public class MoreRestrictedGenericClass <T extends Number> { // ograniczamy dostępne typy tylko do tych które dziedziczą po klasie Number tzw ograniczenie górne
    // jest jeszcze coś takiego <T super Number> odwrotność tego co u góry. Number dziedziczy po T tzw ograniczenie dolne (louer bound)

    public double add(T a, T b ){
        // mamy dostęp do wszystkich metod z klasy number
        return a.doubleValue() +b.doubleValue();
    }
}

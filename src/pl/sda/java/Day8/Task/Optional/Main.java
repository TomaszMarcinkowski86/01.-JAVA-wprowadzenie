package pl.sda.java.Day8.Task.Optional;

import pl.sda.java.Day8.Task.LambdaStream.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Person tomaszMarcinkowski = new Person("Tomasz", "Marcinkowski");
        Person nullPerson = null;

        // nullPerson.getName(); wywali się
        if (nullPerson != null) {
            System.out.println(nullPerson.getName()); // jesteśmy bezpieczni
        }

        ////////////OPTIONALE m.in zabezpieczają przed nullami/////////////
        Optional<Person> optionalPerson = Optional.ofNullable(nullPerson);
        // Optional.of(nullPerson);
     //   Person person = optionalPerson.get();
        Person person1 = optionalPerson.orElse(new Person("Domyślna", "Osoba"));
        System.out.println(person1.getName());

        List<String> hello = methodThatReturnOptional()// metoda zwraca optionala
                .map(sentence->sentence.split(" ")) // bierzemy wartość opakowaną przez optional
                .map(wordsArray-> Arrays.asList(wordsArray)) // zamieniamy tablicę na listę
                .filter(wordsList -> wordsList.contains("or")) // akceptujemy listę jeśli którykolwiek z elementów to
//                .get(); // jezeli nie ma tu żadnego elementu to dostaniemy wyjątek
        .orElse(new ArrayList<>()); // zamiast get możemy użyć tego. Zabezpiecza to nas przed wywaleniem.
        System.out.println(hello);

        List<String> hello2 = methodThatReturnOptional()// metoda zwraca optionala
                .map(sentence->sentence.split(" ")) // bierzemy wartość opakowaną przez optional
                .map(wordsArray-> Arrays.asList(wordsArray)) // zamieniamy tablicę na listę
                .map(wordsList -> wordsList.stream()
                        .filter(listElement->listElement.contains("or")) //sprawdzi czy jest ten zakres liter i jak tak to zwróci słowo
                        .collect(Collectors.toList())
                )
                .orElse(new ArrayList<>()); // zamiast get możemy użyć tego. Zabezpiecza to nas przed wywaleniem.
        System.out.println(hello2);

//        Optional.of(null); // niedopuszczalne ta metoda nie akceputje wartości null
        Optional.ofNullable(null); // ta metoda akceptuje null
    }

    public static Optional<String> methodThatReturnOptional() {
        return Optional.ofNullable("Hello world");
    }
}

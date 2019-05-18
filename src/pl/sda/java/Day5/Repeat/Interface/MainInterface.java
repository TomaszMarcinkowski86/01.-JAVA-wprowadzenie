package pl.sda.java.Day5.Repeat.Interface;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.math.MathContext;
import java.util.*;

public class MainInterface {


    /*1. Stwórz klasę Osoba, która będzie przechowywać imię i nazwisko
      2. Dodaj konstruktor, który jako argument przyjmuje imię i nazwisko
      3. Dodaj gettery
      4. Zaimplenetuj interfejs Comparable, tak, aby osoby były sortowane najpierw po nazwisku,
       a potem po imieniu (ignorując wielkość liter)
      5. Stwórz klasę Main wraz z metodą Main (psvm)
      6. Stwórz listę przechowującą obiekty typu Osoba
      7p. Dodaj następujące osoby:
          Marcin Zebra, Adam Zebra , Wojtek Banan, Waldek Baranowski, Antoni Arbuz, aldona ambroziak
      8p. Posortuj listę z osobami
   */

    public static void main(String[] args) {

        Person marcinZebra = new Person("Marcin", "Zebra");
        Person adamZebra = new Person("Adam", "Zebra");
        Person wojtekZBaran = new Person("Wojtek", "Baran");
        Person antoniArbuz = new Person("Antoni", "Arbuz");
        Person aldonaAbuz = new Person("aldona", "abuz"); // w takim przypadku Aldona przy sortownaiu będzie na końcu.
                                                                        // Sortowanie sprawdza wielkość liter. chyba że dodamy porównanie po sprowadzenia do dużych lub małych liter lub ignorowanie wielkości znaku.

        ArrayList<Person> people = new ArrayList<>();
        people.add(marcinZebra);
        people.add(adamZebra);
        people.add(wojtekZBaran);
        people.add(antoniArbuz);
        people.add(aldonaAbuz);

        for (Person person : people) {           // żeby w osobnych liniach
            System.out.println(person);
        }

        System.out.println();
        people.sort(Comparator.naturalOrder());   // wywołujemy metodę do sortowania
        for (Person person : people) {
            System.out.println(person);
        }
        System.out.println();

        /////////////////////////////////////INNE KOLEKCJE////////////////////////////

        /////LinkedList/////////
        LinkedList<String>linkedList = new LinkedList<>(); // działa przy dodawaniu elementów
        linkedList.add("aaa");
        linkedList.add("bbb");
        linkedList.add(1,"cc"); // nieodpowiednie dla linked list ze względy na wydajność
        linkedList.get(1); // przeszukiwnie listy wolniejsze niż w ArrayList
        linkedList.addFirst("xs"); // bardzo szybkie
        linkedList.addLast("xxx"); // bardzo szybkie
        linkedList.getFirst(); // bardzo szybkie
        linkedList.getLast(); // bardzo szybkie

        /////Set/////////HashSet/////
        //- unikalne wartości
        //- nie ma gwarancji kolejności ,
        // - największa szybkość
        Set<Integer> numbers = new HashSet<>();
        numbers.add(5);
        numbers.add(3);
        numbers.add(5); // błedu nie bedzie ale tej drugiej 5 nie doda bo przechowuje tylko unikatowe wartości

        Person michal = new Person("Michał", "Jaszczyk");
        Person michal2 = new Person("Michał", "Jaszczyk");
        HashSet<Person> peopleSet = new HashSet<>();
        peopleSet.add(michal);
        peopleSet.add(michal2);
        System.out.println(peopleSet); // dopóki nie wygenerujemy equals i hascode w klasie person to bedzie wyświetlać 2  michałów


        /////Set/////////TreeSet/////
        //- unikalne wartości
        //- sortuje automatycznie i naturalnie

        TreeSet<Integer> treeSet=new TreeSet<>();
        treeSet.add(1);
        System.out.println(treeSet);
        treeSet.add(9);
        System.out.println(treeSet);
        treeSet.add(4);
        System.out.println(treeSet);
        treeSet.add(1);
        System.out.println(treeSet); // souty żeby zobrazować że ukłąda po kolei

        TreeSet<Person> peopleTreeSet=new TreeSet<>();
        peopleTreeSet.add(marcinZebra);
        System.out.println(peopleTreeSet);
        peopleTreeSet.add(adamZebra);
        System.out.println(peopleTreeSet);
        peopleTreeSet.add(aldonaAbuz);
        System.out.println(peopleTreeSet);
        peopleTreeSet.add(antoniArbuz);
        System.out.println(peopleTreeSet);

       /////Set/////////LinkedHashSet/////
        //-przechowywane w takiej kolejnosći jak dodajemy
        //- unikalne wartości
        LinkedHashSet<Person> peopleLinkedHashSet=new LinkedHashSet<>();
        peopleLinkedHashSet.add(marcinZebra);
        System.out.println(peopleLinkedHashSet);
        peopleLinkedHashSet.add(adamZebra);
        System.out.println(peopleLinkedHashSet);
        peopleLinkedHashSet.add(aldonaAbuz);
        System.out.println(peopleLinkedHashSet);
        peopleLinkedHashSet.add(antoniArbuz);
        System.out.println(peopleLinkedHashSet);

        /////////////Map//////// HashMap////////////////
        System.out.println();
        // - klucz musi być inikalny (klucz tu to to co pos Integerem)
        // - dodany nowy klucz nadpisuje wartość poprzednią
        // put żeby rozróżnić od add tu nie tylko dodajemy ale i modyfikujemy

        Map<Integer,Person> personMap = new HashMap<>();
        personMap.put(2, new Person("A","B"));
        System.out.println(personMap);
        personMap.put(5, new Person("A","B"));
        System.out.println(personMap);
        personMap.put(2, new Person("C","G")); // to nadpisze pierwsze bo mamy ten sam klucz
        System.out.println(personMap);
        System.out.println();

        /////////////Map//////// HashMap///////thisWillBeNull////// thisIsPersonAB/// róznica od tego u góry
        System.out.println("MAP-HashMap");
        System.out.println();
        // - klucz musi być inikalny (klucz tu to to co pos Integerem)
        // - dodany nowy klucz nadpisuje wartość poprzednią
        // put żeby rozróżnić od add tu nie tylko dodajemy ale i modyfikujemy

        Map<Integer,Person> personMap2 = new HashMap<>(); // implementacja mapy
        Person thisWillBeNull= personMap2.put(2, new Person("A","B"));
        System.out.println(personMap2);
        personMap2.put(5, new Person("A","B"));
        System.out.println(personMap2);
        Person thisIsPersonAb = personMap2.put(2, new Person("C","G")); // to nadpisze pierwsze bo mamy ten sam klucz
        System.out.println(personMap2);

        // doda nowa osobe tylko jak nie ma jeszcze takiego klucza a jak jest taki klucz to nic nie zrobi
        Person personCG =personMap2.putIfAbsent(5,new Person("P","p"));
        Person nonExistingPersonNull = personMap2.putIfAbsent(50, new Person("P","P"));

        Person personCGForKey5 = personMap2.get(5);
        Person personNotExistingPersonNull2 = personMap2.get(55);

        if (personMap2.containsKey(55)){
            Person nonNullValue = personMap2.get(55); // nie zawsze . w wiekszości przypadków poza tym ze jest klucz i jest rowny null
        }
        personMap2.put(123,null); // odradzam

        Person thisPersonCanBeNull = personMap2.get(55);
        if(thisPersonCanBeNull !=null){
            thisPersonCanBeNull.getName(); // thisPersonCanBeNull nigdy nie będzie nulem
         }
        for (Map.Entry<Integer,Person> keyValue : personMap.entrySet()) {
            System.out.println("" + keyValue.getKey() + keyValue.getValue());
        }

        for (Integer key : personMap.keySet()) {
            System.out.println(key);
            Person person = personMap.get(key);
        }

        for (Person person : personMap.values()) {
            System.out.println(person);
        }

        //inna metoda zstąpi obiekt jeśli istnieje taki klucz jak nie istnieje to nic nie zrobi

        Person personThatWasUnderKey5 = personMap.replace(5, new Person("T", "T"));
        Person nonExistingPersonNull3 = personMap.replace(999, new Person("T", "T"));

        /////////////Map//////// TreeMap////////////////
        System.out.println("MAP - TreeMap");
        // - klucz musi być inikalny (klucz tu to to co pos Integerem)
        // - dodany nowy klucz nadpisuje wartość poprzednią
        // put żeby rozróżnić od add tu nie tylko dodajemy ale i modyfikujemy
        // - sortowana mapa ale tylko po kluczach

        TreeMap<Integer,Person> treeMap = new TreeMap<>();
        treeMap.put(5, new Person("R", "R"));
    }
}

package pl.sda.java.Day4;

import java.util.*;

public class CollectionExample { // kolekcje

    // W kolekcjach przechowujemy typy obiektowe nie int tylko np Integer
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3};
        int nr = numbers.length;

        List<Integer> listNumber; // deklaracja listy
        listNumber = new ArrayList<>(); // Tu mamy pustą listę
        listNumber.add(4);
        listNumber.add(432);  // tak dodajemy kolejne elementy. Nie mozemy dodać wielu naraz
        listNumber.add(43);
        listNumber.add(14);
        for (int tempNumber : listNumber) {
            System.out.println(tempNumber);
        }
        Integer pierwszyElement = listNumber.get(0);     // pobieranie wartości z listy pierwszy element dodany
        int size = listNumber.size(); // tutaj rozmiar listy jak w tablicy był length to tu size

        ArrayList<Integer> listNumber2 = new ArrayList<>();// inny sposób deklaracji (2 linijki z góry łączymy). Raczej stosuje się to z góry. List<> ArrayList<> to 2 różne rzeczy
        // ArrayList szybkie przeszukiwanie, dodawanie elementów wolne

        listNumber.remove(3);         // tak możemy usuwać z list  elementy ale 3 to tu INDEX a nie wartość którą dodaliśmy.
        listNumber.remove(new Integer(432)); // tak usuwamy konkretną wartość. Musimy stworzyć Obiekt Integer. Usunie tylko pierwszą napotkaną.
        System.out.println();
        for (int tempNumber : listNumber) {
            System.out.println(tempNumber);
        }
        System.out.println();                     // jak usunąć wszystkie liczby ręcznie np 5
        for (int i = 0; i < listNumber.size(); i++) {
            System.out.println("index: " + i);
            if (listNumber.get(i) == 5) {
                listNumber.remove(i);
                i--;                     // zmniejszamy licznik jak coś się usunie ponieważ usuneliśmy Array działa tak że nie zmniejsza rozmiaru tylko przesuwa kurwa !!!!!
            }
        }
        for (int tempNumber : listNumber) {
            System.out.println(tempNumber);
        }
        //Sortowanie listy
        listNumber.sort(Comparator.naturalOrder()); // posortowane w sposób naturalny od naj do najwiekszej lub alfabetycznie w kolejnosci
        listNumber.sort(Comparator.reverseOrder()); // posortowane w sposób odwrotny

        //


        List<String> word = new LinkedList<>(); // inny sposób deklaracji listy. Nie Array a LinkedList
        //szybkie dodawanie elementów wolne przeszukiwanie listy.
        word.add("abc");
        word.add("asa");
        word.add("ddmd");
        word.remove(0);
        word.remove("ddmd");

        //Kolekcja set

        Set<Integer> setNumbers = new HashSet<>();
        // wartości nie są upożądkowane w jakiś sposób jak w tablicy czy liście
        // przechowuje unikalne wartości. nie mogą się powtarzać
        //Zostaną wyświetlone w dowolnej kolejności
        //Największa szybkość

        setNumbers.add(5);
        setNumbers.add(15);
        setNumbers.add(534);
        setNumbers.add(33);
        setNumbers.add(33); // to niezostanie dodane bo możemy przechowywać unikalne wartości.

        setNumbers.remove(534); // usuwanie ale konkretnego obiektu (wartosci)
        System.out.println();
        System.out.println("liczy kolekcji Set:");
        for (int someNumber : setNumbers) {
            System.out.println(someNumber);
        }

        Set<String> setOfString = new TreeSet<>(); // kolejna kolekcja
        // to możemy sortować
        // liczby umieści po kolei a litery alfabetycznie
        // .descendingSet() prawdopodobnie odwraca kolejność - nie sprawdzone
        // do TreeSeta nie możemy wrzucić czegokolwiek (przykład z Grzybem) klasa Grzyb nie implementuje  Comparable  .
        // Unikalne elemnty posortowane

        setOfString.add("tsxsd");
        setOfString.add("wsx");
        setOfString.add("bbb");
        System.out.println();
        System.out.println("liczy kolekcji TreeSet:");
        for (String someString : setOfString) {
            System.out.println(someString);
        }
       // ((TreeSet<String>) setOfString).descendingSet()  // Sprawdzić bo chyba to może odwrócić kolejność tak jak reverse w liście.

        LinkedHashSet<Integer> linkedHashSet =new LinkedHashSet<>();
        // ta w przeciwieństwie do HashSet przechowa w kolejności której dodaje elemnty
        // unikalne elementy w kolejności dodanej

        linkedHashSet.add(4);
        linkedHashSet.add(124);
        linkedHashSet.add(434);
        System.out.println();
        System.out.println("liczy kolekcji LinkedHashSet:");
        for (Integer tempNum : linkedHashSet) {
            System.out.println(tempNum);
        }
    }
}


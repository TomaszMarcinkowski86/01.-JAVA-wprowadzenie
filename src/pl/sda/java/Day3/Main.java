package pl.sda.java.Day3;


public class Main {

    //Zmienna klasy
    private int number = 3;  //deklarujemy z modyfikatorem dostępu

    public static void main(String[] args) {
        //ZMENNE
        //typy proste
        int numberOne; //deklaracja
        numberOne = 1; // incjalizacja - przypisanie wartości

        //całkowite - domyślna wartość 0
        byte b;
        short s;
        int numberTwo = 2; //incjalizacja
        long l = 3;

        //zmiennoprzecinkowe
        float f = 1.5F;
        double d;

        //inne
        char c = 'r';
        boolean boool = true;

        //typy obiektowe - domyślna wartość null
        // dają więcej możliwości dodając . wywołujemy różne metody na obiektach
        Byte bb;
        Short ss;
        Integer ii = 5;
        Long ll = 3L; // w typie obiektowym dodajemy "L"

        Float ff = 5.5f;
        Double dd = 5.5;

        Character cc;
        Boolean bool2;

        //WARUNKI LOGICZNE
        //>, >=, ==,<,<=
        if (1 > 5) {
            System.out.println("1>5");
        } else {
            System.out.println(" ");
        }

        if (numberOne > numberTwo) {
            System.out.println("cos");
        } else if (numberOne == numberTwo) {
            System.out.println("coś innego");
        } else {
            System.out.println("koniec");
        }
        if ((1 == 1) && (2 == 2) || (2 > 3)) {
            System.out.println("ok");
        } else ;


        //PĘTLE

        for (int i = 0; i < 5; i++) {        //w pętli nie ma znaczenia czy ++i czy i++
            System.out.println(1);
        }
        for (int i = -50; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        for (int i = -50; i < 100; i = i + 2) {
            System.out.println(i);
        }

        int someNumber = 5;
        while (someNumber > 1) {
            someNumber--;
            System.out.println(someNumber);
        }
        int first = 5;
        int second = 5;
        int i = 5 + first++;
        System.out.println("first: " + i);
        int i2 = 5 + ++second;
        System.out.println("second: " + i2);


        //TABLICE

        int[] tab = new int[]{5, 6, 5}; // deklaracja z inicjalizacją
        int[] tab2 = new int[5];     // deklaracja z wpisaniem rozmiaru
        int[] tab3 = {1, 3, 4, 66};      // skrócona wersja pierwszego
        tab2[0] = 245;
        tab2[1] = 23;
        tab[4] = 343;
        //tab[5] = 4; błąd teoretycznie pozwoli przypisać ale odczyt będzie niemożliwy

        System.out.println(tab.length);
        for (int j = 0; j < tab.length; j++) {
            System.out.println(tab[j]);
        }
        for (int element : tab) {
            System.out.println(tab[element]);
        }

        //tablice dwuwymiarowe
        int[][] multiTab;

        //METODY
        // public, private, protected, "package public" - to jak nic nie podamy taka domyślna


    }

    public static int someMethod() {
        return 6;
    }

    public static void someMethod2() {
        System.out.println("hello");
    }

    public static int someMethod3(int param1, long param2) { // Java wyrzuci doubla domyślnie bo bierze to co większe a w deklaracji int. Można zrobić rzutowanie
        double result = param1 + param2; // tu mogę dodać i int i long bo double jest jeszcze większym "pojemnikiem"
        return (int) result; //rzutownie zamieni wynik z doubla na int

    }
}

package pl.sda.java.Day1K;

import java.util.Date; //import bibliotek

public class Main { //deklaracja klasy
    public static void main(String[] args) { //deklaracja metody
        System.out.println("Hello World");  // ciało metody

        Date date = new Date();
        System.out.println(date);

        System.out.println("\"cudzysłów\"");
        System.out.println(4 + 2 + "!"); // kolejność działań - jak liczba pierwsz to doda
        System.out.println("!" + 4 + 2); // jak String pierwszy to liczby zamienia na stringi

        System.out.println("Andam \nNowak"); // \n nowa linia Nowak w  nowej linii będzie wyświetlić
        //  Ctrl + / da komentarz dla całej linii :)

        // typy zmiennych - literały
        System.out.println(12);
        System.out.println('A');
        System.out.println("napis");
        System.out.println(false);

        String text = "zmienna string o nazwie text";
        String anotherText = new String("inny sposób deklaracji");
        System.out.println(text.length() + " - długość wyświetlona od razu");
        int length = text.length();
        System.out.println(length + " - długość wyswietlona ze zmiennej");

        String textWithWitheSpaces = "   Adam W ";
        System.out.println(textWithWitheSpaces.trim()); // przynie nam spacje na początku i końcu

        // Łączenie napisów i kolejność działań!!!!!!!!
        System.out.println(2 + 3);
        System.out.println(2 - 4);
        System.out.println(5 / 2);
        System.out.println(5.0 / 2);
        System.out.println(5 / 2.0);
        System.out.println(100L - 10); // tu mamy doczynienia z typem Long-iem
        System.out.println(2f - 3);   // tu jest typ float
        System.out.println(5f / 2);
        System.out.println(5d / 2);  //tu jest typ double
        System.out.println('A' + 2);
        System.out.println('a' + 2);
        System.out.println("a" + 2);
        System.out.println("a" + "b");
        System.out.println('a' + 'b');
        System.out.println("a" + 'b');
        System.out.println("a" + 'b' + 3);
        System.out.println('b' + 3 + "a");
        System.out.println(9 % 4); // reszta z dzielenia
        System.out.println(-5 + 8 * 6);
        System.out.println("" + 5 + 8 + 6);
        System.out.println((55 + 9) % 9);
        System.out.println(20 + -3 * 5 / 8);
        System.out.println(5 + 15 / 3 * 2 - 8 % 3);
        System.out.println("\"A\"+2 = " + ("A" + 2)); // nawias ma pierszeństwko w wykonywaniu działań
        System.out.println("a" + 4 + 'b');
        System.out.println('a' + 4 + "b");

        System.out.println("false==false = " + (false == false));
        System.out.println("false!=true = " + (false != true));
        System.out.println("!true = " + (!true));
        System.out.println("2>4 = " + (2 > 4));
        System.out.println("3<5 = " + (3 < 5));
        System.out.println("3==3&&3==4 = " + (3 == 3 && 3 == 4));
        System.out.println("3!=5||3==5) =" + (3 != 5 || 3 == 5));
        System.out.println("3 != 5 || 3 == 5 = " + (3 != 5 || 3 == 5));
        System.out.println("(2+4) > (1+3) = " + ((2 + 4) > (1 + 3)));
        System.out.println("\"cos\".equals(\"cos\") = " + ("cos".equals("cos")));
        System.out.println("\"cos\" == \"cos\" = " + ("cos" == "cos"));  // nigdy nie porównujmy obiektów za pomocą == , tylko typy proste
        System.out.println("\"cos\" == new String(\"cos\") = " + ("cos" == new String("cos")));


    }


}
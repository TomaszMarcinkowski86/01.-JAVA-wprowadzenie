package pl.sda.java.Day5.Repeat.Interface;

import java.util.Objects;

public class Person implements Comparable {

    private String name;
    private String surName;

    public Person(String name, String surName) {
        this.name = name;
        this.surName = surName;

    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    @Override                             // interfejs Comparable wykorzystywany jest do sortowania.
                                          // Tu zaimplementowana metoda tego intefacu
    public int compareTo(Object o) {      // Object klasa bazowa w Javie wszystkie klasy po niej dziedziczą.
        Person otherPerson = (Person) o;  // przygotowyjemy zmienną do której rzutujemy Object na Person
        //   int compare = surName.compareTo(otherPerson.surName);  // porównanie nazwisk
        //int compare = surName.toUpperCase().compareTo(otherPerson.surName.toUpperCase()); // sprowadzamy wszystko i do duzych liter i dopiero porównujemy
        int compare = surName.compareToIgnoreCase(otherPerson.surName); // to samo co u góry
        if (compare == 0) {                                    // jak te same nazwisko to 0
            return name.compareTo(otherPerson.name);           // i sprawdzamy imie
        } else {
            return compare;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                '}';
    }

    // Alt + Insert equals i HashCode  // wystarczające w codziennej pracy. Zmienia się te metody gdy zależy nam na wydajności
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(surName, person.surName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surName);
    }
}

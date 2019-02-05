package pl.sda.java.Day3.Task;

public class Zad1Person {
    private String name;
    private String surName;
    private int age;
    private char gender;

    public Zad1Person(String name, String surName, int age, char gender) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Zad1Person{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}

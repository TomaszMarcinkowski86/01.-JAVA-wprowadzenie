package pl.sda.java.Day3;

public class Dog {  // to też w Main2 wywołamy

    private String name;
    private String bread;
    private char gender;

    public Dog(String name, String bread, char gender) {
        this.name = name;
        this.bread = bread;
        this.gender = gender;
    }
// tu gettery bo ktoś może chcieć odczytać jaki pies, jaka ras i płeć

    public String getName() {
        return name;
    }

    public String getBread() {
        return bread;
    }

    public char getGender() {
        return gender;
    }

    @Override             // Alt + Insert toString
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", bread='" + bread + '\'' +
                ", gender=" + gender +
                '}';
    }
}

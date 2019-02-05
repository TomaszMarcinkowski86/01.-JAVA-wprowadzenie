package pl.sda.java.Day3;

public class Person { //ta clasa będzi typem w klasie Main2 możemy używąć tego w ten sposób

    private String firstName ="Gal"; // prywatne zmienne
    private String surName="Anonim";
    private int age= 18;

    //stworzenie konstruktora - przepis w jaki sposób ma zostać utworzony nowy objekt

//    public Person(){
//        firstName="Gal";
//        surName="Anonim";
 //   }
    //konstruktor bezparametrowy
    public Person(){

    }
    //konstruktor parametrowy
    public Person(String firstName, String surName, int age){
        this.firstName=firstName;//this mówi o tym że ja korzystam ze ZMIENNEJ KLASY nie metody !!!!!!! Mamy wtedy pewność że używamy zmiennej klasy.
        this.surName = surName;
        this.age = age;
    }
    // tworzymy tzw getter zmienna bedzie private, nikt nie może jej zmienić ale możemy dać metodę z getterem by odczytać później. Bez gettera nie wyświetlimy bo privet
    public String getFirstName(){         // getter (get) są bezparametrowe
        return firstName;
    }
         //ALT + Insert - wstawia m.in getter
    public String getSurName() {
        return surName;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age){ // setter po utorzeniu mamy możliwość zmiany argumentu. zrobimy to w Main2
        this.age=age;
    }
}

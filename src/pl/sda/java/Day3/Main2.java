package pl.sda.java.Day3;

public class Main2 {
    public static void main(String[] args) {

        // to korzysta z klasy Person
        Person marcinkowski = new Person("Tomasz", "Marcinkowski",33);  //wtym obiekcie Marcinkowski będziemy przechowywać jakieś dane. Bedziemy używać klasy Person
                                                                                              //nowy objekt o nazwie Marcinkowski klasy Person
        System.out.println(marcinkowski.getFirstName());
        System.out.println(marcinkowski.getSurName());
        System.out.println(marcinkowski.getAge());


        Person kowalski = new Person("Jan", "Kowalski", 40); //drugi obeikt niezależny od pierwszego; pokazuje to że modyfikacja setterem wpływa tylko na obiekt marcinkowski
        System.out.println(marcinkowski.getFirstName()); //odczyt jest możliwy dzięki getterowi
        System.out.println(marcinkowski.getSurName());
        System.out.println(marcinkowski.getAge());

        marcinkowski.setAge(23);  // zmodyfikacja Age przy pomocy settera. Modyfikacja tylko w obiekcie marcinkowski. Nie modyfikujemy zmiennej w klasie.
        System.out.println(marcinkowski.getAge());

        //Cake
        Cake applePie=new Cake(2,1,3); // można to porównać do przepisu. Klasa Cake to przepis. Obiekt to nowe ciasto na podstawie przepisu :)
        System.out.println(applePie.isTasty()); //wywołanie metody z klasy Person o nazwie isTasty
        Cake tastyApplePie = new Cake(1,2,3);
        System.out.println(tastyApplePie.isTasty());

        //Dog
        Dog reksio = new Dog("Reksio", "kundel ", 'M');
        System.out.println(reksio); // gdyby nie było w Dog metody toString to by było nieczytelne

    }
}

package pl.sda.java.Day4.Tasks;

public interface PrzykladInterfajsu {

    // w interfejsie metode jest publiczne wiec nie pisze sie  public
    // zmienne są publiczne statyczne public static i final czyli w zasadzie nie zmienne a stała
    // wszystko jest abstrakcyjne
    // żeby nie było abstrakcyjne słówko kluczowe default (od Javy 8.0)

    // static oznacza że jest to współdzielone przez wiele obiektów, i zmieniając w jednym Obiekcie zminiea się wszędzie.
    // w interfejsie wszystko jest public static final
    // final oznacza

    public static final int number=5;

    public void fut();

    public default void fun2(){
        System.out.println("cos");
    } // implementacja metody przy pomocy słowa default możliwa jest od javy 8

}

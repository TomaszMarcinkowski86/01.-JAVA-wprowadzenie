package pl.sda.java.Day3;

public class Main_dziedziczenie {
    public static void main(String[] args) {

        System.out.println("merc");
        Mercedes mercedes =new Mercedes(2.5F, 4, "Black", true);
        System.out.println(mercedes.seatBeltsFastened());
        mercedes.ride();
        System.out.println(mercedes.startEngine());
        mercedes.ride();
        mercedes.isSportVersion();

        System.out.println("");
        System.out.println("Golf");
        Volkswagen golf=new Volkswagen(2,"blue");
        System.out.println(golf.seatBeltsFastened());
        golf.ride();
        System.out.println(golf.startEngine());
        golf.ride();

        System.out.println("");
        Car syrenka = new Car(3.0F, 4, "yellow");
        System.out.println("syrenka");
        System.out.println(syrenka.seatBeltsFastened());
        syrenka.ride();
        System.out.println(syrenka.startEngine());
        syrenka.ride();

        Car samTypuMercedes = new Mercedes(2.0f,4,"red",false);
        Car samTypuVW = new Volkswagen(4,"red");
        samTypuMercedes.ride();
        samTypuMercedes.startEngine();
        samTypuMercedes.ride();
        //samTypuMercedes.isSportVersion(); to nie zadziała jak wpiszemy ręcznie bo nie mam tego w clasie Car.
        System.out.println(((Mercedes) samTypuMercedes).isSportVersion());

        // uwazać z rzutowaniem np nie możemy rzutować vw na mercedesa
    }
}

package pl.sda.java.Day3;

public class Volkswagen extends Car {
    public Volkswagen( int numberOfDoors, String color) {
        super(1.4F, numberOfDoors, color);
           }

    @Override
    public void ride() {
       startEngine();
        System.out.println("Jedzie golfik jedzie ");
    }
}

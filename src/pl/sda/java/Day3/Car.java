package pl.sda.java.Day3;

public class Car {

    //private - tylko w ramach klasy w której jest zdeklarowane można użyć
    //protected - dana zmienna czy metoda może być odczytywana i zapisywana z tej klasy i klas dziedziczone
    private float capacity;
    private int numberOfDoors;
    private String color;
    private boolean manualGear = true;
    private boolean engineStarted;

    public boolean isEngineStarted() {
        return engineStarted;
    }

    public Car(float capacity, int numberOfDoors, String color) { //stąd dziedziczymy słówko ''super" w mercedes
        this.capacity = capacity;
        this.numberOfDoors = numberOfDoors;
        this.color = color;
    }
    public boolean startEngine(){
        engineStarted = true;
        return true;
    }
    public  boolean seatBeltsFastened(){
        return true;
    }
    public void ride(){

    }
}

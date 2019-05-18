package pl.sda.java.Day7.Task.Building;

public abstract class Building {

    private final int numberOfFloors;



    public Building(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public final int getNumberOfFloors() {
        return numberOfFloors;
    }
    public abstract buildingType getBuildingType();
}

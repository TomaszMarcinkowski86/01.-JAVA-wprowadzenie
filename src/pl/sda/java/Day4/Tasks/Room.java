package pl.sda.java.Day4.Tasks;

public class Room extends House {

    private String wallsColor;
    private int nuberOfWindows;

    public Room(int numberOfDoors, boolean alarm, String streetName, String wallsColor, int nuberOfWindows) {
        super(numberOfDoors, alarm, streetName);
        this.wallsColor = wallsColor;
        this.nuberOfWindows = nuberOfWindows;

    }

    public String getWallsColor() {
        return wallsColor;
    }

    public int getNuberOfWindows() {
        return nuberOfWindows;
    }


}

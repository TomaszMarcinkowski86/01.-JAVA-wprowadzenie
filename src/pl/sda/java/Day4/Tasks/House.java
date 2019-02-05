package pl.sda.java.Day4.Tasks;

public class House {

    private int numberOfDoors;
    private boolean alarmOn;
    private String streetName;
    private boolean light;

    public House() {
        this.numberOfDoors = 1;
        this.alarmOn = false;
        this.streetName = "Mokra";

    }

    public House(int numberOfDoors, boolean alarm, String streetName) {
        this.numberOfDoors = numberOfDoors;
        this.alarmOn = alarmOn;
        this.streetName = streetName;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public boolean isAlarm() {
        return alarmOn;
    }

    public String getStreetName() {
        return streetName;
    }

    public boolean isClose() {
        if (alarmOn == true) {
            return true;

        } else {
            return false;
        }
    }

    public boolean lightOn() {
        if (alarmOn == false && light == true) {
            return true;
        } else {
            return false;
        }

    }
}

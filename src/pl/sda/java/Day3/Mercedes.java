package pl.sda.java.Day3;

public class Mercedes extends Car { // java najpierw musi wiedzieć jak stworzyc Car a potem Mercedes. Mercedes to Car
                                     // Dziedziczyć możemy po jednej klasie tylko
    private boolean sportVersion;

    public Mercedes(float capacity, int numberOfDoors, String color, boolean sportVersion) {
        super(capacity, numberOfDoors, color); // wywołuje coś z klasy bazowej tu z Car
        this.sportVersion = sportVersion;
    }

    public boolean isSportVersion(){
        return sportVersion;
    }

    @Override                    // przeciążanie metod
    public void ride() {
        if(isEngineStarted()){
            System.out.println("jadę szybko");
        }else{
            System.out.println("Nie jadę");
        }

        super.ride();
    }
}


package pl.sda.java.Day4;

public class Laptop extends Computer {

    private boolean backLightKeybort;
    private float screanSize;

    public Laptop(String processorName, int ram, int discSizeGb, boolean backLightKeybort, float screanSize) {
        super(processorName, ram, discSizeGb);
        this.backLightKeybort=backLightKeybort;  // this oznacza zmienną klasy
        this.screanSize=screanSize;

    }

    public boolean isBackLightKeybort() {
        return backLightKeybort;
    }

    public float getScreanSize() {
        return screanSize;
    }
}

package pl.sda.java.Day4;

public class Computer {

    private String processorName;
    private int ram;
    private int discSizeGb;

    public Computer(String processorName, int ram, int discSizeGb) {
        this.processorName = processorName;
        this.ram = ram;
        this.discSizeGb = discSizeGb;
    }

    public String getProcessorName() {
        return processorName;
    }

    public int getRam() {
        return ram;
    }

    public int getDiscSizeGb() {
        return discSizeGb;
    }

    public boolean powerOf(){
    if(discSizeGb>0){
       return true;
    }else {
        return false;
    }
    }
}

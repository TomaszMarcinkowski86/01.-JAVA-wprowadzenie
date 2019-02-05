package pl.sda.java.Day4;

public class Main {
    public static void main(String[] args) {

        Computer computer = new Computer("i7", 16, 500);
        System.out.println(computer.getProcessorName());
        System.out.println(computer.getDiscSizeGb());
        System.out.println(computer.getRam());
        System.out.println(computer.powerOf());
        System.out.println();

        Laptop laptop = new Laptop("Celeron", 4, 0, false, 15);
        System.out.println(laptop.getProcessorName());
        System.out.println(laptop.getDiscSizeGb());
        System.out.println(laptop.getRam());
        System.out.println(laptop.powerOf());
        System.out.println();

        Dell dell = new Dell(16, 200, 15);
        System.out.println(dell.getProcessorName());
        System.out.println(dell.getDiscSizeGb());
        System.out.println(dell.getRam());
        System.out.println(dell.powerOf());
        System.out.println();

        Computer laptopComputer = new Laptop("Celeron",8,300,true,17);
        laptop.getRam();

        Computer dellComputer  = new Dell(8,800,17); // takie coś daje pewną elastyczność
        ((Dell) dellComputer).getScreanSize(); // Odradzamy stosowanie rzutowania tu
        dellComputer.powerOf();

        Computer[] computers={computer,laptop,dell,dellComputer,laptopComputer};
        for (Computer tempComp:computers){
            computer.getRam();
        }

       // PrzykladKlasyAbstrakcyjnej przyklad = new PrzykladKlasyAbstrakcyjnej(); // klasy abstrakcyjnej nie możymy utworzyć poprzez new
        // klasy abstrakcyjne służą do przechowywania ogólnych informacji
        // bo co to ogółny owoc czy ogólne auto

    }
}

package pl.sda.java.Day3.Task2;

public class Zwierze {

    private String gatunek;


    public Zwierze(String gatunek) {
        this.gatunek = gatunek;
        if(gatunek.equals("ssak")||gatunek.equals("gad")||gatunek.equals("ryba")){
            this.gatunek = gatunek;
        }else {
            this.gatunek = "nieznazny";
        }
    }
}

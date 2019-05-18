package pl.sda.java.Day7.Repeat;

public abstract class AnimalAbstract {

    // obiektu klasy abstrakcyjnej nie można później utworzyć

    private String specie;

    public AnimalAbstract(String specie) {
        this.specie = specie;
    }

    public String getSpecie() {
        return specie;
    }
}

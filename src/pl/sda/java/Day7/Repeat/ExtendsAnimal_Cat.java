package pl.sda.java.Day7.Repeat;

public class ExtendsAnimal_Cat extends AnimalAbstract implements InterfacePredator{

    private int mustacheLenght;

    public ExtendsAnimal_Cat(int mustacheLenght) {
        super("ssak");                  // z klasy nadrzędnej abstrakcyjnej
        this.mustacheLenght = mustacheLenght; //z tej klasy
            }
            public int getMustacheLenght(){
        return mustacheLenght;
            }

    @Override
    public void hunt() {                   // kółko ze strzałką i literą i - implements - musi być
        System.out.println("poluję jak kot");
    }

    @Override
    public void kill() {                // kółko ze strzałką i literą o - override - nie musi być ale nadpisujemy
        System.out.println("zabijam jak kot");
    }

    @Override
    public String toString() {
        return "ExtendsAnimal_Cat{" +
                "mustacheLenght=" + mustacheLenght +
                '}';
    }
}

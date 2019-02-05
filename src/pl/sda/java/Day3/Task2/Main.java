package pl.sda.java.Day3.Task2;

public class Main {
    public static void main(String[] args) {
        Sznaucer sznaucer = new Sznaucer();
        Labrador labrador = new Labrador();
        Dog  dog = new Dog();
        Pies kundel = new Pies("burek");
        Pies piesSznaucer = new Sznaucer(); // tak też można utworzyć sznaucera

         Pies[] psy= new Pies[]{sznaucer,labrador,dog,kundel, piesSznaucer};
        for (Pies temp: psy){
            System.out.println(temp.getRasa() +" "+ temp.szczekaj());

         Zwierze[] zwierzeta= new Zwierze[]{sznaucer,labrador,dog,kundel};
         }
    }
}

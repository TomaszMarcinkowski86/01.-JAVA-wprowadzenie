package pl.sda.java.Day7.Repeat;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        String someString = "Hello world";
        String anotherString = new String("Hello wort");
        LocalDate myByrthday = LocalDate.of(1986, Month.JANUARY, 24);
        Person person1 = new Person("Tomasz", "Marcinkowski", myByrthday);

        LocalDate birthday = person1.getBirthday(); //Ctrl+Alt+v stworzy zmienną lokalną automatycznie

//        AnimalAbstract animal=new AnimalAbstract(); // Nie można stworzyć klasy abstrakcyjnej - nie robi się tego

        ExtendsAnimal_Cat cat1 = new ExtendsAnimal_Cat(5);
        ExtendsAnimal_Dog dog1 = new ExtendsAnimal_Dog();
        cat1.hunt();
        cat1.kill();

        String specie = cat1.getSpecie();

        AnimalAbstract cat2 = new ExtendsAnimal_Cat(3); // utworzenie kota przy użyciu klasy nadrzędnej Animal
        String cat2Specie = cat2.getSpecie();

        List<AnimalAbstract> animalList = new ArrayList<>();
        animalList.add(cat1);
        animalList.add(cat2);

        if (cat2 instanceof InterfacePredator) {         // instanceof  sprawdza czy Cat2 to predator. Zadziała też z Animal i
            System.out.println("cat2 to predator");
        }

        InterfacePredator catPredator = new ExtendsAnimal_Cat(6);
//        ((ExtendsAnimal_Cat) catPredator).getMustacheLenght()  można wybrać metodę z klasyt wyrzszej ale zrobi rzutowanie tak się nie robi
        catPredator.hunt();
        catPredator.kill();

        AnimalAbstract abstractAnimal = new AnimalAbstract("some specie") {  // klasa anonimaowa początek. rzadko się korzysta. Tworzymy nową klasę która dziedziczy po nowej Klasie ale nie ma nazwy właśnej
            private int number;

            // nie jesteśmy w stanie wywwołać tej metody poza obrębem klasy anonimowej.
            public void fun() {
                System.out.println();
            }

            @Override
            public String getSpecie() {
                return "bla bla";
            }
        };// koniec klasy anonimowej

        Map<String, ExtendsAnimal_Cat> catMap = new HashMap<>();
        catMap.put("filemon", cat1);
        catMap.put("filemon", new ExtendsAnimal_Cat(9)); //poprzedni nadpisze nowym kotem
        catMap.put("bonifacy", new ExtendsAnimal_Cat(2));

        ExtendsAnimal_Cat Filemon = catMap.get("filemon"); // null w brzypadku braku klucza, jak jest zwróci wartość (tego co wyżej)
        boolean filemonExists = catMap.containsKey("filemon"); // zwróci czy klucz istnieje

        // sprawdzamy czy nie jest nullem i dopiero coś robimy. Ale tu wartość klucza bonifacy może by c null
        ExtendsAnimal_Cat bonifacy = catMap.get("bonifacy");
        if (bonifacy != null) { // sprawdzenie czy klucz nie jest nullem
            bonifacy.hunt(); // bezpiecznie mozemy wywoływać metodu
        } else {
            System.out.println("bonifacy poluje");
        }

        // sprawdza czy jest klucz to możemy coś zrobić jak jest
        if (catMap.containsKey("bonifay")) {
            catMap.get("bonifacy").hunt(); // niepowodzenie jeśli wartość pod kluczem bonifacy jest nullem
        } else {
            System.out.println("nie ma bonifacego");
        }

        //doda do mapy klucz z wartością tylko jeśli nie istnieje taki klucz
        catMap.putIfAbsent("klakier", new ExtendsAnimal_Cat(50));
        catMap.putIfAbsent("filemon", new ExtendsAnimal_Cat(2)); // tego nie doda bo już mamy w mapie filemon

        // zadziała jak istnieje i podmieni
        catMap.replace("bonifacy", new ExtendsAnimal_Cat(22));
        // nie zadziała bo nie ma
        catMap.replace("kitek", new ExtendsAnimal_Cat(1));


        ExtendsAnimal_Cat bonifacy1 = catMap.getOrDefault("bonifacy", new ExtendsAnimal_Cat(8)); // zwróci wartość pod kluczem bonifacy z mapy
        ExtendsAnimal_Cat klakier = catMap.getOrDefault("klakier", new ExtendsAnimal_Cat(8)); // zwróci wartość którą podaliśmy pod wartościa metody getOrDefault


        Collection<ExtendsAnimal_Cat> values = catMap.values(); // daje wartosci
        Set<String> keys = catMap.keySet(); // daje klucze
        Set<Map.Entry<String, ExtendsAnimal_Cat>> keyvalue = catMap.entrySet();
        for (Map.Entry<String, ExtendsAnimal_Cat> tempKeyValue: catMap.entrySet()){
            System.out.println(tempKeyValue);
        }


    }     // klasa anonimowa będzie działać tylko do końca tej metody w kt óej występuje

}

package pl.sda.java.Day5.Repeat.ENUM;

import pl.sda.java.Day5.Repeat.Color;

public class Main {
    public static void main(String[] args) {

        /* 1. Stwórz Enum o nazwie Kolor
           2. Zdefiniuj w nim następujące elementy:
              CZERWONY, NIEBIESKI, ZIELONY, CZARNY
           3. Stwórz klasę Samochod, która będzie
              posiadać informację o kolorze samochodu za pomocą powyższego enuma*/

        Car car = new Car(Color.GREEN);
        System.out.println(car.getColor());

    }
}

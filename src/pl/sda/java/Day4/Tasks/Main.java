package pl.sda.java.Day4.Tasks;

import com.sun.xml.internal.ws.policy.PolicyMapKey;

import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {

        int[] numbers = {12,2,2,23,42,566};
        IntNumber intNumber = new IntNumber(numbers);
        intNumber.twoMaxAndTwoMin(numbers);

        House house=new House(1,true,"Słoneczna");
        System.out.println(house.getNumberOfDoors());
        System.out.println(house.getStreetName());


        Apple apple = new Apple();
        Pear pear = new Pear();
        Cherry cherry = new Cherry();
        Fruit appleFruit = new Apple();
        Fruit pearFruit = new Pear();
        Fruit cherryFruit = new Cherry();

        Fruit[] fruits = {apple,pear,cherry,appleFruit,pearFruit,cherryFruit};
        for(Fruit temFruit: fruits){
            System.out.print(temFruit.colour() +" ");
            System.out.print(temFruit.size() +" ");
            System.out.print(temFruit.taste() +" ");
            System.out.println();
        }
    }
}

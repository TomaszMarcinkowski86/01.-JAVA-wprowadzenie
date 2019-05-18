package pl.sda.java.Day8.Task.GenericClass;

public class GenericClass <T> { // <tu dowolne znaki zywczajowo T , Typ, K,V, może być więcej niż jeden typ np mapa ma 2>

    private T someValue;  // klasa generyczna może być naszego własnego typu

    public void set(T value){
        this.someValue = value;
    }
    public T get(){
        return someValue;
    }

    public String convertToString (T value){
        return String.valueOf(value);
    }
}

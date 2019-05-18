package pl.sda.java.Day8.Task.OptionalTask;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class NumberMapping {

   private Map<Integer,String> integerStringMap = new HashMap<>();

   public void add(Integer number, String word){
       integerStringMap.put(number,word); // dodajemy nowy wpis do mapy
   }

   public Optional<String> get(Integer key){
       String word = integerStringMap.get(key); //pobieramy wartość mapy
       return Optional.ofNullable(word);  // opakowujemy pobraną wartość optionala
   }
}

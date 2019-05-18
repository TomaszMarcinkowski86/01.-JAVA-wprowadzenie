package pl.sda.java.Day8.Task.Generic_task;

import java.util.Arrays;
import java.util.List;

public class QuickList<T> {

    private List<T> elements;

    public QuickList(T... elements) {
        this.elements = Arrays.asList(elements); // zamieniamy tablicę na listę
    }
    public List<T> toList(){
        return elements;
    }

}


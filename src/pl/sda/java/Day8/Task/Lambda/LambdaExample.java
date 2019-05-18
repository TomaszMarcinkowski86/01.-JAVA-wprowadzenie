package pl.sda.java.Day8.Task.Lambda;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class LambdaExample {

    ////////////Lambda/////////////////////
    Function<Integer, Integer> power() {
        return x -> x * x;       // tak się ją definiuje jednoparametrowa
    }

    public BiFunction<Integer, Integer, Integer> add() {
        return (x, y) -> x + y;          // tak definiujemy 2 argumentową
    }

    // lambdy które coś zwracają (można traktować jak metody które coś zwracają
    Function<String, String> lambdaForOneParameterAndOneResult;
    BiFunction<String, String, String> lambdaForTwoParameterAndOneResult;

    //Lambdy które nic nie zwracają (można traktować jak metodę void)
    Consumer<String> lambdaForOneParameterAndNoResult;
    BiConsumer<String, String> lambdaForTwoParameterAndNoResult;

}

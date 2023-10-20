package org.example.lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaDemo {

    public static void main(String[] args){

        // x -> x + 2

        // 4 classes
        // Predicate - takes 1 value return a boolean
        Predicate<String> predicate = x -> x.startsWith("a");

        // Function - takes 1 value and returns 1 value
        Function<Integer, Integer> function = x -> x + 2;

        //Supplier - takes nothing and returns 1 value
        Supplier<String> supplier = () -> "Hello Lambda";

        //Consumer - takes 1 value and returns nothing
        Consumer<String> consumer = System.out::println;
    }
}

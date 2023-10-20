package org.example.streamapi;

import java.util.Random;
import java.util.function.Supplier;

public class StringGenerator implements Supplier<String> {

    private Random random = new Random();
    char[] letters  = "01234567ABCDEFGHIJKLMNOPR".toCharArray();


    @Override
    public String get() {
        return "" + letters[random.nextInt(letters.length)];
    }
}

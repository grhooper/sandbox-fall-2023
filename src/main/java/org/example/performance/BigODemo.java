package org.example.performance;

import java.util.ArrayList;
import java.util.List;

public class BigODemo {

    public static void main(String[] args) {

        // O(1)
        List<String> list = new ArrayList<>();

        // O(1)
        if (list.size() > 10){
            // O(n)
            while (list.size() > 10){

            }
            // O(n) * O(n)
            while (list.add("value") != false){

            }
            if (list.contains("value")){

            }
        }
        // 1 + 1 + n + n + 1 = 3 + 2n
    }
}

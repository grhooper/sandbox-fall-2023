package org.example.recursion;

public class Factorial {

    private static int counter = 0;

    public static int factorialIterative(int n) {

        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i; //f = f * i
        }
        return f;
    }

    public static int factorialRecursive(int n) {
        System.out.println(++counter);
        return n * factorialRecursive(n - 1);
    }

    public static void main(String[] args) {
        for (int x = 1; x <= 10; x++) {
            System.out.println(Factorial.factorialIterative(x));
            System.out.println(Factorial.factorialRecursive(x));
        }
    }
}

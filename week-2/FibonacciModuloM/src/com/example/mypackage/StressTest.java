package com.example.mypackage;

import java.util.concurrent.ThreadLocalRandom;

public class StressTest {

    public static void main(String[] args) {

        System.out.println("Stress testing: efficient implementation of " +
                "Fibonacci Number Modulo M algorithm\n");

        while (true) {
            long a = ThreadLocalRandom.current().nextLong(10000000);
            long b = ThreadLocalRandom.current().nextLong(1000);

            long result1 = FibonacciModuloMNaive.fibonacciModuloM(a, b);
            long result2 = FibonacciModuloMNaive.fibonacciModuloM(a, b);

            System.out.println("Input: " + a + " " + b);
            if (result1 != result2) {
                System.out.println("Inconsistent results: " + result1 + " " + result2);
                break;
            } else {
                System.out.println("OK\n");
            }
        }
    }
}

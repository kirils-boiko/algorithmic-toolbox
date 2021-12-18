package com.example.mypackage;

import java.util.concurrent.ThreadLocalRandom;

public class StressTest {

    public static void main(String[] args) {

        System.out.println("Stress testing: efficient implementation of " +
                "Last Digit of the Partial Sum of Fibonacci Numbers algorithm\n");

        while (true) {
            long a = ThreadLocalRandom.current().nextLong(10000);
            long b = ThreadLocalRandom.current().nextLong(a,1000000);

            long result1 = FibonacciPartialSumLastDigitNaive.getLastDigit(a, b);
            long result2 = FibonacciPartialSumLastDigitEfficient.getLastDigit(a, b);

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

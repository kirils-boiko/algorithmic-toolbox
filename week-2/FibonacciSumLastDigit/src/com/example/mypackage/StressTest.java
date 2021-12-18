package com.example.mypackage;

import java.util.concurrent.ThreadLocalRandom;

public class StressTest {

    public static void main(String[] args) {

        System.out.println("Stress testing: efficient implementation of " +
                "Last Digit of the Sum of Fibonacci Numbers algorithm\n");

        while (true) {
            long a = ThreadLocalRandom.current().nextLong(1000000);

            long result1 = FibonacciSumLastDigitNaive.fibonacciSumLastDigit(a);
            long result2 = FibonacciSumLastDigitEfficient.fibonacciSumLastDigit(a);

            System.out.println("Input: " + a);
            if (result1 != result2) {
                System.out.println("Inconsistent results: " + result1 + " " + result2);
                break;
            } else {
                System.out.println("OK\n");
            }
        }
    }
}

package com.example.mypackage;

import java.util.Random;

public class StressTest {

    public static void main(String[] args) {

        System.out.println("Stress testing the efficient implementation of Fibonacci Last Digit algorithm\n");

        while (true) {
            Random rd = new Random();
            int randomInt = rd.nextInt(90);

            long result1 = FibonacciLastDigitNaive.fibonacciLastDigit(randomInt);
            long result2 = FibonacciLastDigitEfficient.fibonacciLastDigit(randomInt);

            System.out.println("n = " + randomInt);
            if (result1 != result2) {
                System.out.println("Inconsistent results: " + result1 + " " + result2);
                break;
            } else {
                System.out.println("OK\n");
            }
        }
    }
}

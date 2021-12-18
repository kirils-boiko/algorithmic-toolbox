package com.example.mypackage;

import java.util.Random;

public class StressTest {

    public static void main(String[] args) {

        System.out.println("Stress testing the efficient implementation of Fibonacci Number algorithm\n");

        while (true) {
            Random rd = new Random();
            int randomInt = rd.nextInt(45);

            long result1 = FibonacciNumberNaive.fibonacciNumber(randomInt);
            long result2 = FibonacciNumberEfficient.fibonacciNumber(randomInt);

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

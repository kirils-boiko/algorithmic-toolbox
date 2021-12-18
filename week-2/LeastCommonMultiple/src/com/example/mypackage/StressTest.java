package com.example.mypackage;

import java.util.concurrent.ThreadLocalRandom;

public class StressTest {

    public static void main(String[] args) {

        System.out.println("Stress testing: efficient implementation of " +
                "Least Common Multiple algorithm\n");

        while (true) {
            int a = ThreadLocalRandom.current().nextInt(10000);
            int b = ThreadLocalRandom.current().nextInt(10000);

            long result1 = LCMNaive.leastCommonMultiple(a,b);
            long result2 = LCMEfficient.leastCommonMultiple(a,b);

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

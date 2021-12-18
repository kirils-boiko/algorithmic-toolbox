package com.example.mypackage;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class StressTest {

    public static void main(String[] args) {

        System.out.println("Stress testing: the efficient implementation of" +
                " Euclidean GCD algorithm\n");

        while (true) {
            long a = ThreadLocalRandom.current().nextLong(2000000);
            long b = ThreadLocalRandom.current().nextLong(2000000);

            long result1 = GCDNaive.GCD(a, b);
            long result2 = GCDEfficient.GCD(a, b);

            System.out.println(a + " " + b);
            if (result1 != result2) {
                System.out.println("Inconsistent results: " + result1 + " " +
                        result2);
                break;
            } else {
                System.out.println("OK");
            }

            System.out.println();
        }

    }
}

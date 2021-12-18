package com.example.mypackage;

/*
    Naive implementation of the GCD algorithm:
    GCD(a,b):
        best <- 0
        for d from 1 to min(a,b):
            if d|a and d|b:
                best <- d
        return best

 */

import java.util.Scanner;

public class GCDNaive {

    static long GCD(long a, long b) {
        long c = Math.min(a, b);
        long result = 1;
        for (int i = 2; i <= c; i++) {
            if (a % i == 0 && b % i == 0) {
                result = (long)i;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();

        System.out.println(GCD(a,b));
    }
}

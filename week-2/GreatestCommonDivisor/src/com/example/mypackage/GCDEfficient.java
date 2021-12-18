package com.example.mypackage;

/*
    Efficient implementation of the GCD Euclidean algorithm:
    GCD(a,b):
        if b = 0:
            return a
        r <- a mod b
        return GCD(b, r)

 */

import java.util.Scanner;

public class GCDEfficient {

    static long GCD(long a, long b) {
        if (b == 0)
            return a;
        long r = a % b;
        return GCD(b, r);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();

        System.out.println(GCD(a,b));
    }
}

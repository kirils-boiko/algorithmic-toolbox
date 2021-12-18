package com.example.mypackage;

/*
    Naive implementation of the Least Common Multiple algorithm:
    LCM(a,b):
        start <- max(a,b)
        product <- a * b
        for i from start to product:
            if a|i and b|i:
                return i
        return product

 */

import java.util.Scanner;

public class LCMNaive {

    static long leastCommonMultiple(int a, int b) {
        for (long l = Math.max(a,b); l <= (long) a * b; ++l)
            if (l % a == 0 && l % b == 0)
                return l;

        return (long) a * b;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(leastCommonMultiple(a, b));
    }

}

package com.example.mypackage;

/*
    Efficient implementation of the Least Common Multiple algorithm
        (using Euclidean GCD):
    LCM(a,b):
        larger <- max(a,b)
        smaller <- min(a,b)
        gcd <- GCD(a,b)
        return (larger/gcd) * smaller

 */

import java.util.Scanner;

public class LCMEfficient {

    static long leastCommonMultiple(int a, int b) {
        return (Math.max(a,b)/GCDEfficient.greatestCommonDivisor(a,b)) *
                Math.min(a,b);
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(leastCommonMultiple(a, b));
    }

}

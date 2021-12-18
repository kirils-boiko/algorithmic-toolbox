package com.example.mypackage;

import java.util.Scanner;

/*
    Efficient implementation of the Fibonacci Number algorithm:
    FibonacciNumber(n):
        create array F[0...n]
        F[0] <- 0
        F[1] <- 1
        for i from 2 to n:
            F[i] <- F[i-1] + F[i-2]
        return F[n]
 */

public class FibonacciNumberEfficient {

    static long fibonacciNumber(int n) {
        if (n == 0) {
            return 0;
        }
        long[] numbers = new long[n+1];
        numbers[0] = 0;
        numbers[1] = 1;
        for (int i = 2; i <= n; i++) {
            numbers[i] = numbers[i-1] + numbers[i-2];
        }
        return numbers[n];
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println(fibonacciNumber(n));
    }
}

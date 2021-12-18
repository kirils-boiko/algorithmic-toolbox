package com.example.mypackage;

/*
    Naive implementation of the Fibonacci Number algorithm:
    FibonacciNumber(n):
        if n <= 1:
            return n
        else:
            return FibonacciNumber(n-1) + FibonacciNumber(n-2)
 */

import java.util.Scanner;

public class FibonacciNumberNaive {
    static long fibonacciNumber(int n) {
        if (n <= 1)
            return (long)n;

        return fibonacciNumber(n - 1) + fibonacciNumber(n - 2);
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println(fibonacciNumber(n));
    }
}

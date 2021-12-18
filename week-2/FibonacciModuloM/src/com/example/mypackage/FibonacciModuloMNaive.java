package com.example.mypackage;

/*
    Naive implementation of the Fibonacci Number Modulo m algorithm:
    FibonacciModuloM(n, m):
        if n < 2:
            return n
        previous <- 0
        current <- 1
        for i from 2 to n:
            tempPrevious <- previous
            previous <- current
            current <- (tempPrevious + previous) mod m
        return current
 */

import java.util.Scanner;

public class FibonacciModuloMNaive {
    static long fibonacciModuloM(long n, long m) {
        if (n < 2)
            return n;

        long previous = 0;
        long current  = 1;

        for (long i = 2; i <= n; ++i) {
            long tmp_previous = previous;
            previous = current;
            current = (tmp_previous + current) % m;
        }

        return current;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long m = scanner.nextLong();
        System.out.println(fibonacciModuloM(n, m));
    }
}

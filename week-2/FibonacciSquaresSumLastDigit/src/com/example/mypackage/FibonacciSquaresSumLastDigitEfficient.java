package com.example.mypackage;

/*
    Efficient implementation of the Last Digit of the Sum of Squares of
     Fibonacci Number algorithm:

    FibonacciSquaresSumLastDigit(n):
        if n < 2:
            return n
        result <- (fibonacciModuloM(n, 10) * fibonacciModuloM(n + 1, 10)) mod 10
        return result

    FibonacciModuloM(n, m):
        if n < 2:
            return n
        period <- pisano(m)
        smallN <- n mod period
        return FibonacciModuloMNaive(smallN, m)


    pisano(m):
        if m < 2:
            return m
        previous <- 1
        current < 1
        period <- 0
        n <- 2
        while previous != 0 and current != 1:
            previous <- current
            current <- FibonacciModuloMNaive(n, m)
            n++
            period++
       return period

   FibonacciModuloMNaive(n, m):
        if n < 2:
            return n
        previous <- 0
        current <- 1
        for i from 2 to n:
            tempPrevious <- previous
            previous <- current
            current <- (tempPrevious + previous) mod m
        return current

    Note: Last Digit of the Sum of Squares of Fibonacci Numbers, LDSSF:
        LDSSF(n) = ((F(n) mod 10) * (F(n+1) mod 10)) mod 10
    Note: fibonacciModuloM(n,m) function is adapted from FibonacciModuloM problem
        which calculate the nth Fibonacci Number modulo m;
 */

import java.util.Scanner;

public class FibonacciSquaresSumLastDigitEfficient {
    static long getLastDigit(long n) {
        if (n < 2)
            return n;

        long result = (fibonacciModuloM(n, 10) *
                fibonacciModuloM(n+1, 10)) % 10;
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long s = getLastDigit(n);
        System.out.println(s);
    }

    private static long fibonacciModuloM(long n, long m) {
        if (n < 2)
            return n;

        int period = pisano(m);
        long smallN = n % period;

        return fibonacciModuloMNaive(smallN, m);
    }

    private static int pisano(long m) {
        if (m < 2)
            return (int)m;

        long previous = 1;
        long current = 1;
        int period = 0;
        long n = 2;
        while (previous != 0 || current != 1) {
            previous = current;
            current = fibonacciModuloMNaive(n,m);
            n++;
            period++;
        }
        return period;
    }

    private static long fibonacciModuloMNaive(long n, long m) {
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
}

package com.example.mypackage;

/*
    Naive implementation of the Last Digit of the Sum of Fibonacci Numbers algorithm:
    FibonacciSumLastDigit(n):
        if n < 2:
            return n
        previous <- 0
        current <- 1
        lastDigit <- 1

        for i from 2 to n:
            tempPrevious <- previous
            previous <- current
            current <- (tempPrevious + previous) mod 10
            lastDigit = (lastDigit + current) mod 10
        return lastDigit


 */

import java.util.Scanner;

public class FibonacciSumLastDigitNaive {

    static long fibonacciSumLastDigit(long n) {
        if (n < 2)
            return n;

        long previous = 0;
        long current  = 1;
        long lastDigit      = 1;

        for (long i = 2; i <= n; ++i) {
            long tmp_previous = previous;
            previous = current;
            current = (tmp_previous + current) % 10;
            lastDigit = (lastDigit + current) % 10 ;
        }

        return lastDigit;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long s = fibonacciSumLastDigit(n);
        System.out.println(s);
    }
}

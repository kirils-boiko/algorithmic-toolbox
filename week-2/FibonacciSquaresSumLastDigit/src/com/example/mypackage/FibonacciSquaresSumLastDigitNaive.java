package com.example.mypackage;

/*
    Naive implementation of the Last Digit of the Sum of Squares of
     Fibonacci Number algorithm:
    FibonacciSquaresSumLastDigit(n):
        if n < 2:
            return n
        previous <- 0
        current <- 1
        result <- 1
        for i from 2 to n:
            tempPrevious <- previous
            previous <- current
            current <- (tempPrevious + previous) mod 10
            square <- (current * current) mod 10
            result <- (result + square) mod 10
        return current
 */

import java.util.Scanner;

public class FibonacciSquaresSumLastDigitNaive {

    static long getLastDigit(long n) {
        if (n < 2)
            return n;

        long previous = 0;
        long current  = 1;
        long result      = 1;

        for (long i = 2; i <= n; ++i) {
            long tempPrevious = previous;
            previous = current;
            current = (tempPrevious + current) % 10;
            long square = (current * current) % 10;
            result = (result + square) % 10;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long s = getLastDigit(n);
        System.out.println(s);
    }
}

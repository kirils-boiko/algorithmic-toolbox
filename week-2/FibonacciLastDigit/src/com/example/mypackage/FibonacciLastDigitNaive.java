package com.example.mypackage;

/*
    Naive implementation of the Last Digit of Fibonacci Number algorithm:
    FibonacciLastDigit(n):
        if n < 2:
            return n
        previous <- 0
        current <- 1
        for i from 2 to n:
            tempPrevious <- previous
            previous <- current
            current <- tempPrevious + previous
        return current mod 10
 */

import java.util.Scanner;

public class FibonacciLastDigitNaive {

    static int fibonacciLastDigit(int n) {
        if (n < 2)
            return n;

        long previous = 0;
        long current  = 1;

        for (int i = 2; i <= n; ++i) {
            long tmp_previous = previous;
            previous = current;
            current = tmp_previous + current;
        }

        return (int)(current % 10);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = fibonacciLastDigit(n);
        System.out.println(c);
    }
}

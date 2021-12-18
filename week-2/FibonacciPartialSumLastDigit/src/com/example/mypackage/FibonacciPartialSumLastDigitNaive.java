package com.example.mypackage;

/*
    Naive implementation of the Last Digit of the Partial Sum of
    Fibonacci Numbers algorithm:
    FibonacciPartialSumLastDigit(from, to):
        result <- 0
        current <- 0
        next <- 1
        for i from 0 to to:
            if i >= from:
                result <- (result + current) mod 10
            newCurrent <- current
            next <- (next + current) mod 10
            current <- newCurrent
        return result
*/

import java.util.Scanner;

public class FibonacciPartialSumLastDigitNaive {

    static long getLastDigit(long from, long to) {
        long sum = 0;

        long current = 0;
        long next  = 1;

        for (long i = 0; i <= to; ++i) {
            if (i >= from) {
                sum = (sum + current) % 10;
            }

            long newCurrent = next;
            next = (next + current) % 10;
            current = newCurrent;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long from = scanner.nextLong();
        long to = scanner.nextLong();
        System.out.println(getLastDigit(from, to));
    }
}

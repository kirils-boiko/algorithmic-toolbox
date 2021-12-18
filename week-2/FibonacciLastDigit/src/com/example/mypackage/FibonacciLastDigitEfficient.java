package com.example.mypackage;

/*
    Efficient implementation of the Last Digit of Fibonacci Number algorithm:
    FibonacciLastDigit(n):
        if n < 2:
            return n
        previous <- 0
        current <- 1
        for i from 2 to n:
            tempPrevious <- previous
            previous <- current
            current <- (tempPrevious + previous) mod 10
        return current
 */

import java.util.Scanner;

public class FibonacciLastDigitEfficient {

    static int fibonacciLastDigit(int n) {
        if (n < 2)
            return n;

        int previous = 0;
        int current  = 1;

        for (int i = 2; i <= n; ++i) {
            int tmp_previous = previous;
            previous = current;
            current = (tmp_previous + current) % 10;
        }

        return current;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = fibonacciLastDigit(n);
        System.out.println(c);
    }
}

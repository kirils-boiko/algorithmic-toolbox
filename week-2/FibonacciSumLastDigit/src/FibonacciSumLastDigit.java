
/*
    Uploadable solution:
        Last Digit of the Sum of Fibonacci Numbers algorithm
 */

import java.util.*;

public class FibonacciSumLastDigit {
    private static long getFibonacciSum(long n) {
        if (n < 2)
            return n;

        int period = pisano(10);
        long smallN = n % period;

        return fibonacciSumLastDigitNaive(smallN);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long s = getFibonacciSum(n);
        System.out.println(s);
    }

    private static long fibonacciSumLastDigitNaive(long n) {
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


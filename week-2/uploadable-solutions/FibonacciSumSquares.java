
/*
    Uploadable solution:
        Last Digit of the Sum of Squares of Fibonacci Number algorithm
 */

import java.util.*;

public class FibonacciSumSquares {
    private static long getFibonacciSumSquares(long n) {
        if (n < 2)
            return n;

        long result = (fibonacciModuloM(n, 10) *
                fibonacciModuloM(n+1, 10)) % 10;
        return result;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long s = getFibonacciSumSquares(n);
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


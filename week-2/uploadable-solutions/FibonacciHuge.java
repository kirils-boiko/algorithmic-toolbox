
/*
    Uploadable solution:
        Large Fibonacci Number Modulo M algorithm
 */

import java.util.*;

public class FibonacciHuge {
    private static long getFibonacciHuge(long n, long m) {
        if (n < 2)
            return n;

        int period = pisano(m);
        long smallN = n % period;

        return fibonacciModuloMNaive(smallN, m);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long m = scanner.nextLong();
        System.out.println(getFibonacciHuge(n, m));
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


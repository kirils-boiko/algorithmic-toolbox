package com.example.mypackage;

import java.util.Scanner;

public class FibonacciPartialSumLastDigitEfficient {

/*
    Efficient implementation of the Last Digit of the Partial Sum of
    Fibonacci Numbers algorithm:
    FibonacciPartialSumLastDigit(from, to):
        period <- pisano(10)
        fromRemainder <- from mod period
        toRemainder <- to mod period
        if fromRemainder > toRemainder:
            summations <- period - toRemainder
        else:
            summations <- toRemainder
        result <- 0
        current <- 0
        next <- 1
        for i from 0 to summations:
            if i >= fromRemainder:
                result <- (result + current) % 10
            newCurrent <- next
            next <- (current + next) % 10
            current <- newCurrent
        return result


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

    static long getLastDigit(long from, long to) {
      long period = pisano(10);
      long fromRemainder = from % period;
      long toRemainder = to % period;

      long summations = (fromRemainder > toRemainder) ?
              (period + toRemainder) : toRemainder;

      long result = 0;
      long current = 0;
      long next = 1;
      for (long i = 0; i <= summations; i++) {
          if (i >= fromRemainder)
              result = (result + current) % 10;

          long newCurrent = next;
          next = (current + next) % 10;
          current = newCurrent;
      }

      return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long from = scanner.nextLong();
        long to = scanner.nextLong();
        System.out.println(getLastDigit(from, to));
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

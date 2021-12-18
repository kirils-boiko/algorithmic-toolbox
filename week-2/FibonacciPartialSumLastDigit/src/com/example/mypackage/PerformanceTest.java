package com.example.mypackage;

public class PerformanceTest {

    static void testPerformance(long a, long b) {
        System.out.println("\nInput: " + a + " " + b);
        long startTime = System.currentTimeMillis();
        FibonacciPartialSumLastDigitNaive.getLastDigit(a, b);
        //System.out.println("Output (naive implementation): " + FibonacciPartialSumLastDigitNaive.getLastDigit(a,b));
        System.out.println("Naive implementation execution time: " +
                (System.currentTimeMillis() - startTime) + " ms");
        startTime = System.currentTimeMillis();
        FibonacciPartialSumLastDigitEfficient.getLastDigit(a, b);
        //System.out.println("Output (efficient implementation): " + FibonacciPartialSumLastDigitEfficient.getLastDigit(a,b));
        System.out.println("Efficient implementation execution time: " +
                (System.currentTimeMillis() - startTime) + " ms");
    }

    public static void main(String[] args) {
        System.out.println("Performance testing: Last Digit of the Partial Sum of Fibonacci Numbers algorithms");

        testPerformance(3, 7);
        testPerformance(10, 200);
        testPerformance(100, 1000);
        testPerformance(1000, 10000);
        testPerformance(10000, 100000);
        testPerformance(10000, 1000000);
        testPerformance(10000, 10000000);
        testPerformance(10000, 100000000);
        testPerformance(10000, 1000000000);
        testPerformance(10000, 10000000000L);

    }
}
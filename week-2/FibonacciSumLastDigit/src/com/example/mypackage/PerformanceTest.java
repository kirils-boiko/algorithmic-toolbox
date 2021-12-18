package com.example.mypackage;

public class PerformanceTest {

    static void testPerformance(long a) {
        System.out.println("\nInput: " + a);
        long startTime = System.currentTimeMillis();
        FibonacciSumLastDigitNaive.fibonacciSumLastDigit(a);
        //System.out.println("Output (naive implementation): " + FibonacciSumLastDigitNaive.fibonacciSumLastDigit(a,b));
        System.out.println("Naive implementation execution time: " +
                (System.currentTimeMillis() - startTime) + " ms");
        startTime = System.currentTimeMillis();
        FibonacciSumLastDigitEfficient.fibonacciSumLastDigit(a);
        //System.out.println("Output (efficient implementation): " + FibonacciSumLastDigitEfficient.fibonacciSumLastDigit(a,b));
        System.out.println("Efficient implementation execution time: " +
                (System.currentTimeMillis() - startTime) + " ms");
    }

    public static void main(String[] args) {
        System.out.println("Performance testing: Last Digit of the Sum of Fibonacci Numbers algorithms");

        testPerformance(10000);
        testPerformance(100000);
        testPerformance(1000000);
        testPerformance(10000000);
        testPerformance(100000000);
        testPerformance(1000000000);
        testPerformance(10000000000L);

    }
}
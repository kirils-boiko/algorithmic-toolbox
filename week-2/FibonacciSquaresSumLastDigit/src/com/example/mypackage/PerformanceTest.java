package com.example.mypackage;

public class PerformanceTest {

    static void testPerformance(long a) {
        System.out.println("\nInput: " + a);
        long startTime = System.currentTimeMillis();
        FibonacciSquaresSumLastDigitNaive.getLastDigit(a);
        //System.out.println("Output (naive implementation): " + FibonacciSquaresSumLastDigitNaive.getLastDigit(a,b));
        System.out.println("Naive implementation execution time: " +
                (System.currentTimeMillis() - startTime) + " ms");
        startTime = System.currentTimeMillis();
        FibonacciSquaresSumLastDigitEfficient.getLastDigit(a);
        //System.out.println("Output (efficient implementation): " + FibonacciSquaresSumLastDigitEfficient.getLastDigit(a,b));
        System.out.println("Efficient implementation execution time: " +
                (System.currentTimeMillis() - startTime) + " ms");
    }

    public static void main(String[] args) {
        System.out.println("Performance testing: Last Digit of the Sum of Squares of Fibonacci Numbers algorithms");

        testPerformance(1000);
        testPerformance(10000);
        testPerformance(100000);
        testPerformance(1000000);
        testPerformance(10000000);
        testPerformance(100000000);
        testPerformance(1000000000);

    }
}
package com.example.mypackage;

public class PerformanceTest {

    static void testPerformance(long a, long b) {
        System.out.println("\nInput: " + a + " " + b);
        long startTime = System.currentTimeMillis();
        FibonacciModuloMNaive.fibonacciModuloM(a, b);
        //System.out.println("Output (naive implementation): " + FibonacciModuloMNaive.fibonacciModuloM(a,b));
        System.out.println("Naive implementation execution time: " +
                (System.currentTimeMillis() - startTime) + " ms");
        startTime = System.currentTimeMillis();
        FibonacciModuloMEfficient.fibonacciModuloM(a, b);
        //System.out.println("Output (efficient implementation): " + FibonacciModuloMEfficient.fibonacciModuloM(a,b));
        System.out.println("Efficient implementation execution time: " +
                (System.currentTimeMillis() - startTime) + " ms");
    }

    public static void main(String[] args) {
        System.out.println("Performance testing: Fibonacci Modulo m algorithms");

        testPerformance(239, 1000);
        testPerformance(2390, 1000);
        testPerformance(23900, 1000);
        testPerformance(239000, 1000);
        testPerformance(2390000, 1000);
        testPerformance(23900000, 1000);
        testPerformance(239000000, 1000);

    }
}
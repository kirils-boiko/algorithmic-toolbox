package com.example.mypackage;

public class PerformanceTest {

    static void testPerformance(int n) {
        System.out.println("\nn = " + n);
        long startTime = System.currentTimeMillis();
        FibonacciNumberNaive.fibonacciNumber(n);
        System.out.println("Naive implementation execution time: " +
                (System.currentTimeMillis() - startTime) + " ms");
        startTime = System.currentTimeMillis();
        FibonacciNumberEfficient.fibonacciNumber(n);
        System.out.println("Efficient implementation execution time: " +
                (System.currentTimeMillis() - startTime) + " ms");
    }

    public static void main(String[] args) {

        // Performance test
        System.out.println("Perfomance testing: Fibonacci Number algorithms");

       testPerformance(10);
       testPerformance(20);
       testPerformance(45);
       testPerformance(50);

    }
}

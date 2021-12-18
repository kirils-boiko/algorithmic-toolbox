package com.example.mypackage;

public class PerformanceTest {

    static void testPerformance(long a, long b) {
        System.out.println("\na=" + a + " b=" + b);
        long startTime = System.currentTimeMillis();
        GCDNaive.GCD(a,b);
        System.out.println("Naive implementation execution time: " +
                (System.currentTimeMillis() - startTime) + " ms");
        startTime = System.currentTimeMillis();
        GCDEfficient.GCD(a,b);
        System.out.println("Efficient implementation execution time: " +
                (System.currentTimeMillis() - startTime) + " ms");
    }

    public static void main(String[] args) {
        System.out.println("Performance testing: GCD algorithms");

        testPerformance(28851538L, 1183019L);
        testPerformance(884837673L, 923849238L);
        testPerformance(12345566L, 123148L);
        testPerformance(123456789, 4);

    }
}

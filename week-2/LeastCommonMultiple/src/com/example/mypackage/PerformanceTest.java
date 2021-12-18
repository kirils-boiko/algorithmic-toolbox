package com.example.mypackage;

public class PerformanceTest {

    static void testPerformance(int a, int b) {
        System.out.println("\nInput: " + a + " " + b);
        long startTime = System.currentTimeMillis();
        LCMNaive.leastCommonMultiple(a, b);
        //System.out.println("Output (naive implementation): " + LCMNaive.leastCommonMultiple(a,b));
        System.out.println("Naive implementation execution time: " +
                (System.currentTimeMillis() - startTime) + " ms");
        startTime = System.currentTimeMillis();
        LCMEfficient.leastCommonMultiple(a, b);
        //System.out.println("Output (efficient implementation): " + LCMEfficient.leastCommonMultiple(a,b));
        System.out.println("Efficient implementation execution time: " +
                (System.currentTimeMillis() - startTime) + " ms");
    }

    public static void main(String[] args) {
        System.out.println("Performance testing: Least Common Multiple algorithms");

        testPerformance(2,3);
        testPerformance(999, 430);
        testPerformance(2885,7665);
        testPerformance(76145, 61457);


    }
}
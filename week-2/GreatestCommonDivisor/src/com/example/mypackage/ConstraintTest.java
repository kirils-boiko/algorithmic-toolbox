package com.example.mypackage;

public class ConstraintTest {


    public static void main(String[] args) {
        // edge case test (maximum number of elements)
        System.out.println("Constraint testing: GCD.");

        System.out.println("\nConstraint test: min value of a, b = 1.");
        System.out.println("Naive implementation: " + GCDNaive.GCD(1,1));
        System.out.println("Efficient implementation: " + GCDEfficient.GCD(1,1));

        System.out.println("\nConstraint test: close to max value of a, b = 2 * 10ˆ9.");
        System.out.println("Naive implementation: " + GCDNaive.GCD(2000000000,199999999));
        System.out.println("Efficient implementation: " + GCDEfficient.GCD(2000000000,199999999));


    }

}

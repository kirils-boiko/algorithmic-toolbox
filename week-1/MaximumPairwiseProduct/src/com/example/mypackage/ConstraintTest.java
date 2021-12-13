package com.example.mypackage;

public class ConstraintTest {

    public static void main(String[] args) {

        // edge case test (maximum number of elements)
        System.out.println("Maximum pairwise product: constraint testing.\n");
        System.out.println("Constraint test: maximum number of elements, n = 2 * 10ˆ5.");

        long startTime = System.currentTimeMillis();
        int[] largeArray = new int[20000000];
        //MaximumPairwiseProductNaive.maximumPairwiseProduct(largeArray);
        System.out.println("Naive implementation execution time: " + (System.currentTimeMillis() - startTime) + " milliseconds");

        startTime = System.currentTimeMillis();
        MaximumPairwiseProductFast.maximumPairwiseProduct(largeArray);
        System.out.println("Fast implementation execution time: " + (System.currentTimeMillis() - startTime) + " milliseconds");

        startTime = System.currentTimeMillis();
        MaximumPairwiseProductFaster.maximumPairwiseProduct(largeArray);
        System.out.println("1.5N comparisons implementation execution time: " + (System.currentTimeMillis() - startTime) + " milliseconds");
    }
}

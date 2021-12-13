package com.example.mypackage;
/*
    Naive implementation of the Maximum Pairwise Product algorithm:

    MaxPairwiseProductNaive(A[1...n]):
        product <- 0
        for i from 1 to n:
            for j from i + 1 to n:
                product <- max(product, A[i] * A[j])
        return product
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MaximumPairwiseProductNaive {

    static long maximumPairwiseProduct(int[] numbers) {
        long product = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                product = Math.max(product, (long)(numbers[i]) * numbers[j]);
            }
        }
        return product;
    }

    public static void main(String[] args) {

        System.out.println("Maximum pairwise product, naive implementation.\n");

        // simple functional test
        System.out.println();
        System.out.println("Simple functional test.");
        MaximumPairwiseProductNaive.FastScanner fastScanner = new MaximumPairwiseProductNaive.FastScanner(System.in);
        System.out.println("Please enter size of array, n:");
        int n = fastScanner.nextInt();
        int[] numbers = new int[n];
        System.out.println("Please enter " + n + " elements separated by space:");
        for (int i = 0; i < n; i++) {
            numbers[i] = fastScanner.nextInt();
        }
        System.out.println(maximumPairwiseProduct(numbers));


    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}

package com.example.mypackage;

/*
    Fast implementation of the Maximum Pairwise Product algorithm:

    MaxPairwiseProductFast(A[1...n]):
        index1 <- 1;
        for i from 2 to n:
            if A[i] > A[index1]:
                index1 <- i
        if index1 = 1:
            index2 <- 2
        else:
            index2 <- 1
        for i from 1 to n:
            if A[i] != A[index1] and A[i] > A[index2]:
                index2 <- i
        return A[index1] * A[index2]
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MaximumPairwiseProductFast {

    static long maximumPairwiseProduct(int[] numbers) {
        int firstIndex = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > numbers[firstIndex]) {
                firstIndex = i;
            }
        }

        int secondIndex = (firstIndex == 0) ? 1 : 0;
        for (int i = 0; i < numbers.length; i++) {
            if (i != firstIndex &&
                numbers[i] >= numbers[secondIndex])
                secondIndex = i;
        }

        return  ((long)numbers[firstIndex]) * numbers[secondIndex];
    }

    public static void main(String[] args) {

        System.out.println("Maximum pairwise product, fast implementation.");

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

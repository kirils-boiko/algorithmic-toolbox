package com.example.mypackage;

/*
    Faster 1.5N comparisons implementation of the
     Maximum Pairwise Product algorithm:

    MaxPairwiseProductFaster(A[1...n]):
        allocate array W[1...n/2]
        allocate array L[1...n/2]
        for i from 1 to n/2:
            if A[2*i] > A[2*i-1]:
                W[i] = A[2*i]
                L[i] = A[2*i-1]
            else:
                W[i] = A[2*i-1]
                L[i] = A[2*i]
        index1 <- 1
        for i from 1 to n/2:
            if w[i] > w[index1]:
                index1 <- i
        if index1 == 1 and n > 3:
            index2 = 2
        else:
            index2 = 1
        for i from 1 to n/2:
            if i != index1 and W[i] >= W[index2]
                index2 = i
        firstLargest <- W[index1]
        if W[index2] > L[index1]:
            secondLargest <- W[index2]
        else:
            secondLargest <- L[index1]
        if n % 2 == 1 and (firstLargest <= A[n] || secondLargest <= A[n]):
            return firstLargest * A[n]
        else:
            return firstLargest * secondLargest



       Adapted from ryan's solution at https://cs.stackexchange.com/questions/83022/find-largest-and-second-largest-elements-of-the-array
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MaximumPairwiseProductFaster {

    static long maximumPairwiseProduct(int[] numbers) {
        int n = numbers.length;
        int[] winners = new int[n/2];
        int[] losers = new int[n/2];

        for (int i = 0; i < n/2; i++) {
            if (numbers[2*i] > numbers[2*i+1]) {
                winners[i] = numbers[2*i];
                losers[i] = numbers[2*i+1];
            } else {
                winners[i] = numbers[2*i+1];
                losers[i] = numbers[2*i];
            }
        }

        int winnerIndex1 = 0;
        for (int i = 0; i < winners.length; i++) {
            if (winners[i] > winners[winnerIndex1]) {
                winnerIndex1 = i;
            }
        }

        int winnerIndex2 = 0;
        if (winnerIndex1 == 0 && n > 3)
            winnerIndex2 = 1;
        for (int i = 0; i < winners.length; i++) {
            if (i != winnerIndex1 && winners[i] >= winners[winnerIndex2]) {
                winnerIndex2 = i;
            }
        }
        
        int firstLargest = winners[winnerIndex1];
        int secondLargest = ((winners[winnerIndex2] > losers[winnerIndex1])
                && (winnerIndex1 != winnerIndex2))
                ? winners[winnerIndex2]
                : losers[winnerIndex1];
        
        if ((n % 2 == 1) &&
                (firstLargest <= numbers[n - 1] ||
                        secondLargest <= numbers[n - 1])) {
            return ((long)firstLargest) * numbers[n-1];
        }

        return ((long)firstLargest) * secondLargest;

    }

    public static void main(String[] args) {

        System.out.println("Maximum pairwise product, faster, 1.5n comparisons implementation.\n");

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

package com.example.mypackage;

import java.util.Random;

public class StressTest {

    public static void main(String[] args) {
        // stress testing loop
        while (true) {
            Random rd = new Random();
            int n = rd.nextInt(10) + 2;
            System.out.println("Size : " + n);
            int[] numbers = new int[n];
            System.out.print("Array: ");
            for (int i = 0; i < n; i++) {
                numbers[i] = rd.nextInt(100000);
                System.out.print(numbers[i] + " ");
            }
            System.out.println();

            long result1 = MaximumPairwiseProductNaive.maximumPairwiseProduct(numbers);
            long result2 = MaximumPairwiseProductFast.maximumPairwiseProduct(numbers);
            long result3 = MaximumPairwiseProductFaster.maximumPairwiseProduct(numbers);

            if (result1 != result2 || result2 != result3 || result1 != result3) {
                System.out.println("Inconsistent answers: " + result1 + " "
                    + result2 + " " + result3);
                break;
            } else {
                System.out.println("OK");
            }

        }
    }

}

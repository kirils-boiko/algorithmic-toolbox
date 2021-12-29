package com.example.mypackage;

/*  GroupingChildrenGreedy(arr[1...n]):
        sort(arr)
        segments <- 0
        i <- 0
        while i <= n:
            left <- arr[i]
            right <- right[i] + 1
            segments++
            i++
            while i <= n and arr[i] <= right:
                i++
        return segments
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GroupingChildrenGreedy {

    static int computeMinGroups(double[] arr) {
        Arrays.sort(arr);
        int groups = 0;
        int i = 0;
        while (i < arr.length) {
            double left = arr[i];
            double right = arr[i] + 1;
            groups++;
            i++;
            while (i < arr.length && arr[i] <= right) {
                i++;
            }
        }
        return groups;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double ages[] = new double[n];
        for (int i = 0; i < n; i++) {
            ages[i] = scanner.nextDouble();
        }

        System.out.println(computeMinGroups(ages));
    }

}

package com.example.mypackage;

/*  Greedy Algorithm
    CarFueling(m,n,stops[1...n]):
        numRefills <- 0, currentRefill <- 0
        while currentRefill <= n:
            lastRefill <- currentRefill
            while currentRefill <= n and
                stops[currentRefill + 1] - stops[lastRefill] <= m:
                currentRefill <- currentRefill + 1
            if currentRefill = lastRefill:
                return IMPOSSIBLE
            if currentRefill <= n:
                numRefills <- numRefills + 1
        return numRefills

 */

import java.util.*;
import java.io.*;
import java.util.stream.Collectors;

public class CarFuelingGreedy {
    static int computeMinRefills(int dist, int tank, int[] stops) {
        if (dist < 1 || dist > Math.pow(10,5) || tank < 1 ||
            tank > 400 || stops.length < 1 || stops.length > 300)
            return -1;

        List<Integer> stopsList = Arrays.stream(stops)
                .boxed().collect(Collectors.toList());
        stopsList.add(0, 0);
        stopsList.add(dist);


        int numRefills = 0, currentRefill = 0;
        while (currentRefill < stopsList.size() - 1) {
            int lastRefill = currentRefill;
            while (currentRefill < stopsList.size() - 1 &&
                    stopsList.get(currentRefill + 1) -
                            stopsList.get(lastRefill) <= tank) {
                currentRefill++;
            }
            if (currentRefill == lastRefill) {
                return -1;
            }
            if (currentRefill < stopsList.size() - 1) {
                numRefills++;
            }
        }
        return numRefills;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dist = scanner.nextInt();
        int tank = scanner.nextInt();
        int n = scanner.nextInt();
        int stops[] = new int[n];
        for (int i = 0; i < n; i++) {
            stops[i] = scanner.nextInt();
        }

        System.out.println(computeMinRefills(dist, tank, stops));
    }
}

package com.example.mypackage;

import java.util.*;

/*  MaximumLootValue(n, W, v[1...n], w[1...n]):
        sort(v, w) by v[i]/w[i] in decreasing order
        lootValue <- 0
        for i from 1 to n:
            temp <- min(W, w[i])
            lootValue <- lootValue + temp * (v[i]/w[i])
            W <- W - temp
            if W = 0:
                return lootValue
        return lootValue
 */

public class MaximumLootValueGreedy {

    private static class Item {
        private final int value;
        private final int weight;

        public Item(int value, int weight) {
            this.value = value;
            this.weight = weight;
        }

        public int getValue() {
            return value;
        }

        public int getWeight() {
            return weight;
        }

        public double getValuePerWeight() {
            return ((double) value) / weight;
        }
    }

    private static double getOptimalValue(int capacity, int[] values, int[] weights) {
        if (capacity < 0 || capacity > 2 * Math.pow(10,6) || values.length == 0 ||
                values.length > 1000)
            return -1;

        List<Item> items = new ArrayList<>();
        for (int i = 0; i < values.length; i++) {
            items.add(new Item(values[i], weights[i]));
        }
        Collections.sort(items, new Comparator<Item>() {
            @Override
            public int compare(Item o1, Item o2) {
                return Double.compare(o1.getValuePerWeight(), o2.getValuePerWeight()) * -1;
            }
        });

        double lootValue = 0.0000;
        for (int i = 0; i < items.size(); i++) {
            int temp = Math.min(capacity, items.get(i).getWeight());
            lootValue += ((double) temp) * items.get(i).getValuePerWeight();
            capacity -= temp;
            if (capacity == 0) {
                return lootValue;
            }
        }

        return lootValue;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int capacity = scanner.nextInt();
        int[] values = new int[n];
        int[] weights = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
            weights[i] = scanner.nextInt();
        }
        System.out.println(getOptimalValue(capacity, values, weights));
    }
} 

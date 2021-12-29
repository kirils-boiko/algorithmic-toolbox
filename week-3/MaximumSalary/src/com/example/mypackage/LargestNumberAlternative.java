package com.example.mypackage;

import java.util.*;
import java.util.stream.Collectors;

public class LargestNumberAlternative {
    private static String largestNumber(String[] a) {
        //write your code here
        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length(); j++) {
                temp.add(Integer.parseInt(String.valueOf(a[i].charAt(j))));
            }
        }

        Collections.sort(temp, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2) * -1;
            }
        });

        String result = temp.stream().map(String::valueOf)
                .collect(Collectors.joining(""));
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] a = new String[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.next();
        }
        System.out.println(largestNumber(a));
    }
}


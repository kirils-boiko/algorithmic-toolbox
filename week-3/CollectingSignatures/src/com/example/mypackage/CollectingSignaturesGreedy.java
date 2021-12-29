package com.example.mypackage;

/*  CollectingSignatures(segments[0...n-1]):
        sort(segments) by coordinate's endpoint ascending
        points <- empty list
        for i from 0 to n-1:
            right <- segments[i].end
            points.add(right)
            while i < n - 1 and segments[i+1].start <= right:
                i++
        return points

 */

import java.util.*;

public class CollectingSignaturesGreedy {

    private static int[] optimalPoints(Segment[] segments) {
        Arrays.sort(segments, new Comparator<Segment>() {
            @Override
            public int compare(Segment o1, Segment o2) {
                return Integer.compare(o1.end, o2.end);
            }
        });
        List<Integer> temp = new ArrayList<>();

        for (int i = 0; i < segments.length; i++) {
            int right = segments[i].end;
            temp.add(right);
            while (i < segments.length - 1 && segments[i+1].start <= right) {
                i++;
            }
        }

        int[] points = new int[temp.size()];
        for (int i = 0; i < points.length; i++) {
            points[i] = temp.get(i);
        }

        return points;

    }

    private static class Segment {
        int start, end;

        Segment(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Segment[] segments = new Segment[n];
        for (int i = 0; i < n; i++) {
            int start, end;
            start = scanner.nextInt();
            end = scanner.nextInt();
            segments[i] = new Segment(start, end);
        }
        int[] points = optimalPoints(segments);
        System.out.println(points.length);
        for (int point : points) {
            System.out.print(point + " ");
        }
    }
}
 

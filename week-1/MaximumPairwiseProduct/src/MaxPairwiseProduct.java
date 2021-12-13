import java.util.*;
import java.io.*;

/*
    File ready for submission to Coursera.
    Based on com.example.mypackage.MaximumPairwiseProductFast
    Successfully passed:
        Simple functional tests
        Constraint test on maximum number of elements
        Extensive stress tests
 */

public class MaxPairwiseProduct {
    static long getMaxPairwiseProduct(int[] numbers) {
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
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println(getMaxPairwiseProduct(numbers));
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new
                        InputStreamReader(stream));
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


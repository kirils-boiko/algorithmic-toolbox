import java.util.*;

/*
    Uploadable solution:
        Last Digit of Fibonacci Number algorithm
 */

public class FibonacciLastDigit {
    private static int getFibonacciLastDigit(int n) {
        if (n < 2)
            return n;

        int previous = 0;
        int current  = 1;

        for (int i = 2; i <= n; ++i) {
            int tmp_previous = previous;
            previous = current;
            current = (tmp_previous + current) % 10;
        }

        return current;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = getFibonacciLastDigit(n);
        System.out.println(c);
    }
}



/*
    Uploadable solution:
      Least Common Multiple algorithm
 */

import java.util.*;

public class LCM {
  private static long lcm(int a, int b) {
    return (Math.max(a,b)/ gcd(a,b)) *
            Math.min(a,b);
  }

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    System.out.println(lcm(a, b));
  }

  private static long gcd(long a, long b) {
    if (b == 0)
      return a;
    long r = a % b;
    return gcd(b, r);
  }
}

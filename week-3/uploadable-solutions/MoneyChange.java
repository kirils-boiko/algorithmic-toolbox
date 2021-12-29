
import java.util.Scanner;

/*  MoneyChange(m):
        numCoins <- 0
        numCoins <- numCoins + m/10
        m <- m mod 10
        numCoins <- numCoins + m/5
        m <- m mod 5
        numCoins <- numCoins + m
        return numCoins
 */

public class MoneyChange {
    private static int getChange(int m) {
        if (m < 1 || m > 1000)
            return -1;
        int numCoins = 0;
        numCoins += m/10;
        m %= 10;
        numCoins += m/5;
        m %= 5;
        numCoins += m;
        return numCoins;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        System.out.println(getChange(m));

    }
}


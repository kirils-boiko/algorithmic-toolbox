import java.util.Scanner;

public class APlusB {

    static int aPlusB(int firstDigit, int secondDigit) {
        return firstDigit + secondDigit;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(aPlusB(a, b));
    }
}

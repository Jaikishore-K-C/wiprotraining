// 1B: Check if two non-negative int values have the same last digit
import java.util.Scanner;

public class _1B_LastDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first non-negative integer: ");
        int a = scanner.nextInt();
        System.out.print("Enter second non-negative integer: ");
        int b = scanner.nextInt();
        boolean result = lastDigit(a, b);
        System.out.println("lastDigit(" + a + ", " + b + ") → " + result);
        scanner.close();
    }

    public static boolean lastDigit(int a, int b) {
        return (a % 10) == (b % 10);
    }
}

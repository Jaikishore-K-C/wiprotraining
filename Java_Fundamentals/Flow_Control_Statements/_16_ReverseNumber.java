// 16: Reverse a given number and print
import java.util.Scanner;

public class _16_ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int reversed = 0;
        int n = Math.abs(num);
        while (n > 0) {
            reversed = reversed * 10 + n % 10;
            n /= 10;
        }
        // If the original number was negative, make the reversed number negative
        if (num < 0) {
            reversed = -reversed;
        }
        System.out.println(reversed);
        scanner.close();
    }
}

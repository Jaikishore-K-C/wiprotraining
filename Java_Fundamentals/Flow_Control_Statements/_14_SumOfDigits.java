// 14: Print the sum of all the digits of a given number
import java.util.Scanner;

public class _14_SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int sum = 0;
        int n = Math.abs(num);
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println(sum);
        scanner.close();
    }
}

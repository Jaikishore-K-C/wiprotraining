// 1A: Check if a given integer is Positive, Negative, or Zero
import java.util.Scanner;

public class _1A_PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        if (num > 0) {
            System.out.println(num + " is Positive");
        } else if (num < 0) {
            System.out.println(num + " is Negative");
        } else {
            System.out.println("The number is Zero");
        }
        scanner.close();
    }
}

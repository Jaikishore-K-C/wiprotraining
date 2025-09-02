// 7: Convert character case and display in specified format
import java.util.Scanner;

public class _7_CharCaseConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an alphabet character: ");
        char ch = scanner.next().charAt(0);
        if (Character.isLowerCase(ch)) {
            System.out.println(ch + "->" + Character.toUpperCase(ch));
        } else if (Character.isUpperCase(ch)) {
            System.out.println(ch + "->" + Character.toLowerCase(ch));
        } else {
            System.out.println("Not an alphabet character");
        }
        scanner.close();
    }
}

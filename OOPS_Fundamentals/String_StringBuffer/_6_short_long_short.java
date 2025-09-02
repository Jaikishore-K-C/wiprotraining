// _6_short_long_short.java
// Question:
// Given 2 strings, a and b, return a new string of the form short+long+short, with the shorter string on the outside and the longer string on the inside.
// The strings will not be the same length, but they may be empty (length 0).
// If input is "hi" and "hello", then output will be "hihellohi".
// Program to return a new string of the form short+long+short, with the shorter string on the outside.
import java.util.Scanner;

public class _6_short_long_short {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String a = scanner.nextLine();
        System.out.print("Enter second string: ");
        String b = scanner.nextLine();
        String result = shortLongShort(a, b);
        System.out.println("Result: " + result);
        scanner.close();
    }

    public static String shortLongShort(String a, String b) {
        if (a.length() < b.length()) {
            return a + b + a;
        } else {
            return b + a + b;
        }
    }
}

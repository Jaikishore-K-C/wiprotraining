// _10_repeat_last_n.java
// Question:
// Given a string and an integer n, print a new string made of n repetitions of the last n characters of the string. You may assume that n is between 0 and the length of the string, inclusive.
// Example1) i/p:Wipro,3 o/p:propropro
// Program to print a new string made of n repetitions of the last n characters of the string.
import java.util.Scanner;

public class _10_repeat_last_n {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        String result = repeatLastN(input, n);
        System.out.println("Result: " + result);
        scanner.close();
    }

    public static String repeatLastN(String str, int n) {
        if (n < 0 || n > str.length()) {
            return "";
        }
        String lastN = str.substring(str.length() - n);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(lastN);
        }
        return sb.toString();
    }
}

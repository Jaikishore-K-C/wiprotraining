// _5_remove_first_last.java
// Question:
// Write a Java program that accepts a string and returns a new string without the first and last character of the input string.
// Example1) i/p:Sumana o/p:uma
// Program to return a new string without the first and last character of the input string.
import java.util.Scanner;

public class _5_remove_first_last {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String result = removeFirstLast(input);
        System.out.println("Result: " + result);
        scanner.close();
    }

    public static String removeFirstLast(String str) {
        if (str.length() <= 2) {
            return "";
        }
        return str.substring(1, str.length() - 1);
    }
}

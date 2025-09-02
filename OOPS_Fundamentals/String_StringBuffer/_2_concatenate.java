// _2_concatenate.java
// Question:
// Write a java program that will concatenate 2 strings and return the result. The result should be in lowercase.
// Note: If the concatenation creates a double-char, then one of the characters need to be omitted.
// Example1) i/p:Sachin,Tendulkar o/p:sachin tendulkar
// Example2) i/p:Mark,kate o/p:markate
// Program to concatenate 2 strings and return the result in lowercase.
// If concatenation creates a double-char, one of the characters is omitted.
import java.util.Scanner;

public class _2_concatenate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();
        String result = concatenateStrings(str1, str2);
        System.out.println("Result: " + result);
        scanner.close();
    }

    public static String concatenateStrings(String str1, String str2) {
        str1 = str1.trim();
        str2 = str2.trim();
        if (!str1.isEmpty() && !str2.isEmpty() &&
            Character.toLowerCase(str1.charAt(str1.length() - 1)) == Character.toLowerCase(str2.charAt(0))) {
            return (str1 + str2.substring(1)).toLowerCase();
        } else {
            return (str1 + str2).toLowerCase();
        }
    }
}

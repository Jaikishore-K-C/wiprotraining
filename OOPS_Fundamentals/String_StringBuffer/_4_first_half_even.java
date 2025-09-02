// _4_first_half_even.java
// Question:
// Write a java program that will return the first half of the string, if the length of the string is even. It should return null for odd length string.
// Example1) i/p:TomCat o/p:Tom
// Example2) i/p:Apron o/p:null
// Program to return the first half of the string if its length is even, otherwise return null.
import java.util.Scanner;

public class _4_first_half_even {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String result = firstHalfIfEven(input);
        System.out.println("Result: " + result);
        scanner.close();
    }

    public static String firstHalfIfEven(String str) {
        if (str.length() % 2 == 0) {
            return str.substring(0, str.length() / 2);
        } else {
            return null;
        }
    }
}

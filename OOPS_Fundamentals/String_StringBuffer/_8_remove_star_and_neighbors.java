// _8_remove_star_and_neighbors.java
// Question:
// Write a Java program that accepts a string (with * in it). The program should return a new string in which the following characters are removed - *, the characters that are to the left and right of *
// Example1) i/p:ab*cd o/p:ad
// Program to remove '*', and the characters to the left and right of '*' from the input string.
import java.util.Scanner;

public class _8_remove_star_and_neighbors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String result = removeStarAndNeighbors(input);
        System.out.println("Result: " + result);
        scanner.close();
    }

    public static String removeStarAndNeighbors(String str) {
        StringBuilder sb = new StringBuilder();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == '*') continue;
            if (i > 0 && str.charAt(i - 1) == '*') continue;
            if (i < n - 1 && str.charAt(i + 1) == '*') continue;
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}

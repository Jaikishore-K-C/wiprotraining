// _3_n_copies_first2.java
// Question:
// Given a string, return a new string made of 'n' copies of the first 2 chars of the original string where 'n' is the length of the string.
// Example1) i/p:Wipro o/p:WiWiWiWiWi
// Program to return a new string made of 'n' copies of the first 2 chars of the original string, where 'n' is the length of the string.
import java.util.Scanner;

public class _3_n_copies_first2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String result = nCopiesFirst2(input);
        System.out.println("Result: " + result);
        scanner.close();
    }

    public static String nCopiesFirst2(String str) {
        int n = str.length();
        String first2 = str.length() < 2 ? str : str.substring(0, 2);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(first2);
        }
        return sb.toString();
    }
}

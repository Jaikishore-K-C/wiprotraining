// _9_mix_strings.java
// Question:
// Given two strings, a and b, print a new string which is made of the following combination - first character of a, the first character of b, second character of a, second character of b and so on. Any characters left, will go to the end of the result.
// Example1) i/p:Hello,World o/p:HWeolrllod
// Program to mix two strings as described: alternate characters, then append leftovers.
import java.util.Scanner;

public class _9_mix_strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String a = scanner.nextLine();
        System.out.print("Enter second string: ");
        String b = scanner.nextLine();
        String result = mixStrings(a, b);
        System.out.println("Result: " + result);
        scanner.close();
    }

    public static String mixStrings(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int minLen = Math.min(a.length(), b.length());
        for (int i = 0; i < minLen; i++) {
            sb.append(a.charAt(i));
            sb.append(b.charAt(i));
        }
        if (a.length() > minLen) {
            sb.append(a.substring(minLen));
        }
        if (b.length() > minLen) {
            sb.append(b.substring(minLen));
        }
        return sb.toString();
    }
}

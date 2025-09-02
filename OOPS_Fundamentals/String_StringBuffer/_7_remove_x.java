// _7_remove_x.java
// Question:
// Given a string, if the first or last chars are 'x', return the string without those 'x' chars, otherwise return the string unchanged.
// If the input is "xHix", then output is "Hi".
// If the input is "America", then the output is "America".
// Program to return the string without 'x' at the start or end, otherwise return unchanged.
import java.util.Scanner;

public class _7_remove_x {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String result = removeX(input);
        System.out.println("Result: " + result);
        scanner.close();
    }

    public static String removeX(String str) {
        int start = 0;
        int end = str.length();
        if (str.length() > 0 && str.charAt(0) == 'x') {
            start = 1;
        }
        if (str.length() > 1 && str.charAt(str.length() - 1) == 'x') {
            end = str.length() - 1;
        }
        return str.substring(start, end);
    }
}

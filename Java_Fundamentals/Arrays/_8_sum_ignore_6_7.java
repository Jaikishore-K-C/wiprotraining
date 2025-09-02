// _8_sum_ignore_6_7.java
// 8. Write a program to print the sum of the elements of an array following the condition:
// If the array has 6 and 7 in succeeding orders, ignore the numbers between 6 and 7 for sum.

public class _8_sum_ignore_6_7 {
    public static void main(String[] args) {
        int[] numbers = {10, 3, 6, 1, 2, 7, 9}; // Example initialization
        int sum = 0;
        boolean ignore = false;
        for (int num : numbers) {
            if (num == 6) {
                ignore = true;
            }
            if (!ignore) {
                sum += num;
            }
            if (ignore && num == 7) {
                ignore = false;
            }
        }
        System.out.println("Sum: " + sum);
    }
}

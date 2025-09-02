// _5_largest2_smallest2.java
// 5. Write a program to find the largest 2 numbers and the smallest 2 numbers in the given array.

import java.util.Arrays;

public class _5_largest2_smallest2 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 5, 40, 50, 2, 99}; // Example initialization
        if (numbers.length < 2) {
            System.out.println("Array must have at least 2 elements.");
            return;
        }
        // Sort the array
        int[] sorted = Arrays.copyOf(numbers, numbers.length);
        Arrays.sort(sorted);
        System.out.println("Smallest two numbers: " + sorted[0] + ", " + sorted[1]);
        System.out.println("Largest two numbers: " + sorted[sorted.length - 2] + ", " + sorted[sorted.length - 1]);
    }
}

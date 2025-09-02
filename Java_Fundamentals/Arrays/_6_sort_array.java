// _6_sort_array.java
// 6. Write a program to initialize an array and print them in a sorted order.

import java.util.Arrays;

public class _6_sort_array {
    public static void main(String[] args) {
        int[] numbers = {10, 2, 33, 21, 5}; // Example initialization
        Arrays.sort(numbers);
        System.out.print("Sorted array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

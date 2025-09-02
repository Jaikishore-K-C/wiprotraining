// _7_remove_duplicates.java
// 7. Write a program to remove the duplicate elements in an array and print the same.
// Example: I/P: {12,34,12,45,67,89} O/P: {12,34,45,67,89}

import java.util.LinkedHashSet;
import java.util.Set;

public class _7_remove_duplicates {
    public static void main(String[] args) {
        int[] numbers = {12, 34, 12, 45, 67, 89}; // Example initialization
        Set<Integer> uniqueNumbers = new LinkedHashSet<>();
        for (int num : numbers) {
            uniqueNumbers.add(num);
        }
        System.out.print("Array after removing duplicates: ");
        for (int num : uniqueNumbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

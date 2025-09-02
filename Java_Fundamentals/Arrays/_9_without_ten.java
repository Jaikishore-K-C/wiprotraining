// _9_without_ten.java
// 9. Print a version of the given array where all the 10's have been removed.
// The remaining elements shift left, and empty spaces at the end are 0.

import java.util.Arrays;

public class _9_without_ten {
    public static void main(String[] args) {
        int[] numbers = {1, 10, 10, 2}; // Example initialization
        int[] result = new int[numbers.length];
        int idx = 0;
        for (int num : numbers) {
            if (num != 10) {
                result[idx++] = num;
            }
        }
        // Remaining elements are already 0 by default
        System.out.println("Resulting array: " + Arrays.toString(result));
    }
}

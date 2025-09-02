// _10_even_odd.java
// 10. Print an array with all even numbers before all odd numbers. Other order does not matter.

import java.util.Arrays;

public class _10_even_odd {
    public static void main(String[] args) {
        int[] numbers = {1, 0, 1, 0, 0, 1, 1}; // Example initialization
        int[] result = new int[numbers.length];
        int evenIdx = 0;
        int oddIdx = numbers.length - 1;
        for (int num : numbers) {
            if (num % 2 == 0) {
                result[evenIdx++] = num;
            } else {
                result[oddIdx--] = num;
            }
        }
        // To maintain all evens at the start and odds at the end
        // If order among odds/evens doesn't matter, this is sufficient
        System.out.println("Resulting array: " + Arrays.toString(result));
    }
}

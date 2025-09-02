// _4_ascii_to_char.java
// 4. Initialize an integer array with ASCII values and print the corresponding character values in a single row.

public class _4_ascii_to_char {
    public static void main(String[] args) {
        int[] asciiValues = {65, 66, 67, 68, 69}; // Example: ASCII for A, B, C, D, E
        for (int value : asciiValues) {
            System.out.print((char) value);
        }
        System.out.println(); // For a new line after printing all characters
    }
}

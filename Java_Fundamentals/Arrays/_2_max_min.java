// _2_max_min.java
// 2. Write a program to initialize an integer array and find the maximum and minimum value of the array.

public class _2_max_min {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50}; // Example initialization
        int max = numbers[0];
        int min = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        System.out.println("Maximum value in array: " + max);
        System.out.println("Minimum value in array: " + min);
    }
}

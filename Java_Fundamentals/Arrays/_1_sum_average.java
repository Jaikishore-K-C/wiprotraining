// _1_sum_average.java
// 1. Write a program to initialize an integer array and print the sum and average of the array.

public class _1_sum_average {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50}; // Example initialization
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        double average = (double) sum / numbers.length;
        System.out.println("Sum of array elements: " + sum);
        System.out.println("Average of array elements: " + average);
    }
}

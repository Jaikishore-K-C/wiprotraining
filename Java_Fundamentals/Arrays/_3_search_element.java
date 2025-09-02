// _3_search_element.java
// 3. Write a program to initialize an integer array with values and check if a given number is present in the array or not.
// If the number is not found, print -1 else print the index value of the given number in the array.

public class _3_search_element {
    public static void main(String[] args) {
        int[] numbers = {1, 4, 34, 56, 7}; // Example initialization
        int searchElement = 90; // Change this value to test different cases
        int index = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == searchElement) {
                index = i;
                break;
            }
        }
        System.out.println(index);
    }
}

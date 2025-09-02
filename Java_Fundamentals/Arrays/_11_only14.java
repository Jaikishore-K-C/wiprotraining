// _11_only14.java
// 11. Given an array of type int, print true if every element is 1 or 4.

public class _11_only14 {
    public static void main(String[] args) {
        int[] numbers = {1, 4, 1, 4}; // Example initialization
        boolean only14 = true;
        for (int num : numbers) {
            if (num != 1 && num != 4) {
                only14 = false;
                break;
            }
        }
        System.out.println(only14);
    }
}

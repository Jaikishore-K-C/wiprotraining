// _14_biggest_3x3.java
// 14. Write a program to find the biggest number in a 3x3 array. The program receives 9 integer numbers as command line arguments.

public class _14_biggest_3x3 {
    public static void main(String[] args) {
        if (args.length != 9) {
            System.out.println("Please enter 9 integer numbers");
            return;
        }
        int[][] arr = new int[3][3];
        int k = 0;
        System.out.println("The given array is :");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = Integer.parseInt(args[k++]);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int max = arr[0][0];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("The biggest number in the given array is " + max);
    }
}

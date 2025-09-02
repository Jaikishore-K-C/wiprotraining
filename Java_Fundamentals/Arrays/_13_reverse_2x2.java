// _13_reverse_2x2.java
// 13. Write a program to reverse the elements of a given 2x2 array. Four integer numbers need to be passed as Command Line arguments.

public class _13_reverse_2x2 {
    public static void main(String[] args) {
        if (args.length != 4) {
            System.out.println("Please enter 4 integer numbers");
            return;
        }
        int[][] arr = new int[2][2];
        int k = 0;
        System.out.println("The given array is :");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = Integer.parseInt(args[k++]);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("The reverse of the array is :");
        for (int i = 1; i >= 0; i--) {
            for (int j = 1; j >= 0; j--) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

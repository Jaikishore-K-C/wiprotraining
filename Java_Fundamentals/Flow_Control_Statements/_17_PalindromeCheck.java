// 17: Check if a given number is a palindrome
public class _17_PalindromeCheck {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a number as a command line argument.");
            return;
        }
        int num = Integer.parseInt(args[0]);
        int original = num;
        int reversed = 0;
        int n = Math.abs(num);
        while (n > 0) {
            reversed = reversed * 10 + n % 10;
            n /= 10;
        }
        if (Math.abs(original) == reversed) {
            System.out.println(original + " is a palindrome");
        } else {
            System.out.println(original + " is not a palindrome");
        }
    }
}

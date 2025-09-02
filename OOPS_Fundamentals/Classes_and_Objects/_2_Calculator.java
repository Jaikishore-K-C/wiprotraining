/*
2. Create a new class called Calculator with the following methods:
1. A static method called powerInt(int num1,int num2) This method should return num1 to the power num2.
2. A static method called powerDouble(double num1,int num2). This method should return num1 to the power num2.
3. Invoke both the methods and test the functionalities.
Hint: Use Math.pow(double,double) to calculate the power.
*/

// 2. Calculator class with static power methods
class Calculator {
    // Static method for int power
    public static int powerInt(int num1, int num2) {
        return (int)Math.pow(num1, num2);
    }

    // Static method for double power
    public static double powerDouble(double num1, int num2) {
        return Math.pow(num1, num2);
    }

    public static void main(String[] args) {
        int intResult = Calculator.powerInt(2, 3);
        double doubleResult = Calculator.powerDouble(2.5, 3);
        System.out.println("2^3 = " + intResult);
        System.out.println("2.5^3 = " + doubleResult);
    }
}

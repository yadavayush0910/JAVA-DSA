public class RecursionSumOfDigits {
    // Method to calculate the sum of digits of a number using recursion
    public static int sum(int num) {
        // Base case: if num is 0, return 0
        if (num == 0) {
            return 0;
        }
        // Recursive case: add last digit (num % 10) to sum of remaining digits
        return (num % 10) + sum(num / 10);
    }

    // Main method to test the sum function
    public static void main(String[] args) {
        // Calculate and print the sum of digits of 123
        System.out.println(sum(123));  // Output will be 6
    }
}

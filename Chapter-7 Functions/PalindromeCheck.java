import java.util.Scanner;

public class PalindromeCheck {
    public static boolean palindromeCheck(int num) {
        int originalNum = num;
        int revNum = 0;

        while (originalNum != 0) {
            revNum = (revNum * 10) + (originalNum % 10); // Build the reversed number
            originalNum /= 10; // Remove the last digit
        }

        return (num == revNum); // Return true if the original number is equal to the reversed number
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = sc.nextInt();

        System.out.println("Palindrome Status: " + palindromeCheck(num));

        sc.close(); // Close the scanner to prevent resource leaks
    }
}

import java.util.Scanner;

public class sumOfDigits {
    public static int sumDigit(int num) {
        int sum = 0;
        while (num != 0) {
            sum += (num % 10); // Add the last digit to the sum
            num /= 10; // Remove the last digit
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();

        System.out.println("Sum of Digits: " + sumDigit(num));

        sc.close(); // Close the scanner to prevent resource leaks
    }
}

import java.util.Scanner;
public class BinaryToDecimal {
    public static void binToDec(int binNum) {
        int decNum = 0;
        int pow = 0;

        while (binNum != 0) {
            int lastDigit = binNum % 10; // Extract the last digit
            decNum += lastDigit * Math.pow(2, pow); // Add the appropriate power of 2
            pow++; // Move to the next power of 2
            binNum /= 10; // Remove the last digit
        }

        System.out.println("Decimal of Binary: " + decNum);
    }
    public static void binaToDeca(int binNum) {
        int decNum = 0;
        int pow = 0;
        
        while (binNum != 0) {
            int lastDigit = binNum % 10; // Get the last digit
            decNum += lastDigit * (int) Math.pow(2, pow); // Convert binary to decimal
            pow++; // Increase the power of 2
            binNum /= 10; // Remove the last digit of the binary number
        }

        System.out.println("Binary Num to Decimal Num: " + decNum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Binary Number:");
        int num = sc.nextInt();
        binToDec(num);
        binaToDeca(num);
        sc.close(); // Close the scanner to prevent resource leaks
    }
}

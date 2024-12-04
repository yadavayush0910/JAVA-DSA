import java.util.Scanner;

public class decimalToBinary {
    public static void decToBin(int decNum) {
        int pow = 0;
        int binNum = 0;
        
        while (decNum > 0) { // Corrected condition
            binNum += (decNum % 2) * (int) Math.pow(10, pow); // Create the binary number
            pow++;
            decNum /= 2; // Divide by 2 to continue the conversion
        }
        
        System.out.println("Binary form of decimal is: " + binNum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Decimal Number: ");
        int decNum = sc.nextInt();
        decToBin(decNum);
        sc.close(); // Close the scanner to prevent resource leaks
    }
}

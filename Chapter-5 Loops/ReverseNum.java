import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int revNum = 0;
        
        // while (n != 0) {
        //     int lastDigit = n % 10;  // Extract the last digit
        //     revNum = revNum * 10 + lastDigit;  // Append last digit to revNum
        //     n /= 10;  // Remove the last digit from n
        // }
        for (; n != 0; n /= 10) {
            revNum = revNum * 10 + (n % 10);
        }
        
        System.out.println("Reverse of the number is: " + revNum);
        sc.close(); // Closing the scanner to prevent resource leaks
    }
}

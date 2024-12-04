import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Year:");
        int year = sc.nextInt();
        
        // Leap year condition
        if ((year % 4 == 0) && ((year % 100 != 0) || (year % 100 == 0 && year % 400 == 0))) {
            System.out.println("Leap Year: " + year);
        } else {
            System.out.println("Not a Leap Year");
        }
        
        sc.close(); // Closing the scanner to prevent resource leaks
    }
}

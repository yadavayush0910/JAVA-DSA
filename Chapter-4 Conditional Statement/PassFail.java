import java.util.Scanner;

public class PassFail {
    public static void main(String[] args) {  // Corrected main method signature
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks: ");  // Prompt for user input
        int marks = sc.nextInt();
        boolean isPass = (marks >= 33) ? true : false;
        System.out.println("Pass status: " + isPass);  // Output the pass/fail status
    }
}

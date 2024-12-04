
import java.util.Scanner;

public class SumOfAandB {
    public static void main(String[] args) {
        // int num1=12;
        // int num2=88;
        // int sum=num1+num2;
        // System.out.println(sum);
         Scanner sc= new Scanner(System.in);
         System.out.print("Enter first number:");
         int num1= sc.nextInt();
         System.out.print("Enter second number:");
         int num2= sc.nextInt();
         int sum=num1+num2;
         System.out.println("Sum is : "+sum);
    }
}

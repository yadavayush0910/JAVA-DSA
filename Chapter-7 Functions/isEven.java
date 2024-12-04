
import java.util.Scanner;

public class isEven {
    public static boolean isEven(int num) {
        return (num%2==0);
    }
    public static void main(String[] args) {
        Scanner sc= new  Scanner(System.in);
        System.out.print("Enter  Number :");
        int num= sc.nextInt();
        System.out.println("Even Status:"+isEven(num));
    }
}

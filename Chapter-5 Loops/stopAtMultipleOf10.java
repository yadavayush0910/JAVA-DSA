
import java.util.Scanner;

public class stopAtMultipleOf10 {
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    while(true){
        System.out.println("Enter a number:");
        int n= sc.nextInt();
        if(n%10==0){
            System.out.println("You entered a multiple of 10"+n);
            break;
        }
        System.out.println("You entered"+n);
    }
}    
}

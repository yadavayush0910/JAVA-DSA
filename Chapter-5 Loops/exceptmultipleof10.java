
import java.util.Scanner;

public class exceptmultipleof10 {
public static void main(String[] args) {
    Scanner sc= new  Scanner(System.in);
    do{ 
        System.out.print("Enter a num:");
        int n= sc.nextInt();
        if(n%10==0){
           System.out.println("You entered a multiple of 10");
           continue;
        }
        System.out.println("You entered:"+n);
    } while (true);
}    
}


import java.util.Scanner;

public class print1ton {
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter a number:");
    int num=sc.nextInt();
    int counter=1;
    while (counter<=num){
        System.out.print(counter+" ");
        counter++;
    }
}    
}

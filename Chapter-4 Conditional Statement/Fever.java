
import java.util.Scanner;

public class Fever {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter your body temperature:");
            double temp = sc.nextDouble();
             if(temp>100){
                System.out.println("You have a fever");
             }else{
                System.out.println("You don't have a fever");
             }
    }
}

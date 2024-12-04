
import java.util.Scanner;

public class BillingProblem {
 public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);
     System.out.print("Enter the price of Pencil:");
     float pencil=sc.nextFloat();
     System.out.print("Enter the price of Pen:");
     float pen=sc.nextFloat();    
     System.out.print("Enter the price of Eraser:");
     float eraser=sc.nextFloat();
     float bill= pencil+pen+eraser;
     System.out.println("Total Bill is : "+bill);
     float gstBill=bill+(0.18f*bill);
     System.out.println("Total Bill with GST : "+gstBill);
 }   
}

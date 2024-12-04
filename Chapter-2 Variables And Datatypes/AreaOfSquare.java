
import java.util.Scanner;

public class AreaOfSquare {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
      System.out.print("Enter the side of square:");
      int side=sc.nextInt();
      int area=side*side;
      System.out.println("Area of Square: "+area);
  }   
}

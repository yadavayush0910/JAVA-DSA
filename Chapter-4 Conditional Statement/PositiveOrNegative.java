
import java.util.Scanner;

public  class  PositiveOrNegative{
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
      System.out.print("Enter a Number :");
      int num= sc.nextInt();
      if(num>0){
        System.out.println("Number " + num+ " is Positive");
      }
      else if(num<0){
        System.out.println("Number " + num+ " is Negative");
      }
      else{
        System.out.println("Number " + num+ " is Zero");
      }
  }   
}
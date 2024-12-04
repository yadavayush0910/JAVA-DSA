import java.util.Scanner;
public class HollowRectange {
    public static void pattern(int rows, int cols) {
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=cols;j++)
            {
                if(i==1||j==1||j==cols||i==rows){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  number of rows  for line of pattern :");
        int rows = sc.nextInt();
        System.out.print("Enter  number of columns  for line of pattern :");
        int cols = sc.nextInt();
        pattern(rows,cols);
    }
}

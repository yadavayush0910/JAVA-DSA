import  java.util.Scanner;
public class InvertedAndRotatedHalfPyramid {
    public static void pattern(int n) {
        for (int i = 1; i <=n; i++) 
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) 
            {
                System.out.print("*");
            }
            System.out.println();
        }
       
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter line of pattern :");
        int n = sc.nextInt();  
        pattern(n);
    }
}

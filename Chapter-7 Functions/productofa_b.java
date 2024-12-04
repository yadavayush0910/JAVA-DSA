import java.util.Scanner;
public class productofa_b {
    public static int multiply(int a, int b) {
       int multiply = a*b;
       return  multiply;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter first Number:");
        int a=sc.nextInt();
        System.out.print("Enter second Number:");
        int b=sc.nextInt();
        int multiplication=multiply(a, b);
        System.out.println(multiplication);
    }
}

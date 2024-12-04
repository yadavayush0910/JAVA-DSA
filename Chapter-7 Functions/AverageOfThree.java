import java.util.Scanner;
public class AverageOfThree {
    public static double average(double x, double y, double z) {
        return  (x+y+z)/3;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number :");
        double x= sc.nextDouble();
        System.out.println("Enter second number :");
        double y= sc.nextDouble();
        System.out.println("Enter third number :");
        double z= sc.nextDouble();
        System.out.println("Average is :"+average(x, y, z));
    }
}

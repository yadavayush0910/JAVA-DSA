import java.util.Scanner;
public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        float rad = sc.nextFloat();
        float area = 3.14f * rad * rad;
        System.out.println("Area: " + area);
        sc.close(); // Close the Scanner
    }
}

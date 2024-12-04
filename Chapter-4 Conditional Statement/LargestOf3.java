import java.util.Scanner;

public class LargestOf3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first Number: ");
        int a = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int b = sc.nextInt();
        System.out.print("Enter Third Number: ");
        int c = sc.nextInt();

        if (a >= b && a >= c) {
            System.out.println("A is the Largest: " + a);
        } else if (b >= a && b >= c) {
            System.out.println("B is the Largest: " + b);
        } else {
            System.out.println("C is the Largest: " + c);
        }
    }
}

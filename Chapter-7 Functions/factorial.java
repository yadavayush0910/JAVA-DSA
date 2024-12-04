import java.util.Scanner;

public class factorial {
    public static int fact(int num) {
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int facto = fact(num);
        System.out.println("Factorial is: " + facto);
    }
}

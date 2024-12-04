import java.util.Scanner;

public class binomialCoefficient {
    public static int fact(int num) {
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter r: ");
        int r = sc.nextInt();
        int binomialCoeff = fact(n) / (fact(r) * fact(n - r));
        System.out.println("Binomial Coefficient: " + binomialCoeff);
    }
}

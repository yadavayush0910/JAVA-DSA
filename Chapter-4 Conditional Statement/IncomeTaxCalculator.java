import java.util.Scanner;

public class IncomeTaxCalculator {

    public static void main(String[] args) {
        double tax;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your income: ");
        int income = sc.nextInt();

        if (income <= 500000) {
            tax = 0;
            System.out.println("Income " + income + " is less than 5 lakh, so tax is: " + tax + "% - " + (0 * income));
        } else if (income > 500000 && income <= 1000000) {
            tax = 20;
            System.out.println("Income " + income + " is between 5 lakh and 10 lakh, so tax is: " + tax + "% - " + (0.2 * income));
        } else {
            tax = 30;
            System.out.println("Income " + income + " is more than 10 lakh, so tax is: " + tax + "% - " + (0.3 * income));
        }
    }
}

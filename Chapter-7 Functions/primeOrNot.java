import java.util.Scanner;

public class primeOrNot {
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
    public static boolean isPrime2(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true; // 2 is the only even prime number
        }
        if (n % 2 == 0) {
            return false; // Even numbers greater than 2 are not prime
        }
        for (int i = 3; i * i <= n; i += 2) { // Check only odd numbers
            if (n % i == 0) {
                return false;
            }
        }
        return true; // Return true if no divisors were found
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Prime status of " + num + " : " + isPrime(num));
        System.out.println("Prime status of " + num + " : " + isPrime2(num));

        sc.close(); // Closing the scanner to prevent resource leaks
    }
}

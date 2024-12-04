
import java.util.Scanner;

public class primeInRange {

    public static boolean isPrime(int n) {
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
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number:");
        int n= sc.nextInt();
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.print(i+"-");
            }
            else{
                System.out.print("-");
            }
        }
    }
}

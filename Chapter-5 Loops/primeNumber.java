import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        sc.close(); // Close the scanner to prevent resource leaks

        if (n <= 1) {
            System.out.println("Number is Not Prime");
            return;
        }

        boolean isPrime = true;
        int sqrtN = (int) Math.sqrt(n);

        for (int i = 2; i <= sqrtN; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println("Number is Prime");
        } else {
            System.out.println("Number is Not Prime");
        }
    }
}



// import java.util.Scanner;

// public class primeNumber {
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         System.out.print("Enter a Number :");
//         int n=sc.nextInt();
//        boolean isPrime=true;
//         for(int i=2;i<n;i++){
//             if(n%i==0){
//                 isPrime=false;
//                 break;
//             }
//         }
//         if(!isPrime){
//             System.out.println("Number is Not Prime");
//         }else{
//             System.out.println("Number is Prime");
//         }

//     }
// }

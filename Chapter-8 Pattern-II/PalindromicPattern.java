import java.util.Scanner;
public class PalindromicPattern {
    public static void pattern(int n) {
        for(int i=1;i<=n;i++){
            for(int j=i;j<n;j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j+" ");
            }
            for(int j=2;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
public static void main(String[] args) {
    Scanner sc= new  Scanner(System.in);
    System.out.print("Enter the length of pattern:");
    int num=sc.nextInt();
    pattern(num);
}    
}
